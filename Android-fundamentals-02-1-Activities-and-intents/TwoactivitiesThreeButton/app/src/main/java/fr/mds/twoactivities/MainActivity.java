package fr.mds.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName() ;
    public static final String EXTRA_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        switch (view.getId()){
            case R.id.button_one:
                intent.putExtra(EXTRA_MESSAGE, getString(R.string.display_one)); startActivity(intent);
                break;
            case R.id.button_two:
                intent.putExtra(EXTRA_MESSAGE, getString(R.string.display_two)); startActivity(intent);
                break;
            case R.id.button_three:
                intent.putExtra(EXTRA_MESSAGE, getString(R.string.display_three)); startActivity(intent);
                break;
            default:
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                break;
        }
    }
}