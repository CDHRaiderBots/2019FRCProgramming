// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2450.ShawMedallion.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.MotorSafety;

import org.usfirst.frc2450.ShawMedallion.Robot;
import com.analog.adis16448.frc.ADIS16448_IMU;

/**
 *
 */
public class DriveWithJoysticks extends Command {
    public static final ADIS16448_IMU imu = new ADIS16448_IMU();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DriveWithJoysticks() {
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveDrainSubsytem);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.driveDrainSubsytem.takeJoystickInputs(Robot.oi.leftJoystick, Robot.oi.rightJoystick);

        //SmartDashboard.putNumber("Gyro Value", Robot.gyroSPI.getAngle());
        //SmartDashboard.putBoolean("Gyro Calibrating", Robot.gyroSPI.isCalibrating());
        
    SmartDashboard.putNumber("Gyro-X", imu.getAngleX());
    SmartDashboard.putNumber("Gyro-Y", imu.getAngleY());
    SmartDashboard.putNumber("Gyro-Z", imu.getAngleZ());
    
    SmartDashboard.putNumber("Accel-X", imu.getAccelX());
    SmartDashboard.putNumber("Accel-Y", imu.getAccelY());
    SmartDashboard.putNumber("Accel-Z", imu.getAccelZ());
        
    SmartDashboard.putNumber("Pitch", imu.getPitch());
    SmartDashboard.putNumber("Roll", imu.getRoll());
    SmartDashboard.putNumber("Yaw", imu.getYaw());
    
    SmartDashboard.putNumber("Pressure: ", imu.getBarometricPressure());
    SmartDashboard.putNumber("Temperature: ", imu.getTemperature()); 
    }
    
    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
