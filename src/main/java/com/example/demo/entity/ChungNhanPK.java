package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ChungNhanPK  implements Serializable {
    private String manv;
    private String mamb;
}