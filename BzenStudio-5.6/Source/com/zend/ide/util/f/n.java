package com.zend.ide.util.f;

import com.zend.ide.util.ct;
import java.awt.Container;
import javax.swing.JFrame;

public class n extends com.zend.ide.i.n
{
  private p c;

  public n(JFrame paramJFrame)
  {
    super(paramJFrame, true);
    setTitle(ct.a(879));
    setResizable(false);
  }

  public void a(p paramp)
  {
    this.c = paramp;
    getContentPane().add(paramp);
    pack();
    B();
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
      this.c.requestFocus();
    super.setVisible(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.n
 * JD-Core Version:    0.6.0
 */