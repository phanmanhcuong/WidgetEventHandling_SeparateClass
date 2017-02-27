package com.example.cuongphan.widgeteventhandling_separateclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_hello = (Button)findViewById(R.id.btn_hello);
        Button btn_goodbye = (Button)findViewById(R.id.btn_goodbye);
        btn_hello.setOnClickListener(new ShowToast(btn_hello.getText().toString(), this));
        btn_goodbye.setOnClickListener(new ShowToast(btn_goodbye.getText().toString(), this));
    }
}

class ShowToast implements View.OnClickListener{
    private String mMessage = "";
    private MainActivity mMainActivity;
    public ShowToast(String message, MainActivity mainActivity){
        mMessage = message;
        mMainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(mMainActivity, mMessage, Toast.LENGTH_SHORT).show();
    }
}
