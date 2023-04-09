package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Question {
    protected String regex;

    public abstract String getAnswer();

    public boolean matches(String input) {
        return input.matches(regex);
    }
}

class HourlyWageQuestion extends Question {
    public HourlyWageQuestion() {
        this.regex = ".*(what is|what's)\\s+my\\s+(current\\s+)?hourly wage.*";
    }

    public String getAnswer() {
        return "Your current hourly wage is 13 pounds per hour.";
    }
}

class SalaryQuestion extends Question {
    public SalaryQuestion() {
        this.regex = ".*(what is|what's)\\s+my\\s+(current\\s+)?salary.*";
    }

    public String getAnswer() {
        return "Your current salary is 32,000 pounds per year.";
    }
}

class BenefitsQuestion extends Question {
    public BenefitsQuestion() {
        this.regex = ".*(what are|what's)\\s+the\\s+company's\\s+benefits.*";
    }

    public String getAnswer() {
        return "The company offers a range of benefits, including health insurance, retirement plans, and paid time off.";
    }
}

class OvertimePolicyQuestion extends Question {
    public OvertimePolicyQuestion() {
        this.regex = ".*(what is|what's)\\s+the\\s+company's\\s+policy\\s+on\\s+overtime.*";
    }

    public String getAnswer() {
        return "The company pays time-and-a-half for overtime worked, and requires all overtime to be approved in advance by a supervisor.";
    }
}
