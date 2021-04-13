package com.weimont.indicadordollarappandroid.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.weimont.indicadordollarappandroid.R;
import com.weimont.indicadordollarappandroid.viewmodel.DolarIndicadorViewModel;

public class MainActivity extends AppCompatActivity {
    // Dollar Indicador Api
    // https://mindicador.cl/api/dolar

    private DolarIndicadorViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(DolarIndicadorViewModel.class);
        getDolarIndicador();
    }

    private void getDolarIndicador() {
        viewModel.getDolarIndicador().observe(this, dolarIndicadorResponse ->
                        Toast.makeText(
                                getApplicationContext(),
                                "Total" + dolarIndicadorResponse.getIndicadors(),
                                Toast.LENGTH_SHORT
                        ).show()
                );
    }
}