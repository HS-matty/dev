package com.zend.ide.o;

import java.io.Serializable;

public class dg
  implements Serializable
{
  private String a;

  public dg()
  {
  }

  public dg(String paramString)
  {
    this.a = paramString;
  }

  public String b()
  {
    return this.a;
  }

  public String toString()
  {
    return this.a;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if ((paramObject instanceof dg))
    {
      dg localdg = (dg)paramObject;
      bool = this.a.equals(localdg.b());
    }
    return bool;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dg
 * JD-Core Version:    0.6.0
 */