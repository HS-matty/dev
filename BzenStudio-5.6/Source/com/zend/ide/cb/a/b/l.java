package com.zend.ide.cb.a.b;

import com.zend.ide.cb.g;
import com.zend.ide.cb.q;
import com.zend.ide.p.f.e;
import com.zend.ide.util.cv;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

class l extends e
{
  protected static final ImageIcon i = cv.b("sql/folderClose.gif");
  protected static final ImageIcon j = cv.b("sql/folderOpen.gif");

  public l(Object paramObject)
  {
    super(paramObject);
    a(e.b);
  }

  public String f()
  {
    return "sqlTree";
  }

  public Icon e()
  {
    return j;
  }

  protected g a()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)getParent();
    if (localDefaultMutableTreeNode == null)
      return null;
    return (g)localDefaultMutableTreeNode.getUserObject();
  }

  protected boolean c()
  {
    g localg = a();
    if (localg == null)
      return false;
    try
    {
      localg.d();
    }
    catch (SQLException localSQLException)
    {
      q localq = localg.c();
      localq.a(true, true);
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.l
 * JD-Core Version:    0.6.0
 */