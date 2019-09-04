package com.zend.ide.bf;

import com.zend.ide.p.eb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

class i
  implements ActionListener
{
  final ba a;

  i(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int[] arrayOfInt = ba.d(this.a).getSelectedRows();
    if (arrayOfInt.length == 0)
      return;
    for (int i = 0; i < arrayOfInt.length; i++)
    {
      int j = arrayOfInt[i] - i;
      Object localObject1 = ba.d(this.a).getValueAt(j, 1);
      Object localObject2 = ba.d(this.a).getValueAt(j, 0);
      r.b().b(localObject1, localObject2);
      ((DefaultTableModel)ba.d(this.a).e()).removeRow(ba.d(this.a).b(j));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.i
 * JD-Core Version:    0.6.0
 */