package com.danita.danitashopping.repository.projection;

import com.danita.danitashopping.model.DeviceType;

import java.time.LocalDateTime;
/**
 * @author daniel Taye
 *
 */
public interface PurchaseItem
{
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
