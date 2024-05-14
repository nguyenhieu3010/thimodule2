package BenhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachBenhAn {
    public static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/BenhVien/MyFile.txt";
    List<BenhAn> danhSach = new ArrayList<>();

    public int findById(int id){
        for (int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getSoBenhAn() == id ){
                return i;
            }
        }
        return -1;
    }
    public BenhAn findBenhAn(int id) {
        if (findById(id) == -1){
            System.out.println("**** KHÔNG TÌM THẤY SẢN PHẨM ****");;
        }
        return danhSach.get(findById(id));
    }
    public void showBenhAn(){
        if (danhSach.isEmpty()) {
            System.out.println("Chưa có sản phâm nào trong ");
        } else {
            for (BenhAn benhAn : danhSach){
                System.out.println(benhAn);
            }
        }
    }
    public void addBenhAn (BenhAn benhAn){
        danhSach.add(benhAn);
    }
    public void removeBenhAn (int id){
        int index = findById(id);
        danhSach.remove(index);
    }
    public void readFile(){
        try {
            FileReader reader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] txt = line.split(",");
                BenhAn benhAn = new BenhAn(txt[0],txt[1],txt[2],txt[3],txt[4] );
                danhSach.add(benhAn);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void witeFile(){
        try{
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhAn benhAn:danhSach){
                String line = benhAn.getTenBenhAn() + "," + benhAn.getMaBenhNhan() + "," + benhAn.getNgayNhapVien() + "," + benhAn.getNgayRaVien() + "," + benhAn.getLyDoNhapVien() ;
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
