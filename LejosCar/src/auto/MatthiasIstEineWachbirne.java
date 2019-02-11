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

		
		RegulatedMotor Right= new EV3LargeRegulatedMotor(MotorPort.B);
		RegulatedMotor Left= new EV3LargeRegulatedMotor(MotorPort.C);
			
		
		public static void main(String[] args) {

	
		colorSensor = new EV3ColorSensor(SensorPort.S1);
		SensorMode color = colorSensor.getColorIDMode();
		
	
		
		
	while (color.fetchSample(sample, 0);) {
		
		
		
		
		
		
	}
		 
		
	
			 

		
		
		
		
	}
		
		}		
		 
		
}
		
		
	

		

