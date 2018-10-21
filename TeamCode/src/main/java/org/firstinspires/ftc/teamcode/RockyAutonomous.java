package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "Depot Marker")
public class RockyAutonomous extends LinearOpMode {
    HardwareRocky robot;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new HardwareRocky();

        robot.init(hardwareMap);
        waitForStart();
        runtime.reset();

        robot.move(new Length(50,Length.Unit.INCH),.6);

        robot.marker.setPosition(0.2);

        while (robot.marker.getPosition()>0.2) Thread.yield();

        sleep(40);

        robot.marker.setPosition(0.6);

        sleep(40);

        robot.pivot(135, .2);

        sleep(40);

        robot.move(new Length( 74,Length.Unit.INCH), .6);

        sleep(40);
    }
}
