package com.zend.ide.cb.a.b;

import com.zend.ide.cb.g;
import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;

class tb extends lb
{
  final bb c;

  public tb(bb parambb)
  {
    super(ct.a(1526), cv.b("null16.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    e locale = bb.a(this.c).i();
    if (locale == null)
      return;
    Object localObject = locale.getUserObject();
    if ((localObject instanceof g))
    {
      g localg = (g)localObject;
      if (!localg.c().a(false))
        return;
    }
    else
    {
      return;
    }
    if ((localObject instanceof v))
      bb.a(this.c).a((v)localObject, true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.tb
 * JD-Core Version:    0.6.0
 */