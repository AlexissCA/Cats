package com.animals.cats.kocia_akademia;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CatMauService implements Mau {
    @Override
    public String mau(String catName) {
        return "mau, " + catName;
    }
}
