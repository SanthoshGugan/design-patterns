public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Concrete class creation
        /**
         * Handler initialization can be with prototype as {@link Handler} so minimally it has operation available
         *
         */
        final BaseClass lastConcreteHandler = new ConcreteClass(null);
        final BaseClass concreteHandler = new ConcreteClass(lastConcreteHandler);

        final BaseClass simpleHandler = new SimpleClass(concreteHandler);

        simpleHandler.operation();
        concreteHandler.operation();
   }
}