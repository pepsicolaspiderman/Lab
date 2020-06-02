package Lab41;

public class Lab43 {
    public static void main(String[]args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");   //создан экземпляр с сообщением
        }
        catch (NullPointerException e) {    //перехват исключение подходчщим классом
            System.out.println("1");        //исключение обработано
        }
        catch (RuntimeException e) {        //перехват исключение подходчщим классом
            System.out.println("2");        //исключение обработано
        }
        catch (Exception e) {               //перехват исключение подходчщим классом
            System.out.println("3");        //исключение обработано
        }
        System.out.println("4");
    }
}
