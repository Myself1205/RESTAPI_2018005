package com.example.assassinnapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView assassinListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assassinListView = findViewById(R.id.assassinListView);

        getAssassins();
    }

    private void getAssassins() {
        Call<AssassinNation> call = RetrofitClient.getInstance().getMyApi().getAssassins();
        call.enqueue(new Callback<AssassinNation>() {
            @Override
            public void onResponse(Call<AssassinNation> call, Response<AssassinNation> response) {
                AssassinNation assassinData = response.body();
                ArrayList<ResultsItem> data = assassinData.getResults();
                String[] satuAssassin = new String[data.size()];

                for (int x = 0; x < data.size(); x++) {
                    satuAssassin[i] = data.get(i).getName();
                }

                pokemonListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, onePokemon));
            }

            @Override
            public void onFailure(Call<AssassinNation> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }

        });
    }

}