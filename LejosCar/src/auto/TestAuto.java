package auto;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.*;
import lejos.internal.ev3.EV3LCD;
import lejos.robotics.Color;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.Touch;

public class TestAuto {

	private static EV3ColorSensor colorSensor;

	public static void main(String[] args) {

		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();

		colorSensor = new EV3ColorSensor(SensorPort.S1);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];
		color.fetchSample(sample, 0);
		int colorId = (int) sample[0];
		String colorName = "";
		switch (colorId) {
		case Color.NONE:
			colorName = "NONE";
			break;
		case Color.BLACK:
			colorName = "BLACK";
			break;
		case Color.BLUE:
			colorName = "BLUE";
			break;
		case Color.GREEN:
			colorName = "GREEN";
			break;
		case Color.YELLOW:
			colorName = "YELLOW";
			break;
		case Color.RED:
			colorName = "RED";
			break;
		case Color.WHITE:
			colorName = "WHITE";
			break;
		case Color.BROWN:
			colorName = "BROWN";
			break;
		}
		lcd.drawString(colorId + " - " + colorName, 0, 0);
		keys.waitForAnyPress();

		

//		RegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.A);
		RegulatedMotor B = new EV3LargeRegulatedMotor(MotorPort.B);
		RegulatedMotor C = new EV3LargeRegulatedMotor(MotorPort.C);
//		mA.resetTachoCount();
		B.resetTachoCount();
		C.resetTachoCount();

//		mA.rotateTo(760);
//		int angle = mA.getTachoCount(); // should be -360
//		lcd.drawInt(angle, 0, 0);
//		keys.waitForAnyPress();

		B.setSpeed(720);// 2 RPM
		C.setSpeed(720);
		B.forward();
		C.forward();
		Delay.msDelay(1000);
		B.stop();
		C.stop();
		B.rotateTo(360);
		B.rotate(-720, true);
//		while (mB.isMoving())
//			Thread.yield();
//		angle = mB.getTachoCount();
//		lcd.drawInt(angle, 0, 1);

//		angle = mA.getTachoCount(); // should be -360
//		lcd.drawInt(angle, 0, 2);

		// EV3ColorSensor color = new EV3ColorSensor(SensorPort.S1);

		// UnregulatedMotor MotorR = new UnregulatedMotor(MotorPort.C);
		// UnregulatedMotor MotorL = new UnregulatedMotor(MotorPort.D);

		// EV3ColorSensor color1 = new EV3ColorSensor(SensorPort.S3);
		// SensorMode colorID = color1.getColorIDMode();
		// float[] sample = new float[color1.sampleSize()];
		// color1.fetchSample(sample, 0);
		// int colorId = (int)sample[0];
		// String colorName = "";
		// switch(colorId){
		// case Color.BLACK: colorName = "BLACK"; break;
		// }
		// LCD.drawString(colorId + " - " + colorName, 0, 0);

		// }

		// MotorR.setPower(100);
		// MotorL.setPower(100);

		// Delay.msDelay(2000);

		// MotorR.stop();
		// MotorL.stop();

		// MotorL.close();
		// MotorR.close();

	}

}
