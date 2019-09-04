package com.zend.ide.util;

import java.util.EventObject;

public class dl extends EventObject
{
  static int a = 1;
  static int b = 2;
  static int c = 3;
  private int d;

  public dl(int paramInt, Object paramObject)
  {
    super(paramObject);
    this.d = paramInt;
  }

  public bn b()
  {
    return (bn)getSource();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dl
 * JD-Core Version:    0.6.0
 */