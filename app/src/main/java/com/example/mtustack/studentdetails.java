package com.example.mtustack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class studentdetails extends AppCompatActivity {

    String[] items = {"CBAS", "CHMS"};
    String[] item1 = {"Computer Science", "Microbiology", "Geophysics", "Mathematics", "Mass Communication" };

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentdetails);

        autoCompleteTxt = findViewById(R.id.auto_complete);

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, items);

        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Item" +items, Toast.LENGTH_SHORT).show();
            }
        });
    }
}