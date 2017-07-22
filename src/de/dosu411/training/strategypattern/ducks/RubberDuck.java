package de.dosu411.training.strategypattern.ducks;

import de.dosu411.training.strategypattern.characteristics.fly.DoesNotFly;
import de.dosu411.training.strategypattern.characteristics.quack.SilentQuacking;

public class RubberDuck extends Duck {

    public RubberDuck() {
	quackCharacteristics = new SilentQuacking();
	flightCharacteristics = new DoesNotFly();
    }

    public String show() {
	return "I am a rubber duck!";
    }
}
