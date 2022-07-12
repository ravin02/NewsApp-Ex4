package at.ac.fhcampuswien.controllers;

import at.ac.fhcampuswien.models.Article;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AppControllerTest {
    private static AppController controller;


    @BeforeAll
    static void init(){

    }

    @BeforeEach
    void setup(){
        controller = AppController.getInstance();
    }

    @Test
    @DisplayName("getAllNewsBitcoin Test 1")
    public void getAllNewsBitcoin_scenario1(){

        List<Article> ac = new ArrayList<>();
        int i = controller.getAllNewsBitcoin().size();
        int i2 = 100;

        assertEquals(i, i2);

    }



}