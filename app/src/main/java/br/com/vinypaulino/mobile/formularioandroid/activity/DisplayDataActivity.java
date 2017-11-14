package br.com.vinypaulino.mobile.formularioandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.vinypaulino.mobile.formularioandroid.R;

public class DisplayDataActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        //Capturando os dados da Intent enviada pelo Main Activity
        Intent intent = getIntent();

        // Referencia no Codido java e utiliza para capturar o valor da intent
        TextView name = (TextView) findViewById(R.id.text_name);
        //atravez da referencia name setar o texto com identificador e o getstringExtra
        name.setText("Nome: " + intent.getStringExtra(MainActivity.EXTRA_NAME));

        TextView phone = (TextView) findViewById(R.id.text_email);
        phone.setText("E-mail: " + intent.getStringExtra(MainActivity.EXTRA_EMAIL));

        TextView email = (TextView) findViewById(R.id.text_phone);
        email.setText("Telefone: " + intent.getStringExtra(MainActivity.EXTRA_PHONE));

        TextView password = (TextView) findViewById(R.id.text_password);
        password.setText("Senha: " + intent.getStringExtra(MainActivity.EXTRA_PASSWORD));

        TextView creditCardNumber = (TextView) findViewById(R.id.text_credit_card_number);
        creditCardNumber.setText("Número: " + intent.getStringExtra(MainActivity.EXTRA_CREDIT_CARD_NUMBER));

        TextView creditCardExpiry = (TextView) findViewById(R.id.text_credit_card_expiry);
        creditCardExpiry.setText("Expiração: " + intent.getStringExtra(MainActivity.EXTRA_CREDIT_CARD_EXPIRY));

        TextView creditCardCvc = (TextView) findViewById(R.id.text_credit_card_cvc);
        creditCardCvc.setText("CVC: " + intent.getStringExtra(MainActivity.EXTRA_CREDIT_CARD_CVC));

        TextView agreement = (TextView) findViewById(R.id.text_agreement);
        agreement.setText("Termo de serviço: " + intent.getStringExtra(MainActivity.EXTRA_AGREEMENT));

    }
}
