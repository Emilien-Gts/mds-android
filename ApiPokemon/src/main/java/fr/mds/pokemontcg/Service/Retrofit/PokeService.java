package fr.mds.pokemontcg.Service.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeService {
    @GET("cards")
    Call<DataContainer> getCards();
}
