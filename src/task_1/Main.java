package task_1;

public class Main {
    public static void main(String[] args) {
        Document document = new Document(2, "r");
        document.documentNumber(document.getX(), document.getY());
        StaticMethod.xBlock(document.documentNumber(document.getX(), document.getY()), document.getX());
        StaticMethod.yReplace(document.documentNumber(document.getX(), document.getY()), document.getY());
        StaticMethod.xReplace(document.documentNumber(document.getX(), document.getY()), document.getX());
        StaticMethod.sb(document);
        StaticMethod.posl(document.documentNumber(document.getX(), document.getY()));
        StaticMethod.checkStart(document.documentNumber(document.getX(), document.getY()));
        StaticMethod.checkEnd(document.documentNumber(document.getX(), document.getY()));
    }
}