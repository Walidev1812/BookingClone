package com.project.BookingClone.repository;


import com.project.BookingClone.entity.Inventory;
import com.project.BookingClone.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);

    void deleteByRoom(Room room);
}
