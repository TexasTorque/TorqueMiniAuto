package frc.robot.auto;

import java.util.ArrayList;

public class AutoManager {

    private static ArrayList<Command> commands = new ArrayList<>();
    private static Command running;
    
    public static void addCommand(double time, int[] speeds, AutoPorts ports) {
        commands.add(new Command(time, speeds, ports));
    }

    public static void run() {
        if (commands.size() == 0) {
            System.out.println("No autos detected");
            return;
        }
        
        running = commands.get(0);
    }

    public static void continuous() {
        if (commands.size() == 0) return;

        if (!running.hasStarted()) {
            System.out.println("started");
            running.start();
        }
        
        if (running.hasElapsed()) {
            running.endContinuous();
            commands.remove(0);
            System.out.println("elapsed");
            if (commands.size() != 0) running = commands.get(0);
        }
       
        if (commands.size() == 0) return;
        running.continuous();
    }
}