package com.zend.ide.util;

import java.io.Serializable;

public class fb
  implements Serializable
{
  private String a;

  public fb(String paramString)
  {
    this.a = paramString;
  }

  public String toString()
  {
    return this.a;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof fb))
      return this.a.equals(((fb)paramObject).toString());
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.fb
 * JD-Core Version:    0.6.0
 */