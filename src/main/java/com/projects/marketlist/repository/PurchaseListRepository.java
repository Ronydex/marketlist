package com.projects.marketlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.marketlist.model.PurchaseList;

@Repository 
public interface PurchaseListRepository extends JpaRepository<PurchaseList, Long> {
    
}
