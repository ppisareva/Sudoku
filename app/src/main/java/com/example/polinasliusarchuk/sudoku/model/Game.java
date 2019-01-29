package com.example.polinasliusarchuk.sudoku.model;

import com.example.polinasliusarchuk.sudoku.Utility;

import java.util.ArrayList;
import java.util.Map;

public class Game {
    Map<Integer, ArrayList<SudokuItem>> allValues;
    Map<Integer, ArrayList<SudokuItem>> values;


    public Map<Integer, ArrayList<SudokuItem>> newGame(int level) {
        allValues = Utility.fillFild();
        values = Utility.prepareSudoku(allValues, level);
        return values;
    }

    public Map<Integer, ArrayList<SudokuItem>> getAllValues() {
        return allValues;
    }

    public void setAllValues(Map<Integer, ArrayList<SudokuItem>> allValues) {
        this.allValues = allValues;
    }

    public Map<Integer, ArrayList<SudokuItem>> getValues() {
        return values;
    }

    public void setValues(Map<Integer, ArrayList<SudokuItem>> values) {
        this.values = values;
    }
//todo
    public boolean check(int row, int column, int value) {
        return true;
    }
}
