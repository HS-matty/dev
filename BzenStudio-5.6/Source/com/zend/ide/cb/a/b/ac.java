package com.zend.ide.cb.a.b;

import com.zend.ide.cb.f;
import com.zend.ide.cb.g;
import com.zend.ide.cb.h;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;

class ac extends lb
{
  final bb c;

  public ac(bb parambb, KeyStroke paramKeyStroke)
  {
    super(ct.a(1553), cv.b("sql/metadata.gif"));
    putValue("AcceleratorKey", paramKeyStroke);
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
    if ((localObject instanceof q))
      bb.a(this.c).b((q)localObject);
    else if ((localObject instanceof f))
      bb.a(this.c).a((f)localObject);
    else if ((localObject instanceof p))
      bb.a(this.c).a((p)localObject);
    else if ((localObject instanceof v))
      bb.a(this.c).a((v)localObject);
    else if ((localObject instanceof h))
      bb.a(this.c).a((h)localObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.ac
 * JD-Core Version:    0.6.0
 */