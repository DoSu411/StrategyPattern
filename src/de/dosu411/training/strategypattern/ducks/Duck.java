package de.dosu411.training.strategypattern.ducks;

import de.dosu411.training.strategypattern.characteristics.fly.FlightCharacteristics;
import de.dosu411.training.strategypattern.characteristics.quack.QuackCharacteristics;

public abstract class Duck {
    protected FlightCharacteristics flightCharacteristics;
    protected QuackCharacteristics quackCharacteristics;

    public Duck() {
    }

    public String doFly() {
	return flightCharacteristics.fly();
    }

    public String doQuack() {
	return quackCharacteristics.quack();
    }
}
