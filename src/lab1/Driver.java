package lab1;

public class Driver {
    public static void main(String[] args) {
        // new Models
        Model m1 = new Model("John", "Doe", 74, 203);
        Model m2 = new Model();
        Model m3 = new Model("James", "Smith", 80, 205, true, true);
        // getters
        System.out.println(m1.getFirstName());
        System.out.println(m1.getLastName());
        System.out.println(m1.getHeightInches());
        System.out.println(m1.getWeightPounds());
        System.out.println(m1.isCanTravel());
        System.out.println(m1.isSmokes());

        // setters check
        m1.setFirstName("J");
        m1.setLastName("Do");
        m1.setHeight(23);
        m1.setWeight(40.0);




        // setters
        m2.setFirstName("Jane");
        m2.setLastName("Done");
        m2.setHeight(67);
        m2.setWeight(140.0);
        m2.setCanTravel(false);
        m2.setSmokes(true);
        System.out.println(m2.getFirstName());
        System.out.println(m2.getLastName());
        System.out.println(m2.getHeightInches());
        System.out.println(m2.getWeightPounds());
        System.out.println(m2.isCanTravel());
        System.out.println(m2.isSmokes());

        // new getters setters
        System.out.println(m3.getWeightKg());
        System.out.println(m3.getHeightInFeetAndInches());
        m3.setWeight(77);
        m3.setHeight(6, 1);
        System.out.println(m3.getWeightKg());
        System.out.println(m3.getHeightInFeetAndInches());


        // Methods
        m1.printDetails();
        m2.printDetails();
        m3.printDetails();
        System.out.println(m1.calculatePayDollarsPerHour());
        System.out.println(m2.calculatePayDollarsPerHour());
        System.out.println(m3.calculatePayDollarsPerHour());
        m3.displayModelDetails();
        m2.displayModelDetails();
        m1.displayModelDetails();
    }
}
