package com.zend.ide.h;

import com.zend.ide.util.dj;
import com.zend.ide.util.e.d;
import java.awt.Point;
import java.io.File;
import java.util.List;
import javax.swing.SwingUtilities;

class b
  implements d
{
  private int a;
  final s b;

  public b(s params, int paramInt)
  {
    this.a = paramInt;
  }

  public boolean a(Object paramObject, Point paramPoint)
  {
    try
    {
      bg localbg = (bg)this.b.h.k.b(paramPoint.x, paramPoint.y);
      File localFile = bf.a(this.b.h.k, localbg);
      if (localFile == null)
        return false;
      boolean bool = false;
      try
      {
        this.b.h.k.a(true);
        bool = com.zend.ide.j.t.a(localFile, (List)paramObject, this.a, t.a(this.b.h));
      }
      finally
      {
        this.b.h.k.a(false);
      }
      return bool;
    }
    catch (dj localdj)
    {
      this.b.h.k.a(false);
      SwingUtilities.invokeLater(new cb(this, localdj));
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.b
 * JD-Core Version:    0.6.0
 */