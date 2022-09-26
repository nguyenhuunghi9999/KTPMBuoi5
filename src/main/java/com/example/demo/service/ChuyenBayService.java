package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ChuyenBay;

import java.util.List;

@Service
public interface ChuyenBayService {
    List<ChuyenBay> findChuyenBaysByGaden(String gaden);
    List<ChuyenBay> findChuyenBays();

    List<ChuyenBay> findChuyenBaysDoDai();

    List<ChuyenBay> findChuyenBaysFromSGToBuonMaThuoc();

    List<ChuyenBay> totalsChuyenBaysFromSGN();


}
