package com.zend.ide.z;

import java.io.Serializable;
import java.util.ArrayList;

public class k
  implements Serializable
{
  private u a;
  private ArrayList b;
  private i c;

  public k()
  {
    e();
  }

  private void e()
  {
    this.b = new ArrayList();
  }

  public u b()
  {
    return this.a;
  }

  public void a(u paramu)
  {
    this.a = paramu;
  }

  public n[] c()
  {
    n[] arrayOfn = new n[this.b.size()];
    this.b.toArray(arrayOfn);
    return arrayOfn;
  }

  public ArrayList a()
  {
    return this.b;
  }

  public i d()
  {
    return this.c;
  }

  public void a(i parami)
  {
    this.c = parami;
  }

  public void a(n paramn)
  {
    this.b.add(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.k
 * JD-Core Version:    0.6.0
 */