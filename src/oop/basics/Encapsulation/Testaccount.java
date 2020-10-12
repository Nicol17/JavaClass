package oop.basics.Encapsulation;

// Account
// + username: String, password: String
// + login (String username, String password)

public class Testaccount {
    public static void main(String[] args) {
        Account ac1 = new Account("abc123", "123", true);
        ac1.login("abc123", "123");
        ac1.login("abcabca234", "3333");
        System.out.println(ac1.getUsername());

    }
}
