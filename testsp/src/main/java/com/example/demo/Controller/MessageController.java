package com.example.demo;

public class MessageController {
    private MessageProcessor messageProcessor = MessageProcessor.getInstance();

    @GetMapping("/decode-messages")
    public List<Message> decodeMessages() throws IOException {
        List<Message> messages = new ObjectMapper().readValue(new URL("file:src/messages.json"), new TypeReference<List<Message>>() {
        });
        List<Message> decodedMessages = new ArrayList<>();

        for (Message message : messages) {
            // Presupunem că mesajul conține informații despre casa (Atreides sau Harkonnen)
            String house = extractHouseFromMessage(message.getContent());
            Message decodedMessage = messageProcessor.processMessage(message.getContent(), house);
            decodedMessages.add(decodedMessage);
        }

        return decodedMessages;
    }

    private String extractHouseFromMessage(String content) {
        if (content.contains("Atreides")) {
            return "Atreides";
        } else (content.contains("Harkonnen")) {
            return "Harkonnen";
        }
    }
}
