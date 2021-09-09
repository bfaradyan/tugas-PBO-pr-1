package PBO_pr;

public class ganjilgenap {
    public static void main(String[] args) {
        int[] arr = {1,2,7,12,143,312,1245,1556,355664,454452,565653,12321415};
        System.out.println("Menentukan bilangan Ganjil dan Genap pada Array");
        System.out.print("Bilangan Genap : ");
        for(int x=0; x<arr.length; x++) {
            if(arr[x]% 2 == 0) {
                System.out.print(arr[x] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil : ");
        for(int x=0; x<arr.length; x++) {
            if(arr[x] % 2!=0) {
                System.out.print(arr[x] +" ");
            }
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
    }
}