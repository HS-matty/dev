package com.zend.ide.f.b;

import com.zend.ide.b.d;
import com.zend.ide.f.dd;
import com.zend.ide.m.ab;
import com.zend.ide.m.t;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.util.HashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class s extends e
{
  public static final String h = ct.a(1791);
  private static final ImageIcon i = cv.b("classbrowser/phpclassdata.gif");

  public s()
  {
    super(h, true);
  }

  public String toString()
  {
    return h;
  }

  private r a()
  {
    return (r)getParent();
  }

  public Object d()
  {
    t localt = (t)a().getUserObject();
    ab[] arrayOfab = localt.d();
    dd.a(arrayOfab);
    return arrayOfab;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return a.a((d)paramObject, a().k);
  }

  public Object a(HashSet paramHashSet)
  {
    return b.a(this, paramHashSet);
  }

  public Icon e()
  {
    return i;
  }

  public String f()
  {
    return "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.s
 * JD-Core Version:    0.6.0
 */