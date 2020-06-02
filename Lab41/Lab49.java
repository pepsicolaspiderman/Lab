package Lab41;

public class Lab49 {
    public static int m() {         //генерация исключения в методе
        try {
            System.out.println("0");
            return 55;              //выход из метода
        }
        finally {
            System.out.println("1");
        }
    }
    public static void main(String[]args) {
        System.out.println(m());
    }
}
