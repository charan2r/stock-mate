package com.example.stock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock.entities.Item;

public interface ItemRepositiry extends JpaRepository<Item, Long> {
    
   
}
