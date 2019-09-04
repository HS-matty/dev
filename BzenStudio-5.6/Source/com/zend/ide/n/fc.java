package com.zend.ide.n;

import com.zend.ide.n.a.m;
import java.awt.event.ActionEvent;
import java.util.Hashtable;
import javax.swing.AbstractAction;

class fc extends AbstractAction
{
  final cb a;

  private fc(cb paramcb)
  {
    super("removeAllBookmarksAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    cb.b(this.a).b();
    cb.d(this.a).clear();
  }

  fc(cb paramcb, hc paramhc)
  {
    this(paramcb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fc
 * JD-Core Version:    0.6.0
 */