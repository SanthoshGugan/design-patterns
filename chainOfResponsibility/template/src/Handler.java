/**
 * Each operation in the chain of responsibility needs to implemented by Handler
 * operation provided in the handler should be part of abstract class and/or part of concrete handlers
 */
public interface Handler {

    void nextHandler(Handler handler);
    /**
     * Each operation in handler will have precedence to take up based on the assignment of chain of responsibility
     */
    void operation();

}
