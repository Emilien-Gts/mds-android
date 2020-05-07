package fr.mds.pokemontcg.Viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.mds.pokemontcg.R;

public class CardViewHolder extends RecyclerView.ViewHolder {

    private TextView itemCardName;
    private ImageView itemCardImage;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        itemCardName = itemView.findViewById(R.id.tv_item_card_name);
        itemCardImage = itemView.findViewById(R.id.iv_item_card_image);
    }

    public TextView getItemCardName() {
        return itemCardName;
    }

    public ImageView getItemCardImage() {
        return itemCardImage;
    }
}
