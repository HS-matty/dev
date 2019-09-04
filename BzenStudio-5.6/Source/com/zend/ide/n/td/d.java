package com.zend.ide.n.td;

import com.zend.ide.f.bp;
import com.zend.ide.n.ho;
import java.util.ArrayList;
import java.util.List;

public abstract class d
  implements mb
{
  protected static l a = new l();
  protected bp b;
  protected jb c;
  protected ArrayList d;
  protected int e = 500;
  protected ho f;
  protected boolean g;
  protected boolean h;

  public d(jb paramjb, ho paramho)
  {
    this.f = paramho;
    this.b = bp.d();
    this.c = paramjb;
    this.d = new ArrayList();
    this.h = true;
  }

  public List a()
  {
    return this.d;
  }

  public void a()
  {
    this.d.clear();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.d
 * JD-Core Version:    0.6.0
 */