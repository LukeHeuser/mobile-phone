public class Main {

    public static void main(String[] args) {

        // Initialized our new Phone!
        MobilePhone myPhone = new MobilePhone("7404177244");

        // initialized a few contacts to add to our phone later
        Contact hannah = new Contact("Hannah","40186879548");
        Contact chevy = new Contact("Chevy", "8784984875");
        Contact preston = new Contact("Preston", "7405648975");
        Contact rachel = new Contact("Rachel", "8794513589");

        // added a few contacts to our phone
        myPhone.addNewContact(hannah);
        myPhone.addNewContact(chevy);
        myPhone.addNewContact(preston);
        myPhone.printContacts();

        // manipulated the contacts that are currently in our phone
        myPhone.removeContact(preston);
        myPhone.printContacts();
        myPhone.queryContact("Chevy");
        myPhone.updateContact(chevy, rachel);
        myPhone.printContacts();


    }

}
