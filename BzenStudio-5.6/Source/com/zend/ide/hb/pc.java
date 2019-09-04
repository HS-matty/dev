package com.zend.ide.hb;

import com.zend.ide.b.d;
import com.zend.ide.f.bl;
import com.zend.ide.p.bc;
import javax.swing.JList;
import javax.swing.JTextField;

class pc
  implements Runnable
{
  final oc a;

  pc(oc paramoc)
  {
  }

  public void run()
  {
    wc.b(this.a.d).f();
    if (oc.a(this.a).length() == 0)
      return;
    d[] arrayOfd = bl.b(fc.a(this.a.d.h).length > 0 ? fc.a(this.a.d.h) : fc.b(this.a.d.h), oc.a(this.a));
    if (arrayOfd != null)
    {
      wc.b(this.a.d).d().setListData(arrayOfd);
      fc.a(this.a.d.h, arrayOfd);
    }
    wc.b(this.a.d).d().setSelectedIndex(0);
    wc.a(this.a.d).grabFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.pc
 * JD-Core Version:    0.6.0
 */