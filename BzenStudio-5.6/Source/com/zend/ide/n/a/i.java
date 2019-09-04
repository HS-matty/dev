package com.zend.ide.n.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class i
  implements f
{
  private Collection a = new ArrayList(3);

  public void a(e parame)
  {
    parame.a(this);
  }

  public void b(e parame)
  {
    parame.b(this);
  }

  public void a(e parame, String paramString, Object paramObject1, Object paramObject2)
  {
    b(parame, paramString, paramObject1, paramObject2);
  }

  public void a(h paramh)
  {
    if (!this.a.contains(paramh))
      this.a.add(paramh);
  }

  public void b(h paramh)
  {
    if (this.a != null)
      this.a.remove(paramh);
  }

  public void c(e parame)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      localh.a(parame);
    }
  }

  public void b(e parame, String paramString, Object paramObject1, Object paramObject2)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      localh.a(parame, paramString, paramObject1, paramObject2);
    }
  }

  public void d(e parame)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      localh.b(parame);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.i
 * JD-Core Version:    0.6.0
 */