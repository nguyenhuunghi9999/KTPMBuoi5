package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.MayBay;

import java.util.List;

@Service
public interface MayBayService{
    List<MayBay> findMayBaysTamBayFrom();

    List<MayBay> findLoaiMayBaysBoeing();

    List<MayBay> findMayBaysByTenNhanVien();
}

