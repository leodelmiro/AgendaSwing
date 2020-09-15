package repository

import entity.Contact

class ContactRepository {

    companion object {
        private val contactList = mutableListOf<Contact>()

        fun save(contact: Contact) {
            contactList.add(contact)
        }


        fun delete(contact: Contact) {
        }

        fun getList(): List<Contact>{
            return contactList;
        }
    }

}