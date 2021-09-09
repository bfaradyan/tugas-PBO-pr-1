package PBO_pr;

import java.util.Arrays;

public class binarysearch {
    public static void main(String args[]){
        int arr[] = {2,6,7,11,12,50,66,69,55};
        int kunci = 18;
        int hasil = Arrays.binarySearch(arr,kunci);
        if (hasil < 0) {
            System.out.println("angka tidak ditemukan");
        } else {
            System.out.println("angka ditemukan pada index : "+hasil);
        }
    }
}