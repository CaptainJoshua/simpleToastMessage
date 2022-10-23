package com.example.garcia_mytoastmessage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.LinearLayout;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button buttonToast;
    Button buttonSnackbar;
    LinearLayout linear;
    Button buttonAlertMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToast = findViewById(R.id.buttonToast);
        buttonSnackbar = findViewById(R.id.buttonSnackbarMessage);
        linear = findViewById(R.id.linear);
        buttonAlertMessage = findViewById(R.id.buttonAlertMessage);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Joshua!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(linear, "Hi, I live in Quezon City.", Snackbar.LENGTH_INDEFINITE).setAction("Close", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
            }
        });

        buttonAlertMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogMessage();
            }
        });
    }

    private void showDialogMessage() {
    AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Alert Message");
        alertDialog.setMessage("Welcome! I cherish every moment we spend together, so let's create more memories!");
        alertDialog.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        })
        .setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
        alertDialog.create();
    }
}