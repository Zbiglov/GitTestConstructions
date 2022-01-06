package com.zbiglov.test;
import java.util.Random;
import java.util.Scanner;

public class GitTestLearnConstructions {
    static String s = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите: 1 для запуска игры \"Угадай число\".\n" +
                    "Введите: 2 для запуска игры \"Угадай букву\".\n" +
                    "Введите: 3 для выхода.");

            switch (scanner.nextInt()) {
                case 1:
                    number(scanner);
                    break;
                case 2:
                    letters(scanner);
                    break;
                case 3:
                    System.out.println("За время сеанса введено " + s.length() + " не верных ответов. Ваши варианты: ");
                    System.out.print("[");
                    for (int i = 0; i < s.length() - 1; i++) {
                        System.out.print(s.charAt(i) + ", ");
                    }
                    System.out.print(s.charAt(s.length() - 1));
                    System.out.println("]");

                    return;
                default:
                    System.out.println("Введеные данные - не верны, попробуйте вновь!\n");
                    break;
            }
        }

    }

    private static void letters(Scanner scanner) {
        Random random = new Random();
        char ch, answer = (char) ((random.nextInt(26) + 65));
        System.out.println(answer);// ответ
        do {
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");
            // Получить символ с клавиатуры
            ch = scanner.next().toUpperCase().charAt(0);
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print(" ... Извините, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
                countingMethod(Character.toString(ch));
            }
        }  while(answer != ch);
    }


    private static void number(Scanner scanner) {
        Random random = new Random();
        int a, z = random.nextInt(10) + 1;
        System.out.println(z); // ответ
        do {
            System.out.println("Угадайте число от 1 до 10");
            a = scanner.nextInt();
            if (a == z) {
                System.out.println("** Правильно! ** Вы угадали число\n");
            } else {
                System.out.print("-- Неверно!!! --\nугадываемое число ");
                if (a > z) System.out.println(">>>> МЕНЬШЕ <<<<");
                else System.out.println(">>>> БОЛЬШЕ <<<<");
                System.out.println("Повторите попытку!\n");
                countingMethod(Integer.toString(a));
            }
        } while (z != a);
    }

    static void countingMethod(String str) {
        s = s.concat(str);
    }
}
