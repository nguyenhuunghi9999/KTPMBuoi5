package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "chungnhan")
@Data
@IdClass(ChungNhanPK.class)
public class ChungNhan {

    @Id
    @ManyToOne
    @JoinColumn(name = "manv")
    private NhanVien manv;

    @Id
    @ManyToOne
    @JoinColumn(name = "mamb")
    private MayBay mamb;



}