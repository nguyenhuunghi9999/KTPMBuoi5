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
    @JoinColumn(name = "ma_mb")
    private MayBay mamb;

    @Id
    @ManyToOne
    @JoinColumn(name = "ma_mv")
    private NhanVien manv;

}