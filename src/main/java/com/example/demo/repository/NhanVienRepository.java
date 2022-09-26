package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NhanVien;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

    @Query(
            value = "SELECT * FROM nhanvien u WHERE u.luong<10000",
            nativeQuery = true)
    List<NhanVien> findNhanViensLuong();

    @Query(value = "SELECT SUM(luong) FROM nhanvien", nativeQuery = true)
    Float getTotalSalaryAllNhanVien();

    @Query(
            value = "SELECT  * FROM nhanvien n LEFT JOIN chungnhan c on n.manv= c.ma_mv  LEFT JOIN maybay m ON  m.mamb = c.ma_mb  where m.loai like N'%Boeing%'",
            nativeQuery = true)
    List<NhanVien> findNhanViensGroupByLoaiMayBays();

    @Query(value = "SELECT * FROM nhanvien n  JOIN chungnhan c on n.manv= c.ma_mv where c.ma_mB ='747'", nativeQuery = true)
    List<NhanVien> findNhanViensByMaSo();
}