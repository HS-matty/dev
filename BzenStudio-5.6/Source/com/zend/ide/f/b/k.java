package com.zend.ide.f.b;

import com.zend.ide.b.d;
import com.zend.ide.b.m;
import com.zend.ide.f.di;
import com.zend.ide.f.s;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.util.HashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

class k extends e
{
  public static final String k = ct.a(1016);
  private static final ImageIcon l = cv.b("classbrowser/phpclassdata.gif");

  public k()
  {
    super(k, true);
  }

  public String toString()
  {
    return k;
  }

  private c h()
  {
    return (c)getParent();
  }

  public Object d()
  {
    s locals = h().k;
    v localv = (v)h().getUserObject();
    w[] arrayOfw = localv.d();
    if ((arrayOfw == null) || (arrayOfw.length == 0))
      return null;
    String str1 = null;
    if (localv.e())
      str1 = localv.f().c();
    d[] arrayOfd = new d[arrayOfw.length];
    for (int i = 0; i < arrayOfw.length; i++)
    {
      String str2 = arrayOfw[i].a();
      arrayOfd[i] = locals.a(str1, str2, false);
      if (arrayOfd[i] != null)
        continue;
      arrayOfd[i] = di.a(str2, 0, null, null, null, null, di.g, di.j, di.c);
    }
    return arrayOfd;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return a.a((d)paramObject, h().k);
  }

  public Object a(HashSet paramHashSet)
  {
    return b.a(this, paramHashSet);
  }

  public Icon e()
  {
    return l;
  }

  public String f()
  {
    return "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.k
 * JD-Core Version:    0.6.0
 */