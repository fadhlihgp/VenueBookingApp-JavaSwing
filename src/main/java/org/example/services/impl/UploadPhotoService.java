package org.example.services.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UploadPhotoService {

    public String UploadPhoto(String fileName){
        String newPath = "src/upload";
        File directory = new File(newPath);
        if (!directory.exists()){
            directory.mkdirs();
        }
        File beginFile = null;
        File endFile = null;

        // Set random name photo
        LocalDate nowDate = LocalDate.now();
        String datee = nowDate.format(DateTimeFormatter.ofPattern("dd"));
        LocalTime now = LocalTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("hhmmss"));
        String id = "BK"+datee+"-"+time;

        String ext = fileName.substring(fileName.lastIndexOf('.')+1);
        beginFile = new File(fileName);
        endFile = new File(newPath+"/"+ id +"."+ext);
        try {
            Files.copy(beginFile.toPath(), endFile.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileName = newPath + "/" + id +"."+ext;
        return fileName;
    }
}
