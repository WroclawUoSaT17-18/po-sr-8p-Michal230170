package com.example.studia.projekt;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DodawanieActivity extends AppCompatActivity {


    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodawanie);
    }

    public void roslina(View view) {
        final CharSequence[] kategorie = {"pszenica","jęczmień","żyto","rzepak","kukurydza"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Wybierz roślinę");
        builder.setItems(kategorie, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                editText4.setText(kategorie[which]);


            }
        });

        builder.create();
        builder.show();
    }
}
