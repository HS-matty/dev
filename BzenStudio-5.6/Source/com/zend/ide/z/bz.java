package com.zend.ide.z;

import com.zend.ide.p.be;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JTree;

class bz extends be
{
  final bp a;

  private bz(bp parambp)
  {
    a(cv.b("parent_open.gif"));
    b(cv.b("parent_closed.gif"));
    c(cv.b("son.gif"));
  }

  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    setIcon(a(paramBoolean2, paramBoolean3));
    Color localColor = paramBoolean1 ? Color.white : Color.blue;
    o();
    if ((paramObject instanceof by))
    {
      by localby = (by)paramObject;
      double d = localby.f();
      r localr = localby.c();
      if (localr != null)
      {
        String str1 = localby.d();
        String str2 = bp.a(this.a) ? ct.a(1046, localr.b()) : "";
        String str3 = bp.c(this.a) ? ct.a(1048, str1) : "";
        a(d + "% ", null, null);
        a(localr.k() + "()", null, localColor);
        a(str2 + str3, null, null);
        setToolTipText(ct.a(897, "" + d, localr.k(), localr.h(), str1));
      }
      else
      {
        a(ct.a(898), null, null);
      }
    }
    else
    {
      a(ct.a(899), null, null);
      setToolTipText(ct.a(899));
    }
    return this;
  }

  public Icon a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
      return h();
    if (paramBoolean1)
      return f();
    return g();
  }

  bz(bp parambp, a parama)
  {
    this(parambp);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bz
 * JD-Core Version:    0.6.0
 */