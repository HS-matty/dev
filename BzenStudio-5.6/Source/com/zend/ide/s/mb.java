package com.zend.ide.s;

import com.zend.ide.util.da;
import java.util.Collection;

public class mb
{
  private static mb a;
  private Collection b = new da(10);

  public static lb a(int paramInt)
  {
    return a().b(paramInt);
  }

  private static mb a()
  {
    if (a == null)
      a = new mb();
    return a;
  }

  private lb b(int paramInt)
  {
    lb locallb = new lb(paramInt);
    this.b.add(locallb);
    return locallb;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.mb
 * JD-Core Version:    0.6.0
 */