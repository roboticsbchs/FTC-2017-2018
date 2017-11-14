package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


/**
 * Created by cookja on 10/27/2017.
 */
@Autonomous(name="Forward Power10 Time2000ms", group="RIP2017bot")
//@Disabled
public class Forward10power2000ms extends LinearOpMode {

    @Override
    public void runOpMode() {

        HardwareRIP robot = new HardwareRIP();

        waitForStart();

        robot.leftFrontDrive.setPower(0.1);
        robot.leftRearDrive.setPower(0.1);
        robot.rightFrontDrive.setPower(0.1);
        robot.rightRearDrive.setPower(0.1);
        sleep(2000);

        robot.leftFrontDrive.setPower(0);
        robot.leftRearDrive.setPower(0);
        robot.rightFrontDrive.setPower(0);
        robot.rightRearDrive.setPower(0);
        idle();
    }
}