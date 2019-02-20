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
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
    import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.*;


/**
 *
 */
public class DriveDrainSubsytem extends Subsystem {
    
    
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private PWMVictorSPX leftFrontMotor;
    private PWMVictorSPX leftRearMotor;
    private PWMVictorSPX rightFrontMotor;
    private PWMVictorSPX rightRearMotor;
    private MecanumDrive robotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_VictorSPX driveMotor2Spx;
    private WPI_VictorSPX driveMotor0Spx;
    private WPI_VictorSPX driveMotor1Spx;
    private WPI_VictorSPX driveMotor3Spx;
    private MecanumDrive canDrive;
    public MecanumDrive getRobotDrive() {
        return canDrive;
    }

    public DriveDrainSubsytem() {
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftFrontMotor = new PWMVictorSPX(0);
        addChild("LeftFrontMotor",leftFrontMotor);
        leftFrontMotor.setInverted(false);
        
        leftRearMotor = new PWMVictorSPX(1);
        addChild("LeftRearMotor",leftRearMotor);
        leftRearMotor.setInverted(false);
        
        rightFrontMotor = new PWMVictorSPX(2);
        addChild("RightFrontMotor",rightFrontMotor);
        rightFrontMotor.setInverted(false);
        
        rightRearMotor = new PWMVictorSPX(3);
        addChild("RightRearMotor",rightRearMotor);
        rightRearMotor.setInverted(false);
        
        robotDrive = new MecanumDrive(leftFrontMotor, leftRearMotor,
              rightFrontMotor, rightRearMotor);
        addChild("RobotDrive",robotDrive);
        robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setMaxOutput(1.0);

        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
     driveMotor2Spx = new WPI_VictorSPX(1);
     driveMotor0Spx = new WPI_VictorSPX(2);
     driveMotor1Spx = new WPI_VictorSPX(5);
     driveMotor3Spx = new WPI_VictorSPX(6);
    

    canDrive = new MecanumDrive(driveMotor0Spx, driveMotor2Spx,
              driveMotor1Spx, driveMotor3Spx);
        addChild("RobotCanDrive",canDrive);
        robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setMaxOutput(1.0);

        

    
    }


    public void takeXboxJoystickInputs(XboxController xboxcontroller)
    {   
        canDrive.driveCartesian(xboxcontroller.getX(Hand.kLeft), -xboxcontroller.getY(Hand.kLeft), xboxcontroller.getRawAxis(2));   
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
        canDrive.driveCartesian(0.2, 0 ,0);
    }

    public void stopMotors()
    {
        // Robot.driveDrainSubsytem.leftFrontMotor.set(0);
        // Robot.driveDrainSubsytem.rightFrontMotor.set(0);
        // Robot.driveDrainSubsytem.leftRearMotor.set(0);
        // Robot.driveDrainSubsytem.rightRearMotor.set(0);
    }
    
    public void turnLeft()
    {
        canDrive.driveCartesian(0,0,-.175);
    }

    public void turnRight()
    {
        canDrive.driveCartesian(0,0, 0.175);
    }
    
    public void turnLeftAngle(double turnRate)
    {
        canDrive.driveCartesian(0,0, turnRate);
    }

    public void turnRightAngle(double turnRate)
    {
        canDrive.driveCartesian(0,0, turnRate);
    }
    public void MoveForwardProportional(double driveProportion){
        canDrive.driveCartesian(driveProportion, 0, 0);
    }


}

