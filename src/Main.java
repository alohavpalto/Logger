import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Logger logger = Logger.getInstance();
    logger.log("Запускаем программу");
    logger.log("Просим пользователя ввести входные данные для списка");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите размер списка: ");
    String input = scanner.next().replaceAll("\\*", "");
    int size = Integer.parseInt(input);
    System.out.print("Введите верхнюю границу для значений: ");
    input = scanner.next().replaceAll("\\*", "");
    int maxValue = Integer.parseInt(input);
    List<Integer> list = new ArrayList<>();
    logger.log("Создаём и наполняем список");
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      int num = random.nextInt(maxValue + 1);
      list.add(num);
    }
    System.out.println("Вот случайный список: " + list.toString());
    logger.log("Просим пользователя ввести входные данные для фильтрации");
    System.out.print("Введите порог для фильтра: ");
    input = scanner.next().replaceAll("\\*", "");
    int threshold = Integer.parseInt(input);

    Filter filter = new Filter(threshold);
    List<Integer> filteredList = filter.filterOut(list);
    logger.log("Выводим результат на экран");
    System.out.println("Отфильтрованный список: " + filteredList.toString());
    logger.log("Завершаем программу");
  }
}

