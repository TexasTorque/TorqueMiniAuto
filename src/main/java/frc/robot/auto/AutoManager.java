package frc.robot.auto;

import java.util.ArrayList;

public class AutoManager {

    private static ArrayList<Command> commands = new ArrayList<>();
    private static Command running;
    
    public static void addCommand(double time, double[] speeds) {
        commands.add(new Command(time, speeds));
    }

    public static void run(AutoMotors motors) {
        if (commands.size() == 0) {
            System.out.println("No auto program detected");
            return;
        }
        commands.forEach((command) -> command.setMotors(motors));
        
        running = commands.get(0);
    }

    public static void continuous() {
        if (commands.size() == 0 || running == null) return;

        if (!running.hasStarted()) {
            running.start();
        }
        
        if (running.hasElapsed()) {
            running.end();
            commands.remove(0);

            if (commands.size() != 0) {
                running = commands.get(0);
            }
        }
    }
}