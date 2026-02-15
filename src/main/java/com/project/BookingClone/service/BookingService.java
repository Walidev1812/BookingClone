package com.project.BookingClone.service;

import com.project.BookingClone.dto.BookingDto;
import com.project.BookingClone.dto.BookingRequest;
import com.project.BookingClone.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
