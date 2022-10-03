package task5;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello fospg fispdf");

        for (int i = 0; i < stringBuilder.length(); i++){
            if(i % 2 != 0){
                continue;
            }
            stringBuilder = stringBuilder.insert(i+1,stringBuilder.charAt(i));
        }

        System.out.println(stringBuilder);

    }
}
