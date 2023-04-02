public class Main {
    public static void main(String[] args) {

        final var rupee500Dispense = new Rupee500Dispense();
        final var rupee100Dispense = new Rupee100Dispense();
        final var rupee50Dispense = new Rupee50Dispense();

        rupee500Dispense.setNextDispense(rupee100Dispense);
        rupee100Dispense.setNextDispense(rupee50Dispense);

        System.out.println("Dispensing amount : "+1750);
        rupee500Dispense.dispense(1750);
    }
}