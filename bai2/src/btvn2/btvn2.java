package btvn2;

import java.util.Scanner;
public class btvn2 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
private static boolean isPrime(int number){
        if (number==1||number==2){
            return  false;
        }
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number %i==0){
        return false;
    }
}
    return  true;
}}