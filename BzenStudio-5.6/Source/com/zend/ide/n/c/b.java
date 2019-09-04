package com.zend.ide.n.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

class b
{
  private static Collection a = new Vector(3);

  public static a a(int paramInt1, int paramInt2)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.a(paramInt1, paramInt2))
        return locala;
    }
    return null;
  }

  static
  {
    a.add(new e());
    a.add(new d());
    a.add(new g());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.c.b
 * JD-Core Version:    0.6.0
 */