package com.zend.ide.util;

import java.util.Collection;
import java.util.Iterator;
import javax.swing.JComponent;

public class bs
{
  private String a;
  protected bn c;
  private Collection d = new da(1);

  public bs(bn parambn)
  {
    this.c = parambn;
  }

  public void i()
  {
  }

  public boolean d(boolean paramBoolean)
  {
    e();
    return true;
  }

  public JComponent c()
  {
    return this.c.c();
  }

  public void d(String paramString)
  {
    this.a = paramString;
  }

  public String r()
  {
    return this.a;
  }

  public void a(bo parambo)
  {
    if (!this.d.contains(parambo))
      this.d.add(parambo);
  }

  public void b(bo parambo)
  {
    this.d.remove(parambo);
  }

  protected final void b()
  {
    dl localdl = new dl(dl.b, this.c);
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      bo localbo = (bo)localIterator.next();
      localbo.a(localdl);
    }
  }

  protected final void d()
  {
    dl localdl = new dl(dl.a, this.c);
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      bo localbo = (bo)localIterator.next();
      localbo.b(localdl);
    }
  }

  protected final void a(String paramString)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      bo localbo = (bo)localIterator.next();
      localbo.a(this.c, paramString);
    }
  }

  protected final void e()
  {
    dl localdl = new dl(dl.c, this.c);
    Object[] arrayOfObject = this.d.toArray();
    for (int i = 0; i < arrayOfObject.length; i++)
    {
      bo localbo = (bo)arrayOfObject[i];
      localbo.c(localdl);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bs
 * JD-Core Version:    0.6.0
 */