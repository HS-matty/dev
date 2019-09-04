package com.zend.ide.cb.a.b;

import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;

class pb extends lb
{
  final bb c;

  public pb(bb parambb)
  {
    super(ct.a(354), cv.b("sql/refresh.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    e locale = bb.a(this.c).i();
    if (locale == null)
      return;
    bb.c(this.c).a(locale, e.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.pb
 * JD-Core Version:    0.6.0
 */