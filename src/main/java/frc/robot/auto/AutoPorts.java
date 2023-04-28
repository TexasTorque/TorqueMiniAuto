package frc.robot.auto;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class AutoPorts {
    
    private TalonSRX[] motors = new TalonSRX[4];

    public AutoPorts(int one, int two, int three, int four) {
        motors[0] = new TalonSRX(one);
        motors[1] = new TalonSRX(two);
        motors[2] = new TalonSRX(three);
        motors[3] = new TalonSRX(four);
    }

    public TalonSRX[] getMotors() {
        return motors;
    }
}
