public class Rupee500Dispense implements DispenseChain{

    private DispenseChain next;

    @Override
    public void setNextDispense(final DispenseChain next) {
        this.next = next;
    }

    @Override
    public void dispense(final int amount) {
        var nextDispenseAmount = amount;
        if (amount >= 500) {
            final var dispense500notes = amount / 500;
            System.out.println("dispensing 500 notes %d".formatted(dispense500notes));
            nextDispenseAmount = amount % 500;
        }

        if (this.next != null) {
            this.next.dispense(nextDispenseAmount);
        }
    }
}
