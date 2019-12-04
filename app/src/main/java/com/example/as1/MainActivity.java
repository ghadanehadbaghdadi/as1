package com.example.as1;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Note> noteList = new ArrayList<>();
    RecyclerView notes_rv;
    NotesAdapter notesAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        notes_rv = findViewById(R.id.notes_rv);
        notes_rv.setLayoutManager(new LinearLayoutManager(this));
        notesAdapter = new NotesAdapter(this ,noteList );
        notes_rv.setAdapter(notesAdapter);
    }

    private void initData() {
        noteList . add(new Note("1","ahmed" , "Fifth Le." , 82.5f));
        noteList . add(new Note("2","tareq" , "Fifth Le." , 81.5f));
        noteList . add(new Note("3","ghada" , "Fifth Le." , 87.5f));
        noteList . add(new Note("4","hadeel" , "Fifth Le." , 89.5f));
        noteList . add(new Note("5","reham" , "Fifth Le." , 86.5f));
        noteList . add(new Note("6","nour" , "Fifth Le." , 84.5f));

    }
}