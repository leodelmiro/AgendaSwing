package repository

import entity.Contact

class ContactRepository {

    companion object {
        private val list = mutableListOf<Contact>()

        fun save(contact: Contact) {
            list.add(contact)
        }


        fun delete(contact: Contact) {
        }
    }

}