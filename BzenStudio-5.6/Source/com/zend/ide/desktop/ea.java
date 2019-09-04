package com.zend.ide.desktop;

import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JRootPane;
import javax.swing.JWindow;
import javax.swing.border.LineBorder;

public class ea extends JWindow
{
  private dy a;

  public ea()
  {
    c();
  }

  private void c()
  {
    getRootPane().setBorder(new LineBorder(Color.black, 1));
    getContentPane().setBackground(Color.white);
    this.a = new dy(cv.a("studio_splash_screen.gif"));
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.a, "Center");
    this.a.a("Loading...");
    pack();
    Dimension localDimension = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle localRectangle = getBounds();
    setLocation((localDimension.width - localRectangle.width) / 2, (localDimension.height - localRectangle.height) / 2);
    setVisible(true);
  }

  public void a(String paramString)
  {
    this.a.a(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ea
 * JD-Core Version:    0.6.0
 */