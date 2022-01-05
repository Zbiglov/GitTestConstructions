package com.zbiglov.test;


import java.io.IOException;
import java.util.Scanner;

public class GitTestLearnConstructions {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите игру : Угадай число - 1, Угадай букву - 2");
            switch (scanner.nextInt()) {
                case 1:
                number(scanner);
                break;
                case 2:
                letters();
                break;
                case 3:
                    break;
                default:
            }       System.out.println("Unsuitable action, please, try again\n");
        }
    }

    private static void letters() throws IOException {
        char ch, ignore, answer = (char) ((Math.random() * 26) + 1);
        do {
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");
            // Получить символ с клавиатуры
            ch = (char) System.in.read();
            // Отбросить все остальные символы во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print(" ... Извините, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        }  while(answer != ch);
    }

    private static void number(Scanner scanner) {
        int a, z = (int) (Math.random() * 10) + 1;

        do {
            System.out.println("Угадайте число от 1 до 10");
            a = scanner.nextInt();
            if (a == z) {
                System.out.println("** Правильно! ** Вы угадали число");
            } else {
                System.out.print("-- Неверно!!! --\nугадываемое число ");
                if (a > z) System.out.println(">>>> МЕНЬШЕ <<<<");
                else System.out.println(">>>> БОЛЬШЕ <<<<");
                System.out.println("Повторите попытку!\n");
            }

        } while (z != a);
    }
}
