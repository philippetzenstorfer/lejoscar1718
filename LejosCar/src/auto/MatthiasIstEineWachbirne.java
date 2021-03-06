package auto;

import lejos.robotics.ColorIdentifier;

import java.awt.Button;
import java.awt.image.SampleModel;
import java.util.concurrent.TimeUnit;

import javax.sql.rowset.CachedRowSet;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.motor.MotorRegulator;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;
import lejos.hardware.sensor.*;
import lejos.internal.ev3.EV3LCD;
import lejos.robotics.Color;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.RegulatedMotorListener;
import lejos.robotics.Touch;

public class MatthiasIstEineWachbirne {

	private static EV3ColorSensor colorSensor;

	public static void main(String[] args) {
// 		Zuordnung der Motoren
		RegulatedMotor A = new EV3LargeRegulatedMotor(MotorPort.A);
		RegulatedMotor B = new EV3LargeRegulatedMotor(MotorPort.B);
		RegulatedMotor C = new EV3MediumRegulatedMotor(MotorPort.C);
//		Zuordnung des Farbsensensors
		colorSensor = new EV3ColorSensor(SensorPort.S1);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];

		while (true) {

			color.fetchSample(sample, 0);
			{

				int colorId = (int) sample[0];
				// String colorName = "";
				switch (colorId) {
//		Wenn der Farbsensor Schwarz erkennt dann f�hrt er gerade 
				case Color.BLACK:
					C.rotateTo(0);
					A.setSpeed(200);
					B.setSpeed(200);
					A.backward();
					B.backward();
					break;
//		Wenn der Farbsensor Rot erkennt	dann f�hrt er nach rechts		
				case Color.RED:
					A.stop();
					B.stop();
					C.rotateTo(90);
					C.stop();
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					A.setSpeed(200);
					B.setSpeed(200);
					A.backward();
					B.backward();
					break;
//		Wenn der Farbsensor Gr�n erkennt f�hrt er nach rechts
				case Color.GREEN:
					//A.stop();
					//B.stop();
					C.rotateTo(-180);
					C.stop();
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					A.setSpeed(200);
					B.setSpeed(200);
					A.backward();
					B.backward();
					break;
//		Wenn der Farbsensor White erkennt bleibt er stehen
				case Color.WHITE:
					C.rotateTo(0);
					A.stop();
					B.stop();
					break;

				}
//		einmal pro Sekunde wird die Farbe abgefragt
				try {
					Thread.sleep(800);

				} catch (InterruptedException e) {
				}
				//A.close();
				//B.close();
				//C.close();
			}
		}
	}
}

//		lcd.drawString(colorId + " - " + colorName, 0, 0);
//		keys.waitForAnyPress();

//		while(true) {
//			
//				A.setSpeed(300);
//				A.backward();
//				
//				B.setSpeed(300);
//				B.backward();

//			else {
//				A.setSpeed(0);
//				A.backward();
//				
//				B.setSpeed(0);
//				B.backward();
//				
//				try {
//					Thread.sleep(3000);
//				}catch(InterruptedException e) {
//				}
//				
//				
//				

//			}

//			A.close();
//			B.close();
//			colorSensor.close();
//			}

//		else (colorSensor.getColorID() == Color.WHITE){
//			RegulatedMotor B = new EV3LargeRegulatedMotor(MotorPort.B); 
//			RegulatedMotor C = new EV3LargeRegulatedMotor(MotorPort.C);
//			B.stop();
//			C.stop();

//		}

//}
