package de.dosu411.training.strategypattern.ducks;

import de.dosu411.training.strategypattern.characteristics.fly.Fly;
import de.dosu411.training.strategypattern.characteristics.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
	quackCharacteristics = new Quack();
	flightCharacteristics = new Fly();
    }

    public String show() {
	return "I am a Mallard!";
    }
}
