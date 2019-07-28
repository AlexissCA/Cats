package com.animals.cats.kocia_akademia;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CatMauController {
    private final Mau mauService;

    public String mauFromService(String mau) {
        String result = mauService.mau(mau);
        if (result == null) {
            return "not mau";
        } else {
            return result;
        }
    }
}
