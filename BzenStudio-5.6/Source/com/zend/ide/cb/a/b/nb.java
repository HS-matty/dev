package com.zend.ide.cb.a.b;

import com.zend.ide.cb.q;
import com.zend.ide.cb.s;
import com.zend.ide.cb.y;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

class nb extends lb
  implements s
{
  private ImageIcon c = cv.b("sql/connect_16.gif");
  private ImageIcon d = cv.b("sql/disconnect_16.gif");
  final bb e;

  public nb(bb parambb)
  {
  }

  public void a(q paramq, boolean paramBoolean)
  {
    super.a(paramq, paramBoolean);
    b(paramBoolean);
    a(paramBoolean);
  }

  private void a(boolean paramBoolean)
  {
    if (this.b == paramBoolean)
      return;
    this.b = paramBoolean;
    b(this.b);
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      putValue("Name", ct.a(186));
      putValue("SmallIcon", this.d);
    }
    else
    {
      putValue("Name", ct.a(187));
      putValue("SmallIcon", this.c);
    }
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.b)
      this.a.b();
    else
      bb.a(this.e).a(this.a, true);
  }

  public void a(y paramy)
  {
    a(true);
  }

  public void b(y paramy)
  {
    a(false);
  }

  public void c(y paramy)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.nb
 * JD-Core Version:    0.6.0
 */