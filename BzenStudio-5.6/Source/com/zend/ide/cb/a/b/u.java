package com.zend.ide.cb.a.b;

import com.zend.ide.cb.q;
import com.zend.ide.cb.w;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class u extends l
{
  private static final ImageIcon k = cv.b("sql/users.gif");

  public u(Object paramObject)
  {
    super(paramObject);
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new k((w)paramObject);
  }

  public Icon e()
  {
    return k;
  }

  public Object d()
  {
    q localq = (q)a();
    return localq != null ? localq.j() : null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.u
 * JD-Core Version:    0.6.0
 */