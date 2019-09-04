package com.zend.ide.cb.a.b;

import com.zend.ide.cb.e;
import com.zend.ide.cb.q;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class i extends a
{
  private static final ImageIcon j = cv.b("sql/enabledServer16.gif");
  private static final ImageIcon k = cv.b("sql/secureServer16.gif");
  private static final ImageIcon l = cv.b("sql/disabledServer16.gif");
  private ImageIcon m;

  public i(q paramq)
  {
    super(paramq);
  }

  public Icon e()
  {
    if (this.m == null)
      c();
    return this.m;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    String str = paramObject.toString();
    if (str.equalsIgnoreCase(q.d))
      return new m(str);
    return new u(str);
  }

  public Object d()
  {
    q localq = (q)getUserObject();
    if (!localq.a(false))
      return new Object[0];
    return super.d();
  }

  protected boolean c()
  {
    q localq = (q)getUserObject();
    int i = 0;
    if (localq.a(false))
    {
      e locale = localq.l();
      if (locale.g())
      {
        i = this.m != k ? 1 : 0;
        this.m = k;
      }
      else
      {
        i = this.m != j ? 1 : 0;
        this.m = j;
      }
    }
    else
    {
      i = this.m != l ? 1 : 0;
      this.m = l;
    }
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.i
 * JD-Core Version:    0.6.0
 */