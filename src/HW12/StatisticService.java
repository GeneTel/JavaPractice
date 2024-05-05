package HW12;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class StatisticService {
    public List<String> popularWord (List<String> word, int amount){
        return word.stream()
                .distinct()
                .sorted(Comparator.comparingInt(s -> Collections.frequency(word, s)).reversed())
                .limit(amount)
                .toList();
    }
    public int uniqueWords (List<String> words){
        return new HashSet<>(words).size();
    }

    public void save (Statistic statistic, File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(statistic.toString());
        writer.close();
        }
    }

