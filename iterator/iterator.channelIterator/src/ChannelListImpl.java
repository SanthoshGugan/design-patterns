import java.util.ArrayList;
import java.util.List;

public class ChannelListImpl implements ChannelList{

    private final List<Channel> channels;

    public ChannelListImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void add(final Channel channel) {
        channels.add(channel);
    }

    @Override
    public void remove(final int index) {
        if (channels.size() <= index) return;

        channels.remove(index);
    }

    @Override
    public ChannelIterator iterator(final ChannelType channelType) {
        return new ChannelIteratorImpl(channels, channelType);
    }


}
