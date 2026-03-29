package com.project.BookingClone.util;

import org.springframework.stereotype.Component;

@Component
public class CacheKeyGenerator {

    public String forHotel(Long hotelId) {
        return "hotel:" + hotelId;
    }

    public String forUser(Long userId) {
        return "user:" + userId;
    }

}
