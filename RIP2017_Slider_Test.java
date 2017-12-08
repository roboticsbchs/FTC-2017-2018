package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

/**
 * Created by Zach on 10/24/2017.
 */
@Autonomous(name="Slider Test", group="RIP2017bot")
//@Disabled
public class RIP2017_Slider_Test extends LinearOpMode {

    HardwareRIP robot = new HardwareRIP();

    public void runOpMode() throws InterruptedException {

        waitForStart();

        robot.slider.setPosition(0.55);
        sleep(1000);
        robot.slider.setPosition(0.5);

        idle();
    }
}
