public interface DispenseChain {
    void setNextDispense(DispenseChain next);

    void dispense(int amount);
}
