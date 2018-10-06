package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "Depot Marker")
public class RockyAutonomous extends LinearOpMode {
    HardwareRocky robot;



    @Override
    public void runOpMode() throws InterruptedException {
        robot = new HardwareRocky();

        robot.init(hardwareMap);
        waitForStart();
        robot.move(new Length(60,Length.Unit.INCH),.6);


    }





}
