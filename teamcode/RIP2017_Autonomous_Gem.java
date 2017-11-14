package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

/**
 * Created by Zach on 10/24/2017.
 */
@Autonomous(name="Autonomous Gem", group="RIP2017bot")
@Disabled
public class RIP2017_Autonomous_Gem extends LinearOpMode {

    ColorSensor color_sensor;
    HardwareRIP robot = new HardwareRIP();

    public void runOpMode() throws InterruptedException {

        color_sensor = hardwareMap.colorSensor.get("color");

        waitForStart();

        robot.leftFrontDrive.setPower(1);
        robot.leftRearDrive.setPower(1);
        robot.rightFrontDrive.setPower(1);
        robot.rightRearDrive.setPower(1);
        sleep(2000);

        color_sensor.enableLed(true);
        if (color_sensor.red() > 20) {
            robot.leftFrontDrive.setPower(-1);
            robot.leftRearDrive.setPower(1);
            robot.rightFrontDrive.setPower(1);
            robot.rightRearDrive.setPower(-1);
            sleep(2000);

            robot.leftFrontDrive.setPower(-1);
            robot.leftRearDrive.setPower(-1);
            robot.rightFrontDrive.setPower(1);
            robot.rightRearDrive.setPower(1);
            sleep(2000);
        }
        else {
            robot.leftFrontDrive.setPower(1);
            robot.leftRearDrive.setPower(-1);
            robot.rightFrontDrive.setPower(-1);
            robot.rightRearDrive.setPower(1);
            sleep(2000);

            robot.leftFrontDrive.setPower(1);
            robot.leftRearDrive.setPower(1);
            robot.rightFrontDrive.setPower(-1);
            robot.rightRearDrive.setPower(-1);
            sleep(2000);
        }

        robot.leftFrontDrive.setPower(0);
        robot.leftRearDrive.setPower(0);
        robot.rightFrontDrive.setPower(0);
        robot.rightRearDrive.setPower(0);
        idle();
    }
}
