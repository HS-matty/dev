package com.zend.ide.n.b;

import java.util.ArrayList;
import java.util.Iterator;

public class b
  implements a
{
  protected g a;
  protected ArrayList b;

  public b(g paramg)
  {
    this.a = paramg;
  }

  public void a(g paramg)
  {
    paramg.a(this);
  }

  public void a(boolean paramBoolean)
  {
    c(paramBoolean);
  }

  public void b(boolean paramBoolean)
  {
    d(paramBoolean);
  }

  public void c(boolean paramBoolean)
  {
    if (this.b == null)
      return;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).a(paramBoolean);
  }

  public void d(boolean paramBoolean)
  {
    if (this.b == null)
      return;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).b(paramBoolean);
  }

  public void a(a parama)
  {
    if (this.b == null)
      this.b = new ArrayList(2);
    this.b.add(parama);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.b.b
 * JD-Core Version:    0.6.0
 */