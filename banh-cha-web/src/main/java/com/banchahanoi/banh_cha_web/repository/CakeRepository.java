package com.banchahanoi.banh_cha_web.repository;

import com.banchahanoi.banh_cha_web.model.Cake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepository extends JpaRepository<Cake, Long> {
}