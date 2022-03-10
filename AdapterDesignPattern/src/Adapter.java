public class Adapter implements Attacker{

    Bot theBot;
    public Adapter(Bot newBot) {
        theBot = newBot;
}
    @Override
    public void fireWeapon() {
        theBot.smash();
    }

    @Override
    public void driveForward() {
        theBot.walkForward();
    }

    @Override
    public void assignDriver() {
        theBot.reactToHumans();
    }
}
