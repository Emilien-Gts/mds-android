package fr.mds.pokemontcg.Service.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    // singleton
    private static PokeService pokeService;
    public static PokeService getPokeService(){
        if (pokeService == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.pokemontcg.io/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            pokeService = retrofit.create(PokeService.class);
        }

        return pokeService;
    }
}
