package Cau3;
import java.util.Scanner;
public class Cau3 {
    public static void main(String[] args) {
        //Nhập và kiểm tra dữ liệu đầu vào
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Moi ban nhap vao so phan tu cua mang (0<n<100)");
        n= sc.nextInt();
        if(n<=0||n>100){
            System.out.println("So luong phan tu nhap vao khong hop le");
        }
        else {
            //Khai báo và nhập các phần tử của mảng
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Moi ban nhap vao phan tu thu :"+(i+1));
                arr[i]=sc.nextInt();
            }
            //Logic kiểm tra
            System.out.println("Moi ban nhap vao so K can tim");
            int k=sc.nextInt();
            int num1=0,num2=0;
            boolean found=false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if((arr[i]+arr[j])==k){
                        num1=arr[i];
                        num2=arr[j];
                        found=true;
                        break;
                    }
                }
            }
            if(!found){
                System.out.println(" Khong tim thay cap so thoa man yeu cau ");
            }
            else {
                System.out.println(" Cap so thoa man yeu cau la: So thu nhat: "+ num1 +" So thu 2: "+ num2);
            }
        }
    }
}
