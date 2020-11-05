package lab2;

import java.util.Arrays;

public class Province {
    // Blueprint
    private String province;
    private String capital;
    private long population;

    //CONSTANTS
    public static final long DEFAULT_POPULATION = 4648055;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";


    // Constructors
    public Province() {
        province = DEFAULT_PROVINCE;
        capital = DEFAULT_CAPITAL;
        population = DEFAULT_POPULATION;
    }


    public Province(String province, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(province)) && (isValidCapitalCity(capital))) {
            setProvince(province);
            setCapital(capital);
            setPopulation(population);
        } else {
            this.population = DEFAULT_POPULATION;
            this.province = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }

    // Getters, Setters


    public String getProvince() {
        return province;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setProvince(String province) {
        if (isValidProvince(province)) {
            this.province = province;
        } else {
            this.province = DEFAULT_PROVINCE;
        }
    }

    public void setCapital(String capital) {
        if (isValidCapitalCity(capital)) {
            this.capital = capital;
        } else {
            this.capital = DEFAULT_CAPITAL;
        }
    }

    public void setPopulation(long population) {
        if(isValidPopulation(population)) {
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
        }
    }

    // Validation Methods
    private boolean isValidProvince(String province) {
        String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        if (Arrays.asList(provinces).contains(province)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidCapitalCity(String capital) {
        String[] capitals = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton", "St.John's"};
        if (Arrays.asList(capitals).contains(capital)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidPopulation( long population) {
        if (population >= 30000 && population <= 15000000) {
            return true;
        } else {
            return false;
        }
    }


    // Methods
    public String getDetails() {
        return String.format("The capital of " + province + " (population. " + population + ") is " + capital);
    }
}
