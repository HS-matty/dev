package com.zend.ide.n;

import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.p.d.bl;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;

class gu extends DefaultListCellRenderer
{
  private JLabel a = new JLabel();
  final gt b;

  public gu(gt paramgt)
  {
    this.a.setOpaque(true);
    this.a.setBorder(new EmptyBorder(3, 3, 3, 5));
    this.a.setBackground(Color.white);
    setBorder(BorderFactory.createLineBorder(Color.black));
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if (paramBoolean1)
    {
      this.a.setBackground(paramJList.getSelectionBackground());
      this.a.setForeground(paramJList.getSelectionForeground());
    }
    else
    {
      this.a.setBackground(paramJList.getBackground());
      this.a.setForeground(paramJList.getForeground());
    }
    File localFile = h.m.g((String)paramObject);
    if ((((localFile instanceof bd)) && (!((bd)localFile).b())) || (localFile.exists()))
    {
      this.a.setText(localFile.getName());
      this.a.setToolTipText(localFile.getAbsolutePath());
      if ((!(localFile instanceof bd)) || (((bd)localFile).b()))
        this.a.setIcon(bl.q.getSystemIcon(localFile));
    }
    else
    {
      this.a.setText((String)paramObject);
    }
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gu
 * JD-Core Version:    0.6.0
 */