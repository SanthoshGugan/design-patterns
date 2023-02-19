public class Rupee100Dispense implements DispenseChain{

    private DispenseChain next;

    @Override
    public void setNextDispense(final DispenseChain next) {
        this.next = next;
    }

    @Override
    public void dispense(final int amount) {
        var nextDispenseAmount = amount;
        if (amount >= 100) {
            final var dispense100Notes = amount / 100;
            System.out.println("dispensing 100 notes %d".formatted(dispense100Notes));
            nextDispenseAmount = amount %100;
        }
        if (this.next != null) {
            this.next.dispense(nextDispenseAmount);
        }
    }
}
