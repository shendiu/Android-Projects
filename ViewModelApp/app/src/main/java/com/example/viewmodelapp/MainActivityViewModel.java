package com.example.viewmodelapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int counter;
    private MutableLiveData<Integer> counterLiveData = new MutableLiveData<>();

//    public int getCounter() {
//        counter++;
//        return counter;
//    }
//
//    public int getInitialCounter() {
//        return counter;
//    }


    public MutableLiveData<Integer>getInitialCounter(){
        counterLiveData.setValue(counter);
        return counterLiveData;
    }

    public void getCounter(){
        counter++;
        counterLiveData.setValue(counter);
    }
}
