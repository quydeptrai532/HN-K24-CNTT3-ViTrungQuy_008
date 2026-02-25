package Cau2;
import java.util.Scanner;
public class Cau2Phan2 {
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
            int maxCount=1;
            int soXuatHienNhieuNhat=arr[0];
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                    if(count>maxCount){
                        maxCount=count;
                        soXuatHienNhieuNhat=arr[i];
                    }
                }
            }
            System.out.println("So xuat hien nhieu nhat trong mang la:" +soXuatHienNhieuNhat + "So lan xuat hien: " +maxCount);
        }
    }
}
