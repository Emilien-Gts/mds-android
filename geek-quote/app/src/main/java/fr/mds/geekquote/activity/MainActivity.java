package fr.mds.geekquote.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import fr.mds.geekquote.R;
import fr.mds.geekquote.model.Quote;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "GeekQuoteTAG";

    private LinearLayout ll_main_quotes;
    private Button bt_main_add;
    private EditText et_main_quote;

    private List<Quote> quotes = new ArrayList<Quote>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_main_quotes = findViewById(R.id.ll_main_quotes);
        bt_main_add = findViewById(R.id.bt_main_add);
        et_main_quote = findViewById(R.id.et_main_quote);

        bt_main_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = et_main_quote.getText().toString();
                addQuote(content);
                et_main_quote.getText().clear();
                Log.d(TAG, "Button Clicked");
            }
        });

        for(int i = 0; i< 10; i++) {
            quotes.add(new Quote("Quoter number " + (i+1)));
        }

        for(Quote q : quotes) {



            TextView tv_quote = new TextView(this);
            tv_quote.setText(q.getStrQuote());
            ll_main_quotes.addView(tv_quote);
        }
    }

    protected void addQuote(String strQuote) {
        Quote quote = new Quote(strQuote);
        quotes.add(quote);
        TextView tvQuote = new TextView(this);
        tvQuote.setText(quote.getStrQuote());
        ll_main_quotes.addView(tvQuote);
    }
}
