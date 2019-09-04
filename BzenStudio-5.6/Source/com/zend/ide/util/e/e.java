package com.zend.ide.util.e;

import com.zend.ide.util.a.b;
import java.awt.Point;

public class e
  implements d
{
  private d a;

  public e(d paramd)
  {
    this.a = paramd;
  }

  public boolean a(Object paramObject, Point paramPoint)
  {
    try
    {
      return this.a.a(paramObject, paramPoint);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.e.e
 * JD-Core Version:    0.6.0
 */