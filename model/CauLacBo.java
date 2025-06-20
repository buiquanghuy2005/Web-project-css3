package com.example.quanlydoibong.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class CauLacBo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ten;
    private String hlv;

    @OneToMany(mappedBy = "cauLacBo", cascade = CascadeType.ALL)
    private List<CauThu> danhSachCauThu;

    // Getters and setters
    // ...
}
