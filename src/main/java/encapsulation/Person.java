package encapsulation;

public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    /*
    The get method returns the value of the variable name.
    The set method takes a parameter (newName) and assigns it to the name variable.
    this keyword is used to refer to the current object.
    However, as the name variable is declared as private, we cannot access it from outside this class:
    */
}
