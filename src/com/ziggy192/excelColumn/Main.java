package com.ziggy192.excelColumn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();
        char[]a = new char[27];
        for (char i = 'a'; i <= 'z'; i++) {
            a[i-'a'+1] = i;
        }

        String s = "";
        while (n>0){
            s=a[n % 26]+s;
            n = n / 26;
        }
        System.out.println(s);
    }
}
