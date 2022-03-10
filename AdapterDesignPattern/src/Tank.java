public class Tank implements Attacker{



    @Override
    public void fireWeapon() {
        System.out.println("fire");
    }

    @Override
    public void driveForward() {
        System.out.println("driveForward");
    }

    @Override
    public void assignDriver() {
        System.out.println("Assign Driver");
    }
}
