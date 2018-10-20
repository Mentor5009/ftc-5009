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
        robot.move(new Length(10,Length.Unit.INCH),.6);

        //Servo "marker" drops marker
        robot.marker.setPosition(0.3);

        //Servo "marker" goes back to up

        robot.marker.setPosition(0.6);

        //Robot right pivots towards crater








    }





}
