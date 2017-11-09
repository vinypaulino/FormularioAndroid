package br.com.vinypaulino.mobile.formularioandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button send = findViewById(R.id.button_send);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent (this, DisplayDataActivity.class);
        startActivity(intent);

    }
}
