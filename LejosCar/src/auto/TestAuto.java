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

		colorSensor = new EV3ColorSensor(SensorPort.S1);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];

		while (true) {
			color.fetchSample(sample, 0);
			int colorId = (int) sample[0];
			//
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
			//
			System.out.println("Farbe: " + colorName);
			//
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			//
		}
	}
}
