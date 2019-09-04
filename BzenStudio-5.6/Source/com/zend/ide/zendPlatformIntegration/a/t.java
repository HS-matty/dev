package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JComboBox;

class t
  implements ActionListener
{
  final ib a;

  t(ib paramib)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    f localf = f.a();
    JComboBox localJComboBox = (JComboBox)paramActionEvent.getSource();
    String[] arrayOfString1 = new String[0];
    int i = localJComboBox.getSelectedIndex();
    ArrayList localArrayList = localf.b;
    if (i != 0)
      arrayOfString1 = ((g)localArrayList.get(i)).b();
    String[] arrayOfString2 = null;
    ib.a(this.a).removeAllItems();
    if (arrayOfString1.length > 0)
    {
      ib.a(this.a).addItem(ct.a(673));
      for (int j = 0; j < arrayOfString1.length; j++)
        ib.a(this.a).addItem(localf.c.get(arrayOfString1[j]));
    }
    else
    {
      Collection localCollection = localf.c.values();
      arrayOfString2 = new String[localCollection.size()];
      localCollection.toArray(arrayOfString2);
      Arrays.sort(arrayOfString2);
      for (int k = 0; k < arrayOfString2.length; k++)
        ib.a(this.a).addItem(arrayOfString2[k]);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.t
 * JD-Core Version:    0.6.0
 */