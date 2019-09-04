package com.zend.ide.y;

import java.util.List;

public class l
{
  public k[] a;
  public String b;

  public l(String paramString, k[] paramArrayOfk)
  {
    this.b = paramString;
    this.a = paramArrayOfk;
  }

  public l(String paramString, List paramList)
  {
    this.b = paramString;
    this.a = new k[paramList.size()];
    paramList.toArray(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.l
 * JD-Core Version:    0.6.0
 */