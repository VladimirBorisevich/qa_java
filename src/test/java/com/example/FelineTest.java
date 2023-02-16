package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getFoodPredator() throws Exception {
        Feline feline = new Feline();
        List<String> felineFood = feline.eatMeat();
        assertEquals(felineFood, List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamilyCats() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals(family, "Кошачьи");
    }

    @Test
    public void getKittensNegative() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(-1);
        assertEquals(kittens, -1);
    }

    @Test
    public void getKittensOne() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        assertEquals(kittens, 1);
    }
}
