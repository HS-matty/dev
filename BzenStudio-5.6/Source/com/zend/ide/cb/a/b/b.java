package com.zend.ide.cb.a.b;

import com.zend.ide.cb.f;
import com.zend.ide.cb.q;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class b extends cc
{
  private static final ImageIcon j = cv.b("sql/database.gif");

  public b(f paramf)
  {
    super(paramf);
  }

  public Icon e()
  {
    return j;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    f localf = (f)getUserObject();
    if (localf.c().k())
      return new s((String)paramObject);
    String str = paramObject.toString();
    if (str.equalsIgnoreCase(f.e))
      return new r(str);
    return new t(str);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.b
 * JD-Core Version:    0.6.0
 */