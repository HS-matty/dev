package com.zend.ide.fb;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

class hb extends JPanel
  implements ListCellRenderer
{
  private JLabel a;
  final db b;

  public hb(db paramdb)
  {
    setBorder(null);
    this.a = new JLabel();
    this.a.setBorder(new EmptyBorder(1, 4, 1, 0));
    setLayout(new BorderLayout());
    add(this.a, "West");
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = paramObject.toString();
    this.a.setText(str);
    if (paramInt != -1)
    {
      this.a.setIcon((Icon)db.b(this.b).get(db.b(str)));
      if (paramBoolean1)
      {
        this.a.setForeground(paramJList.getSelectionForeground());
        setBackground(paramJList.getSelectionBackground());
      }
      else
      {
        this.a.setForeground(paramJList.getForeground());
        setBackground(paramJList.getBackground());
      }
    }
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.hb
 * JD-Core Version:    0.6.0
 */