package miniproject2;

import java.util.ArrayList;
import lab3.Piece;

public class ContactList {
  protected ArrayList<Contact> Contacts;

  // constructor
  public ContactList() {
    Contacts = new ArrayList<Contact>();
  }


  // Method
  public void addContact(Contact newContact) {
    if (Contacts.contains(newContact)) {
      System.out.println("Contact already exists!");
    } else {
      Contacts.add(newContact);
    }
  }

//  public boolean isValidContact(Contact newContact) {
//    boolean flag = true;
//    for (Contact contact : Contacts) {
//      if (contact.equals(newContact)) {
//        flag = false;
//      } else {
//        flag = true;
//      }
//    } return flag;
//  }

  public void removeContact(int index) { Contacts.remove(index); }

  public void updateContact(int index) {
    Contacts.get(index).name = InputCollector.getUserInput("Enter name: ");
    Contacts.get(index).mobile = InputCollector.getUserInput("Enter mobile: ");
    Contacts.get(index).work = InputCollector.getUserInput("Enter work: ");
    Contacts.get(index).home = InputCollector.getUserInput("Enter home: ");
    Contacts.get(index).city = InputCollector.getUserInput("Enter city: ");

  }

  public void displayContacts() {
    for (Contact contact : Contacts) {
      System.out.println(Contacts.indexOf(contact) + ": " + contact.getName() + " (" + contact.getMobile() + ", " + contact.getCity() + ")");
    }
  }

}
