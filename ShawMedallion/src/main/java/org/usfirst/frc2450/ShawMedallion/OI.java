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
import edu.wpi.first.wpilibj.XboxController;
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
    public JoystickButton leftHighButton;
    public JoystickButton leftMidButton;
    public JoystickButton leftLowButton;
    public JoystickButton rightHighButton;
    public JoystickButton rightMiddleButton;
    public JoystickButton rightLowButton;
    public Joystick joystick;
    public Joystick controller;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public XboxController xboxcontroller;
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        controller = new Joystick(2);
        
        joystick = new Joystick(0);
        
        rightLowButton = new JoystickButton(joystick, 12);
        rightLowButton.whenPressed(new LeftPanelPlaceLow());
        rightMiddleButton = new JoystickButton(joystick, 11);
        rightMiddleButton.whenPressed(new RightPanelPlaceMid());
        rightHighButton = new JoystickButton(joystick, 10);
        rightHighButton.whenPressed(new RightPanelPlaceHigh());
        leftLowButton = new JoystickButton(joystick, 6);
        leftLowButton.whenPressed(new LeftPanelPlaceLow());
        leftMidButton = new JoystickButton(joystick, 5);
        leftMidButton.whenPressed(new LeftPanelPlaceMid());
        leftHighButton = new JoystickButton(joystick, 4);
        leftHighButton.whenPressed(new LeftPanelPlaceHigh());
        pistonDownButton = new JoystickButton(joystick, 2);
        pistonDownButton.whileHeld(new PistonDown());
        pistonUpButton = new JoystickButton(joystick, 1);
        pistonUpButton.whileHeld(new PistonUp());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DeployPressure", new DeployPressure());
        SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
        SmartDashboard.putData("PistonUp", new PistonUp());
        SmartDashboard.putData("PistonDown", new PistonDown());
        SmartDashboard.putData("ApproachTarget", new ApproachTarget());
        SmartDashboard.putData("LineUpRight", new LineUpRight());
        SmartDashboard.putData("EleUP", new EleUP());
        SmartDashboard.putData("ElevatorToPosition", new ElevatorToPosition());
        SmartDashboard.putData("TargetSeek", new TargetSeek());
        SmartDashboard.putData("TargetAlign", new TargetAlign());
        SmartDashboard.putData("EleDown", new EleDown());
        SmartDashboard.putData("MoveBananaArms", new MoveBananaArms());
        SmartDashboard.putData("TargetAlignLeft", new TargetAlignLeft());
        SmartDashboard.putData("TargetAlignRight", new TargetAlignRight());
        SmartDashboard.putData("LeftPanelPlaceMid", new LeftPanelPlaceMid());
        SmartDashboard.putData("ElevatorMid", new ElevatorMid());
        SmartDashboard.putData("ElevatorHigh", new ElevatorHigh());
        SmartDashboard.putData("ElevatorPickUp", new ElevatorPickUp());
        SmartDashboard.putData("DeactivatePanelPiston", new DeactivatePanelPiston());
        SmartDashboard.putData("ActivatePanelPiston", new ActivatePanelPiston());
        SmartDashboard.putData("RightPanelPlaceLow", new RightPanelPlaceLow());
        SmartDashboard.putData("RightPanelPlaceMid", new RightPanelPlaceMid());
        SmartDashboard.putData("RightPanelPlaceHigh", new RightPanelPlaceHigh());
        SmartDashboard.putData("RunElevator", new RunElevator());
        SmartDashboard.putData("LeftPanelPlaceLow", new LeftPanelPlaceLow());
        SmartDashboard.putData("LeftPanelPlaceHigh", new LeftPanelPlaceHigh());
        SmartDashboard.putData("RightPanelPickup", new RightPanelPickup());
        SmartDashboard.putData("LeftPanelPickUp", new LeftPanelPickUp());
        SmartDashboard.putData("ElevatorDrop", new ElevatorDrop());
        SmartDashboard.putData("ElevatorLow", new ElevatorLow());
        SmartDashboard.putData("ElevatorToPosition", new ElevatorToPosition());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    xboxcontroller = new XboxController(1);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }

    public Joystick getController() {
        return controller;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS


    public XboxController getXboxController() {
        return xboxcontroller;
    }

    
}

