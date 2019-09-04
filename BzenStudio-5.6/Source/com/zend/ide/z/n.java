package com.zend.ide.z;

import java.io.Serializable;
import java.util.ArrayList;

public class n
  implements Serializable
{
  private String a;
  private int b;
  private double c = 0.0D;
  private ArrayList d = new ArrayList();

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String e()
  {
    return this.a;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }

  public int b()
  {
    return this.b;
  }

  public void a(r paramr)
  {
    this.d.add(paramr);
    this.c += paramr.g();
  }

  public r[] c()
  {
    r[] arrayOfr = new r[this.d.size()];
    this.d.toArray(arrayOfr);
    return arrayOfr;
  }

  public double d()
  {
    return this.c * 1000.0D;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.n
 * JD-Core Version:    0.6.0
 */