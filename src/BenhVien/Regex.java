package BenhVien;

import java.util.Scanner;

public class Regex {
    public String inputNgayXuatNHapVien() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String regexName = "^[0-9]{2}[-|/]\\d{2}[-|/]\\d{4}$";
        while (true) {
            name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("Ngày Không được để trống");
                continue;
            }
            if (name.matches(regexName)) {
                return name;
            }
            System.out.println("Ngày  không đúng định dạng lại :");

        }
    }
    public String inputMaBenhNhan() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String regexName = "^[A-Z]{3}\\s[0-9]{1,4}$";
        while (true) {
            name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("Mã Không được để trống");
                continue;
            }
            if (name.matches(regexName)) {
                return name;
            }
            System.out.println(" Mã  không đúng định dạng lại :");

        }
    }
    public String inputId (){
        Scanner scanner = new Scanner(System.in);
        String Int ;
        String regexInt = "^[0-9]{1,3}$";
        while (true){
            Int = scanner.nextLine();
            if (Int.isEmpty()){
                System.out.println("Id không để trống");
                continue;
            }
            if (Int.matches(regexInt)){
                return Int;
            }
            System.out.println("NHập id đúng định dạng");
        }
    }

}
