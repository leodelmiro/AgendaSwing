package business

import entity.Contact
import repository.ContactRepository

class ContactBusiness {

    private fun validate(name: String, phone: String) {
        if (name == "") {
            throw Exception("Nome é obrigatório!")
        }

        if (phone == "") {
            throw Exception("Telefone é obrigatório")
        }
    }

    private fun validateDelete(name: String, phone: String) {
        if (name == "" || phone == "") {
            throw Exception("É necessário selecionar um contato antes de remover")
        }
    }

    fun getContactCountDescription(): String {
        val list = getList();

        return when {
            list.isEmpty() -> "0 contatos"
            list.size == 1 -> "1 contato"
            else -> "${list.size} contatos"
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone)

        val contact = Contact(name, phone)
        ContactRepository.save(contact)
    }


    fun delete(name: String, phone: String) {
        validateDelete(name, phone)

        val contact = Contact(name, phone)
        ContactRepository.delete(contact)
    }

    fun getList(): List<Contact>{
        return ContactRepository.getList()
    }
}