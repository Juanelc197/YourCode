package com.juanelc197gmail.dentalcris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UbicasionActivity extends AppCompatActivity {

    Button btnr, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicasion);

        btnr = (Button)findViewById(R.id.btn_R);

        btn1 = (Button)findViewById(R.id.btn_1);

        btnr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent (UbicasionActivity.this, InicioActivity.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent (UbicasionActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
