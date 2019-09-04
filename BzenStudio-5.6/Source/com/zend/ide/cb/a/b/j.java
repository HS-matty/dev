package com.zend.ide.cb.a.b;

import com.zend.ide.cb.v;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class j extends cc
{
  private static final ImageIcon j = cv.b("sql/table.gif");

  public j(v paramv)
  {
    super(paramv);
  }

  public Icon e()
  {
    return j;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    String str = paramObject.toString();
    if (str.equalsIgnoreCase(v.a))
      return new n(str);
    return new p(str);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.j
 * JD-Core Version:    0.6.0
 */