package de.dosu411.training.strategypattern.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.dosu411.training.strategypattern.ducks.RubberDuck;

public class RubberDuckTest {

    private RubberDuck rubberDuck;

    @Before
    public void initRubberDuck() {
	rubberDuck = new RubberDuck();
    }

    @Test
    public void fly() {
	String flyResult = rubberDuck.doFly();
	String expectedResult = "I cannot fly!";
	assertEquals(expectedResult, flyResult);
    }

}
