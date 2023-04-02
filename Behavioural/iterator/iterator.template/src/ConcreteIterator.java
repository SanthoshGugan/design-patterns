import java.util.List;

public class ConcreteIterator implements Iterator{
    private int position;
    private final List<String> list;
    public ConcreteIterator(final List<String> list) {
        this.position = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.position < list.size();
    }

    @Override
    public String getNext() {
        // handle tail use case gracefully
        if (!hasNext()) return "";

        return this.list.get(this.position++);
    }
}
