package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        quantity=0;
        displayPrice();
    }

    /**
     * This method displays the given quantity value on the screen.
     */
//    private void display(int number) {
//        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
//        quantityTextView.setText("" + number);
//    }

    private void displayPrice() {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(quantity*5));
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        //quantityTextView.setText(NumberFormat.getCurrencyInstance().format(quantity));
        quantityTextView.setText(NumberFormat.getNumberInstance().format(quantity));
    }

    public void increment(View view){
        quantity++;
        displayPrice();
    }
    public void decrement(View view){
        if(quantity>0)
            quantity--;
        displayPrice();
    }
}
