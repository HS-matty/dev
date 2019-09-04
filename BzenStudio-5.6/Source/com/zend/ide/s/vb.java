package com.zend.ide.s;

import com.zend.ide.util.da;
import java.util.Collection;

public class vb
{
  private static vb a;
  private Collection b = new da(10);

  public static tb a(int paramInt)
  {
    return a().b(paramInt);
  }

  private static vb a()
  {
    if (a == null)
      a = new vb();
    return a;
  }

  private tb b(int paramInt)
  {
    tb localtb = new tb(paramInt);
    this.b.add(localtb);
    return localtb;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.vb
 * JD-Core Version:    0.6.0
 */