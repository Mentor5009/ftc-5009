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

        robot.move(new Length(60,Length.Unit.INCH),.6);

        robot

        }



}
