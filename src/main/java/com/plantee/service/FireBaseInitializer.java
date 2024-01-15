package com.plantee.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;
 


import com.google.api.client.util.Value;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


@Service
public class FireBaseInitializer {
	
	
	@Value("${app.firebase-configuration-file}")
	private String firebaseConfigPath;
	
	
	 @PostConstruct
	    public void initialize() {
	        try {
	            FirebaseOptions options = new FirebaseOptions.Builder()
	                    .setCredentials(GoogleCredentials.fromStream(
	                            new ClassPathResource("serviceAccountKey.json").getInputStream()))
	                    .build();

	            if (FirebaseApp.getApps().isEmpty()) {
	                FirebaseApp.initializeApp(options);
	                System.out.println("Firebase application has been initialized");
	            }
	        } catch (IOException e) {
	            System.err.println("Error initializing Firebase: " + e.getMessage());
	        }
	    }
	}
 
 
