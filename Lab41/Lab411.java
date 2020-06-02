package Lab41;

public class Lab411 {
    public static void main(String[]args) { //использован вариант блока try-catch-finally
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        }
        catch (NullPointerException e) {
            System.out.println("1");
        }
        finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
