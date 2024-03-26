package thiGK.ntu63132986.QLNhanVien.Services;

import org.springframework.stereotype.Service;
import thiGK.ntu63132986.QLNhanVien.Models.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
@Service
public interface NhanVienService {
	public Page<NhanVien> findPaginated(Pageable pageable);
     
   
}