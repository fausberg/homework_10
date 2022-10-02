package task2;

import jdk.jshell.JShell;

public class Main {
    public static void main(String[] args) {
        String str = "jfdjk jgkdfhjkg gfdjkhgj sdf";
        int schet = 0;
        String strcopy = str;

        while (strcopy.contains(" ")) {
            strcopy = strcopy.replaceFirst(" ", "");
            schet++;
        }
        System.out.println(schet);

        String str1 = str.substring(0,str.indexOf(" "));
        str = str.substring(str.indexOf(" ")+1);
        int min = str1.length();
        String copy = str1;

        for(int i = 0; i < schet; i++){
            if(i == schet - 1){
                str1 = str.substring(0);
                str = null;
            }else {
                str1 = str.substring(0,str.indexOf(" "));
                str = str.substring(str.indexOf(" ") + 1);
            }
            if(min >= str1.length()){
                min = str1.length();
                copy = str1;
            }
        }

        System.out.println(min);
        System.out.println(copy);
    }

}

