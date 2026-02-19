package com.project.BookingClone.service;


import com.project.BookingClone.dto.ProfileUpdateRequestDto;
import com.project.BookingClone.dto.UserDto;
import com.project.BookingClone.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();

}
