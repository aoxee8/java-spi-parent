package com.nicky.spi.impl;

import com.nicky.spi.Developer;

/**
 * PythonDeveloper
 *
 * @author gaoxi
 * @Time 2018/1/12
 */
public class PythonDeveloper implements Developer {

  @Override
  public String getPrograme() {
    return "python";
  }
}
