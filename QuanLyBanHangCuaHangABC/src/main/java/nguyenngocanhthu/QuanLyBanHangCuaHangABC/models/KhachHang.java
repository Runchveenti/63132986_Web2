package nguyenngocanhthu.QuanLyBanHangCuaHangABC.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="khachhang")    // ten bang se mapping, chu y hoa-thuong
public class KhachHang {
	@Id
	@Column(name = "MAKH")
	private String maKhach;
	@Column(name = "HOTEN")
	private String hoTen;
	@Column(name = "DCHI")
	private String diaChi;
	@Column(name = "SODT")
	private String soDienThoai;
	@Column(name = "NGSINH")
	private String ngaySinh;
	@Column(name = "NGDK")
	private String ngayDangKy;
	@Column(name = "DOANHSO")
	private double doanhSo;
	// getter, setter
	public String getMaKhach() {
		return maKhach;
	}
	public void setMaKhach(String maKhach) {
		this.maKhach = maKhach;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getNgayDangKy() {
		return ngayDangKy;
	}
	public void setNgayDangKy(String ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}
	public double getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(double doanhSo) {
		this.doanhSo = doanhSo;
	}
	
}
