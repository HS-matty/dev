package com.zend.ide.util;

import java.io.Serializable;

public class ib
  implements Serializable
{
  private String a;

  public ib(String paramString)
  {
    this.a = paramString;
  }

  public String toString()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ib
 * JD-Core Version:    0.6.0
 */