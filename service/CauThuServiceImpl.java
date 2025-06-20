package com.example.quanlydoibong.service;

import com.example.quanlydoibong.model.CauThu;
import com.example.quanlydoibong.repository.CauThuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CauThuServiceImpl implements CauThuService {

    @Autowired
    private CauThuRepository repository;

    public List<CauThu> findAll() {
        return repository.findAll();
    }

    public void save(CauThu cauThu) {
        repository.save(cauThu);
    }

    public CauThu findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
