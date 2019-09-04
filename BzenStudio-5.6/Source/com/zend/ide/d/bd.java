package com.zend.ide.d;

import com.zend.ide.f.zc.b.l;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

class bd extends AbstractAction
{
  final md a;

  public bd(md parammd)
  {
    super(ct.a(643));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = ud.b(md.b(this.a));
    int[] arrayOfInt = md.b(this.a).getSelectedRows();
    int j = 0;
    for (int k = 0; k < arrayOfInt.length; k++)
    {
      if (arrayOfInt[k] < i)
        ud.d(md.b(this.a));
      else if (arrayOfInt[k] == i)
        j = 1;
      md.g(this.a).removeRow(arrayOfInt[k] - k);
      md.a(this.a, true);
    }
    if (j != 0)
    {
      ud.a(md.b(this.a), 0);
      String str = l.c();
      int m = md.g(this.a).getRowCount();
      for (int n = 0; n < m; n++)
      {
        if (!str.equals(md.g(this.a).getValueAt(n, 0).toString()))
          continue;
        ud.a(md.b(this.a), n);
        break;
      }
    }
    SwingUtilities.invokeLater(new ec(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bd
 * JD-Core Version:    0.6.0
 */