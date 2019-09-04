package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import com.zend.ide.gb.g;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class d
  implements ActionListener
{
  final mb a;

  d(mb parammb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if ((mb.b(this.a) == 1) && (!mb.a(this.a)[mb.b(this.a)].b(true)))
      return;
    if (mb.b(this.a) < 2)
      mb.d(this.a).a(mb.c(this.a), null, null, false);
    mb.e(this.a);
    mb.f(this.a);
    if (mb.g(this.a).e())
      mb.d(this.a).a(mb.c(this.a).c(), 0);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.d
 * JD-Core Version:    0.6.0
 */