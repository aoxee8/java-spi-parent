package com.nicky.spi.client;

import com.nicky.spi.Developer;
import java.util.ServiceLoader;

/**
 * JavaSpiClient
 *
 * @author gaoxi
 * @Time 2018/1/12
 */
public class JavaSpiClient {

  public static void main(String[] args) {

    ServiceLoader<Developer> serviceLoader = ServiceLoader.load(Developer.class);

    for (Developer developer : serviceLoader) {
      System.out.println("this is " + developer.getPrograme());
    }

  }

}
