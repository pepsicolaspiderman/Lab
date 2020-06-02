package Lab41;

public class Lab48{
    public static int m(){  //генерация исключения в методе
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }
        finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}