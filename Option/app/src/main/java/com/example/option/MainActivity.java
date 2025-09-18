package com.example.option;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu); // Make sure your file is named menu.xml and placed in res/menu/
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "Item 1 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item2) {
            Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item3) {
            Toast.makeText(this, "Item 3 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item4) {
            Toast.makeText(this, "Item 4 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item5) {
            Toast.makeText(this, "Item 5 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item6) {
            Toast.makeText(this, "Item 6 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}