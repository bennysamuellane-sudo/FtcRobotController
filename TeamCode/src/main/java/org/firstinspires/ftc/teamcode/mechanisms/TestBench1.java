package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench1 {
    private DigitalChannel touchSensor; //touchSensorIntake
    private DcMotor motor; //linearSlideMotor0
    private double tickePerRev; //revolution

    public void init(HardwareMap hwMap){
        //touch sensor code
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        //DC Motor code
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        tickePerRev = motor.getMotorType().getTicksPerRev();
    }

    //-------------Touch Sensor--------------------

    public void setMotorSpeed(double speed){
        //accepts values between -1.0 and 1.0
        motor.setPower(speed);
    }

    public double getMotorRevs(){
        return motor.getCurrentPosition() / tickePerRev; //normalizing ticks per revolution
    }


}
