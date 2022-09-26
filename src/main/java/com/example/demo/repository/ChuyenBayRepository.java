package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ChuyenBay;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    List<ChuyenBay> findChuyenBaysByGaden(String gaden);

    @Query(
            value = "SELECT * FROM chuyenbay u WHERE u.dodai<10000 and u.dodai>8000",
            nativeQuery = true)
    List<ChuyenBay> findChuyenBaysDoDai();


    @Query(
            value = "SELECT * FROM chuyenbay u WHERE u.gaden like N'SGN' and u.gadi like N'BMV'",
            nativeQuery = true)
    List<ChuyenBay> findChuyenBaysFromSGToBuonMaThuoc();

    @Query(
            value = "SELECT * FROM chuyenbay u WHERE u.gaden like N'SGN'",
            nativeQuery = true)
    List<ChuyenBay> totalsChuyenBaysFromSGN();
}
