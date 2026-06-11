package br.edu.tds.ecommerce;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.util.HashMap;
import java.util.Map;


public class CloudinaryConfig {

   private static Cloudinary cloudinary;

   public static Cloudinary getCloudinary() {

       if (cloudinary == null) {

           Map<String, String> config =
                   new HashMap<>();

           config.put("cloud_name", "dsblmepe1");
           config.put("api_key", "926457989327978");
           config.put("api_secret", "nDgERX4JlOPTt5kI4nYVOm7P4NM");

           cloudinary =
                   new Cloudinary(config);
       }

       return cloudinary;
   }
   
}