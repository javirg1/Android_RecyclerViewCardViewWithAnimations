package com.example.recyclerviewcardviewwithanomations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Ana", "Abadiño", "Activo"));
        elements.add(new ListElement("#607d8b", "Laura", "Durango", "Activo"));
        elements.add(new ListElement("#03a9f4", "Javi", "Ermua", "Cancelado"));
        elements.add(new ListElement("#f44336", "Ainhoa", "Zaldibar", "Inactivo"));
        elements.add(new ListElement("#252255", "Paz", "Durango", "Activo"));
        elements.add(new ListElement("#015254", "Paz", "Durango", "Activo"));
        elements.add(new ListElement("#605845", "Bego", "Abadiño", "Activo"));
        elements.add(new ListElement("#052548", "Haritz", "Ermua", "Activo"));
        elements.add(new ListElement("#264584", "Javi", "Durango", "Activo"));
        elements.add(new ListElement("#010504", "Asier", "Iurreta", "Activo"));
        elements.add(new ListElement("#895424", "Ander", "Berriz", "Activo"));
        elements.add(new ListElement("#254a54", "Juan Carlos", "Elorrio", "Activo"));
        elements.add(new ListElement("#5564b5", "Edu", "Ermua", "Activo"));
        elements.add(new ListElement("#624582", "Sandra", "Durango", "Activo"));
        elements.add(new ListElement("#655425", "Marina", "Amorebieta", "Activo"));


        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}