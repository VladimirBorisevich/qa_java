package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void lionWrongSexException() {
        try {
            Lion lion = new Lion("Всеядное", new Feline());
            lion.doesHaveMane();
            fail("Должно появиться исключение");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    @Test
    public void getKittensNoArg() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void getFoodPredator() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
