package frc.robot.auto;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class AutoMotors {
    
    private TalonSRX[] motors = new TalonSRX[4];

    public AutoMotors(int frontLeft, int backLeft, int frontRight, int backRight) {
        motors[0] = new TalonSRX(frontLeft);
        motors[1] = new TalonSRX(backLeft);
        motors[2] = new TalonSRX(frontRight);
        motors[3] = new TalonSRX(backRight);
    }

    public TalonSRX[] getMotors() {
        return motors;
    }
}
