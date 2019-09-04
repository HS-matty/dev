package com.zend.ide.d;

import com.zend.ide.util.ct;
import com.zend.ide.y.g;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

class bh extends DefaultListCellRenderer
{
  private bh()
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    String str = paramObject.toString();
    if (str.equals(g.e()))
      str = str + ct.b(652);
    setText(str);
    return this;
  }

  bh(f paramf)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bh
 * JD-Core Version:    0.6.0
 */