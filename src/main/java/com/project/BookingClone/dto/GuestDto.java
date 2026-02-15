package com.project.BookingClone.dto;


import com.project.BookingClone.entity.User;
import com.project.BookingClone.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
