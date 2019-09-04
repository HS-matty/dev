package com.zend.ide.fb;

import com.zend.ide.bd.c;
import com.zend.ide.desktop.fb;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.f.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class e
  implements ActionListener
{
  final d a;

  e(d paramd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (a.a.b())
    {
      ba.a(fb.b().h(), ct.a(1544), ct.a(1545), -1, 1);
      return;
    }
    this.a.d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.e
 * JD-Core Version:    0.6.0
 */