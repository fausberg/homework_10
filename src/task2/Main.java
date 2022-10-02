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
        strcopy = str;
        System.out.println(strcopy);

        String str1 = strcopy.substring(0,strcopy.indexOf(" "));
        strcopy = strcopy.substring(strcopy.indexOf(" ")+1);
        int min = str1.length();
        String copy = str1;

        for(int i = 0; i < schet; i++){
            if(i == schet - 1){
                str1 = strcopy.substring(0);
                strcopy = null;
            }else {
                str1 = strcopy.substring(0,str.indexOf(" "));
                strcopy = strcopy.substring(strcopy.indexOf(" ") + 1);
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

