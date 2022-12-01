// Если необходимо, исправьте данный код (задание 2)

package Seminar2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int intArray[] = { 1, 2, 33, 4, 5, 6, 7, 8, 9 };
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
// Тут я не очень понял что нужно было исправить. В коде я просто добавил массив.
