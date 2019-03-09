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

import org.usfirst.frc2450.ShawMedallion.OI;
import org.usfirst.frc2450.ShawMedallion.Robot;
import com.analog.adis16448.frc.ADIS16448_IMU;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 *
 */
public class DriveWithJoysticks extends Command {
    //public static final ADIS16448_IMU imu = new ADIS16448_IMU();

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
        //  Robot.driveDrainSubsytem.takeXboxJoystickInputs(Robot.oi.getXboxController());

         Robot.driveDrainSubsytem.takeDriveJoystickInputs(Robot.oi.getrightJoystick());

        //SmartDashboard.putNumber("Gyro Value", Robot.gyroSPI.getAngle());
        //SmartDashboard.putBoolean("Gyro Calibrating", Robot.gyroSPI.isCalibrating());
    
     SmartDashboard.putNumber("Gyro-X", Robot.imu.getAngleX());
     SmartDashboard.putNumber("Gyro-Y", Robot.imu.getAngleY());
     SmartDashboard.putNumber("Gyro-Z", Robot.imu.getAngleZ());
    
    SmartDashboard.putNumber("Accel-X", Robot.imu.getAccelX());
    
    SmartDashboard.putNumber("Accel-Y", Robot.imu.getAccelY());
    SmartDashboard.putNumber("Accel-Z", Robot.imu.getAccelZ());
        
    SmartDashboard.putNumber("Pitch", Robot.imu.getPitch());
    SmartDashboard.putNumber("Roll", Robot.imu.getRoll());
    SmartDashboard.putNumber("Yaw", Robot.imu.getYaw());
    
    SmartDashboard.putNumber("Pressure: ", Robot.imu.getBarometricPressure());
    SmartDashboard.putNumber("Temperature: ", Robot.imu.getTemperature()); 
    
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
