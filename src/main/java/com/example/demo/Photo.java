package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Photo {
   private int Id = 1;
   private String username = "Cybergate";

   private Map<String, Photo> db = new HashMap<>() {{
      put("1", new Photo());
   }};

   public Collection<Photo> get() {
      return null;
   }
   
}
