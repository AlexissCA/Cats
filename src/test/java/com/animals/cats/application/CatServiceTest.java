package com.animals.cats.application;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class CatServiceTest {
    private final static long FIRST_CAT_ID = 1L;
    private final static long SECOND_CAT_ID = 2L;

    @Mock
    private DbCat catOne;
    @Mock
    private DbRace dbRaceOne;
    @Mock
    private DbCat catTwo;
    @Mock
    private DbRace dbRaceTwo;

    private DbCat realDbCat;

    @Mock
    private CatRepository catRepository;
    @Captor
    private ArgumentCaptor<String> stringCaptor;

    @InjectMocks
    private CatService catService;

    @Test
    public void shouldFindCatById (){
        //given
        when(catOne.getId()).thenReturn(FIRST_CAT_ID);
        when(catOne.getDbRace()).thenReturn(dbRaceOne);
        when(dbRaceOne.getId()).thenReturn(1);
        when(catRepository.getOne(FIRST_CAT_ID)).thenReturn(catOne);

        //when
        Cat cat = catService.findById(FIRST_CAT_ID);

        //then
        assertThat(cat.getId()).isEqualTo(FIRST_CAT_ID);
        assertThat(cat.getRace().getId()).isEqualTo(1);

    }

    public void shouldFindAllCatsAndCollectToList () {
        //given

    }

//    @Before
//    public void setUp() {
//        when(catRepository.findById(FIRST_CAT_ID)).thenReturn(Optional.of(catOne));
//        when(catOne.getId()).thenReturn(FIRST_CAT_ID);
//        when(catOne.getDbRace()).thenReturn(dbRaceOne);
//        when(catRepository.findById(SECOND_CAT_ID)).thenReturn(Optional.of(catTwo));
//        when(catTwo.getId()).thenReturn(SECOND_CAT_ID);
//        when(catTwo.getDbRace()).thenReturn(dbRaceTwo);
//    }
//
//
//
//    @Test
//    public void blueEyesAreCutterThanGreen() {
//        // given
//        when(catOne.getEyeColor()).thenReturn("GREEN");
//        when(catTwo.getEyeColor()).thenReturn("BLUE");
//
//        // when
//        Cat moreCuteCat = catService.cuteFight(FIRST_CAT_ID, SECOND_CAT_ID);
//
//        // then
//        assertThat(moreCuteCat.getId()).isEqualTo(SECOND_CAT_ID);
//    }
//
//    @Test
//    public void youngerKittyIsMoreCute() {
//        // given
//        when(catOne.getBirthDate()).thenReturn(LocalDate.of(1994, 2, 10));
//        when(catTwo.getBirthDate()).thenReturn(LocalDate.of(2019, 4, 10));
//
//        // when
//        Cat moreCuteCat = catService.cuteFight(FIRST_CAT_ID, SECOND_CAT_ID);
//
//        // then
//        assertThat(moreCuteCat.getId()).isEqualTo(SECOND_CAT_ID);
//    }
//
//    @Test
//    public void lessThanOneYearCatWithGreenEyesIsTheCutest() {
//        // given
//        when(catOne.getBirthDate()).thenReturn(LocalDate.of(2019, 5, 10));
//        when(catTwo.getBirthDate()).thenReturn(LocalDate.of(2019, 4, 10));
//        when(catOne.getEyeColor()).thenReturn("GREEN");
//        when(catTwo.getEyeColor()).thenReturn("GREEN");
//
//        // when
//        Cat moreCuteCat = catService.cuteFight(FIRST_CAT_ID, SECOND_CAT_ID);
//
//        // then
//        assertThat(moreCuteCat.getId()).isEqualTo(FIRST_CAT_ID);
//    }
//    @Test
//    public void smallerKittyIsCutterThanBigger() {
//        //given
//        when(catOne.getWeight()).thenReturn(1.25);
//        when(catTwo.getWeight()).thenReturn(1.10);
//
//        //when
//        Cat moreCuteCat = catService.cuteFight(FIRST_CAT_ID, SECOND_CAT_ID);
//
//        //then
//        assertThat(moreCuteCat.getId()).isEqualTo(SECOND_CAT_ID);
//    }
//
//    @Test
//    public void blackKittiesAreCutterThanOther() {
//        //given
//        when(catOne.getFurColor()).thenReturn("BLACK");
//        when(catTwo.getFurColor()).thenReturn("PINK");
//
//        //when
//        Cat moreCuteCat = catService.cuteFight(FIRST_CAT_ID, SECOND_CAT_ID);
//
//        //then
//        assertThat(moreCuteCat.getId()).isEqualTo(FIRST_CAT_ID);
//    }
//
//    @Test
//    public void saveCuteKittyShouldSaveKittyWithCorrectName() {
//        //given
//
//        //when
//        catService.seveCuteKitty("cuteKitty");
//
//        //the
//        verify(catRepository).findByName(stringCaptor.capture());
//        verify(catRepository).findByName("REPO-CAT:cuteKitty;VERY_CUTE!");
//        assertThat(stringCaptor.getValue()).isEqualTo("REPO-CAT:cuteKitty;VERY_CUTE!");
//    }

}
