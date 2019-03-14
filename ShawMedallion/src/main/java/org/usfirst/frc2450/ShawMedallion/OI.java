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
// import com.analog.adis16448.frc.ADIS16448_IMU;


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
    public JoystickButton leftHighButton;
    public JoystickButton leftMidButton;
    public JoystickButton leftLowButton;
    public JoystickButton rightHighButton;
    public JoystickButton rightMiddleButton;
    public JoystickButton rightLowButton;
    public JoystickButton elevatorLowButton;
    public JoystickButton elevatorMidButton;
    public JoystickButton elevatorHighButton;
    public JoystickButton elevatorPickUpButton;
    public JoystickButton retractPistonButton;
    public Joystick leftJoystick;
    public JoystickButton elevatorDropButton;
    public JoystickButton elevatorUpButton;
    public Joystick rightJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public XboxController xboxcontroller;
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(1);
        
        elevatorUpButton = new JoystickButton(rightJoystick, 4);
        elevatorUpButton.whenPressed(new EleUP());
        elevatorDropButton = new JoystickButton(rightJoystick, 3);
        elevatorDropButton.whenPressed(new ElevatorDrop());
        leftJoystick = new Joystick(0);
        
        retractPistonButton = new JoystickButton(leftJoystick, 3);
        retractPistonButton.whenPressed(new RetractPressure());
        elevatorPickUpButton = new JoystickButton(leftJoystick, 13);
        elevatorPickUpButton.whenPressed(new ElevatorToPosition(0));
        elevatorHighButton = new JoystickButton(leftJoystick, 7);
        elevatorHighButton.whenPressed(new ElevatorToPosition(56));
        elevatorMidButton = new JoystickButton(leftJoystick, 6);
        elevatorMidButton.whenPressed(new ElevatorToPosition(33));
        elevatorLowButton = new JoystickButton(leftJoystick, 5);
        elevatorLowButton.whenPressed(new ElevatorToPosition(3));
        // rightLowButton = new JoystickButton(leftJoystick, 12);
        // rightLowButton.whenPressed(new LeftPanelPlaceLow());
        // rightMiddleButton = new JoystickButton(leftJoystick, 11);
        // rightMiddleButton.whenPressed(new RightPanelPlaceMid());
        // rightHighButton = new JoystickButton(leftJoystick, 10);
        // rightHighButton.whenPressed(new RightPanelPlaceHigh());
        // leftLowButton = new JoystickButton(leftJoystick, 6);
        // leftLowButton.whenPressed(new LeftPanelPlaceLow());
        // leftMidButton = new JoystickButton(leftJoystick, 5);
        // leftMidButton.whenPressed(new LeftPanelPlaceMid());
        // leftHighButton = new JoystickButton(leftJoystick, 4);
        // leftHighButton.whenPressed(new LeftPanelPlaceHigh());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DeployPressure", new DeployPressure());
        SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
        SmartDashboard.putData("PistonUp", new PistonUp());
        SmartDashboard.putData("PistonDown", new PistonDown());
        SmartDashboard.putData("ApproachTarget", new ApproachTarget());
        SmartDashboard.putData("EleUP", new EleUP());
        SmartDashboard.putData("TargetSeek", new TargetSeek());
        SmartDashboard.putData("TargetAlign: default", new TargetAlign("right"));
        SmartDashboard.putData("ElevatorDown", new ElevatorDown());
        SmartDashboard.putData("MoveBananaArms", new MoveBananaArms());
        SmartDashboard.putData("TargetAlignLeft", new TargetAlignLeft());
        SmartDashboard.putData("TargetAlignRight", new TargetAlignRight());
        SmartDashboard.putData("ElevatorPickUp", new ElevatorPickUp());
        SmartDashboard.putData("ElevatorMid", new ElevatorMid());
        SmartDashboard.putData("ElevatorHigh", new ElevatorHigh());
        SmartDashboard.putData("ElevatorToPosition: default", new ElevatorToPosition(0));
        SmartDashboard.putData("DeactivatePanelPiston", new DeactivatePanelPiston());
        SmartDashboard.putData("ActivatePanelPiston", new ActivatePanelPiston());
        SmartDashboard.putData("RightPanelPlaceLow", new RightPanelPlaceLow());
        SmartDashboard.putData("RightPanelPlaceMid", new RightPanelPlaceMid());
        SmartDashboard.putData("RightPanelPlaceHigh", new RightPanelPlaceHigh());
        SmartDashboard.putData("RunElevator", new RunElevator());
        SmartDashboard.putData("LeftPanelPlaceLow", new LeftPanelPlaceLow());
        SmartDashboard.putData("LeftPanelPlaceHigh", new LeftPanelPlaceHigh());
        SmartDashboard.putData("LeftPanelPlaceMid", new LeftPanelPlaceMid());
        SmartDashboard.putData("LeftPanelPickUp", new LeftPanelPickUp());
        SmartDashboard.putData("ElevatorDrop", new ElevatorDrop());
        SmartDashboard.putData("ElevatorLow", new ElevatorLow());
        SmartDashboard.putData("ElevatorToPosition: default", new ElevatorToPosition(0));
        SmartDashboard.putData("LowerArms", new LowerArms());
        SmartDashboard.putData("ClimbDoNothing", new ClimbDoNothing());
        SmartDashboard.putData("RaiseArmsAndPistons", new RaiseArmsAndPistons());
        SmartDashboard.putData("Climb", new Climb());
        SmartDashboard.putData("DriveOn", new DriveOn());
        SmartDashboard.putData("RaiseToPlatform", new RaiseToPlatform());
        SmartDashboard.putData("RetractPressure", new RetractPressure());
        SmartDashboard.putData("ResetElevatorEncoder", new ResetElevatorEncoder());
        SmartDashboard.putData("TestPistonWheel", new TestPistonWheel());
        SmartDashboard.putData("ResetClimbEncoder", new ResetClimbEncoder());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    SmartDashboard.putData("ElevatorPosition: ElevatorToPickup", new ElevatorToPosition(0));
    SmartDashboard.putData("ElevatorPosition: ElevatorToLow", new ElevatorToPosition(3));
    SmartDashboard.putData("ElevatorPosition: ElevatorToMid", new ElevatorToPosition(33));
    SmartDashboard.putData("ElevatorPosition: ElevatorToHigh", new ElevatorToPosition(56));
    xboxcontroller = new XboxController(1);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getleftJoystick() {
        return leftJoystick;
    }

    public Joystick getrightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS


    public XboxController getXboxController() {
        return xboxcontroller;
    }

    
}

