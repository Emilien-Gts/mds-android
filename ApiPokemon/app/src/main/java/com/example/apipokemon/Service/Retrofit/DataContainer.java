package fr.mds.pokemontcg.Service.Retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import fr.mds.pokemontcg.Model.CardModel;

public class DataContainer {
    @SerializedName("cards")
    private List<CardModel> cards;

    public DataContainer(List<CardModel> cards) {
        this.cards = cards;
    }

    public List<CardModel> getCards() {
        return cards;
    }

    public void setCards(List<CardModel> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "cards=" + cards +
                '}';
    }
}
