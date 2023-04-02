public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        final var channelList = new ChannelListImpl();

        channelList.add(new Channel("Channel 1", ChannelType.GOVERNMENT_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 2", ChannelType.REGIONAL_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 3", ChannelType.GOVERNMENT_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 4", ChannelType.GOVERNMENT_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 5", ChannelType.REGIONAL_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 6", ChannelType.INTERNATIONAL_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 7", ChannelType.NATIONAL_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 8", ChannelType.NATIONAL_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 9", ChannelType.NATIONAL_BROADCAST, 98.0));
        channelList.add(new Channel("Channel 10", ChannelType.GOVERNMENT_BROADCAST, 98.0));

        final var iterator = channelList.iterator(ChannelType.GOVERNMENT_BROADCAST);

        while(iterator.hasNext())
            System.out.println(iterator.getNext().getName());
    }
}