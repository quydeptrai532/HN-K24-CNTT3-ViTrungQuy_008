package Cau2;
import java.util.Scanner;
public class Cau2Phan1 {
    public static void main(String[] args) {
        //Nhập và kiểm tra dữ liệu đầu vào
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Moi ban nhap vao so phan tu cua mang (0<n<100)");
        n= sc.nextInt();
        if(n<0||n>100){
            System.out.println("So luong phan tu nhap vao khong hop le");
        }
        else {
            //Khai báo và nhập các phần tử của mảng
            int []arr=new int[n];
            boolean doixung=true;
            for (int i=0;i<arr.length;i++){
                System.out.println("Moi ban nhap vao phan tu thu :"+(i+1));
                arr[i]=sc.nextInt();
            }
            //Logic kiểm tra
            for(int i=0;i<n/2;i++){
                if(arr[i]!=arr[n-1-i]){
                    doixung=false;
                    break;
                }

            }
            if(doixung){
                System.out.println("Mang doi xung");
            }
            else {
                System.out.println("Mang khong doi xung");
            }
        }
    }
}
