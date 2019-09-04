package com.zend.ide.cb.a.b;

import com.zend.ide.cb.i;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class e extends a
{
  private static final ImageIcon j = cv.b("sql/index.gif");

  public e(i parami)
  {
    super(parami, true);
  }

  public Icon e()
  {
    return j;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new o((String)paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.e
 * JD-Core Version:    0.6.0
 */