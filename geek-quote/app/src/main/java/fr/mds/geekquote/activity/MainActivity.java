package fr.mds.geekquote.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
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
    private List<Quote> quotes = new ArrayList<Quote>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_main_quotes = findViewById(R.id.ll_main_quotes);

        for(int i = 0; i< 100; i++) {
            quotes.add(new Quote("Quoter number " + i));
        }

        for(Quote q : quotes) {
            TextView tv_quote = new TextView(this);
            tv_quote.setText(q.getStrQuote());
            ll_main_quotes.addView(tv_quote);
        }
    }

    protected void addQuote(String strQuote) {
        Resources ressources = getResources();

        Quote quote = new Quote(strQuote);
        quotes.add(quote);

        TextView textView = new TextView(this);
        textView.setText(strQuote);

        if(quotes.size() % 2 == 0) {
            textView.setBackgroundColor(ressources.getColor(R.color.grey));
        }
    }
}
