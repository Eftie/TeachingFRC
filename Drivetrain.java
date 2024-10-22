public class Drivetrain {
    int drivetrainPos = 0;
    double drivetrainAngle = 0; 

    Motor fLW;
    Motor bLW;
    Motor fRW;
    Motor bRW;

    public Drivetrain (Motor frontLeftWheel, Motor backLeftWheel, Motor frontRightWheel, Motor backRightWheel) {
        fLW = frontLeftWheel;
        bLW = backLeftWheel;
        fRW = frontRightWheel;
        bRW = backRightWheel;
    }

    public void driveForward() {
        fLW.motorForward();
        bLW.motorForward();
        fRW.motorForward();
        bRW.motorForward();

        drivetrainPos += 1;
    }

    public void driveReverse() {
        fLW.motorReverse();
        bLW.motorReverse();
        fRW.motorReverse();
        bRW.motorReverse();
        drivetrainPos -= 1;
    }

    public int getDrivetrainPos () {
        return drivetrainPos;
    }

    public void rotate (double angle) {
        drivetrainAngle = angle;
    }

    public double getDrivetrainAngle () {
        return drivetrainAngle;
    }
}
