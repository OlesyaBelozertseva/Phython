/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.io.*;

public class Main {
    private static final String HISTORY_FILE = "history.txt";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Простой калькулятор");
        System.out.println("Доступные операции: +, -, *, /, //, %, ^, |число|");
        System.out.println("Введите 'история' для просмотра истории или 'выход' для завершения");
        
        while (true) {
            System.out.print("\nВведите выражение: ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("выход")) {
                break;
            } else if (input.equalsIgnoreCase("история")) {
                showHistory();
                continue;
            }
            
            try {
                double result = calculate(input);
                System.out.println("Результат: " + result);
                saveToHistory(input, result);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
    
    private static double calculate(String expr) throws Exception {
        // Обработка модуля |число|
        expr = expr.replaceAll("\\|([^|]+)\\|", "Math.abs($1)");
        
        // Обработка деления без остатка //
        expr = expr.replace("//", "/1/"); // временная замена
        
        // Разбиваем выражение на части
        String[] parts = expr.split(" ");
        if (parts.length < 3) {
            throw new Exception("Неверный формат выражения");
        }
        
        double num1 = Double.parseDouble(parts[0]);
        String op = parts[1];
        double num2 = Double.parseDouble(parts[2]);
        
        switch (op) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
            case "/1/": return (int)(num1 / num2); // целочисленное деление
            case "%": return num1 % num2;
            case "^": return Math.pow(num1, num2);
            default: throw new Exception("Неизвестная операция: " + op);
        }
    }
    
    private static void saveToHistory(String expr, double result) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE, true))) {
            writer.println(expr + " = " + result);
        } catch (IOException e) {
            System.out.println("Не удалось сохранить историю");
        }
    }
    
    private static void showHistory() {
        try (Scanner fileScanner = new Scanner(new File(HISTORY_FILE))) {
            System.out.println("\nИстория вычислений:");
            int i = 1;
            while (fileScanner.hasNextLine()) {
                System.out.println(i++ + ". " + fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("История пока пуста");
        }
    }
}