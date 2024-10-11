package frc.robot;

public class Module {
	private int number;
	private boolean isCW;
    private int maxId;
	

	public Module() {
		number = 0;
		isCW = false;
	}

	public Module(int number, boolean CW, int id) {
		this.number = number;
		isCW = CW;
		maxId = id;
	}

	public void print() {
		System.out.println("This module’s number is " + number);
		if (isCW)
			System.out.println("This module turns clockwise.");
		else
			System.out.println("This module turns counter-clockwise.");
		if (number < 1 || number > 4)
			System.out.println("This module contains no position. It does not exist.");
		else
			System.out.println("This module’s position is the " + Constants.ModuleConstants.POSITION[number-1]);
		System.out. println("It’s Spark Max ID is " + maxId);
	}

	
}

