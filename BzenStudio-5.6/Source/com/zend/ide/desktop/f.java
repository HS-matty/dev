package com.zend.ide.desktop;

import com.zend.ide.be.d;
import com.zend.ide.n.bw;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.AbstractAction;

public class f extends AbstractAction
{
  final cj a;

  public f(cj paramcj)
  {
    super("ShowWindowsAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (cj.e(this.a) != null)
    {
      d locald = cj.a(this.a).c();
      Iterator localIterator = cj.e(this.a).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        locald.a(str, true);
      }
      cj.a(this.a, null);
      cj.f(this.a).d(cj.f(this.a).getCaretPosition());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.f
 * JD-Core Version:    0.6.0
 */