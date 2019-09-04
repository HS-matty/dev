package com.zend.ide.h;

import com.zend.ide.util.bn;
import com.zend.ide.util.bu;
import com.zend.ide.util.e.c;
import java.awt.Component;
import javax.swing.JComponent;

public class t extends bu
{
  private JComponent b;
  final bf k;

  public t(bf parambf, bn parambn)
  {
    super(parambf, parambn);
    this.b = parambn.c();
  }

  protected c b(Component paramComponent)
  {
    return new s(this);
  }

  static JComponent a(t paramt)
  {
    return paramt.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.t
 * JD-Core Version:    0.6.0
 */