package com.example.polinasliusarchuk.sudoku.modelView;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableArrayMap;

import com.example.polinasliusarchuk.sudoku.model.Game;

public class SudokuViewModel extends ViewModel {
   ObservableArrayMap <Integer, Integer> rowColumn;
   Game game;

    private SudokuViewModel sudokuViewModel;

    public SudokuViewModel(SudokuViewModel sudokuViewModel) {
        this.sudokuViewModel = sudokuViewModel;
    }


   public void init(int level){
       game= new Game();
       game.newGame(level);
   }
    public void onChangeValue(int row, int column, int value){
     if(game.check(row,column,value)){

     }

    }
}
