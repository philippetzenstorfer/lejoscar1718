package auto;

import lejos.hardware.Keys;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;



import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.*;
import lejos.internal.ev3.EV3LCD;
import lejos.robotics.Color

public class TestAuto {

	public static void main(String[] args) {
		
		 
		EV3ColorSensor	color = new EV3ColorSensor(SensorPort.S1);
		
		
		//UnregulatedMotor MotorR = new UnregulatedMotor(MotorPort.C);
		//UnregulatedMotor MotorL = new UnregulatedMotor(MotorPort.D);
		
		
		EV3ColorSensor color = new EV3ColorSensor(SensorPort.S3);
		SensorMode colorID = color.getColorIDMode();
		float[] sample = new float[color.sampleSize()];
		color.fetchSample(sample, 0);
		int colorId = (int)sample[0];
		String colorName = "";
		switch(colorId){
			case Color.NONE: colorName = "NONE"; break;
			case Color.BLACK: colorName = "BLACK"; break;
			case Color.BLUE: colorName = "BLUE"; break;
			case Color.GREEN: colorName = "GREEN"; break;
			case Color.YELLOW: colorName = "YELLOW"; break;
			case Color.RED: colorName = "RED"; break;
			case Color.WHITE: colorName = "WHITE"; break;
			case Color.BROWN: colorName = "BROWN"; break;
		}
		LCD.drawString(colorId + " - " + colorName, 0, 0);
		Keys.waitForAnyPress();
        
        	
        	
        }
        
      

        
        
        
		
		
	//	MotorR.setPower(100);
	//	MotorL.setPower(100);
		
		
	//	Delay.msDelay(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	MotorR.stop();
	//	MotorL.stop();
		
		//MotorL.close();
		//MotorR.close();
		
		
		
	}

}
