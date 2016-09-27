package seedu.addressbook.logic;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage;

/**
 * Represents the file used to store address book data.
 */
public class StorageStub implements Storage {

    public StorageStub(String filePath){

    }

    public void save(AddressBook addressBook) {
    }
    public void initSave(AddressBook addressBook) {
    }

    public AddressBook load() {
        return null;
    }

    public String getPath() {
        return null;
    }

}
