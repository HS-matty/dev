package com.zend.ide.l;

import com.zend.ide.util.bh;
import com.zend.ide.y.b;
import java.awt.event.ActionEvent;
import java.util.Hashtable;
import javax.swing.AbstractAction;

public class bu extends AbstractAction
{
  final g a;

  public bu(g paramg)
  {
    super("ShowProjectPropertiesAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (g.e(this.a) == null)
      g.a(this.a, new bx(this.a.w().z(), this.a.w().e()));
    String str1 = "debugger";
    String str2 = "javaBridge";
    e locale1 = new e(((k)this.a.d.get(str1)).m(), str1);
    e locale2 = new e(((k)this.a.d.get(str2)).m(), str2);
    g.e(this.a).a(locale1);
    g.e(this.a).b(locale2);
    g.e(this.a).a(this.a.f().b());
    g.e(this.a).setVisible(true);
    e locale3 = (e)g.e(this.a).b();
    e locale4 = (e)g.e(this.a).c();
    if (locale3 != null)
      ((k)this.a.d.get(locale3.c())).a(locale3.b());
    if (locale4 != null)
      ((k)this.a.d.get(locale4.c())).a(locale4.b());
    if (g.e(this.a).e())
    {
      this.a.f().a(g.e(this.a).f());
      bh localbh = (bh)b.a("editing.encoding");
      b.a("editing.encoding", g.e(this.a).f());
      b.a("editing.encoding", localbh);
      g.e(this.a).a(false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bu
 * JD-Core Version:    0.6.0
 */