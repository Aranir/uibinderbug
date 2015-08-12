package com.sample.project.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "com.sample.project.Project";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
