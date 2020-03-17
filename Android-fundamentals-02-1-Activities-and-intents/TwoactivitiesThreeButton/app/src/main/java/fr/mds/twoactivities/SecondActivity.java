package fr.mds.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView tv_second_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_second_display = findViewById(R.id.display_text);
        Intent intent = getIntent();
        String display = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        tv_second_display.setText(display);
    }
}
