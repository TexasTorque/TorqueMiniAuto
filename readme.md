# TorqueMiniAuto

Codebase for **TorqueMiniAuto**, An auto framework written for time based autos!

## Details

TorqueMiniAuto is used for time based autos running a four motor drive to set motor speeds for a specific amount of time in blocks.

To add new blocks to the auto, go to the [Robot class](https://github.com/TexasTorque/TorqueMiniAuto/blob/main/src/main/java/frc/robot/Robot.java), scroll down to the autonomousInit() method, where you will find other pre-set blocks. Copy and paste, and change the motor speeds to your choosing. The first parameter is the amount of time to be at that set speed before moving on to the next line and running that.

A few lines above that you will find the `motors` variable. This allows you to set the motor ports used for each wheel. Change this to what your ports are.

## Contributors

- [Davey Adams (programmer)](https://github.com/humandavey/)
- [Jacob Daniels (programmer)](https://github.com/firebanner64/)
