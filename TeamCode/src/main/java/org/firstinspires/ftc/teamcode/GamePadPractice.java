package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double xDiff = (gamepad1.left_stick_x - gamepad1.right_stick_x);
        double triggerAdd = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("L-X", gamepad1.left_stick_x);
        telemetry.addData("L-Y", speedForward);
        telemetry.addData("R-X", gamepad1.right_stick_x);
        telemetry.addData("R-Y", gamepad1.right_stick_y);
        telemetry.addData("Diff", xDiff);
        telemetry.addData("Trigger", triggerAdd);
        telemetry.addData("A", gamepad1.a);
        telemetry.addData("B", gamepad1.b);

    }
}
