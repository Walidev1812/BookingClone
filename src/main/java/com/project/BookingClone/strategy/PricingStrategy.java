package com.project.BookingClone.strategy;


import com.project.BookingClone.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
