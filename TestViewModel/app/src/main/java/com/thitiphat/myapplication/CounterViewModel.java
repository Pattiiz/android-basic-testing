package com.thitiphat.myapplication;

import android.arch.lifecycle.ViewModel;

/**
 * Created by student on 17/11/2017 AD.
 */

public class CounterViewModel extends ViewModel {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
