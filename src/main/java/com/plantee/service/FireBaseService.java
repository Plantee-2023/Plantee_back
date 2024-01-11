package com.plantee.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

import com.google.cloud.storage.Acl;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.cloud.StorageClient;

@Service
public class FireBaseService {
	
	@Value("${app.firebase-bucket}")
	private String firebaseBucket;
	
	
	public String uploadFiles(MultipartFile file, String nameFile)
	throws IOException, FirebaseAuthException{
		Bucket bucket =StorageClient.getInstance().bucket(firebaseBucket);
		InputStream content=new ByteArrayInputStream(file.getBytes());
		Blob blob=bucket.create(nameFile.toString(), content, file.getContentType());
		return  getPublicUrl(blob);
	}

	
	 private String getPublicUrl(Blob blob ) {
		 String bucketName = blob.getBucket();
	        String blobName = blob.getName();
	        
	        return String.format("https://firebasestorage.googleapis.com/v0/b/%s/o/%s?alt=media", bucketName, blobName);
	    }
	
	 
}
