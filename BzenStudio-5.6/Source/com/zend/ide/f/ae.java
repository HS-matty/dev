package com.zend.ide.f;

import com.zend.ide.f.b.b;
import com.zend.ide.m.ba;
import com.zend.ide.m.bh;
import com.zend.ide.util.w;

class ae extends w
{
  final l c;

  public ae(l paraml)
  {
  }

  public boolean b()
  {
    Object localObject = this.c.g.getLastSelectedPathComponent();
    if ((localObject instanceof b))
    {
      ba localba = (ba)((b)localObject).getUserObject();
      if ((localba instanceof bh))
      {
        bh localbh = (bh)localba;
        if ((localbh.l() != null) && (!localbh.l().e()))
          return false;
      }
      return localba.e();
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ae
 * JD-Core Version:    0.6.0
 */