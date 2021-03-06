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
import org.usfirst.frc2450.ShawMedallion.Robot;
import org.usfirst.frc2450.ShawMedallion.subsystems.DriveDrainSubsytem;
import org.usfirst.frc2450.ShawMedallion.subsystems.ADXRS453Gyro;

/**
 *
 */
public class TURN180 extends Command {
    public DriveDrainSubsytem leftFrontMotor;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TURN180() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        // Robot.driveDrainSubsytem.leftFrontMotor.set(0.2);
        // Robot.driveDrainSubsytem.rightFrontMotor.set(-0.2);
        // Robot.driveDrainSubsytem.leftRearMotor.set(-0.2);
        // Robot.driveDrainSubsytem.rightRearMotor.set(0.2);

       // Robot.gyroSPI.reset();
       Robot.imu.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.driveDrainSubsytem.turnRight();
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        double zAngle = Robot.imu.getAngleZ();
        if (zAngle >= 180) {
            return true;
        }
        else {
            return false;
        }
    }
    

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.driveDrainSubsytem.stopMotors();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}