package com.ohgiraffers.api.hair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private LocalDate birthday;
    private LocalDate reservation_date;
    private LocalTime reservation_time;
    private LocalDateTime created_at;

    public Customer() {}

    public Customer(long id, String firstName, String lastName, String email, String gender, LocalDate birthday, LocalDate reservation_date, LocalTime reservation_time, LocalDateTime created_at) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservation_date = reservation_date;
        this.reservation_time = reservation_time;
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Customer[" +
                "id='" + id + '\'' +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", reservation_date=" + reservation_date +
                ", reservation_time=" + reservation_time +
                ", created_at=" + created_at +
                ']';
    }
}


