public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        final var sampleCollection = new ConcreteSampleCollection();

        sampleCollection.add("one");
        sampleCollection.add("two");
        sampleCollection.add("three");
        sampleCollection.add("four");
        sampleCollection.add("five");
        sampleCollection.add("six");

        final var sampleCollectionIterator = sampleCollection.iterator();

        while(sampleCollectionIterator.hasNext()) {
            System.out.println(sampleCollectionIterator.getNext());
        }
    }
}