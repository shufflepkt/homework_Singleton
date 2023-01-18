import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускам программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер списка: ");
        int listRange = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        List<Integer> source = new ArrayList<>();
        Random random = new Random();

        logger.log("Создаём и наполняем список");
        for (int i = 0; i < listRange; i++) {
            source.add(random.nextInt(maxValue));
        }

        System.out.println("Вот случайный список: " + source.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int threshold = scanner.nextInt();

        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(source);
        logger.log("Выводим результат на экран\nОтфильтрованный список: " + result.toString());

        logger.log("Завершаем программу");
    }
}