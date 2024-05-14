package Input;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);
    public static int getInt(){
        try{
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println(" Đề nghị nhập số ");
        }
        return getInt();
    }
}
