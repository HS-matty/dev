package com.zend.ide.d;

import com.zend.ide.n.bd;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComponent;
import javax.swing.JList;

class jd extends DefaultListCellRenderer
{
  final mb a;

  private jd(mb parammb)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    JComponent localJComponent = (JComponent)super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    jc localjc = (jc)paramObject;
    if (localjc != null)
    {
      bd localbd = localjc.a();
      if (localbd != null)
      {
        localJComponent.setForeground(localbd.b());
        if (localbd.d())
          localJComponent.setBackground(localbd.c());
        else
          localJComponent.setBackground(null);
        Font localFont = localJComponent.getFont();
        if (localFont.getStyle() != localbd.e())
          localJComponent.setFont(localFont.deriveFont(localbd.e()));
        if (paramBoolean1)
          localJComponent.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
      }
    }
    return localJComponent;
  }

  jd(mb parammb, hb paramhb)
  {
    this(parammb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.jd
 * JD-Core Version:    0.6.0
 */