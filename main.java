import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        scanner.close();

        String result = ReverseWords.processText(input);
        System.out.println("Результат:");
        System.out.println(result);
    }
}