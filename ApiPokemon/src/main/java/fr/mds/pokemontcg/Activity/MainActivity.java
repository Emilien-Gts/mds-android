package fr.mds.pokemontcg.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import fr.mds.pokemontcg.Adapter.CardsAdapter;
import fr.mds.pokemontcg.Model.CardModel;
import fr.mds.pokemontcg.R;
import fr.mds.pokemontcg.Service.Retrofit.DataContainer;
import fr.mds.pokemontcg.Service.Retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "PokemonTCG";
    private RecyclerView cardsList;
    private List<CardModel> cards = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardsList = findViewById(R.id.rv_main_cards);

        CardsAdapter cardsAdapter = new CardsAdapter(cards);

        cardsList.setAdapter(cardsAdapter);
        cardsList.setLayoutManager(new LinearLayoutManager(this));

        Call<DataContainer> getCardsCall = RetrofitClient.getPokeService().getCards();
        getCardsCall.enqueue(new Callback<DataContainer>() {
            @Override
            public void onResponse(Call<DataContainer> call, Response<DataContainer> response) {
                Log.d(TAG, "MainActivity - getCardsCall _ onResponse");
                Log.d(TAG, response.code() + "");
                Log.d(TAG, response.body().toString());
                cards.clear();
                cards.addAll(response.body().getCards());
                cardsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<DataContainer> call, Throwable t) {
                Log.d(TAG, "MainActivity - getCardsCall _ onFailure");
                Log.d(TAG, t.getMessage());
            }
        });
    }
}
