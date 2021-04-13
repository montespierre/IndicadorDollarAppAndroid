package com.weimont.indicadordollarappandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.weimont.indicadordollarappandroid.repositories.DolarIndicadorRepository;
import com.weimont.indicadordollarappandroid.responses.IndicadorResponse;

public class DolarIndicadorViewModel extends ViewModel {
    private DolarIndicadorRepository dolarIndicadorRepository;

    public DolarIndicadorViewModel(){
        dolarIndicadorRepository = new DolarIndicadorRepository();
    }

    public LiveData<IndicadorResponse> getDolarIndicador(){
        return dolarIndicadorRepository.getDolarIndicador();
    }
}
