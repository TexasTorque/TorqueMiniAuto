package frc.robot.auto;

public class AutoSpeeds {

    private double[] speeds = new double[4];

    public AutoSpeeds(double frontLeft, double backLeft, double frontRight, double backRight) {
        speeds[0] = frontLeft;
        speeds[1] = backLeft;
        speeds[2] = frontRight;
        speeds[3] = backRight;
    }

    public double get(int i) {
        if (i > 1) {
            return -speeds[i];
        }
        return speeds[i];
    }
}
