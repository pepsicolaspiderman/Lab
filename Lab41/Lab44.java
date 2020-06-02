package Lab41;

public class Lab44 {
    public static void main(String[]args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");   //создан экземпляр с сообщением
        }
        catch (NullPointerException e) {    //перехват исключение подходчщим классом
            System.out.println("1");        //обработка исключения
        }
        catch (Exception e) {               //перехват исключение подходчщим классом
            System.out.println("2");        //обработка исключения
        }
        catch (Error e) {                   //перехват исключение подходчщим классом
            System.out.println("3");        //обработка исключения
        }
        System.out.println("4");
    }
}
