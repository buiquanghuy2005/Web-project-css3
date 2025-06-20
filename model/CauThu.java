package com.example.quanlydoibong.model;

import jakarta.persistence.*;

@Entity
public class CauThu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ten;
    private int tuoi;
    private String viTri;
    private String quocTich;

    @ManyToOne
    @JoinColumn(name = "clb_id")
    private CauLacBo cauLacBo;

    // Getters and setters
    // ...
}
