package de.dosu411.training.strategypattern.characteristics.fly;

public class Fly implements FlightCharacteristics {

    @Override
    public String fly() {
	return "I am flying!";
    }
}
