package com.project.BookingClone.service;


import com.project.BookingClone.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
