package com.example.CakeFactory.repository;

import com.example.CakeFactory.model.Cake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepository extends JpaRepository<Cake, Integer> {
}
