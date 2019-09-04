package com.zend.ide.d;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.table.DefaultTableModel;

class xc extends AbstractAction
{
  final md a;

  public xc(md parammd)
  {
    super(ct.a(8));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    List localList = this.a.i();
    fc localfc = new fc();
    ld localld = new ld(md.f(this.a), true, localfc, localList, n.ADD);
    localld.setVisible(true);
    if (localfc.c())
    {
      md.g(this.a).addRow(new Object[] { localfc.a(), localfc.b() });
      md.a(this.a, true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.xc
 * JD-Core Version:    0.6.0
 */