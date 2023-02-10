package com.danita.danitashopping.service;

import com.danita.danitashopping.model.Purchase;
import com.danita.danitashopping.repository.projection.PurchaseItem;

import java.util.List;
/**
 * @author daniel Taye
 *
 */
public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
