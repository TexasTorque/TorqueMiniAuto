package frc.robot.auto;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Timer;

public class Command {

    private boolean hasStarted;
    private double startTime;
    private double runTime;
    private AutoPorts ports;
    private int[] speeds;

    public Command(double time, int[] speeds, AutoPorts ports) {
        this.runTime = time;
        this.ports = ports;
        this.speeds = speeds;
    }

    public void start() {
        System.out.println("start continuous");
        startTime = Timer.getFPGATimestamp();
        hasStarted = true;
        for (int i = 0; i < 4; i++) {
            ports.getMotors()[i].set(ControlMode.PercentOutput, speeds[i]);
        }
    }

    public void continuous() {
        ;
    }

    public void endContinuous() {
        System.out.println("End continuous");
        for (int i = 0; i  < 4; i++) {
            ports.getMotors()[i].set(ControlMode.PercentOutput, 0);
        }
    }

    public boolean hasElapsed() {
        if (hasStarted) {
            return (startTime + runTime) < Timer.getFPGATimestamp();
        }
        
        return false;
    }

    public boolean hasStarted() {
        return hasStarted;
    }
}
