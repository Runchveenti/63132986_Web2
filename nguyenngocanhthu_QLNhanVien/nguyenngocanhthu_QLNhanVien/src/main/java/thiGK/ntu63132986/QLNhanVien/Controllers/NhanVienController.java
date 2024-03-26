package thiGK.ntu63132986.QLNhanVien.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu63132986.QLNhanVien.Models.*;
import thiGK.ntu63132986.QLNhanVien.Services.*;
@Controller
public class NhanVienController {
	 @Autowired
	 private NhanVienService nvService;
	 
	@GetMapping("/danhsachNV")
	public String listEmployee(Model model,  
								@RequestParam("page") Optional<Integer> page,
								@RequestParam("size") Optional<Integer> size) {
		final int currentPage = page.orElse(1);
        final int pageSize = size.orElse(5);
        Page<NhanVien> nvPage = nvService.findPaginated(PageRequest.of(currentPage - 1, pageSize));
		model.addAttribute("dsNV", nvPage);
		
		int totalPages = nvPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                .boxed()
                .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "nhanvien_getAll_Paged";
	}
}