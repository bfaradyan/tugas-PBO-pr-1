package PBO_pr;

import java.util.Arrays;

public class dragonslayer {
    public static void main(String[] args) {
        int[] dragonkiller = { 4, 3, 1, 2};
        int[] dragons = { 7, 2 };
        Arrays.sort(dragonkiller);
        Arrays.sort(dragons);
        int varDragon = 10;
        int power = 17;
        for (int i : dragonkiller) {
            if (varDragon < dragons.length) {
                if (i >= dragons[varDragon]) {
                    power += i;
                    varDragon++;
                }
            }
        }
        if (varDragon == dragons.length) {
            System.out.println("Minimum Power : " + power);
        } else {
            System.out.println("Knight Fall");
        }
    }
}
