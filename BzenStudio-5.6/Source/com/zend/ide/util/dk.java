package com.zend.ide.util;

import java.util.EventObject;

public class dk extends EventObject
{
  private String a;

  public dk(Object paramObject, String paramString)
  {
    super(paramObject);
    this.a = paramString;
  }

  public String b()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dk
 * JD-Core Version:    0.6.0
 */