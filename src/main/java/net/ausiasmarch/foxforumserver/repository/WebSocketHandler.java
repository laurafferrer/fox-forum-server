package net.ausiasmarch.foxforumserver.repository;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebSocketHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Implementa la lógica para manejar los mensajes recibidos
        String payload = message.getPayload();
        // Puedes procesar el mensaje aquí



        // Y enviar una respuesta
        session.sendMessage(new TextMessage("Hola " + payload + " !"));
    }
}
