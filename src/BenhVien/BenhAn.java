package BenhVien;

public class BenhAn {
        private int soBenhAn;
        private String  tenBenhAn;
        private String maBenhNhan;
        private String ngayNhapVien;
        private String ngayRaVien;
        private String lyDoNhapVien;
        private static int idSoBenhNhan = 0;

    public BenhAn( String tenBenhAn, String maBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.soBenhAn = ++idSoBenhNhan;
        this.tenBenhAn = tenBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSoBenhAn() {
        return soBenhAn;
    }

    public void setSoBenhAn(int soBenhAn) {
        this.soBenhAn = soBenhAn;
    }

    public String getTenBenhAn() {
        return tenBenhAn;
    }

    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "soBenhAn=" + soBenhAn +
                ", tenBenhAn='" + tenBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
}
