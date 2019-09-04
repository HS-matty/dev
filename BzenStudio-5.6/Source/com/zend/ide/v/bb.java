package com.zend.ide.v;

import com.zend.ide.n.dz;
import com.zend.ide.util.cv;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

class bb extends DefaultListCellRenderer
{
  ImageIcon a = cv.b("explorer/phpfile.gif");
  final bd b;

  bb(bd parambd)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    JLabel localJLabel = (JLabel)super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    localJLabel.setIcon(this.a);
    setText(((dz)paramObject).k());
    return localJLabel;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.bb
 * JD-Core Version:    0.6.0
 */