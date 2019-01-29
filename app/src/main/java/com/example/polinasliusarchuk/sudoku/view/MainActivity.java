package com.example.polinasliusarchuk.sudoku.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.polinasliusarchuk.sudoku.R;

public class MainActivity extends AppCompatActivity {
     TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTab();

    }

    private void initTab() {
      tableLayout = (TableLayout) findViewById(R.id.sudoku_layout);
        TableRow row = new TableRow(this);

    }
}
