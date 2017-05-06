package com.example.gayathri.traversematrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tcost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tcost = (TextView)findViewById(R.id.cost);

    }
    public void seeTraverse(View v){
        int sample[][]={{5},
                {8},
                {5},
                {3},
                {5}};
        MatrixTraverse mat=new MatrixTraverse(sample);
        List<String> trList = mat.traverse(sample);
        tcost.setText(" "+trList.get(2)+ "\n Traversecost:  "+trList.get(0)+" \n Traverse path "+trList.get(1));



    }

}
