package runchvt.DisplayListObject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import runchvt.DisplayListObject.models.SinhVien;
@Controller
public class SinhVienController {
	static List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
	static {
				dsSinhVien.add(new SinhVien("0001", "Ngọc Anh Thư"));
				dsSinhVien.add(new SinhVien("0002", "Trần Hoàng Vũ My"));
				dsSinhVien.add(new SinhVien("0003", "Nguyễn Trần Thanh Nhã"));
				dsSinhVien.add(new SinhVien("0004", "Nguyễn Ngọc Cát Tiên"));
				dsSinhVien.add(new SinhVien("0005", "Tống Nguyễn Thy Hoàng"));
				dsSinhVien.add(new SinhVien("0006", "Nguyễn Khánh"));
	}
	@GetMapping("/danhsachSV")
	public String listStudent(ModelMap mm) {
		mm.addAttribute("dsSV", dsSinhVien);
		return "sinhvien_getAll";
	}
}
