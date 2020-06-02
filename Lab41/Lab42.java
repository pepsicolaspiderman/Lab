package Lab41;

public class Lab42 {
    public static void main(String[]args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); //создан экземпляр с сообщением
            System.out.println("1");
        }
        catch (Exception e) {               //исключение перехвачено перехватчиком предка
            System.out.println("2 " + e);   //исключение обработано
        }
        System.out.println("3");
    }
}
