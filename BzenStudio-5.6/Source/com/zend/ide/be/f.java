package com.zend.ide.be;

import java.util.Vector;

public class f
{
  private Vector a;
  private Vector b;
  private Vector c;

  public synchronized void a(e parame)
  {
    if (this.a == null)
      this.a = new Vector(4);
    this.a.add(parame);
  }

  public synchronized void a(g paramg)
  {
    if (this.b == null)
      this.b = new Vector(4);
    this.b.add(paramg);
  }

  public synchronized void a(String paramString, boolean paramBoolean)
  {
    if (this.c == null)
      return;
    for (int i = 0; i < this.c.size(); i++)
    {
      n localn = (n)this.c.get(i);
      localn.a(paramString, paramBoolean);
    }
  }

  public synchronized void a(String paramString)
  {
    if (this.a == null)
      return;
    for (int i = 0; i < this.a.size(); i++)
    {
      e locale = (e)this.a.get(i);
      locale.a(paramString);
    }
  }

  public synchronized void b(String paramString)
  {
    if (this.a == null)
      return;
    for (int i = 0; i < this.a.size(); i++)
    {
      e locale = (e)this.a.get(i);
      locale.b(paramString);
    }
  }

  public synchronized void c(String paramString)
    throws b
  {
    if (this.b == null)
      return;
    for (int i = 0; i < this.b.size(); i++)
    {
      g localg = (g)this.b.get(i);
      localg.a(paramString);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.f
 * JD-Core Version:    0.6.0
 */