package com.zend.ide.fb;

import com.zend.ide.bd.c;
import com.zend.ide.desktop.fb;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.f.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JMenuItem;

class h
  implements ActionListener
{
  private ButtonModel a;
  final d b;

  h(d paramd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (a.a.b())
    {
      ba.a(fb.b().h(), ct.a(1544), ct.a(1545), -1, 1);
      return;
    }
    if (this.a == null)
    {
      this.a = this.b.g.getSelection();
    }
    else
    {
      ButtonModel localButtonModel = ((AbstractButton)paramActionEvent.getSource()).getModel();
      if (this.a.equals(localButtonModel))
      {
        d.a(this.b, 0);
        this.a = d.b(this.b).getModel();
        this.b.g.setSelected(d.b(this.b).getModel(), true);
        this.b.a(d.c(this.b));
        return;
      }
      this.a = this.b.g.getSelection();
    }
    if (paramActionEvent.getSource().equals(d.b(this.b)))
    {
      d.a(this.b, 4);
      this.b.g.setSelected(d.b(this.b).getModel(), true);
      this.b.d();
    }
    else if (paramActionEvent.getSource().equals(d.d(this.b)))
    {
      d.a(this.b, 1);
    }
    else if (paramActionEvent.getSource().equals(d.e(this.b)))
    {
      d.a(this.b, 3);
    }
    else if (paramActionEvent.getSource().equals(d.f(this.b)))
    {
      d.a(this.b, 2);
    }
    this.b.a(d.c(this.b));
  }

  public void a(ButtonModel paramButtonModel)
  {
    this.a = paramButtonModel;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.h
 * JD-Core Version:    0.6.0
 */