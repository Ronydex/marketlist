package com.projects.marketlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projects.marketlist.model.PurchaseItem;

@Repository 
public interface PurchaseItemRepository extends JpaRepository <PurchaseItem, Long> {

    List<PurchaseItem> findPurchaseItemFromEmailUser(@Param("email_user") String $email_user) 
}
