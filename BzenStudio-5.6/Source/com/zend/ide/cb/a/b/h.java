package com.zend.ide.cb.a.b;

import com.zend.ide.cb.p;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class h extends cc
{
  private static final ImageIcon j = cv.b("sql/database.gif");

  public h(p paramp)
  {
    super(paramp);
  }

  public Icon e()
  {
    return j;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    String str = paramObject.toString();
    if (str.equalsIgnoreCase(p.a))
      return new r(str);
    return new t(str);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.h
 * JD-Core Version:    0.6.0
 */