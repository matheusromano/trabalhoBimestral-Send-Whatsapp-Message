package com.example.trabalhobimestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutPhone;
    private TextInputLayout inputLayoutMessage;

    private TextInputEditText inputEditTextPhone;
    private TextInputEditText inputEditTextMessage;

    private Button buttonSendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutPhone = findViewById(R.id.input_layout_phone);
        inputLayoutMessage = findViewById(R.id.input_layout_message);

        inputEditTextPhone = findViewById(R.id.input_text_phone);
        inputEditTextMessage = findViewById(R.id.input_text_message);

        buttonSendMessage = findViewById(R.id.button_send_message);

        buttonSendMessage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String phone = inputEditTextPhone.getText().toString();
                        String message = inputEditTextMessage.getText().toString();


                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/"+phone+"?text="+message)));
                    }
                });
    }
}