import java.util.Scanner;
package com.company;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше предложение: ");
        String userStr = scan.nextLine();
        System.out.print("Ваши символы без пробелов: " + userStr.replace(" ", ""));
    }
}
