package com.zend.ide.cb.a;

import com.zend.ide.n.gz;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class xb extends AbstractAction
{
  final yc a;

  public xb(yc paramyc)
  {
    super(".");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (yc.a(this.a) == null)
      yc.a(this.a, new gz());
    if (yc.d(this.a) != null)
      yc.a(this.a).setText(yc.d(this.a));
    else if (yc.b(this.a) != null)
      yc.a(this.a).setText(yc.b(this.a));
    else
      yc.a(this.a).setText(null);
    ed localed = new ed(yc.a(this.a));
    if (localed.a() == 1)
      yc.a(this.a, yc.a(this.a).getText());
    this.a.stopCellEditing();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.xb
 * JD-Core Version:    0.6.0
 */