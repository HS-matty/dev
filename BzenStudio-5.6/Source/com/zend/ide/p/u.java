package com.zend.ide.p;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;

public class u extends DefaultListCellRenderer
{
  final bc a;

  public u(bc parambc)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if ((paramObject instanceof k))
    {
      k localk = (k)paramObject;
      setText(localk.toString());
      Icon localIcon = localk.c();
      if (localIcon != null)
        setIcon(localIcon);
    }
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.u
 * JD-Core Version:    0.6.0
 */