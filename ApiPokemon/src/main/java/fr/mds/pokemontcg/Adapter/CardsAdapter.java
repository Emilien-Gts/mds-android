package fr.mds.pokemontcg.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import fr.mds.pokemontcg.Model.CardModel;
import fr.mds.pokemontcg.R;
import fr.mds.pokemontcg.Viewholder.CardViewHolder;

public class CardsAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<CardModel> cards;

    public CardsAdapter(List<CardModel> cards) {
        this.cards = cards;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mainViewHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(mainViewHolder);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        CardModel card = cards.get(position);

        TextView itemCardName = holder.getItemCardName();
        itemCardName.setText(card.getName());

        ImageView itemCardImage = holder.getItemCardImage();

        Picasso.get().load(card.getImageUrl()).into(itemCardImage);
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
