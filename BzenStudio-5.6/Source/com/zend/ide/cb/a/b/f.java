package com.zend.ide.cb.a.b;

import com.zend.ide.cb.l;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class f extends a
{
  private static final ImageIcon j = cv.b("sql/procedure.gif");

  public f(l paraml)
  {
    super(paraml, true);
  }

  public Icon e()
  {
    return j;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new q((String)paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.f
 * JD-Core Version:    0.6.0
 */