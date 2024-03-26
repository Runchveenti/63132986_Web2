package thiGK.ntu63132986.QLNhanVien.Models;

public class NhanVien {
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
    
    public String getChucVu() {
        return chucVu;
    }
    
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    
    public String getDiaChi() {
        return diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSoDienThoai() {
        return soDienThoai;
    }
    
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    public NhanVien(String maSoNV, String hoVaTen, String chucVu, String diaChi, String email, String soDienThoai) {
        this.maSoNV = maSoNV;
        this.hoVaTen = hoVaTen;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }
}
