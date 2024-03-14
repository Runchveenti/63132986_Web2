package runchvt.DisplayListObject.services;

import org.springframework.stereotype.Service;

@Service
public interface SinhvienService {
	public Page<SinhVien> findPaginated(Pageable pageable);
     
   
}