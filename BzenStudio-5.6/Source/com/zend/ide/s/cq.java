package com.zend.ide.s;

import com.zend.ide.b.d;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class cq
  implements ListCellRenderer
{
  final dj a;

  private cq(dj paramdj)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return dj.a(this.a).f().a(dj.a(this.a), (d)paramObject, paramJList, paramBoolean1, paramBoolean2, dj.b(this.a), paramInt);
  }

  cq(dj paramdj, cp paramcp)
  {
    this(paramdj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.cq
 * JD-Core Version:    0.6.0
 */