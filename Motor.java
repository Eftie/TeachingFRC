public class Motor {
    private int motorID;
    private int motorPos = 0;

    public Motor (int motorID) {
        this.motorID = motorID;
    }

    public int getMotorID() {
        return motorID;
    }

    public void motorForward () {
        motorPos += 1;
    }

    public void motorReverse () {
        motorPos -= 1;
    }

    public void printMotorPosition () {
        System.out.println(motorPos);
    }
}