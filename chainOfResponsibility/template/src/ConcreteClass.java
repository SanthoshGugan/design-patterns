/**
 * Concrete class points to next handler
 *
 * <p>
 *     Next point means controller pass to next operation or it may be the fall back to parent class depends on the
 *     scenario
 *
 *     operation fall back to base class operation if not explicitly specified in the concrete class
 * </p>
 */
public class ConcreteClass extends BaseClass{

    /**
     * Next pointer can be assigned during class initialization or dynamically assigned with set method
     * @param next
     */
    public ConcreteClass(final Handler next) {
        this.next = next;
    }

    /**
     * Operation needs to a check on next handler. This is the reason to have next assignment on the constructor and
     * have mandatory field check as it may break chain of responsibility
     */
    @Override
    public void operation() {

        System.out.println("Operation from Concrete class");
        if (next != null)
            next.operation();
    }
}
