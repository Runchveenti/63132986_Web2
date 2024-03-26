package thiGK.ntu63132986.QLNhanVien.Models;

public class DTONhanVien {
    private String maSoNV;
    private String hoVaTen;
    private String chucVu;
    private String diaChi;
    private String email;
    private String soDienThoai;
    
    public String getMaSoNV() {
        return maSoNV;
    }
    
    public void setMaSoNV(String maSoNV) {
        this.maSoNV = maSoNV;
    }
    
    public String getHoVaTen() {
        return hoVaTen;
    }
    
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    
    public DTONhanVien(String maSoNV, String hoVaTen, String chucVu, String diaChi, String email, String soDienThoai) {
        this.maSoNV = maSoNV;
        this.hoVaTen = hoVaTen;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public DTONhanVien() {
        super();
    }
}
