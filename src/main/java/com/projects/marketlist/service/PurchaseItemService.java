package com.projects.marketlist.service;


import org.springframework.stereotype.Service;

import com.projects.marketlist.model.PurchaseItem;
import com.projects.marketlist.model.User;

@Service 
public class PurchaseItemService {

    private final PurchaseItem purchaseItem;
    private final User user;

    public PurchaseItemService(User user, PurchaseItem purchaseItem){
        this.user = user;
        this.purchaseItem = purchaseItem;
    }
    public PurchaseItem createPurchaseItem(){

    };
}
