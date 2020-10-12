package oop.basics.Encapsulation;

public class Account {
    private String username;
    private String password;
    boolean paid;

//    public Account(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }

    public Account(String username, String password, boolean paid) {
        setUsername(username);
        setPassword(password);
        this.paid = paid;
    }


    public boolean login(String username, String password) {
        return checkCredential(username, password);
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getUsername() {
        return username;
    }

    public  void setUsername(String username) {
        if (username.length() > 5 && username.length() < 12) {
            this.username = username;
        } else {
            System.out.println("Your username must contain more than 5 characters and less than 12");
        }
    }


    public  void setPassword(String password) {
        if (password.length() >= 8 && password.length() < 20) {
        } else {
            System.out.println("Your password must contain more than 8 characters and less than 20");
        }
    }

    private boolean checkCredential(String username, String password) {
        if (!username.equals(this.username)) {
            System.out.println("Invalid username");
            return false;
        }
        if (!password.equals(this.password)) {
            System.out.println("Invalid Password");
            return false;
        }
        System.out.println("logged in successfully!");
        return true;
    }
}