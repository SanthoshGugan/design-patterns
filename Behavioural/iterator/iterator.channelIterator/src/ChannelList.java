
public interface ChannelList {

    void add(Channel channel);

    void remove(int index);

    ChannelIterator iterator(ChannelType channelType);
}
