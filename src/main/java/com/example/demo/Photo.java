package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

public class Photo {
   private int Id = 1;
   private String username = "Cybergate";

   private Map<String, Photo> db = new HashMap<>() {{
      db.put("1", new Photo());
   }};

   public Collection<Photo> getPhotos(@PathVariable @Validated MultipartFile data) {
      return null;
   }
   
}
