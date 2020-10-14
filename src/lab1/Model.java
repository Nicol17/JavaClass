package lab1;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author Nico Lluesa
 *  This class is used to store basic information and measures from models.
 */
    // blueprint
public class Model {
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;


    //CONSTANTS
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    // constructors

    /**
     *  default constructor with no parameters
     */
    public Model() {}

    /**
     * @param firstName     The First Name of the Model
     * @param lastName      The Last Name of the Model
     * @param heightInches  The height of the Model, measured in inches
     * @param weightPounds  The weight of the model, measured in pounds
     * @param canTravel     The availability of the Model for traveling, boolean can be true or false
     * @param smokes        The habit of the Model regarding smoking, boolean can be true or false
     * Constructor with all the parameters specified by the class, user can define every single one of them from the constructor
     */
    public Model(String firstName, String lastName, int heightInches, double weightPounds, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInches);
        setWeight(weightPounds);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * @param firstName     The First Name of the Model
     * @param lastName      The Last Name of the Model
     * @param heightInches  The height of the Model, measured in inches
     * @param weightPounds  The weight of the model, measured in pounds
     * Constructor without the boolean parameters, user can specify the Model's name, height and weight By default, Model would be available to travel and don't smoke.
     */
    public Model(String firstName, String lastName, int heightInches, double weightPounds) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInches);
        setWeight(weightPounds);
        canTravel = true;
        smokes = false;
    }

    // Getters
    /**
     * @return The First Name of the Model
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return The Last Name of the Model
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return The Height of the Model in Inches
     */
    public int getHeightInches() {
        return height;
    }

    /**
     * @return The Weight of the Model in Pounds
     */
    public double getWeightPounds() {
        return weight;
    }

    /**
     * @return The availability of the Model to travel for work, true or false
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * @return The habit of smoking from the Model, true or false
     */
    public boolean isSmokes() {
        return smokes;
    }

    // Setters

    /**
     * @param firstName     Sets a new First Name for the Model, firstName must be between 3 and 20 characters
     */
    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 20) {
            this.firstName = firstName;
        } else {
            System.out.println("Your first name must be at least 3 characters long and 20 characters Max");
        }
    }

    /**
     * @param lastName      Sets a new Last Name for the Model, lastName must be between 3 and 20 characters
     */
    public void setLastName(String lastName) {
        if (lastName.length() >= 3 && lastName.length() <= 20) {
            this.lastName = lastName;
        } else {
            System.out.println("Your last name must be at least 3 characters long and 20 characters Max");
        }
    }

    /**
     * @param inches        Sets a new height for the model in inches, height must be between 24 and 84 inches
     */
    public void setHeight(int inches) {
        if (inches >= 24 && inches <= 84) {
            height = inches;
        } else {
            System.out.println("Height can't be lower than 24 inches or bigger than 84 inches");
        }
    }

    /**
     * @param pounds        Sets a new weight for the Model in pounds, weight must be between 80 and 280 pounds
     */
    public void setWeight(double pounds) {
        if (pounds >= 80 && pounds <= 280) {
            weight = pounds;
        } else {
            System.out.println("Weight must be between 80 and 280 pounds");
        }
    }

    /**
     * @param canTravel     Sets the availability of the Model for traveling, true or false
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * @param smokes        Defines the smoking habit of the Model, true or false
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    // more  getters, setters
    /**
     * @return a String with the height of the Model transformed to Feet & Inches
     */
    public String getHeightInFeetAndInches() {
        return ((height / INCHES_PER_FOOT) + " feet " + (height % INCHES_PER_FOOT) + " inches");
    }

    /**
     *
     * @return a Long with the Weight of the Model transformed to Kilograms
     */
    public long getWeightKg() {
        return Math.round (getWeightPounds() / POUNDS_PER_KG);
    }

    /**
     * @param kilograms     sets the weight of the Model in kilograms, gets transformed into pounds and stored in weight
     */
    public void setWeight(long kilograms) {
        weight = Math.round(kilograms * POUNDS_PER_KG);
    }

    /**
     * @param feet      Sets the Height of the Model in feet (1 foot = 12 inches), feet get transformed to inches and stored in height
     * @param inches    Adds inches to the Height so the user can store an accurate height using 2 parameters
     */
    public void setHeight(int feet, int inches) {
        height = (feet * INCHES_PER_FOOT) + inches;
    }

    //METHODS

    /**
    * Prints detailed information about the model
    */
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInches() + " inches");
        System.out.println("Weight: " + getWeightPounds() + " pounds");
        if (canTravel) {
            System.out.println("Does travel");
        } else {
            System.out.println("Does not travel");
        }
        if (smokes) {
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke");
        }
    }

    /**
     * @Returns the estimation of the Model's wage (per hour) based on his/her personal information
     */
    public int calculatePayDollarsPerHour() {
        int wage = BASE_RATE_DOLLARS_PER_HOUR;
        if (height >= TALL_INCHES && weight <= THIN_POUNDS) {
            wage = wage + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        } if (canTravel) {
            wage = wage + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        } if (smokes) {
            wage = wage - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return wage;
    }


    /**
     *  Displays all the Information about the Model and the estimate hourly rate based on that information
     */
    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeightPounds());
        if (canTravel) {
            System.out.println("Travels: Yep");
        } else {
            System.out.println("Travels: Nope");
        }
        if (smokes) {
            System.out.println("Smokes: Yep");
        } else {
            System.out.println("Smokes: Nope");
        }
        System.out.println("Hourly rate: $ " + calculatePayDollarsPerHour());
    }
}

