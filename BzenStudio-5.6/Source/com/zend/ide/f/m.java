package com.zend.ide.f;

import com.zend.ide.f.b.b;
import com.zend.ide.m.ba;
import com.zend.ide.m.bf;
import com.zend.ide.m.d;
import com.zend.ide.util.w;

class m extends w
{
  final l c;

  public m(l paraml)
  {
  }

  public boolean b()
  {
    Object localObject = this.c.g.getLastSelectedPathComponent();
    if ((localObject instanceof b))
    {
      ba localba = (ba)((b)localObject).getUserObject();
      if (!localba.e())
        return false;
      if (localba.a() == null)
      {
        int i = 1;
        if ((localba instanceof bf))
        {
          d[] arrayOfd = ((bf)localba).a();
          i = arrayOfd.length > 0 ? 1 : 0;
        }
        return i;
      }
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.m
 * JD-Core Version:    0.6.0
 */