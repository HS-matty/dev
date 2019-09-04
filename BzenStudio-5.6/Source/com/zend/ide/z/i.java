package com.zend.ide.z;

import java.io.Serializable;
import java.util.ArrayList;

public class i
  implements Serializable
{
  private ArrayList a = new ArrayList();
  private int b;

  public void a(j paramj)
  {
    this.a.add(paramj);
  }

  public int c()
  {
    return this.b;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }

  public void a()
  {
    this.a.remove(0);
    this.a.remove(this.a.size() - 1);
    this.b -= 2;
  }

  public j[] b()
  {
    j[] arrayOfj = new j[this.a.size()];
    this.a.toArray(arrayOfj);
    return arrayOfj;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.i
 * JD-Core Version:    0.6.0
 */