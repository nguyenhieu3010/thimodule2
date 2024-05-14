package BenhVien;

import Input.Input;

import java.util.Scanner;

public class MenuBenhAn {
    DanhSachBenhAn danhSachBenhAn = new DanhSachBenhAn();
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        while (true){
            System.out.println("**** Menu ****");
            System.out.println("1.Thêm bệnh án");
            System.out.println("2. Xoá bệnh án ");
            System.out.println("3. Hiển thị danh sách bệnh án");
            System.out.println("4. thoát");
            int choice = Input.getInt();
            if(choice > 0 && choice < 4){
                switch (choice){
                    case 1:
                            add();
                            break;
                    case 2:
                            danhSachBenhAn.witeFile();
                            remove();
                            break;
                    case 3:
                            show();
                        danhSachBenhAn.readFile();
                            break;

                    case 4:
                            return;


                }

            }
            else {
                System.out.println("Không có lựa chọn phù hợp ");
            }

        }
    }
    public void add(){
        Regex regex = new Regex();
        System.out.println("Nhập tên bệnh án");
        String tenBenhan = scanner.nextLine();
        System.out.println("Nhập mã bệnh án");
        String maBenhAn = regex.inputMaBenhNhan();
        System.out.println("Nhập ngày nhập viện");
        String ngayNHapVien = regex.inputNgayXuatNHapVien();
        System.out.println("Nhập ngày xuất viện");
        String ngayXuatVien = regex.inputNgayXuatNHapVien();
        System.out.println("Lý do nhập viện");
        String lyDo = scanner.nextLine();
        BenhAn benhAn = new BenhAn(tenBenhan,maBenhAn,ngayNHapVien,ngayXuatVien,lyDo);
        danhSachBenhAn.addBenhAn(benhAn);
        System.out.println("**** Thêm Thành công ****");

    }

    public void remove(){

           Regex regex = new Regex();
            try {
                System.out.println("Nhập số bệnh án cần xoá :");
                int id = Integer.parseInt(regex.inputId());
                    while (true){
                        System.out.println("chon xoá");
                        System.out.println("1. yes");
                        System.out.println("2. no");
                        int choice = Input.getInt();
                        if (choice > 0 && choice < 3){
                            switch (choice){
                                case 1 :
                                    danhSachBenhAn.removeBenhAn(id);
                                    break;
                                case 2:
                                    return;
                            }
                        }
                    }

            }catch (Exception e){
                System.out.println(" Nhập Id không đúng");
                remove();
            }


        }
    public void show(){
        System.out.println("Danh sách bệnh án ");
        danhSachBenhAn.showBenhAn();
    }

}
