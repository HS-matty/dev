package com.zend.ide.desktop;

import com.zend.ide.p.z;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class er extends JPanel
{
  final du a;

  private er(du paramdu)
  {
    b();
  }

  private void b()
  {
    setLayout(new BorderLayout());
    z localz = new z();
    setBackground(Color.white);
    localz.setIcon(new ImageIcon(cv.a("zendlogobottom.gif")));
    add(localz, "Center");
  }

  er(du paramdu, j paramj)
  {
    this(paramdu);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.er
 * JD-Core Version:    0.6.0
 */