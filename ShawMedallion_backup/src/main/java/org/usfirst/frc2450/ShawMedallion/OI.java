// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2450.ShawMedallion;

import org.usfirst.frc2450.ShawMedallion.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import com.analog.adis16448.frc.ADIS16448_IMU;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton pistonUpButton;
    public JoystickButton pistonDownButton;
    public Joystick leftJoystick;
    public Joystick rightJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(1);
        
        leftJoystick = new Joystick(0);
        
        pistonDownButton = new JoystickButton(leftJoystick, 2);
        pistonDownButton.whileHeld(new PistonDown());
        pistonUpButton = new JoystickButton(leftJoystick, 1);
        pistonUpButton.whileHeld(new PistonUp());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DeployPressure", new DeployPressure());
        SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
        SmartDashboard.putData("PistonUp", new PistonUp());
        SmartDashboard.putData("PistonDown", new PistonDown());
        SmartDashboard.putData("TurnWithAngle", new TurnWithAngle());
        SmartDashboard.putData("ApproachTarget", new ApproachTarget());
        SmartDashboard.putData("LineUpRight", new LineUpRight());
        SmartDashboard.putData("TargetAlign", new TargetAlign());
        SmartDashboard.putData("TargetSeek", new TargetSeek());
        SmartDashboard.putData("RunElevator", new RunElevator());
        SmartDashboard.putData("EleUP", new EleUP());
        SmartDashboard.putData("ElevatorDown", new ElevatorDown());
        SmartDashboard.putData("MoveBananaArms", new MoveBananaArms());
        SmartDashboard.putData("TargetAlignLeft", new TargetAlignLeft());
        SmartDashboard.putData("TargetAlignRight", new TargetAlignRight());
        SmartDashboard.putData("ElevatorLow", new ElevatorLow());
        SmartDashboard.putData("ElevatorMid", new ElevatorMid());
        SmartDashboard.putData("ElevatorHigh", new ElevatorHigh());
        SmartDashboard.putData("ElevatorPickUp", new ElevatorPickUp());
        SmartDashboard.putData("DeactivatePanelPiston", new DeactivatePanelPiston());
        SmartDashboard.putData("ActivatePanelPiston", new ActivatePanelPiston());
        SmartDashboard.putData("RightPanelPlaceLow", new RightPanelPlaceLow());
        SmartDashboard.putData("RightPanelPlaceMid", new RightPanelPlaceMid());
        SmartDashboard.putData("RightPanelPlaceHigh", new RightPanelPlaceHigh());
        SmartDashboard.putData("LeftPanelPlaceLow", new LeftPanelPlaceLow());
        SmartDashboard.putData("LeftPanelPlaceMid", new LeftPanelPlaceMid());
        SmartDashboard.putData("LeftPanelPlaceHigh", new LeftPanelPlaceHigh());
        SmartDashboard.putData("RightPanelPickup", new RightPanelPickup());
        SmartDashboard.putData("LeftPanelPickUp", new LeftPanelPickUp());
        SmartDashboard.putData("ElevatorToPosition", new ElevatorToPosition());
        SmartDashboard.putData("Command 1", new Command1());
        SmartDashboard.putData("testElevator", new testElevator());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

