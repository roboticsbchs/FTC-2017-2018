package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by cookja on 10/27/2017.
 */
@Autonomous(name="Right Power50 Time2000ms", group="RIP2017bot")
//@Disabled
public class Right50Power2000ms extends LinearOpMode {

    @Override
    public void runOpMode() {

        HardwareRIP robot = new HardwareRIP();

        waitForStart();

        robot.leftFrontDrive.setPower(0.5);
        robot.leftRearDrive.setPower(-0.5);
        robot.rightFrontDrive.setPower(-0.5);
        robot.rightRearDrive.setPower(0.5);
        sleep(2000);

        robot.leftFrontDrive.setPower(0);
        robot.leftRearDrive.setPower(0);
        robot.rightFrontDrive.setPower(0);
        robot.rightRearDrive.setPower(0);
        idle();
    }
}