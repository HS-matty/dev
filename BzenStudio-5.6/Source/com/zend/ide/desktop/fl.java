package com.zend.ide.desktop;

import com.zend.ide.db.z;
import com.zend.ide.k.e;
import com.zend.ide.k.f;
import com.zend.ide.util.w;
import com.zend.ide.w.bb;

class fl extends w
{
  final fc c;

  fl(fc paramfc)
  {
  }

  public boolean b()
  {
    e locale = this.c.g.b();
    return (locale != null) && (locale.x().o() > 0) && (!(locale instanceof z)) && (!(locale instanceof bb));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.fl
 * JD-Core Version:    0.6.0
 */