package pl.globallogic.exercises.intermediate.MobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        Contact contact3 = Contact.createContact("Tom", "11235813");
        Contact contact4 = Contact.createContact("Jane", "23571113");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        mobilePhone.printContacts();

        System.out.println("Updating contact Alice...");
        Contact newContact2 = Contact.createContact("Alice", "98765432");
        mobilePhone.updateContact(contact2, newContact2);
        mobilePhone.printContacts();

        System.out.println("Finding contact Tom...");
        int position = mobilePhone.findContact("Tom");
        if (position != -1) {
            System.out.println("Found Tom at position " + (position + 1));
        } else {
            System.out.println("Tom not found");
        }

        System.out.println("Removing contact Bob...");
        mobilePhone.removeContact(contact1);
        mobilePhone.printContacts();
    }
}