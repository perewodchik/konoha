package com.example.konoha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.graphics.Typeface;
import android.os.Bundle;
import java.util.ArrayList;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView konohaView;
    TextView narutoBridgeView;
    TextView akagaharaView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        akagaharaView    = (TextView) findViewById(R.id.akagahara);
        narutoBridgeView = (TextView) findViewById(R.id.narutoBridge);
        konohaView       = (TextView) findViewById(R.id.konoha);

        akagaharaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i1 = new Intent(getApplicationContext(), AkagaharaActivity.class);
                startActivity(i1);
            }
        });
        narutoBridgeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i2 = new Intent(getApplicationContext(), NarutoBridgeActivity.class);
                startActivity(i2);
            }
        });
        konohaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i3 = new Intent(getApplicationContext(), KonohaActivity.class);
                startActivity(i3);
            }
        });
    }


}
