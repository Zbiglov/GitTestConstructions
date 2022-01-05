package com.zbiglov.test;


import java.util.Scanner;

public class GitTestLearnConstructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int z = (int) (Math.random() * 10) + 1;
        int a;


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
