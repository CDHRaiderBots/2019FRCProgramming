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
import org.usfirst.frc2450.ShawMedallion.subsystems.LimelightSubsystem;

/**
 *
 */
public class TargetAlignLeft extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TargetAlignLeft() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.limelightSubsystem);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.driveDrainSubsytem.getRobotDrive().driveCartesian(getStrafeRate(), 0, getRotateRate());
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return (LimelightSubsystem.getTs() > -3 && LimelightSubsystem.getTx() < 2 && LimelightSubsystem.getTx() > -2);
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
    public double getStrafeRate()
    {
        if(LimelightSubsystem.getTs() < -3)
        {
            double speed = LimelightSubsystem.getTs()/90d;
            if(speed < -0.35)
            {
                return 0.35;
            }
            return -speed;
        }
        return -0;
    }

    public double getRotateRate()
    {
        if(LimelightSubsystem.getTx() < 0)
        {
            double speed = LimelightSubsystem.getTx()/27d;
            if(speed < -0.35)
            {
                return -0.35;
            }
            return speed;
        }
        return 0;
    }
}
