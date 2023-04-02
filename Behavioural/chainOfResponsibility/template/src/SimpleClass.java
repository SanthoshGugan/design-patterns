/**
 * Simple class is intended to explain that it doesnt have its own handler and operation defined. it fall back to
 * abstract class {@link BaseClass} for handler and operation
 */
public class SimpleClass extends BaseClass {
    public SimpleClass(final Handler next) {
        this.next = next;
        System.out.println("I am simple class without a operation override");
    }

}
