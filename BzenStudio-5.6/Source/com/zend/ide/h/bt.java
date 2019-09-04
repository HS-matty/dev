package com.zend.ide.h;

import com.zend.ide.util.w;
import java.io.File;

public class bt extends w
{
  final h c;

  protected bt(h paramh)
  {
  }

  public boolean b()
  {
    File[] arrayOfFile = this.c.h.b();
    for (int i = 0; (arrayOfFile != null) && (i < arrayOfFile.length); i++)
      if (!arrayOfFile[i].isFile())
        return false;
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bt
 * JD-Core Version:    0.6.0
 */