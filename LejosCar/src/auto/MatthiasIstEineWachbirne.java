package auto;

import lejos.robotics.ColorIdentifier;

import java.awt.Button;
import java.awt.image.SampleModel;

import javax.sql.rowset.CachedRowSet;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.motor.MotorRegulator;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;
import lejos.hardware.sensor.*;
import lejos.internal.ev3.EV3LCD;
import lejos.robotics.Color;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.RegulatedMotorListener;
import lejos.robotics.Touch;

public class MatthiasIstEineWachbirne {
		
		
		

	private static EV3ColorSensor colorSensor;
		
		public static void main(String[] args) {

		RegulatedMotor A = new EV3LargeRegulatedMotor(MotorPort.A); 
		RegulatedMotor B = new EV3LargeRegulatedMotor(MotorPort.B);
			
		
		
		colorSensor = new EV3ColorSensor(SensorPort.S1);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];	
		
		while(true) {
			color.fetchSample(sample, 0); {
		
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
//		lcd.drawString(colorId + " - " + colorName, 0, 0);
//		keys.waitForAnyPress();
		
		
	
//		while(true) {
//			
//				A.setSpeed(300);
//				A.backward();
//				
//				B.setSpeed(300);
//				B.backward();
 		
 		System.out.println("color: " +  colorName);
//				
		try {	
		Thread.sleep(100);
				}catch (InterruptedException e) {
				}
			
				}}
			
			
			
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
		}
}

	
			 

		
		
		
		
//}
		
		
		 
		

		
		
	

		

