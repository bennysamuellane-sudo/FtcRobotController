package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench1 {
    private DcMotor motor; //Can make more clear

    public void init(HardwareMap hwMap){
        //touch sensor code

        //DC Motor code
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorSpeed(double speed){
        //accepts values between -1.0 and 1.0
        motor.setPower(speed);
    }

}
