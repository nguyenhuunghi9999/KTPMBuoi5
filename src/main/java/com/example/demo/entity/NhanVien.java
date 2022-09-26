package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "nhanvien")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
    @Id
    @Column(name = "manv")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String manv;

    @Column(name = "ten")
    private String ten;

    @Column(name = "luong")
    private Long luong;

}