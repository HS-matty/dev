package com.zend.ide.r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class c extends b
{
  private ArrayList f = new ArrayList(3);

  public void a(o paramo)
  {
    this.f.add(paramo);
  }

  public void b(o paramo)
  {
    this.f.remove(paramo);
  }

  public boolean a(String paramString)
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      String str = ((o)localIterator.next()).b();
      d locald = p.e().c(str);
      if ((locald != null) && (locald.a(paramString)))
        return true;
    }
    return false;
  }

  public Collection e()
  {
    return this.f;
  }

  public boolean c(o paramo)
  {
    return this.f.contains(paramo);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.c
 * JD-Core Version:    0.6.0
 */