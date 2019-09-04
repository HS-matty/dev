package com.zend.ide.h;

import com.zend.ide.p.cd;
import com.zend.ide.util.bn;
import javax.swing.JComponent;

public class bs extends r
{
  private cd d;

  public bs(e parame, boolean paramBoolean)
  {
    super(parame);
    b(parame);
  }

  private void b(bn parambn)
  {
    this.d = new cd(parambn.c());
  }

  public JComponent c()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bs
 * JD-Core Version:    0.6.0
 */