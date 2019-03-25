package com.oooof.jonnyjonny.recyclerview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private List<Person>personList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        personList=new ArrayList<>();
        for(int index=0;index<20;index++){
            Person myPerson=new Person("Mr OOOOF"+index,"Programmer"+index);
            personList.add(myPerson);
        }
        recyclerViewAdapter=new MyRecyclerViewAdapter(personList,MainActivity.this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
