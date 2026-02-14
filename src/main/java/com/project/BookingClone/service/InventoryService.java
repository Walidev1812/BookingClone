package com.project.BookingClone.service;


import com.project.BookingClone.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

}
