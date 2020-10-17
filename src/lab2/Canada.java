package lab2;

public class Canada {
    //blueprint (instances variables)
    private Province[] provinces;


    //constructor
    public Canada() {
        provinces = new Province[10];

    }


    //methods
    public void displayAllProvinces() {
        for (Province province : provinces) {
            province.getDetails();
        }
    }
//
//    public int getNumberOfProvincesBetween(int min, int max) {
//      for (Province.population : provinces) {
//
//    }

}
