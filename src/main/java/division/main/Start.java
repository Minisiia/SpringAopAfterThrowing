package division.main;

import division.objects.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Реалізувати аспект виведення Exception.
 * Створити метод ділення чисел. У разі помилки: виводить її на екран.
 */

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Calculator calculator = (Calculator) context.getBean("calculator");
        System.out.println((char) 27 + "[34m" + "Calculator: " + (char) 27 + "[38m");
        try {
            System.out.println(calculator.divide(12, 3));
            System.out.println(calculator.divide(12, 0));
            System.out.println(calculator.divide(12, 4));
        } catch (ArithmeticException e) {
        }
    }
}
