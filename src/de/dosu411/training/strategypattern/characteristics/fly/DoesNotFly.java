package de.dosu411.training.strategypattern.characteristics.fly;

public class DoesNotFly implements FlightCharacteristics {

    @Override
    public String fly() {
	return "I cannot fly!";
    }
}
