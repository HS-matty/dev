package com.zend.ide.l;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

class qb extends DefaultListCellRenderer
{
  final tb a;

  qb(tb paramtb)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    JLabel localJLabel = (JLabel)super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if (paramObject != null)
    {
      String str1 = paramObject.toString();
      localJLabel.setToolTipText(str1);
      String str2 = str1.toLowerCase();
      if ((str2.endsWith(".jar")) || (str2.endsWith(".zip")))
        localJLabel.setIcon(sb.i());
      else
        localJLabel.setIcon(sb.j());
    }
    localJLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
    return localJLabel;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.qb
 * JD-Core Version:    0.6.0
 */