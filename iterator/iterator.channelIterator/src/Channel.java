public class Channel {
    private double freq;
    private String name;

    private ChannelType channelType;

    public Channel(final String name, final ChannelType channelType, final double freq) {
        this.name = name;
        this.channelType = channelType;
        this.freq = freq;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }
}
