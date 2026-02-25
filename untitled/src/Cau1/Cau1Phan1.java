package Cau1;
import java.util.Scanner;

public class Cau1Phan1 {
    public static void main(String[] args) {
        // Nhập và kiểm tra dữ liệu đầu vào
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap vao chuoi can kiem tra:");
        String string=sc.nextLine();
        if(string.length()==0||string==null){
            System.out.println("Chuoi nhap vao khong hop le");
        }
        else {
            //Khai báo các biến cần dùng
            int countNum=0,countLetter=0,countSpecial=0;
            //Logic Kiểm tra
            for(int i=0;i<string.length();i++){
                char c=string.charAt(i);
                if(Character.isLetter(c)){
                    countLetter++;
                } else  if(Character.isDigit(c)){
                    countNum++;
                }
                else {
                    countSpecial++;
                }
            }
            System.out.println("So chu so: " +countNum +" So chu cai: "+countLetter + " So ky tu dac biet : "+countSpecial);
        }

    }
}
