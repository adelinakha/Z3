package org.KhairullinaA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Объявление переменных для хранения информации о транзакциях
        int[] transactionIds = new int[5];
        double[] amounts = new double[5];
        String[] transactionDates = new String[5];
        String[] transactionDescriptions = new String[5];
        boolean[] transactionStatuses = new boolean[5];

        int transactionCount = 0; // Счетчик введенных транзакций

        // Чтение информации о транзакциях в бесконечном цикле

        while (transactionCount < 5) {

            System.out.println("Введите информацию для транзакции " + (transactionCount + 1) + ":");

            System.out.print("Идентификатор транзакции: ");
            transactionIds[transactionCount] = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            System.out.print("Сумма транзакции: ");
            amounts[transactionCount] = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера

            System.out.print("Дата транзакции (например, 2023-02-22): ");
            transactionDates[transactionCount] = scanner.nextLine();

            System.out.print("Описание транзакции: ");
            transactionDescriptions[transactionCount] = scanner.nextLine();

            System.out.print("Статус транзакции (true - выполнена, false - не выполнена): ");
            transactionStatuses[transactionCount] = scanner.nextBoolean();
            scanner.nextLine(); // Очистка буфера

            transactionCount++; // Увеличение счетчика транзакций
            System.out.println(); // Пустая строка для разделения транзакций
        }

        // Вывод информации о транзакциях
        System.out.println("Информация о транзакциях:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Транзакция " + (i + 1) + ":");
            System.out.println("Идентификатор: " + transactionIds[i]);
            System.out.println("Сумма: " + amounts[i]);
            System.out.println("Дата: " + transactionDates[i]);
            System.out.println("Описание: " + transactionDescriptions[i]);
            System.out.println("Статус: " + (transactionStatuses[i] ? "Выполнена" : "Не выполнена"));
            System.out.println(); // Пустая строка для разделения транзакций
        }

        scanner.close();
    }
}
