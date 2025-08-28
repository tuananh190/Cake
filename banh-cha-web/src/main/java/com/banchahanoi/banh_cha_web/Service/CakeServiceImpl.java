package com.banchahanoi.banh_cha_web.Service;

import com.banchahanoi.banh_cha_web.model.Cake;
import com.banchahanoi.banh_cha_web.repository.CakeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeServiceImpl implements CakeService {

    private final CakeRepository cakeRepository;

    public CakeServiceImpl(CakeRepository cakeRepository) {
        this.cakeRepository = cakeRepository;
    }

    @Override
    public List<Cake> getAllCakes() {
        return cakeRepository.findAll();
    }

    @Override
    public Cake getCakeById(Long id) {
        return cakeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cake not found with id " + id));
    }

    @Override
    public Cake createCake(Cake cake) {
        return cakeRepository.save(cake);
    }

    @Override
    public Cake updateCake(Long id, Cake cake) {
        Cake existing = getCakeById(id);
        existing.setCakeType(cake.getCakeType());
        existing.setPrice(cake.getPrice());
        existing.setFilling(cake.getFilling());
        return cakeRepository.save(existing);
    }

    @Override
    public void deleteCake(Long id) {
        cakeRepository.deleteById(id);
    }
}
