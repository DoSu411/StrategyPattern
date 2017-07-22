package de.dosu411.training.strategypattern.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.dosu411.training.strategypattern.ducks.MallardDuck;

public class MallardDuckTest {
    private MallardDuck mallardDuck;

    @Before
    public void initMallardDuck() {
	mallardDuck = new MallardDuck();
    }

    @Test
    public void fly() {
	String flyResult = mallardDuck.doFly();
	String exptectedResult = "I am flying!";
	assertEquals(exptectedResult, flyResult);
    }

    @Test
    public void quack() {
	String quackResult = mallardDuck.doQuack();
	String expectedResult = "Quack";
	assertEquals(quackResult, expectedResult);
    }

    @Test
    public void show() {
	String showResult = mallardDuck.show();
	String exptectedResult = "I am a Mallard!";
	assertEquals(showResult, exptectedResult);
    }
}
