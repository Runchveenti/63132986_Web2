package thiGK.ntu63132986.QLNhanVien.Services;

import org.springframework.stereotype.Service;

import thiGK.ntu63132986.QLNhanVien.Models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
@Service
public class NhanVienServicelmpl implements NhanVienService {
	// Ta hard-code dữ liệu tại đây  để tiện demo------ 
	static List<NhanVien> dsNhanVien=  new ArrayList<NhanVien>();
	static {
		dsNhanVien.add(new NhanVien("NV001", "Nguyễn Văn Anh", "Quản lý", "123 Đường ABC", "nguyenvananh@example.com", "123456789"));
        dsNhanVien.add(new NhanVien("NV002", "Trần Thị Bình", "Nhân viên", "456 Đường XYZ", "tranthibinh@example.com", "987654321"));
        dsNhanVien.add(new NhanVien("NV003", "Lê Văn Can", "Kế toán", "789 Đường HIJ", "levancan@example.com", "456123789"));
        dsNhanVien.add(new NhanVien("NV004", "Nguyễn Giao My", "Nhân viên", "123 Đường ABC", "nguyengiaomy@example.com", "323456789"));
        dsNhanVien.add(new NhanVien("NV005", "Lê Trọng Tín", "Nhân viên", "456 Đường XYZ", "letrongtin@example.com", "087654321"));
        dsNhanVien.add(new NhanVien("NV006", "Phạm Anh Hào", "Kế toán", "789 Đường HIJ", "phamanhhao@example.com", "756123789"));
	}
	//----------hết phần hard-code dữ liệu ---------------------
		@Override
		public Page<NhanVien> findPaginated(Pageable pageable) {
			int pageSize = pageable.getPageSize();
	        int currentPage = pageable.getPageNumber();
	        int startItem = currentPage * pageSize;
	        List<NhanVien> list;

	        if (dsNhanVien.size() < startItem) {
	            list = Collections.emptyList();
	        } else {
	            int toIndex = Math.min(startItem + pageSize, dsNhanVien.size());
	            list = dsNhanVien.subList(startItem, toIndex);
	        }
	        Page<NhanVien> sinhvienPage = new PageImpl<NhanVien>(list, PageRequest.of(currentPage, pageSize), dsNhanVien.size());
	        return sinhvienPage;
		}

	}