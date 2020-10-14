package com.example.jetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etWidth, etHeight, etLength;
    private TextView tvResult;
    private Button btnCalculate;
    private MainlViewModel viewModel;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = findViewById(R.id.edt_width);
        etHeight = findViewById(R.id.edt_height);
        etLength = findViewById(R.id.edt_length);
        tvResult = findViewById(R.id.tv_result);
        btnCalculate = findViewById(R.id.btn_calculate);

        context = this;

        viewModel = new ViewModelProvider(this).get(MainlViewModel.class);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.calculate(etWidth.getText().toString(), etHeight.getText().toString(), etLength.getText().toString());
                tvResult.setText(String.valueOf(viewModel.result));
                viewModel.getUsers(context).observe( MainActivity.this, users ->{

                });
            }
        });
    }
}