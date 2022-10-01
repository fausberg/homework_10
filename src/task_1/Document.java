package task_1;

public class Document {
    private int x;
    private String y;

    public Document(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String documentNumber(int x, String y){
        String document = "xxxx-yyy-xxxx-yyy-xyxy";
        String e = String.valueOf(x);
        document = document.replace("x",e);
        document = document.replace("y", y);
        return document;
    }


}
