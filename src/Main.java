import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // задание 1
        System.out.print("Введите строку: ");
        String a = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String b = scanner.nextLine();
        int h = c(a, b);
        System.out.println("Подстрока \"" + b + "\" встречается в строке \"" + a + "\" " + h + " раз");
        // задание 2
        String kaka = a.replaceAll("кака|бяка", "вырезано цензурой");
        System.out.println(kaka);
        // задание 3,4
        System.out.println("Введите дату формата 31.12.2020: ");
        String q = scanner.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(q);
            String formattedDate = outputFormat.format(date);
            System.out.println(formattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static int c(String a, String b) {
        int h = 0;
        int j = 0;

        while ((j = a.indexOf(b, j)) != -1) {
            h++;
            j += b.length();
        }
        return h;
    }
}