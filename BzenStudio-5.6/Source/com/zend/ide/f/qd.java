package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.bh;
import com.zend.ide.m.z;

abstract class qd
  implements rb
{
  private qd()
  {
  }

  public boolean a(d paramd)
  {
    if ((paramd instanceof z))
      return a(((z)paramd).d());
    if ((paramd instanceof bh))
      return a(((bh)paramd).a());
    return true;
  }

  public abstract boolean a(int paramInt);

  qd(rd paramrd)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.qd
 * JD-Core Version:    0.6.0
 */