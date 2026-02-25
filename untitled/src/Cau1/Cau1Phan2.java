package Cau1;
import java.util.Scanner;
public class Cau1Phan2 {

    public static void main(String[] args) {
        //Nhập và kiểm tra dữ liệu đầu vào
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap vao chuoi can kiem tra:");
        String string=sc.nextLine();
        if(string==null||string.length()==0){
            System.out.println("Chuoi nhap vao khong hop le");
        }
        else {
            //Logic
            boolean doixung=true;
            for(int i=0;i<string.length()/2;i++){
                if(string.charAt(i)!=string.charAt(string.length()-1-i)){
                    doixung=false;
                    break;
                }
            }
            if(doixung){
                System.out.println("Chuoi nhap vao la chuoi doi xung");
            }
            else {
                System.out.println("Chuoi nhap vao khong doi xung");
            }
        }
    }

}
