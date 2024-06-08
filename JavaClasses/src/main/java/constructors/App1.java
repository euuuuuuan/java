package constructors;

public class App1 {
    int modelYear;
    String modelName;

    public App1(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        App1 myCar = new App1(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
