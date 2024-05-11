package HW12;

import javax.imageio.IIOException;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String dirLocation = "src/main/resources/";
    private static final String namePrefix = "%s_statistic.txt";

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        BookParser parser = new BookParser();
        StatisticService statisticService = new StatisticService();
        while (!exit) {
            System.out.println(Messages.PLEASE_ENTER_FILE_NAME);
            File book = new File(dirLocation + scanner.next());
            List<String> text = null;
            try {
                text = parser.getWords(book);
            } catch (FileNotFoundException e) {
                System.err.println((Messages.FILE_NOT_FOUND));
                continue;
            }
            List<String> top = statisticService.popularWord(text, 3);
            int uniqueWords = statisticService.uniqueWords(text);
            Statistic statistic = new Statistic(top, uniqueWords);

            try {
                new StatisticService()
                        .save(statistic, new File(String.format(dirLocation + namePrefix, book.getName())));
            } catch (IIOException e) {
                System.err.println(Messages.INTERNAL_ERROR);
                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println((statistic));
            System.out.println(Messages.EXIT);
            exit = !scanner.next().equals("n");
        }
        scanner.close();
    }
}
