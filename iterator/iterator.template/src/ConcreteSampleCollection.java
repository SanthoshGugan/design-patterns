import java.util.ArrayList;
import java.util.List;

public class ConcreteSampleCollection implements SampleCollection{

    private final List<String> list;

    public ConcreteSampleCollection() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(final String item) {
        list.add(item);
    }

    @Override
    public void remove(final int index) {
        if(index >= list.size()) return;
        list.remove(index);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
