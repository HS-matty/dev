package com.zend.ide.e;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComboBox;

class n extends AbstractAction
{
  final c a;

  public n(c paramc)
  {
    super("TipListAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (!c.i(this.a))
    {
      String str = (String)c.j(this.a).getSelectedItem();
      c.a(this.a, c.a(this.a, str));
      c.k(this.a);
    }
    c.b(this.a, false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.n
 * JD-Core Version:    0.6.0
 */