 

package org.usfirst.frc2450.ShawMedallion.commands;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2450.ShawMedallion.Robot;
import org.usfirst.frc2450.ShawMedallion.subsystems.DriveDrainSubsytem;

/**
 *
 */
public class ApproachTarget extends Command {
    double P = .0002;
    double I = .00008;
    double error = 0;
    double setpoint = 500;
    double integral = 0;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    
    public ApproachTarget() {
       requires(Robot.ultrasonic);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
         integral = 0;
         error = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        error = Robot.ultrasonic.GetDistance() - setpoint;
        integral += (error*.02);
        double DriveProportion = (P*error + I*integral);
        if (DriveProportion > 0.3){
            DriveProportion = 0.3;
        }
        SmartDashboard.putNumber("PIDSpeed", DriveProportion);

        Robot.driveDrainSubsytem.MoveForwardProportional(DriveProportion);

    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        if (Robot.ultrasonic.GetDistance() <=  setpoint){
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
