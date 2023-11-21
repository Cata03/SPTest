package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;
@SpringBootApplication
public class TestApplication {
	public static void main(String[] args) {
		// SpringApplication.run(MainApplication.class, args);
		private MessageController messageController;
		public void testMessageDecoding () throws IOException {
			List<Message> decodedMessages = messageController.decodeMessages();

			// Print decoded messages
			for (Message decodedMessage : decodedMessages) {
				System.out.println("Decoded Message: " + decodedMessage.getContent());
			}
		}


	}
}