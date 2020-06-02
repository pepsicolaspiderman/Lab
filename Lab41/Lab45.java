package Lab41;

public class Lab45 {
    public static void main(String[]args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");   //создан экземпляр с сообщением
        }
        catch (NullPointerException e) {    //исключение не перехвачено
            System.out.println("1");
        }
        System.out.println("2");
    }
}
