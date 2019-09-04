package com.zend.ide.cb.a.b;

import com.zend.ide.bd.c;
import com.zend.ide.cb.a.dd;
import com.zend.ide.cb.q;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;

class ob extends lb
{
  private q c;
  final bb d;

  public ob(bb parambb)
  {
    super(ct.a(1530), cv.b("sql/serverProperties16.gif"));
  }

  public void a(q paramq)
  {
    this.c = paramq;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.c == null)
      return;
    dd localdd = new dd(c.b().h(), this.c.a() + ' ' + ct.a(1530), bb.d(this.d));
    localdd.a(this.c);
    localdd.setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.ob
 * JD-Core Version:    0.6.0
 */