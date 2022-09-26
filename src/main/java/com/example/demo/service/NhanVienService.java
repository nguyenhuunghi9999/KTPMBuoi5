package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.entity.NhanVien;

import java.util.List;

@Service
public interface NhanVienService {
    List<NhanVien> findNhanViensLuong();

    Float getTotalSalaryAllNhanVien();

    List<NhanVien> findNhanViensGroupByLoaiMayBays();

    List<NhanVien> findNhanViensByMaSo();
}