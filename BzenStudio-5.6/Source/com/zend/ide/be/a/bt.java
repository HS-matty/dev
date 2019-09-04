package com.zend.ide.be.a;

import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class bt extends JWindow
{
  private Border b = UIManager.getBorder("InternalFrame.border");
  private bh c = new bh(this, null);

  public bt(JFrame paramJFrame)
  {
    super(paramJFrame);
    addMouseListener(this.c);
    addMouseMotionListener(this.c);
    ((JComponent)getContentPane()).setBorder(this.b);
  }

  public Insets getInsets()
  {
    return new Insets(2, 2, 2, 2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bt
 * JD-Core Version:    0.6.0
 */