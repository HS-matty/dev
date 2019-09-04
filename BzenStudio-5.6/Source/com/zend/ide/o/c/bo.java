package com.zend.ide.o.c;

import com.zend.ide.o.ab;
import com.zend.ide.o.fk;
import com.zend.ide.p.f.d;

public abstract class bo extends d
{
  protected fk j;
  protected ab m;
  private b k;

  protected bo(fk paramfk)
  {
    super(paramfk);
    this.m = paramfk.a();
    this.k = new b(this);
    paramfk.a(this.k);
    a(500);
    a(false);
    setRootVisible(false);
    setShowsRootHandles(true);
    setCellRenderer(new bb(this));
  }

  protected void a(Object paramObject)
  {
    this.j = ((fk)paramObject);
    super.a(paramObject);
  }

  protected com.zend.ide.util.bb d()
  {
    return new v(this);
  }

  protected boolean j()
  {
    return (this.j != null) && (this.j.d());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bo
 * JD-Core Version:    0.6.0
 */