package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.ListModel;

class m
  implements ActionListener
{
  final pb a;

  m(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ListModel localListModel = pb.c(this.a).getModel();
    String str1 = "";
    int i = 1;
    String str2 = ct.a(1311);
    if (localListModel.getSize() == 0)
      str1 = str2 + 1;
    while (str1.equals(""))
    {
      for (int j = 0; j < localListModel.getSize(); j++)
      {
        String str3 = ((b)localListModel.getElementAt(j)).d();
        if (!str3.equals(str2 + i))
          continue;
        i++;
        break;
      }
      if (j == localListModel.getSize())
        str1 = str2 + i;
    }
    pb.a(this.a, str1);
    pb.c(this.a).setSelectedIndex(localListModel.getSize() - 1);
    pb.c(this.a).updateUI();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.m
 * JD-Core Version:    0.6.0
 */