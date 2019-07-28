package com.animals.cats.kocia_akademia;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CatMauController.class, CatMauService.class})
public class CatMauControllerTest {

    @Autowired
    CatMauController catMauController;

    @Test
    public void mauTest() {
        String mau = catMauController.mauFromService("kotek");
        Assertions.assertThat(mau).isEqualTo("mau, kotek");
    }

}