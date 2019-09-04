package com.zend.ide.n.td.a;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Segment;

public class o
{
  private static o a = new o();
  private List b = new ArrayList(11);

  public static o a()
  {
    return a;
  }

  public static Segment b()
  {
    return a().c();
  }

  public static void a(Segment paramSegment)
  {
    a().b(paramSegment);
  }

  public Segment c()
  {
    synchronized (this)
    {
      int i = this.b.size();
      if (i > 0)
        return (Segment)this.b.remove(i - 1);
    }
    return new r(null);
  }

  public void b(Segment paramSegment)
  {
    if ((paramSegment instanceof r))
      synchronized (this)
      {
        paramSegment.array = null;
        paramSegment.count = 0;
        this.b.add(paramSegment);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.o
 * JD-Core Version:    0.6.0
 */