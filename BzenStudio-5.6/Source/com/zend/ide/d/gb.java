package com.zend.ide.d;

import com.zend.ide.p.ba;
import com.zend.ide.p.bb;
import com.zend.ide.util.ct;
import com.zend.ide.util.f.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gb
  implements ActionListener
{
  final ca a;

  private gb(ca paramca)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (a.a.b())
    {
      ba.a(this.a, ct.a(1544), ct.a(1545), -1, 1);
      ca.b(this.a).setSelected(true);
      return;
    }
    ca.a(this.a);
  }

  gb(ca paramca, bv parambv)
  {
    this(paramca);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.gb
 * JD-Core Version:    0.6.0
 */