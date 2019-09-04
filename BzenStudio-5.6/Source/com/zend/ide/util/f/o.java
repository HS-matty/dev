package com.zend.ide.util.f;

import com.zend.ide.p.y;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

class o extends y
{
  private p b;

  public o()
  {
    setIconImage(cv.b("application32.gif").getImage());
    setTitle(ct.a(879));
  }

  public void a(p paramp)
  {
    this.b = paramp;
    getContentPane().add(paramp);
    pack();
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension localDimension2 = getSize();
    setLocation(localDimension1.width / 2 - localDimension2.width / 2, localDimension1.height / 2 - localDimension2.height / 2);
    setResizable(false);
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
      this.b.requestFocus();
    super.setVisible(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.o
 * JD-Core Version:    0.6.0
 */