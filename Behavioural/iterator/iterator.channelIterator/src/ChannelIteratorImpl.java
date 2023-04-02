import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator{
    private final List<Channel> channels;
    private final ChannelType channelType;

    private int position;

    public ChannelIteratorImpl(final List<Channel> channels, final ChannelType channelType) {
        this.channelType = channelType;
        this.channels = channels;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        while(position < this.channels.size()) {
            final var channel = channels.get(position);
            if (channel.getChannelType().equals(channelType)) return true;
            position += 1;
        }
        return false;
    }

    @Override
    public Channel getNext() {
        final var channel = channels.get(position);
        position += 1;
        return channel;
    }
}
