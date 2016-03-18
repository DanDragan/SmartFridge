package com.example.alex.smartfridge;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.microsoft.windowsazure.mobileservices.*;

public class MainActivity extends Activity {

    EditText name;
    EditText date;
    Button addProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.idName);
        date = (EditText) findViewById(R.id.idDate);
        addProduct = (Button)  findViewById(R.id.addProduct);

       addProduct.setOnClickListener(new Button.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
        });
    }
}
