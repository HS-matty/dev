package com.zend.ide.bf;

import com.zend.ide.p.eb;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

class h
  implements ActionListener
{
  final ba a;

  h(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ba.c(this.a).e();
    ba.c(this.a).setVisible(true);
    d locald = ba.c(this.a).f();
    if (locald == null)
      return;
    while (r.b().a(locald))
    {
      JOptionPane.showMessageDialog(this.a, ct.a(1275, locald.a(), (String)locald.d()));
      ba.c(this.a).setVisible(true);
      locald = ba.c(this.a).f();
      if (locald == null)
        return;
    }
    r.b().a(locald.d(), locald);
    ((DefaultTableModel)ba.d(this.a).e()).addRow(new Object[] { locald.a(), locald.d(), locald.b() });
    ba.d(this.a).repaint();
    int i = ba.d(this.a).a(locald.a(), 0);
    ba.d(this.a).getSelectionModel().setSelectionInterval(i, i);
    ba.d(this.a).b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.h
 * JD-Core Version:    0.6.0
 */