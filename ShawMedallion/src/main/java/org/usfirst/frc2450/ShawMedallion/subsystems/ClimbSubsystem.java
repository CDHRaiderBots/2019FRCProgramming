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


import java.lang.module.ModuleDescriptor.Requires;

import com.sun.jdi.Value;

import org.usfirst.frc2450.ShawMedallion.Robot;
import org.usfirst.frc2450.ShawMedallion.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
    import com.ctre.phoenix.motorcontrol.can.*;
    import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class ClimbSubsystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Compressor compressor;
    private PWMVictorSPX climbMotor;
    private DoubleSolenoid climbingSolenoids;
    private Encoder climbEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_VictorSPX bananaArmMotorSpx;
    private WPI_VictorSPX pistonWheelMotorSpx;

    public ClimbSubsystem() {
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        compressor = new Compressor(0);
        addChild("Compressor",compressor);
        
        
        climbMotor = new PWMVictorSPX(4);
        addChild("ClimbMotor",climbMotor);
        climbMotor.setInverted(false);
        
        climbingSolenoids = new DoubleSolenoid(0, 2, 3);
        addChild("ClimbingSolenoids",climbingSolenoids);
        
        
        climbEncoder = new Encoder(5, 6, false, EncodingType.k4X);
        addChild("ClimbEncoder",climbEncoder);
        climbEncoder.setDistancePerPulse(1.0);
        climbEncoder.setPIDSourceType(PIDSourceType.kRate);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        bananaArmMotorSpx = new WPI_VictorSPX(3);
        pistonWheelMotorSpx = new WPI_VictorSPX(7);
        compressor.setClosedLoopControl(true);
        //TODO change distance based on the spool
        getClimbEncoder().setDistancePerPulse(5.49 / 102400);
    }
    public Encoder getClimbEncoder()
    {
        return climbEncoder;
    }
    public void setPistonWheelMotorSpeed(double MotorSpeed)
    {
        pistonWheelMotorSpx.set(MotorSpeed);
    }
    public void StopPistonWheelMotor()
    {
        pistonWheelMotorSpx.set(0.0);
    }
    public void setBananaArmMotor(double MotorSpeed)
    {
        bananaArmMotorSpx.set(MotorSpeed);
    }
    public void stopBananaArmMotor()
    {
        bananaArmMotorSpx.set(0.0);
    }

    public void shootUp()
    {
       climbingSolenoids.set(edu.wpi.first.wpilibj.DoubleSolenoid.Value.kReverse);
    }
    public void shootDown()
    {
        climbingSolenoids.set(edu.wpi.first.wpilibj.DoubleSolenoid.Value.kForward);
    }

    public Encoder getEncoder() {
        return climbEncoder;
    }
    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new ClimbDoNothing());

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

    public Compressor getCompressor()
    {
        return compressor;
    }
    


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

