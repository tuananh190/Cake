package com.banchahanoi.banh_cha_web.controller;

import com.banchahanoi.banh_cha_web.model.Cake;
import com.banchahanoi.banh_cha_web.Service.CakeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cakes")
public class CakeController {

    private final CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping
    public List<Cake> getAllCakes() {
        return cakeService.getAllCakes();
    }

    @GetMapping("/{id}")
    public Cake getCakeById(@PathVariable Long id) {
        return cakeService.getCakeById(id);
    }

    @PostMapping
    public Cake createCake(@RequestBody Cake newCake) {
        return cakeService.createCake(newCake);
    }

    @PutMapping("/{id}")
    public Cake updateCake(@PathVariable Long id, @RequestBody Cake updatedCake) {
        return cakeService.updateCake(id, updatedCake);
    }

    @DeleteMapping("/{id}")
    public void deleteCake(@PathVariable Long id) {
        cakeService.deleteCake(id);
    }
}
