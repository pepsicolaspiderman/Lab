package Lab41;

public class Lab410 {
    public static int m() {     //генерация исключения метода
        try {
            System.out.println("0");
            return 15;          //использование оператора return в секции try
        }
        finally {
            System.out.println("1");
            return 20;          //использование оператора return в секции finally
        }
    }
    public static void main(String[]args) {
        System.out.println(m());
    }
}
