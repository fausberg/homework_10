package task_1;

public class StaticMethod {
    public static void xBlock(String d, int x) {
        String xcopy = String.valueOf(x);
        xcopy = xcopy + xcopy + xcopy + xcopy;
        String dcopy = d;
        while (dcopy.contains(xcopy)) {
            System.out.print(xcopy);
            System.out.print(" ");
            dcopy = dcopy.replaceFirst(xcopy, "*");
        }
        System.out.println();
    }

    public static void yReplace(String d, String y) {
        String dcopy = d;
        while (dcopy.contains(y)) {
            dcopy = dcopy.replaceFirst(y, "*");
        }
        System.out.println(dcopy);
    }

    public static String xReplace(String d, int x) {
        String xcopy = String.valueOf(x);
        String dcopy = d;
        if (dcopy.contains("-")) {
            dcopy = dcopy.replace("-", "/");
        }
        while (dcopy.contains(xcopy)) {
            dcopy = dcopy.replaceFirst(xcopy, "");
        }
        if (dcopy.contains("//")) {
            dcopy = dcopy.replace("//", "/");
            dcopy = dcopy.replaceFirst("/", "");
        }
        System.out.println(dcopy);
        return dcopy;
    }

    public static String xReplace1(String d, int x) {
        String xcopy = String.valueOf(x);
        String dcopy = d;
        if (dcopy.contains("-")) {
            dcopy = dcopy.replace("-", "/");
        }
        while (dcopy.contains(xcopy)) {
            dcopy = dcopy.replaceFirst(xcopy, "");
        }
        if (dcopy.contains("//")) {
            dcopy = dcopy.replace("//", "/");
            dcopy = dcopy.replaceFirst("/", "");
        }
        return dcopy;
    }

    public static void sb(Document document) {
        StringBuilder test = new StringBuilder();
        test.append("Letters:").append(xReplace1(document.documentNumber(document.getX(), document.getY()), document.getX()));
        String test1 = String.valueOf(test);
        test1 = test1.toUpperCase();
        System.out.println(test1);
    }

    public static void posl(String d){
        String test = d;
        String test1 = test.toUpperCase();
        if(test.contains("abc") || test1.contains("ABC")){
            System.out.println("Есть");
        }else{
            System.out.println("Нет");
        }
    }

    public static void checkStart(String d){
        if(d.startsWith("555")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void checkEnd(String d){
        if(d.startsWith("1a2b")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
