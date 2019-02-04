// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2450.ShawMedallion.subsystems;


import org.usfirst.frc2450.ShawMedallion.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc2450.ShawMedallion.Robot;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveDrainSubsytem extends Subsystem {
    
    
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Spark leftFrontMotor;
    private Spark leftRearMotor;
    private Spark rightFrontMotor;
    private Spark rightRearMotor;
    private MecanumDrive robotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public DriveDrainSubsytem() {
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftFrontMotor = new Spark(0);
        addChild("LeftFrontMotor",leftFrontMotor);
        leftFrontMotor.setInverted(false);
        
        leftRearMotor = new Spark(1);
        addChild("LeftRearMotor",leftRearMotor);
        leftRearMotor.setInverted(false);
        
        rightFrontMotor = new Spark(2);
        addChild("RightFrontMotor",rightFrontMotor);
        rightFrontMotor.setInverted(false);
        
        rightRearMotor = new Spark(3);
        addChild("RightRearMotor",rightRearMotor);
        rightRearMotor.setInverted(false);
        
        robotDrive = new MecanumDrive(leftFrontMotor, leftRearMotor,
              rightFrontMotor, rightRearMotor);
        addChild("RobotDrive",robotDrive);
        robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setMaxOutput(1.0);

        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    
    }
    public void takeJoystickInputs(Joystick left, Joystick right)
    {   

        robotDrive.driveCartesian(left.getX(), -left.getY(), left.getZ());
        

    
    }


    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoysticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
         
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void moveForward(){
        robotDrive.driveCartesian(0.2, 0 ,0);
    }

    public void turnRight()
    {
        // Robot.driveDrainSubsytem.leftFrontMotor.set(0.1);
        // Robot.driveDrainSubsytem.rightFrontMotor.set(-0.1);
        // Robot.driveDrainSubsytem.leftRearMotor.set(-0.1);
        // Robot.driveDrainSubsytem.rightRearMotor.set(0.1);
        
        robotDrive.driveCartesian(0,0,.175);
    }
    public void turnLeft()
    {
        robotDrive.driveCartesian(0,0,-.175);
    }
    public void stopMotors()
    {
        // Robot.driveDrainSubsytem.leftFrontMotor.set(0);
        // Robot.driveDrainSubsytem.rightFrontMotor.set(0);
        // Robot.driveDrainSubsytem.leftRearMotor.set(0);
        // Robot.driveDrainSubsytem.rightRearMotor.set(0);
        robotDrive.driveCartesian(0,0,0);
    }

}

