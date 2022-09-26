package com.example.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MayBay;
import com.example.demo.repository.MayBayRepository;
import com.example.demo.service.MayBayService;

import java.util.List;

@Service
public class MayBayImpl implements MayBayService {

    @Autowired
    private MayBayRepository mayBayRepository;

    @Override
    public List<MayBay> findMayBaysTamBayFrom() {
        return mayBayRepository.findMayBaysTamBayFrom();
    }

    @Override
    public List<MayBay> findLoaiMayBaysBoeing() {
        return mayBayRepository.findLoaiMayBaysBoeing();
    }

    @Override
    public List<MayBay> findMayBaysByTenNhanVien() {
        return mayBayRepository.findMayBaysByTenNhanVien();
    }
}