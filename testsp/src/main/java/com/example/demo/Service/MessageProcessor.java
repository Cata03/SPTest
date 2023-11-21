package Service;

public class MessageProcessor {
    private static final MessageProcessor instance = new MessageProcessor();

    private MessageDecoder atreidesDecoder = new AtreidesMessageDecoder();
    private MessageDecoder harkonnenDecoder = new HarkonnenMessageDecoder();

    private MessageProcessor() {
    }

    public static MessageProcessor getInstance() {
        return instance;
    }

    public Message processMessage(String content, String house) {
        MessageDecoder decoder = house.equals("Atreides") ? atreidesDecoder : harkonnenDecoder;
        String decodedContent = decoder.decode(content);
        return MessageFactory.createMessage(decodedContent);
    }
}
