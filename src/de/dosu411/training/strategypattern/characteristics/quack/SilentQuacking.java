package de.dosu411.training.strategypattern.characteristics.quack;

public class SilentQuacking implements QuackCharacteristics {

    @Override
    public String quack() {
	return "<<Silence>>";
    }

}
