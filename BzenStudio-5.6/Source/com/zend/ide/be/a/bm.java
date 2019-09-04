package com.zend.ide.be.a;

import com.zend.ide.be.i;
import javax.swing.Icon;
import javax.swing.JComponent;

public class bm extends bl
{
  private JComponent j;

  public bm(String paramString1, Icon paramIcon, String paramString2, boolean paramBoolean, i parami, JComponent paramJComponent)
  {
    super(paramString1, paramIcon, paramString2, paramBoolean, parami);
    this.j = paramJComponent;
    add(paramJComponent);
  }

  protected JComponent j()
  {
    return this.j;
  }

  protected void i()
  {
    j().grabFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bm
 * JD-Core Version:    0.6.0
 */