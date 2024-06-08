package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
//        myObj.name = "John"; // error
//        System.out.println(myObj.name); //error
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());

        // 프라이벗 클라스의 자료를 끌어 쓸 수 없기 때문에
        // get과 set 캡슐화를 사용하여 끌어와 쓸 수 있다.
    }
}
