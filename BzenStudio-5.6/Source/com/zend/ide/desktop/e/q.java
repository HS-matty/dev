package com.zend.ide.desktop.e;

import com.zend.ide.be.l;
import com.zend.ide.desktop.cj;
import com.zend.ide.f.dd;
import com.zend.ide.f.nd;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JToggleButton;

class q extends AbstractAction
{
  final a a;

  public q(a parama)
  {
    super(ct.a(1737), cv.b("classbrowser/linkToEditor16.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (a.a(this.a) == null)
      a.a(this.a, new nd((dd)a.b(this.a), a.c(this.a).X()));
    JToggleButton localJToggleButton = (JToggleButton)a.d(this.a).a(ct.a(162), "FileBrowserComponent.linkToEditor");
    boolean bool = localJToggleButton.isSelected();
    a.a(this.a).a(bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.q
 * JD-Core Version:    0.6.0
 */