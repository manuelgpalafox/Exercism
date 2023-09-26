package tests;

import java.util.*;

public class DnDCharacter {

    static private int strength = ability(rollDice());
    static private int dexterity = ability(rollDice());

    //static private int constitution = ability(rollDice());
    static private int constitution = 3;

    static private int intelligence = ability(rollDice());
    static private int wisdom = ability(rollDice());
    static private int charisma = ability(rollDice());

    public static void main(String[] args) {
        //List<Integer> scores = rollDice();
        List<Integer> scores = List.of(4, 3, 2, 1);

        int points = ability(scores);
        for (Object score : scores) {
            System.out.println("score = " + score);
        }
        System.out.println("------------------------------------");
        System.out.println("points = " + points);
        int hitpoints = getHitpoints();
        System.out.println("hitpoints = " + hitpoints);

    }

    static int ability(List<Integer> scores) {
        int totalPoints = 0;
        List<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }
        Collections.sort(scoreList);
        Collections.reverse(scoreList);
        scoreList.remove(3);
        for (int points : scoreList) {
            totalPoints += points;
        }
        return totalPoints;
    }

    static List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        int score;
        int counter = 0;
        while (counter < 4) {
            score = (int) (Math.random() * 6 + 1);
            scores.add(score);
            ++counter;
        }
        return scores;
    }

    static int modifier(int input) {
        double modifier = ((double)input - 10) / 2;
        modifier = Math.floor(modifier);
        return (int) modifier;
    }

    static int getStrength() {
        return DnDCharacter.strength;
    }

    static int getDexterity() {
        return DnDCharacter.dexterity;
    }

    static int getConstitution() {
        return DnDCharacter.constitution;
    }

    static int getIntelligence() {
        return DnDCharacter.intelligence;
    }

    static int getWisdom() {
        return DnDCharacter.wisdom;
    }

    static int getCharisma() {
        return DnDCharacter.charisma;
    }

    static int getHitpoints() {
        return DnDCharacter.modifier(constitution) + 10;
    }
}
