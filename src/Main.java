import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            // Читаем две строки из файла
            String firstLine = scanner.nextLine();
            String secondLine = scanner.nextLine();
            scanner.close();

            // Парсим строки в целые числа
            int a = Integer.parseInt(firstLine);
            int b = Integer.parseInt(secondLine);

            // Выполняем деление
            int result = a / b;
            System.out.println("Результат деления: " + result);

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат числа. Убедитесь, что в файле только целые числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль.");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}