package com.zend.ide.r;

import com.zend.ide.p.d.bl;
import java.io.File;

class bu extends s
{
  final b a;

  bu(b paramb)
  {
  }

  public boolean accept(File paramFile)
  {
    if (bl.q.isTraversable(paramFile).booleanValue())
      return true;
    return this.a.a(paramFile);
  }

  public String getDescription()
  {
    return this.a.b();
  }

  public String toString()
  {
    return this.a.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.bu
 * JD-Core Version:    0.6.0
 */