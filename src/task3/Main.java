package task3;

public class Main {
    public static void main(String[] args) {
        String str = "jfhdsjhjk aaaaaaaaaaaaa fkdsjf ffffff";

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

        int num = 0;
        String copy = str1;

        for(int i = 0; i < schet; i++){
            if(i == schet - 1){
                str1 = strcopy.substring(0);
                strcopy = null;
            }else {
                str1 = strcopy.substring(0,str.indexOf(" "));
                strcopy = strcopy.substring(strcopy.indexOf(" ") + 1);
            }
            if(num < Arr.zapolnenie(str1)){
                num = Arr.zapolnenie(str1);
                copy = str1;
            }
        }
        System.out.println(copy);
        System.out.println(num);

    }
}
