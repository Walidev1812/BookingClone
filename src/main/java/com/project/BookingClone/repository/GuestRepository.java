package com.project.BookingClone.repository;


import com.project.BookingClone.entity.Guest;
import com.project.BookingClone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}