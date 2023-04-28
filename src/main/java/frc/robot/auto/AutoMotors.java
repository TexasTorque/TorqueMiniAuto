package frc.robot.auto;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class AutoMotors {
    
    private TalonSRX[] motors = new TalonSRX[4];

    public AutoMotors(int port1, int port2, int port3, int port4) {
        motors[0] = new TalonSRX(port1);
        motors[1] = new TalonSRX(port2);
        motors[2] = new TalonSRX(port3);
        motors[3] = new TalonSRX(port4);
    }

    public TalonSRX[] getMotors() {
        return motors;
    }
}
