package server.commands;

import java.io.Serializable;
import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

import calculation.Calculation;
import client.callback.Callback;

public class CalculationCommand implements Command, Serializable {

	private static final long serialVersionUID = 3202369269194172790L;
	private Calculation calc;
	private Callback<BigDecimal> callback;

	public CalculationCommand(Calculation calc, Callback<BigDecimal> callback) {
		this.calc = calc;
		this.callback = callback;
	}

	@Override
	public void execute() {
		System.out.println("CalculationCommand called!");
		calc.calculate();
		try {
			callback.give(calc.getResult());
		} catch(RemoteException e) {
			System.err.println("Failed Returning Value");
		}
	}
}
