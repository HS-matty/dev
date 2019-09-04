package com.zend.ide.h;

import com.zend.ide.j.u;
import com.zend.ide.util.ct;
import java.util.Arrays;

public class bj extends bg
{
  bo m = new bo();
  final be l;

  public bj(be parambe, Object paramObject)
  {
    super(parambe, paramObject, true);
    parambe.a(paramObject, this);
  }

  public Object b()
  {
    Object localObject = ((u)getUserObject()).b();
    localObject = this.l.a(localObject);
    this.m.a(this.l.w);
    Arrays.sort(localObject, this.m);
    return localObject;
  }

  protected String h()
  {
    return ct.a(176);
  }

  public boolean isLeaf()
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bj
 * JD-Core Version:    0.6.0
 */