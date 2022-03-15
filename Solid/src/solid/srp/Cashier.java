package solid.srp;

public class Cashier {
    private int amountCharged;
    private int amountPaid;

    public void setCharges(int amountCharged){
        this.amountCharged = amountCharged;
        System.out.println(amountCharged);
    }

    public int getBalance(String patient_id){
        return amountCharged - amountPaid;
    }

}
