package com.zend.ide.hb;

import com.zend.ide.p.db;
import java.awt.event.ActionEvent;
import javax.swing.text.TextAction;

class ac extends TextAction
{
  private int a;
  final qb b;

  public ac(qb paramqb, int paramInt)
  {
    super("FindReplaceAction");
    this.a = paramInt;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str1 = qb.a(this.b);
    qb.d(this.b).a(str1);
    if (qb.e(this.b) == 1)
    {
      String str2 = this.b.c();
      qb.f(this.b).a(str2);
    }
    qb.c(this.b).a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.ac
 * JD-Core Version:    0.6.0
 */