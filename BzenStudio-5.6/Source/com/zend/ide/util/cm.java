package com.zend.ide.util;

import java.io.Serializable;

public class cm
  implements Serializable
{
  static final long serialVersionUID = -5903636469164615372L;
  private String a;
  private boolean b;

  public cm(String paramString)
  {
    this.a = paramString;
  }

  public cm(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String toString()
  {
    return this.a;
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public boolean b()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cm
 * JD-Core Version:    0.6.0
 */