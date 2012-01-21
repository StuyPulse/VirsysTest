/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class VirsysTest extends SimpleRobot {
    public static final int LEFT_CHANNEL             = 1;
    public static final int RIGHT_CHANNEL            = 2;
    
    RobotDrive rd;
    
    public void robotInit() {
        rd = new RobotDrive(LEFT_CHANNEL, RIGHT_CHANNEL);
        rd.setSafetyEnabled(false);
    }
    
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        getWatchdog().setEnabled(false);
        System.out.println("Running auton");
        rd.tankDrive(1, -1);
        Timer.delay(0.5);
        rd.tankDrive(0, 0);
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {

    }
}
