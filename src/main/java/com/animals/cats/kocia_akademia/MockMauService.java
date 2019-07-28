package com.animals.cats.kocia_akademia;

public class MockMauService implements Mau {

    @Override
    public String mau(String catName) {
        if ("kotek".equals(catName)) {
            return null;
        }
        return null;
    }
}
