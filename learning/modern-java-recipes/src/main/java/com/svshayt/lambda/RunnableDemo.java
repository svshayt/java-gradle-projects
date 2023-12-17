package com.svshayt.lambda;

public class RunnableDemo {
    public static void main(String[] args) {
        // Анонимный внутренний класс, реализующий интерфейс Runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("внутри Runnable в анонимном внутреннем классе");
            }
        }).start();

        // Использование лямбда-выражения в конструкторе Thread
        new Thread(() -> System.out.println("внутри конструктора Thread с использованием лямбды")).start();

        // Присваивание лямбда-выражения переменной
        Runnable runnable = () -> System.out.println("лямбда-выражение, реализующее метод run");
        new Thread(runnable).start();
    }
}
