package com.arthurlawrie.pizzaslicecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int quantity = 1;
    int perPerson = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method decreases the quantity.
     *
     * @param view
     */
    public void decrementQuantity(View view) {
        if (quantity == 1) {
            Toast.makeText(this, "You cannot have less than 1 pizza or slice", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity--;
        displayQuantity(quantity);
    }

    /**
     * This method increases the quantity.
     *
     * @param view
     */
    public void incrementQuantity(View view) {
        if (quantity == 200) {
            Toast.makeText(this, "You cannot have more than 200 pizzas or slices", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity++;
        displayQuantity(quantity);
    }

    /**
     * This method decreases the amount of people.
     *
     * @param view
     */
    public void decrementPerPerson(View view) {
        if (perPerson == 1) {
            Toast.makeText(this, "You cannot have less than 1 person", Toast.LENGTH_SHORT).show();
            return;
        }
        perPerson--;
        displayPerPerson(perPerson);
    }

    /**
     * This method increases the amount of people.
     *
     * @param view
     */
    public void incrementPerPerson(View view) {
        if (perPerson == 200) {
            Toast.makeText(this, "You cannot have more than 200 people", Toast.LENGTH_SHORT).show();
            return;
        }
        perPerson++;
        displayPerPerson(perPerson);
    }

    /**
     * This method displays the number of pizzas or slices.
     *
     * @param numberOfPizzas
     */
    private void displayQuantity(int numberOfPizzas) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_int_view);
        quantityTextView.setText("" + numberOfPizzas);
    }

    /**
     * This method displays the number of people splitting the pizza.
     *
     * @param numberPerPerson number of people
     */
    private void displayPerPerson(int numberPerPerson) {
        TextView quantityTextView = (TextView) findViewById(R.id.per_int_view);
        quantityTextView.setText("" + numberPerPerson);
    }
}