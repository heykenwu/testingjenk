package com.example.linuxtesting;

import com.example.linuxtesting.DataStorage.IStore;
import com.example.linuxtesting.DataStorage.LocalStorage;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LocalStorageTest {
    @Test
    public void localstorage_working() throws Exception {
        IStore ls = new LocalStorage();
        ls.saveState("Just Testing");
        assertEquals(ls.getState(),"Just Testing");
    }
}
