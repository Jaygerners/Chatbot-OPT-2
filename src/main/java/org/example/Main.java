package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new HourlyWageQuestion());
        questions.add(new SalaryQuestion());
        questions.add(new BenefitsQuestion());
        questions.add(new OvertimePolicyQuestion());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please ask a question: ");
        String question = scanner.nextLine().toLowerCase();

        boolean foundAnswer = false;
        for (Question q : questions) {
            if (q.matches(question)) {
                System.out.println(q.getAnswer());
                foundAnswer = true;
                break;
            }
        }

        if (!foundAnswer) {
            System.out.println("I'm sorry, I don't know how to answer that question.");
        }

        scanner.close();
    }
}
