package com.zend.ide.cb;

import com.zend.ide.util.cl;
import java.util.Vector;

public class u
{
  private Vector a = new Vector(10);
  private Vector b = new Vector(3);

  public void a(q paramq)
  {
    if (paramq != null)
    {
      this.a.add(paramq);
      a(0, paramq);
    }
  }

  public void b(q paramq)
  {
    if (this.a.remove(paramq))
      a(1, paramq);
  }

  public void a()
  {
    try
    {
      for (int i = this.a.size() - 1; i >= 0; i--)
        b((q)this.a.get(i));
    }
    catch (Throwable localThrowable)
    {
      cl.a(localThrowable);
      this.a.clear();
    }
  }

  public q[] a()
  {
    q[] arrayOfq = new q[this.a.size()];
    this.a.toArray(arrayOfq);
    return arrayOfq;
  }

  public int b()
  {
    return this.a.size();
  }

  public boolean a(String paramString)
  {
    q[] arrayOfq = a();
    for (int i = 0; i < arrayOfq.length; i++)
      if (arrayOfq[i].a().equalsIgnoreCase(paramString))
        return true;
    return false;
  }

  public void c()
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      q localq = (q)this.a.get(i);
      localq.b();
    }
  }

  private void a(int paramInt, q paramq)
  {
    k[] arrayOfk = new k[this.b.size()];
    this.b.toArray(arrayOfk);
    x localx = new x(this, paramq, paramInt);
    for (int i = 0; i < arrayOfk.length; i++)
      arrayOfk[i].a(localx);
  }

  public void a(k paramk)
  {
    this.b.add(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.u
 * JD-Core Version:    0.6.0
 */