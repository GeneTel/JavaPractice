package HW12;

import java.util.List;

public class Statistic {
    private final List<String> top10;
    private final int uniqueWords;
    public Statistic(List<String> top10, int uniqueWords){
        this.top10 = top10;
        this.uniqueWords = uniqueWords;
    }
    @Override
    public String toString() {
        return "Statistic{" +
                "top10=" + top10 +
                ", uniqueWords=" + uniqueWords +
                '}';
    }
}