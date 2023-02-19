public class Rupee50Dispense implements DispenseChain{
    private DispenseChain next;

    @Override
    public void setNextDispense(final DispenseChain next) {
        this.next = next;
    }

    @Override
    public void dispense(final int amount) {
        var nextDispenseAmount = amount;

        if (amount >= 50) {
            final var dispense50Notes = amount / 50;
            System.out.println("Dispensing 50 rupee notes %d".formatted(dispense50Notes));
            nextDispenseAmount = amount%50;
        }
        if (this.next != null) {
            this.next.dispense(nextDispenseAmount);
        }
    }
}
