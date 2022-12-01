// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Seminar2;

import java.util.Scanner;

public class Task1 {

    public static float UserInput(String messege) {
        Scanner scanInp = new Scanner(System.in);
        float num;
        while (true) {
            System.out.println(messege);
            try {
                num = Float.parseFloat(scanInp.next());
                System.out.println("Поздравляю, вы ввели " + num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Нужно ввести дробное число");

            }
        }
        return num;
    }

    public static void main(String[] args) {
        float number = UserInput("Введите дробное число.");

    }
}
