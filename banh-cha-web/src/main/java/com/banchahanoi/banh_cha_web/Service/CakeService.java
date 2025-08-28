package com.banchahanoi.banh_cha_web.Service;

import com.banchahanoi.banh_cha_web.model.Cake;

import java.util.List;

public interface CakeService {
    List<Cake> getAllCakes();
    Cake getCakeById(Long id);
    Cake createCake(Cake cake);
    Cake updateCake(Long id, Cake cake);
    void deleteCake(Long id);
}
