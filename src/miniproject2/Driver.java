package miniproject2;


import java.util.Arrays;

public class Driver {

  public static void main(String[] args) {

    String mainMenu = String.format("+----  Contact App  ----+\n"
        +            "| 1. List all Contacts  |\n"
        +            "| 2. Add new Contact    |\n"
        +            "| 3. Remove Contact     |\n"
        +            "| 4. Update Contact     |\n"
        +            "| 5. Quit               |\n"
        +            "+-----------------------+");

    System.out.println(mainMenu);
    ContactList Contacts = new ContactList();
    //SEEDS
    Contact c1 = new Contact("Nico", "(236) 889-8714", "Vancouver");
    Contact c2 = new Contact("Abel", "695489889", "Madrid");
    Contact c3 = new Contact("Will", "3216543", "Alpujarra");
    Contacts.addContact(c1);
    Contacts.addContact(c2);
    Contacts.addContact(c3);


    while (true) {
      String usernameInput = InputCollector.getUserInput("Enter your option: ");
      // 5. QUIT
      if (usernameInput.equals("5")) {
        System.out.println("Bye Bye!");
        break;
        // 1. LIST ALL
      } else if (usernameInput.equals("1")) {
        Contacts.displayContacts();
        // 2. ADD
      } else if (usernameInput.equals("2")) {
        String name = InputCollector.getUserInput("Enter name: ");
        String mobile = InputCollector.getUserInput("Enter mobile: ");
        String work = InputCollector.getUserInput("Enter work: ");
        String home = InputCollector.getUserInput("Enter home: ");
        String city = InputCollector.getUserInput("Enter city: ");

        Contact contact = new Contact(name, mobile, city);
        Contacts.addContact(contact);
        System.out.println(mainMenu);

        // 3. REMOVE
      } else if (usernameInput.equals("3")) {
        Contacts.displayContacts();
        String removeIndex = InputCollector.getUserInput("Enter the index of the Contact that you want to remove: ");
        Contacts.removeContact(Integer.parseInt(removeIndex));
        System.out.println("Successfully removed ");

        // 4. UPDATE
      } else if (usernameInput.equals("4")) {
        Contacts.displayContacts();
        String updateIndex = InputCollector.getUserInput("Enter the index of the Contact that you want to update: ");
        Contacts.updateContact(Integer.parseInt(updateIndex));
        System.out.println("Contact updated successfully!");

      } else {
        System.out.println(mainMenu);
      }
    }

  }
}
