import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Base {
    public static void main(String[] args) throws IOException {
        System.out.println("Вводим данные через пробелы. Число - знак действия - число.");
        System.out.println("Работа осуществляется и с римскими и с арабскими цифрами.");
        System.out.println("Целые числа от 1 и I до 10 и X соответсвенно.");

        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String retval : input.split(" ", 50)) {
                list.add(retval);
            }
            Footing.logic(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Данные не верны, попробуй еще раз");
        }
        System.exit(0);
    }

}

