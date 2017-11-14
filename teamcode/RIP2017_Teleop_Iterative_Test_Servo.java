/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import static java.lang.Math.abs;

/**
 * This file provides basic Telop driving for a Pushbot robot.
 * The code is structured as an Iterative OpMode
 *
 * This OpMode uses the common Pushbot hardware class to define the devices on the robot.
 * All device access is managed through the HardwarePushbot class.
 *
 * This particular OpMode executes a basic Tank Drive Teleop for a PushBot
 * It raises and lowers the claw using the Gampad Y and A buttons respectively.
 * It also opens and closes the claws slowly using the left and right Bumper buttons.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

/**
 * This file provides basic Telop driving for a 2017-2018 Robots In Paradise robot.
 * The code is structured as an Iterative OpMode
 *
 * This OpMode uses the common HardwareRIP class to define the devices on the robot.
 * All device access is managed through the HardwareRIP class.
 *
 * This particular OpMode executes a basic Mecanum Wheel Drive Teleop for our robot.
 * It drives forward and reverse using the Gamepad1 Y sticks vertical axis respectively.
 * gamepad1.left_stick_y gamepad.right_stick_y
 * It drives left and right using the Gamepad1 X sticks horizontal axis respectively.
 * gamepad1.left_stick_x gamepad1.right_stick_x
 * It raises and lowers the claw using the Gamepad2 Y and A button respectively.
 * gamepad2.y gamepad2.a
 * It opens and closes the claws slowly using the Gamepad2 dpad_up and dpad_down repectively.
 * gamepad2.dpad_up gamepad2.dpad_down
 *
 */

@TeleOp(name="RIP2017bot: Teleop Test Servo", group="RIP2017bot")
//@Disabled
public class RIP2017_Teleop_Iterative_Test_Servo extends OpMode{

    /* Declare OpMode members. */
    HardwareRIP robot       = new HardwareRIP(); // used to define a robot's hardware
                                                         // could also use HardwareRIPMatrix class.

    double          clawOffset  = 0.0 ;                  // Servo mid position
    final double    CLAW_SPEED  = 0.02 ;                 // sets rate to move servo

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Say", "Hello Driver");    //
    }
    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        double leftNS;
        double rightNS;
        double leftEW;
        double rightEW;

        // Use gamepad2 dpadto open and close the claw

        rightNS = -gamepad2.right_stick_y;
        if (rightNS > 0) {
            robot.leftClaw.setPosition(robot.leftClaw.getPosition() - 0.02);
            robot.rightClaw.setPosition(robot.rightClaw.getPosition() + 0.02);}
        else if (rightNS < 0) {
            robot.leftClaw.setPosition(robot.leftClaw.getPosition() + 0.02);
            robot.rightClaw.setPosition(robot.rightClaw.getPosition() - 0.02);}
        else {
            robot.leftClaw.setPosition(robot.leftClaw.getPosition());
            robot.rightClaw.setPosition(robot.rightClaw.getPosition());}
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}
