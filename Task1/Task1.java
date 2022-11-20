// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий 
// новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//  Если длины массивов не равны, необходимо как-то оповестить пользователя.
// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов 
// не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.
package Task1;

import java.util.ArrayList;


public class Task1 {

    public static ArrayList GetDiffArray(int arr1[], int arr2[]) throws Exception {
        if (arr1.length != arr2.length)
            throw new Exception("Нельзя выполнить операцию, так как массивы разной длины");
        ArrayList<Integer> findArray = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            findArray.add(arr1[i] - arr2[i]);
        }
        return findArray;
    }

    public static ArrayList GetQuoArray(int arr1[], int arr2[]) throws Exception {
        if (arr1.length != arr2.length)
            throw new Exception("Нельзя выполнить операцию, так как массивы разной длины");
        ArrayList<Integer> findArray = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            findArray.add(arr1[i] / arr2[i]);
        }
        return findArray;
    }

    public static void main(String[] args) {
        int firstArray[] = { 10, 34, 43, 84, 29, 59, 62 };
        int sacondArray[] = { 5, 2, 8, 4, 9, 10, 3 };

        try {
            ArrayList<Integer> resultDiffArray = GetDiffArray(firstArray, sacondArray);
            System.out.println(resultDiffArray);
            ArrayList<Integer> resultQuoArray = GetQuoArray(firstArray, sacondArray);
            System.out.println(resultQuoArray);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}