package com.project.BookingClone.repository;


import com.project.BookingClone.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
