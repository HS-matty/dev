package com.zend.ide.h;

import java.io.File;
import java.util.Vector;

public class g
{
  protected Vector a = new Vector(2);

  public void a(f paramf)
  {
    if (!this.a.contains(paramf))
      this.a.add(paramf);
  }

  public void b(f paramf)
  {
    this.a.remove(paramf);
  }

  public void b(File paramFile)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      f localf = (f)this.a.get(j);
      localf.a(paramFile);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.g
 * JD-Core Version:    0.6.0
 */