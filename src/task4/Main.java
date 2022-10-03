package task4;

import task3.Arr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите какое слово по счёту вы хотите проверить");
        int n = scanner.nextInt();
        String str = "lol kok mnm fjidsgj";

        int schet = 0;
        String strcopy = str;

        while (strcopy.contains(" ")) {
            strcopy = strcopy.replaceFirst(" ", "");
            schet++;
        }
        if(n > schet+1){
            System.out.println("Столько слов нет, есть только " + (schet + 1));
            System.out.println("Введите номер слова от 1 до " + (schet + 1));
            n = scanner.nextInt();
        }
        System.out.println(schet);

        strcopy = str;
        System.out.println(strcopy);

        StringBuilder reversestr;

        String str1;
        for(int i = 0; i < schet+1; i++){
            if(i == schet){
                str1 = strcopy.substring(0);
                strcopy = null;
            }else {
                str1 = strcopy.substring(0,str.indexOf(" "));
                strcopy = strcopy.substring(strcopy.indexOf(" ") + 1);
            }
            if (n - 1 == i) {
                reversestr = new StringBuilder(str1);
                reversestr.reverse();
                String str1copy = new String(reversestr);
                System.out.println(reversestr);
                if (str1.equals(str1copy)) {
                    System.out.println("Полиндром");
                } else {
                    System.out.println("Не полиндром");
                }
                reversestr = new StringBuilder();
            }
        }



    }
}
