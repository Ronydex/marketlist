package com.projects.marketlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projects.marketlist.model.PurchaseItem;

@Repository 
public interface PurchaseItemRepository extends JpaRepository <PurchaseItem, Long> {
    @Query ("SELECT p FROM PurchaseItem p WHERE p.purchase_list.id_list = : id_list")
    List<PurchaseItem> findPurchaseItemFromId(@Param("id_list") int $id_list); 
}
