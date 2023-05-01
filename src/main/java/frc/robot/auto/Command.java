package frc.robot.auto;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Timer;

public class Command {

    private boolean hasStarted;
    private double startTime;
    private double runTime;
    private AutoMotors motors;
    private double[] speeds;

    public Command(double time, double[] speeds) {
        this.runTime = time;
        this.speeds = speeds;
    }

    public void start() {
        startTime = Timer.getFPGATimestamp();
        hasStarted = true;
        
        for (int i = 0; i < 4; i++) {
            motors.getMotors()[i].set(ControlMode.PercentOutput, speeds[i]);
        }
    }

    public void end() {
        for (int i = 0; i  < 4; i++) {
            motors.getMotors()[i].set(ControlMode.PercentOutput, 0);
        }
    }

    public boolean hasElapsed() {
        if (hasStarted) {
            return (startTime + runTime) < Timer.getFPGATimestamp();
        }
        
        return false;
    }

    public void setMotors(AutoMotors ports) {
        this.motors = ports;
    }

    public boolean hasStarted() {
        return hasStarted;
    }
}
