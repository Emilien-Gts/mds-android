package fr.mds.geekquote.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import fr.mds.geekquote.R;
import fr.mds.geekquote.model.Quote;

public class DetailQuoteActivity extends AppCompatActivity {

    private Button bt_detail_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_quote);

        bt_detail_cancel = findViewById(R.id.bt_detail_cancel);
        bt_detail_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(2);
                finish();
            }
        });

        Bundle bundle = getIntent().getExtras();

        Quote quote = (Quote) bundle.getSerializable("quote");

        // Log.d(TAG, "Quote "+ quote.toString());

    }
}
