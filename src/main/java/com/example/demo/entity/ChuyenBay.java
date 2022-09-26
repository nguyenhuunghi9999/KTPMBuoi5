package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "chuyenbay")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChuyenBay {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "macb",columnDefinition = "varchar(50)")
    private String macb;

    @Column(name = "gadi")
    private String gadi;

    @Column(name = "gaden")
    private String gaden;

    @Column(name = "dodai")
    private Long dodai;

    @Column(name = "giodi")
    private Time giodi;

    @Column(name = "gioden")
    private Time gioden;

    @Column(name = "chiphi")
    private Long chiphi;
}
