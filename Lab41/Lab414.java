package Lab41;

public class Lab414 {
    public static void m(int x) throws ArithmeticException {
        int h = 10/x;
    }
    public static void main(String[]args) {     //метод порожденный другим методом
        try {                                   //обработка исключения
            int l = args.length;
            System.out.println("Размер массива= " + l);
            m(1);
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль ");
        }
    }
}
