package com.zend.ide.cb.a;

import com.zend.ide.cb.f;
import com.zend.ide.cb.q;
import java.util.HashMap;
import javax.swing.JComboBox;

class ee
  implements Runnable
{
  final t a;

  ee(t paramt)
  {
  }

  public void run()
  {
    if (this.a.b() == null)
      return;
    t.b(this.a).setModel(t.d(this.a));
    if (!t.b(this.a).containsKey(this.a.b().a()))
      t.b(this.a).put(this.a.b().a(), this.a.c());
    else
      this.a.a(t.a(this.a, this.a.b().a()));
    if (this.a.b().k())
    {
      f localf = this.a.c();
      if (localf != null)
        this.a.a(localf.b());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ee
 * JD-Core Version:    0.6.0
 */