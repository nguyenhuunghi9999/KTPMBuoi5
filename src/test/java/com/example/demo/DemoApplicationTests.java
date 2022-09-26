package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.ChuyenBayService;
import com.example.demo.service.MayBayService;
import com.example.demo.service.NhanVienService;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private ChuyenBayService chuyenBayService;

    @Autowired
    private MayBayService mayBayService;

    @Autowired
    private NhanVienService nhanVienService;

	@Test
	void cau01() {
		System.out.println("Câu 01");
		chuyenBayService.findChuyenBaysByGaden("DAD").stream().forEach(chuyenBay -> {
			System.out.println(chuyenBay.toString());
		});
	}

	@Test
	void cau02() {
		System.out.println("Câu 02");
		mayBayService.findMayBaysTamBayFrom().stream().forEach(mb -> {
			System.out.println(mb.toString());
		});
	}


	@Test
	void cau03() {
		System.out.println("Câu 03");
		nhanVienService.findNhanViensLuong().stream().forEach(nv -> {
			System.out.println(nv.toString());
		});
	}
}