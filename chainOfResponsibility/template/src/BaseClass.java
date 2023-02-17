/**
 * Abstract class implements boiler plate code for each of the handler
 * <p>
 *     It also serves as the defaul action if handler doesnt override the operation method
 * </p>
 */
public abstract class BaseClass implements Handler{

    /**
     * next pointer is available for the set of concrete classes that needs to assign chain of responsibility
     */
    protected BaseClass next;

    @Override
    public void operation() {
        System.out.println("Base class operation!!!!");
    }

    public BaseClass getNext() { return this.next;}

}
