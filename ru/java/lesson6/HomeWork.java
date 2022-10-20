package ru.java.lesson6;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String[][] questions = {
                {"Какого цвета апельсин?", "зеленого", "белого", "оранжевого"},
                {"Сколько пальцев на руке?", "3", "5", "2", "10", "1"},
                {"Когда на улице холоднее?", "зимой", "летом", "осенью", "весной"},
                {"Сколько дней в январе?", "30", "23", "31"},
                {}
        };
        int[] answers = {3, 2, 1, 3};
        Scanner sc = new Scanner(System.in);
        int correct = 0;
        int index = 0;
        for (String[] question : questions) {
            if (question.length < 2) continue;
            System.out.println(question[0]);
            for (int j = 1; j < question.length; j++) {
                if (question[j] == null) break;
                System.out.println(j + ". " + question[j]);
            }
            System.out.print("Ваш ответ: ");
            int answer = sc.nextInt();
            if (answer == answers[index]) {
                correct += 1;
                System.out.println(index % 2 == 0 ? "> Правильно" : "> Так держать!");
            }
            else {
                System.out.println(index % 3 == 0 ? "> Будьте внимательнее!" : "> Вы ошиблись!");
            }
            System.out.println("-------------------------------------");
            index++;
        }
        int lastDigit = correct % 10;
        String wordEnding = switch (lastDigit) {
            case 1 -> "";
            case 2, 3, 4 -> "а";
            default -> "ов";
        };
        System.out.println("Вы ответили верно на " + correct + " вопрос" + wordEnding + " из " + index);
    }
}
