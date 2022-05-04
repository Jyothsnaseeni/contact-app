package com.miniproject.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "phonebook")
@Configuration
public class AppProperties {
	
  Map<String, String> messages = new HashMap<>();

public AppProperties() {
	super();
	// TODO Auto-generated constructor stub
}

public AppProperties(Map<String, String> messages) {
	super();
	this.messages = messages;
}

public Map<String, String> getMessages() {
	return messages;
}

public void setMessages(Map<String, String> messages) {
	this.messages = messages;
}
  

}
