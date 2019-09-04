package com.zend.ide.util;

import java.io.Serializable;

public class bv
  implements Serializable
{
  private String a;
  private boolean b;

  public bv(String paramString)
  {
    this.a = paramString;
  }

  public bv(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }

  public String toString()
  {
    return this.a;
  }

  public boolean b()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bv
 * JD-Core Version:    0.6.0
 */