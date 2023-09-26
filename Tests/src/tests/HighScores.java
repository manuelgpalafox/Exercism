package tests;

import java.util.*;

public class HighScores {

    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(3);
        HighScores scores = new HighScores(Arrays.asList(20, 10, 30));
        for (int score : scores.scores()) {
            System.out.println("score = " + score);
        }
        System.out.println("scores.latest() = " + scores.latest());
        System.out.println("scores.personalBest() = " + scores.personalBest());
        var mafak = scores.personalTopThree();
        for (int score : mafak) {
            System.out.println("score = " + score);
        }
    }

    public HighScores(List<Integer> highScores) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.list = highScores;
    }

    List<Integer> scores() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.list;
    }

    Integer latest() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int lisSize = list.size();
        return list.get(lisSize - 1);
    }

    Integer personalBest() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return Collections.max(list);
    }

    List<Integer> personalTopThree() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
    }
}
