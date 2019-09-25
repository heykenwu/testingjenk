package com.example.linuxtesting.DataStorage;

public class LocalStorage implements IStore {
    String state_;
    @Override
    public void saveState(String state) {
        state_=state;
    }
    @Override
    public String getState() {
        return state_;
    }
}
