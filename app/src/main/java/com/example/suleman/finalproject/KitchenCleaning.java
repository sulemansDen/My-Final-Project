package com.example.suleman.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class KitchenCleaning extends AppCompatActivity {
    TextView disp;
    int total = 0, countBhk = 0;
    TextView bhk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_cleaning);
        getSupportActionBar().setTitle("Kitchen Cleaning");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        disp = (TextView) findViewById(R.id.total);
        bhk = (TextView) findViewById(R.id.bhk);
    }
    public void result(View v) {
        if (v.getId() == R.id.add) {
            if (countBhk == 0) {
                countBhk++;
                total += 2000;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen");
            } else if (countBhk == 1) {
                countBhk++;
                total += 1000;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen");
            } else if (countBhk == 2) {
                countBhk++;
                total += 800;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen");
            } else if (countBhk == 3) {
                countBhk++;
                total += 700;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen & above");
            }
        }
        else if (v.getId() == R.id.minus) {
            if (countBhk ==0)
            {

            }
            else if (countBhk == 1) {
                countBhk--;
                total -= 2000;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen");
            } else if (countBhk == 2) {
                countBhk--;
                total -= 1000;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen");
            } else if (countBhk == 3) {
                countBhk--;
                total -= 800;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen");
            } else if (countBhk == 4) {
                countBhk--;
                total -= 700;
                disp.setText("Total : Rs " + total);
                bhk.setText(countBhk + " Kitchen");
            }
        }
    }

    public void submit(View v)
    {
        if(total == 0)
        {
            Toast.makeText(getApplicationContext(),"Please Select The Quantity",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent i =new Intent(this,Address.class);
            startActivity(i);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(android.R.id.home == item.getItemId())
        {
            this.finish();

        }
        return super.onOptionsItemSelected(item);
    }
}

