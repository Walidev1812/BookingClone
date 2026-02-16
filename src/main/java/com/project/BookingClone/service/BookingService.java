package com.project.BookingClone.service;

import com.project.BookingClone.dto.BookingDto;
import com.project.BookingClone.dto.BookingRequest;
import com.project.BookingClone.dto.GuestDto;
import com.stripe.model.Event;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

    void capturePayment(Event event);

    String initiatePayments(Long bookingId);

    void cancelBooking(Long bookingId);
}
