// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.auto.AutoManager;
import frc.robot.auto.AutoMotors;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

	private AutoMotors motors = new AutoMotors(1, 2, 3, 4);

	/**
	 * This function is run when the robot is first started up and should be used for any
	 * initialization code.
	 */
	@Override
	public void robotInit() {}

	/**
	 * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
	 * that you want ran during disabled, autonomous, teleoperated and test.
	 *
	 * <p>This runs after the mode specific periodic functions, but before LiveWindow and
	 * SmartDashboard integrated updating.
	 */
	@Override
	public void robotPeriodic() {}

	/**
	 * This autonomous shows how you can create your own to run the motors provided for a
	 * specific amount of time at a specific speeds. Make sure AutoManager.run() runs
	 * last after you have added all of the commands.
	 *
	 * <p>You can add additional auto stages by adding more commands using different motor speeds
	 * and times.
	 */
	@Override
	public void autonomousInit() {
		AutoManager.addCommand(2, new double[]{1, 1, 1, 1});
		AutoManager.addCommand(2, new double[]{0, 0, 0, 0});
		AutoManager.addCommand(2, new double[]{-1, -1, -1, -1});

		AutoManager.run(motors);
	}

	/** This function is called periodically during autonomous. */
	@Override
	public void autonomousPeriodic() {
		AutoManager.continuous();
	}
	
	/** This function is called once when teleop is enabled. */
	@Override
	public void teleopInit() {}

	/** This function is called periodically during operator control. */
	@Override
	public void teleopPeriodic() {}

	/** This function is called once when the robot is disabled. */
	@Override
	public void disabledInit() {}

	/** This function is called periodically when disabled. */
	@Override
	public void disabledPeriodic() {}

	/** This function is called once when test mode is enabled. */
	@Override
	public void testInit() {}

	/** This function is called periodically during test mode. */
	@Override
	public void testPeriodic() {}

	/** This function is called once when the robot is first started up. */
	@Override
	public void simulationInit() {}

	/** This function is called periodically whilst in simulation. */
	@Override
	public void simulationPeriodic() {}
}