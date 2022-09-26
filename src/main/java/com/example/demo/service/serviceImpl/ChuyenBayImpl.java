package com.example.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.repository.ChuyenBayRepository;
import com.example.demo.service.ChuyenBayService;

import java.util.List;
import java.util.Optional;

@Service
public class ChuyenBayImpl implements ChuyenBayService {

    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

    @Override
    public List<ChuyenBay> findChuyenBaysByGaden(String gaden) {
        return chuyenBayRepository.findChuyenBaysByGaden(gaden);
    }

    @Override
    public List<ChuyenBay> findChuyenBays() {
        return chuyenBayRepository.findAll();
    }

    @Override
    public List<ChuyenBay> findChuyenBaysDoDai() {
        return chuyenBayRepository.findChuyenBaysDoDai();
    }

    @Override
    public List<ChuyenBay> findChuyenBaysFromSGToBuonMaThuoc() {
        return chuyenBayRepository.findChuyenBaysFromSGToBuonMaThuoc();
    }

    @Override
    public List<ChuyenBay> totalsChuyenBaysFromSGN() {
        return chuyenBayRepository.totalsChuyenBaysFromSGN();
    }


}