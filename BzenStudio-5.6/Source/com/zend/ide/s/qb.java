package com.zend.ide.s;

import com.zend.ide.util.da;
import java.util.Collection;

public class qb
{
  private static qb a;
  private Collection b = new da(10);

  public static ob a(int paramInt)
  {
    return a().b(paramInt);
  }

  private static qb a()
  {
    if (a == null)
      a = new qb();
    return a;
  }

  private ob b(int paramInt)
  {
    ob localob = new ob(paramInt);
    this.b.add(localob);
    return localob;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.qb
 * JD-Core Version:    0.6.0
 */