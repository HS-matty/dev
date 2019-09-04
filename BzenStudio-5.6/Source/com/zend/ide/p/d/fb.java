package com.zend.ide.p.d;

import com.zend.ide.r.s;
import java.io.File;

class fb extends s
{
  final bc a;

  fb(bc parambc)
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
    return bc.a(this.a);
  }

  public String toString()
  {
    return bc.a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.fb
 * JD-Core Version:    0.6.0
 */