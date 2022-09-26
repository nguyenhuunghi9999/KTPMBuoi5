package com.example.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.NhanVienService;

import java.util.List;

@Service
public class NhanVienImpl implements NhanVienService {


    @Autowired
    private NhanVienRepository nhanVienRepository;


    @Override
    public List<NhanVien> findNhanViensLuong() {
        return nhanVienRepository.findNhanViensLuong();
    }

    @Override
    public Float getTotalSalaryAllNhanVien() {
       return nhanVienRepository.getTotalSalaryAllNhanVien();
    }

    @Override
    public List<NhanVien> findNhanViensGroupByLoaiMayBays() {
        return nhanVienRepository.findNhanViensGroupByLoaiMayBays();
    }

    @Override
    public List<NhanVien> findNhanViensByMaSo() {
        return nhanVienRepository.findNhanViensByMaSo();
    }
}