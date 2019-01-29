package com.example.polinasliusarchuk.sudoku;

import com.example.polinasliusarchuk.sudoku.model.SudokuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Utility {
    public static final int EASY = 1;
    public static final int MODERATE =2;
    public static final int HARD = 3;


// todo
    public static final Map<Integer, ArrayList<SudokuItem>> fillFild(){
        Map<Integer, ArrayList<SudokuItem>> map =new HashMap<>();
        SudokuItem item;
        ArrayList<SudokuItem> innerArray = new ArrayList<>();
        for(int i =1; i<10; i++){
           item = new SudokuItem(i);
            innerArray.add(item);
        }
        for(int j = 1; j<10; j++){
            map.put(j, innerArray);
        }

        return map;
    }

    // todo
    public static final  Map<Integer, ArrayList<SudokuItem>> prepareSudoku (Map<Integer, ArrayList<SudokuItem>> value, int complexity){
        switch (complexity){
            case EASY:
                break;
            case MODERATE:
                break;
            case HARD:
                break;
                default:

        }
        return value;
    }

}
