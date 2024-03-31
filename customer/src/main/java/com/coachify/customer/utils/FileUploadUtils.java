package com.coachify.customer.utils;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtils {

	public static byte[] convertToByteArray(MultipartFile file) {
		if (file.isEmpty()) {
			return null;
		}
		try {
			return file.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
