package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.service.ChuyenBayService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {

    @Autowired
    private ChuyenBayService chuyenBayService;


    @GetMapping("/chuyenbay")
    public  List<ChuyenBay> fiBays(){
        return  chuyenBayService.findChuyenBays();
    }


    @GetMapping("/chuyenbay/{gaden}")
    public  List<ChuyenBay> getChuyenByByGaden(@PathVariable("gaden") String gaden){

List<ChuyenBay> chuyenBays= chuyenBayService.findChuyenBaysByGaden(gaden);
System.err.println(gaden);
        return  chuyenBays ;
    }

}