package com.kt.jersey.config;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * 
 * @author sofien
 *
 */
public class AppConfig extends ResourceConfig {
  public AppConfig(){
    
    //package activation
    packages("com.kt.jersey.impl", "com.fasterxml.jackson.core", "com.wordnik.swagger.jaxrs.json", "com.wordnik.swagger.jaxrs.listing");

    //multipart activation
    register(MultiPartFeature.class);
  }
}
