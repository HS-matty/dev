package com.zend.ide.s;

import com.zend.ide.b.d;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class l
  implements ListCellRenderer
{
  final cw a;

  private l(cw paramcw)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return cw.a(this.a).f().a(cw.a(this.a), (d)paramObject, paramJList, paramBoolean1, paramBoolean2, cw.c(this.a), paramInt);
  }

  l(cw paramcw, b paramb)
  {
    this(paramcw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.l
 * JD-Core Version:    0.6.0
 */