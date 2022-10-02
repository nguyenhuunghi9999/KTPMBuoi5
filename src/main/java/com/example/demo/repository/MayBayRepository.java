package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MayBay;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, String> {
    @Query(
            value = "SELECT * FROM maybay u WHERE u.tambay>10000",
            nativeQuery = true)
    List<MayBay> findMayBaysTamBayFrom();

    @Query(
            value = "SELECT * FROM maybay u WHERE u.loai like N'%Boeing%'",
            nativeQuery = true)
    List<MayBay> findLoaiMayBaysBoeing();

    @Query(
            value = "select * from maybay m left join chungnhan c on m.mamb= c.mamb left join nhanvien n on  n.manv = c.manv where n.ten like N'%Nguyễn%'",
            nativeQuery = true)
    List<MayBay> findMayBaysByTenNhanVien();
}