package task3;

import java.util.Arrays;

public class Arr {
    public static int zapolnenie(String str) {
        String[] str1 = new String[str.length()];
        for (int i = 0; i < str1.length; i++) {
            str1[i] = str.substring(0, 1);
            str = str.substring(1);
        }
        int num = 0;
        for (int i = 0; i < str1.length; i++) {
            for (int j = str1.length - 1; j > i; j--) {
                if(str1[j].equals("*")){
                    continue;
                }
                if (str1[i].equals(str1[j])) {
                    num++;
                    str1[j] = "*";
                }
            }
            str1[i] = "*";
        }
        return num;
    }
}
