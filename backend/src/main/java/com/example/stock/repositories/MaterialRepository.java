package com.example.stock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock.entities.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {
    
}
