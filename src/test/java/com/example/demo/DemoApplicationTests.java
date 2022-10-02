package com.example.demo;


import com.example.demo.entity.ChuyenBay;
import com.example.demo.entity.MayBay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.ChuyenBayService;
import com.example.demo.service.MayBayService;
import com.example.demo.service.NhanVienService;

import java.util.List;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private ChuyenBayService chuyenBayService;

    @Autowired
    private MayBayService mayBayService;

    @Autowired
    private NhanVienService nhanVienService;

//	@Test
//	void cau01() {
//		System.out.println("Câu 01");
//		chuyenBayService.findChuyenBaysByGaden("DAD").stream().forEach(chuyenBay -> {
//			System.out.println(chuyenBay.toString());
//		});
//	}
//
//	@Test
//	void cau02() {
//		System.out.println("Câu 02");
//		mayBayService.findMayBaysTamBayFrom().stream().forEach(mb -> {
//			System.out.println(mb.toString());
//		});
//	}
//
//
//	@Test
//	void cau03() {
//		System.out.println("Câu 03");
//		nhanVienService.findNhanViensLuong().stream().forEach(nv -> {
//			System.out.println(nv.toString());
//		});
//	}

	@Test
	void cau04() {
		System.out.println("Câu 04");
		chuyenBayService.findChuyenBaysDoDai().stream().forEach(cb -> {
			System.out.println(cb.toString());
		});
	}

	@Test
	void cau05() {
		System.out.println("Câu 05");
		chuyenBayService.findChuyenBaysFromSGToBuonMaThuoc().stream().forEach(cb -> {
			System.out.println(cb.toString());
		});
	}

		@Test
	void cau06() {
		System.out.println("Câu 06");
		int total=0;
		List<ChuyenBay> list= chuyenBayService.totalsChuyenBaysFromSGN();
		for (ChuyenBay cb: list) {
		total++;
		}
		System.out.println("Có " + total + " chuyến bay xuất phát từ Sài Gòn");
	}

    @Test
    void cau07() {
        System.out.println("Câu 07");
        int total = 0;
        List<MayBay> list = mayBayService.findLoaiMayBaysBoeing();
        for (MayBay cb : list) {
            total++;
        }
        System.out.println("Có " + total + " máy bay loại Boeing");
    }

    @Test
    void cau08() {
        System.out.println("Câu 08");
      Float total = nhanVienService.getTotalSalaryAllNhanVien();
        System.out.println("Tổng số lương phải trả cho nhân viên: " + total);
    }

    @Test
    void cau09() {
        System.out.println("Câu 09");
        nhanVienService.findNhanViensGroupByLoaiMayBays().stream().forEach(cb -> {
			System.out.println(cb.getManv().toString() +":" +cb.getTen().toString() );
		});
    }

    @Test
    void cau10() {
        System.out.println("Câu 10");
        nhanVienService.findNhanViensByMaSo().stream().forEach(cb -> {
            System.out.println(cb.getTen().toString());
        });
    }

    @Test
    void cau11() {
        System.out.println("Câu 11");
        mayBayService.findMayBaysByTenNhanVien().stream().forEach(cb -> {
            System.out.println(cb.getMamb().toString());
        });
    }

	@Test
	void cau12() {
		System.out.println("Câu 12");
		nhanVienService.findNhanViensByLoaiMayBays().stream().forEach(cb -> {
			System.out.println(cb.getManv().toString() +":" +cb.getTen().toString() );
		});
	}

}