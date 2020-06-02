package Lab41;

public class Lab46 {
    public static void main(String[]args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        }
        catch (ArithmeticException e) {
            System.out.println("1");
        }
        catch (Exception e) {
            System.out.println("2");
        }
        catch (RuntimeException e) {    /*Программа не запустится, предок
            System.out.println("3");    не должен перехватывать раньше потомкаов*/
        }
        System.out.println("4");
    }
}
