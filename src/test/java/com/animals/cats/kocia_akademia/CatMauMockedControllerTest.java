package com.animals.cats.kocia_akademia;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CatMauMockedControllerTest {

    @Mock
    Mau catMauService;
    @InjectMocks
    CatMauController catMauController;

    @Test
    public void mauTest() {
        Mockito.when(catMauService.mau("kotek")).thenReturn("mau, kotek");
        String mau = catMauController.mauFromService("kotek");
        Assertions.assertThat(mau).isEqualTo("mau, kotek");
    }
    @Test
    public void mauTestForNull() {
        Mockito.when(catMauService.mau(Mockito.any())).thenReturn(null);
        String mau = catMauController.mauFromService("kotek");
        Assertions.assertThat(mau).isEqualTo("not mau");
    }

}