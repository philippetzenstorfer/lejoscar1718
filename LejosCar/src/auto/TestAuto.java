package auto;

import lejos.hardware.motor.Motor;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;

public class TestAuto {

	public static void main(String[] args) {
		
		UnregulatedMotor MotorA = new UnregulatedMotor(MotorPort.A);
		UnregulatedMotor MotorB = new UnregulatedMotor(MotorPort.B);
		
		
		
		Motor.A.setSpeed(77);
		Motor.B.setSpeed(77);

		MotorA.close();
		MotorB.close();
	}

}
