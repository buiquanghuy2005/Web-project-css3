package com.example.quanlydoibong.service;

import com.example.quanlydoibong.model.CauThu;

import java.util.List;

public interface CauThuService {
    List<CauThu> findAll();
    void save(CauThu cauThu);
    CauThu findById(Long id);
    void deleteById(Long id);
}
