package org.firstinspires.ftc.teamcode;
//sorry i'll finish comments later because its midnight rn
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "BIOBUZZ Starter Bot", group = "Linear Opmode")
public class testBiobuzzStarterBotDrive extends LinearOpMode {

    // fix these on the field
    static final double ACTUATOR_OUT = 0.2;  
    static final double ACTUATOR_HOME = 0.0; 

    @Override
    public void runOpMode() {
        DcMotor leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");
        DcMotor rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");
        DcMotor intake = hardwareMap.get(DcMotor.class, "Intake");
        DcMotor flyWheel = hardwareMap.get(DcMotor.class, "FlyWheel");
        Servo fwActuator = hardwareMap.get(Servo.class, "fwActuator");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE); // keep in mind, youve gotta ask mr beatty if i should keep to reverse or not
        fwActuator.setDirection(Servo.Direction.REVERSE);  // keep in mind, youve gotta ask mr beatty if i should keep to reverse or not

        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

     
        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        while (opModeIsActive()) {
  
            double left = gamepad1.left_stick_y;
            double right = gamepad1.right_stick_y;

            leftDrive.setPower(left);
            rightDrive.setPower(right);

            if (gamepad1.a) {
                fwActuator.setPosition(ACTUATOR_OUT);
            } else if (gamepad1.x) {
                fwActuator.setPosition(ACTUATOR_HOME);
            }

     
            if (gamepad1.right_bumper) {
                intake.setPower(1);
            } else if (gamepad1.left_bumper) {
                intake.setPower(-1);
            } else {
                intake.setPower(0);
            }


            flyWheel.setPower(gamepad1.right_trigger);

            telemetry.addData("left", left);
            telemetry.addData("right", right);
            telemetry.addData("flywheel", gamepad1.right_trigger);
            telemetry.update();
        }
    }
}
