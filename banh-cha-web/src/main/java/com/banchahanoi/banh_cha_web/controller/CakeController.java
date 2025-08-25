package com.banchahanoi.banh_cha_web.controller;

import com.banchahanoi.banh_cha_web.model.Cake;
import com.banchahanoi.banh_cha_web.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cake")
public class CakeController {

    @Autowired
    private CakeRepository cakeRepository;

    @GetMapping
    public List<Cake> getAllCakes() {
        return cakeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cake getCakeById(@PathVariable Long id) {
        return cakeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Cake createCake(@RequestBody Cake newCake) {
        return cakeRepository.save(newCake);
    }

    }
    @DeleteMapping("/{id}")
    public void deleteCake(@PathVariable Long id) {
        cakeRepository.deleteById(id);
    }
}