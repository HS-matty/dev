package com.zend.ide.cb.a.b;

import com.zend.ide.cb.a.kb;
import com.zend.ide.cb.c.w;
import com.zend.ide.desktop.cj;
import com.zend.ide.util.bn;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;

class zb extends lb
{
  final bb c;

  public zb(bb parambb)
  {
    super(ct.b(1350), cv.b("sql/preferences.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bn localbn = bb.b(this.c).a().d();
    if ((localbn instanceof cj))
      ((cj)localbn).a(11);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.zb
 * JD-Core Version:    0.6.0
 */