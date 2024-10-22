class Main {
    public static void main (String[] args) {
        Motor m1 = new Motor(1);
        Motor m2 = new Motor(2);
        Motor m3 = new Motor(3);
        Motor m4 = new Motor(4);
        
        Drivetrain dt = new Drivetrain(m1, m2, m3, m4);
        dt.driveForward();
        dt.driveForward();
        dt.driveReverse();
        dt.rotate(45.2);

        System.out.println(dt.getDrivetrainPos());
        System.out.println(dt.getDrivetrainAngle());
    }
}