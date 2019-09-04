package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import com.zend.ide.util.cv;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.UIManager;

class hb extends DefaultListCellRenderer
{
  final pb a;

  private hb(pb parampb)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setComponentOrientation(paramJList.getComponentOrientation());
    if (paramBoolean1)
    {
      setBackground(paramJList.getSelectionBackground());
      setForeground(paramJList.getSelectionForeground());
    }
    else
    {
      setBackground(paramJList.getBackground());
      setForeground(paramJList.getForeground());
    }
    if ((paramObject instanceof Icon))
    {
      setIcon((Icon)paramObject);
      setText("");
    }
    else
    {
      ImageIcon localImageIcon = pb.a(this.a, (b)paramObject) ? cv.b("wsdlCreator/wdsl_config.gif") : cv.b("wsdlCreator/wdsl_config_X.gif");
      setIcon(localImageIcon);
      setText(paramObject.toString());
    }
    setEnabled(paramJList.isEnabled());
    setFont(paramJList.getFont());
    setBorder(paramBoolean2 ? UIManager.getBorder("List.focusCellHighlightBorder") : noFocusBorder);
    return this;
  }

  hb(pb parampb, f paramf)
  {
    this(parampb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.hb
 * JD-Core Version:    0.6.0
 */