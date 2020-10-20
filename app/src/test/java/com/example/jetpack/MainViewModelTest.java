package com.example.jetpack;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MainViewModelTest {

    private MainViewModel mainViewModel;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void init(){
        mainViewModel = new MainViewModel();
    }

    @Test
    public void calculate() {
        String width = "1";
        String length = "2.4";
        String height = "3";

        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("For input string: \"2.4\"");
        mainViewModel.calculate(width, height, length);
        //assertEquals(6, mainViewModel.result);
    }
}