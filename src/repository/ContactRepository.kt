package repository

import entity.Contact

class ContactRepository {

    companion object {
        private val contactList = mutableListOf<Contact>()

        fun save(contact: Contact) {
            contactList.add(contact)
        }


        fun delete(contact: Contact) {
            var index = 0
            for (item in contactList.withIndex()){
                if (item.value.name == contact.name && item.value.phone == contact.phone){
                    index = item.index
                    break
                }
            }

            contactList.removeAt(index)
        }

        fun getList(): List<Contact>{
            return contactList;
        }
    }

}