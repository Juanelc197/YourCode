package com.juanelc197gmail.dentalcris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PromocionesActivity extends AppCompatActivity {

    Button btnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);

        btnr = (Button)findViewById(R.id.btn_R);

        btnr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent (PromocionesActivity.this, InicioActivity.class);
                startActivity(intent);
            }
        });
    }
}
