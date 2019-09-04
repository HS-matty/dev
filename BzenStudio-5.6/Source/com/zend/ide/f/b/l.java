package com.zend.ide.f.b;

import com.zend.ide.b.d;
import com.zend.ide.f.dd;
import com.zend.ide.m.bf;
import com.zend.ide.m.r;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.util.HashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class l extends e
{
  public static final String k = ct.a(534);
  public static final String l = k;
  private static final ImageIcon m = cv.b("explorer/phpfile.gif");

  public l()
  {
    super(k, true);
  }

  public String toString()
  {
    return k;
  }

  private g h()
  {
    return (g)getParent();
  }

  public Object d()
  {
    bf localbf = (bf)h().getUserObject();
    r[] arrayOfr = localbf.h();
    dd.a(arrayOfr);
    return arrayOfr;
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
    return m;
  }

  public String f()
  {
    return l;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.l
 * JD-Core Version:    0.6.0
 */