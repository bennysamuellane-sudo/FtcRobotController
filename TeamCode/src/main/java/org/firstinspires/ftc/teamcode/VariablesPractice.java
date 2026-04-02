package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablesPractice extends OpMode {

    @Override
    public void init() {
        int teamNumber = 27014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw State", clawClosed);
    }

    @Override
    public void loop() {

    }
}
