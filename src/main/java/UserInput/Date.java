package UserInput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
//        LocalDate myObj = LocalDate.now(); // Create a date object
//        LocalTime myObjTime = LocalTime.now();
//        LocalDateTime myDateTime = LocalDateTime.now();
//
//        System.out.println(myObj);
//        System.out.println(myObjTime);
//        System.out.println(myDateTime);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
