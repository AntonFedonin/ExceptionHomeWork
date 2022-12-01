// Разработайте программу, которая выбросит Exception, когда 
// пользователь вводит пустую строку. Пользователю должно показаться 
// сообщение, что пустые строки вводить нельзя.

package Seminar2;

import java.util.Scanner;

public class Task4 {
    public static String UserInput(String messege) throws Exception {
        System.out.println(messege);
        String ex = "";
        Scanner scanInp = new Scanner(System.in);
        String name = scanInp.nextLine();
        if (name == ex)
            throw new Exception("Нельзя оставить строку пустой");
        return name;
    }

    public static void main(String[] args) {
        try {
            String name = UserInput("Как тебя зовут?");
            System.out.println("Привет " + name + "!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
