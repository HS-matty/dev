package com.zend.ide.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class bp
{
  private static bp a;
  protected Collection b = new ArrayList(1);
  protected Collection c = new da(10);

  protected static bp b()
  {
    if (a == null)
      a = new bp();
    return a;
  }

  public static void a(bn parambn)
  {
    b().b(parambn);
  }

  public static void a(bq parambq)
  {
    b().b(parambq);
  }

  protected void b(bn parambn)
  {
    this.c.add(parambn);
    a(new br(parambn));
  }

  protected void b(bq parambq)
  {
    if (!this.b.contains(parambq))
    {
      this.b.add(parambq);
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        bn localbn = (bn)localIterator.next();
        parambq.a(new br(localbn));
      }
    }
  }

  protected void a(br parambr)
  {
    if (this.b != null)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        bq localbq = (bq)localIterator.next();
        localbq.a(parambr);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bp
 * JD-Core Version:    0.6.0
 */