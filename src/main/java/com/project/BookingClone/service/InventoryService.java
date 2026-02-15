package com.project.BookingClone.service;


import com.project.BookingClone.dto.HotelDto;
import com.project.BookingClone.dto.HotelPriceDto;
import com.project.BookingClone.dto.HotelSearchRequest;
import com.project.BookingClone.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);

}
