package net.ausiasmarch.foxforumserver.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import net.ausiasmarch.foxforumserver.repository.WebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketService implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myHandler(), "/ws").setAllowedOrigins("*");
    }

    @Bean
    public WebSocketHandler myHandler() {
        return new WebSocketHandler();
    }
    
}
