package net.ausiasmarch.foxforumserver.repository;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebSocketHandler extends TextWebSocketHandler {
    
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Implementa la lógica para manejar los mensajes recibidos
        String payload = message.getPayload();

        // Loguea el mensaje recibido
        System.out.println("WebSocket message received: " + payload);

        // Envía una respuesta al cliente
        String responseMessage = "Hola " + payload + " !";
        session.sendMessage(new TextMessage(responseMessage));
        System.out.println("WebSocket response sent: " + responseMessage);
    }
}

