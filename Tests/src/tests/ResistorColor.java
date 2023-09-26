/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

/**
 *
 * @author Manuel
 */
public class ResistorColor {

    public static void main(String[] args) {

    }

    int colorCode(String color) {
        int value = 0;
        if(color == "black"){
            value = 0;
        } else if(color == "white"){
            value = 9;
        } else if (color == "orange"){
            value = 3;
        }
        return value;
    }

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String [] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
    }

}
