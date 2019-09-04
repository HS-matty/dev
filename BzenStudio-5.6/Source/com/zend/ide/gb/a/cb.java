package com.zend.ide.gb.a;

import com.zend.ide.gb.b.c;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

class cb
  implements ActionListener
{
  final rb a;

  cb(rb paramrb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = rb.f(this.a);
    localbp.setFileSelectionMode(0);
    int i = localbp.showOpenDialog(this.a);
    if (i != 0)
      return;
    File[] arrayOfFile = localbp.getSelectedFiles();
    ArrayList localArrayList = new ArrayList();
    DefaultListModel localDefaultListModel = (DefaultListModel)rb.u().getModel();
    String str1;
    for (int j = 0; j < arrayOfFile.length; j++)
    {
      str1 = arrayOfFile[j].getPath();
      int k = 0;
      for (int m = 0; m < localDefaultListModel.size(); m++)
      {
        String str2 = ((c)localDefaultListModel.getElementAt(m)).b();
        if (!str2.equals(str1))
          continue;
        ba.a(this.a, ct.a(1776), ct.a(94), 0);
        k = 1;
        break;
      }
      if (k != 0)
        continue;
      localArrayList.add(arrayOfFile[j]);
    }
    arrayOfFile = (File[])localArrayList.toArray(new File[0]);
    for (j = 0; j < arrayOfFile.length; j++)
    {
      str1 = arrayOfFile[j].getPath();
      c localc = rb.a(this.a, str1);
      if (localc == null)
        continue;
      ((DefaultListModel)rb.u().getModel()).addElement(localc);
      rb.u().setSelectedIndex(rb.u().getModel().getSize() - 1);
      rb.u().updateUI();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.cb
 * JD-Core Version:    0.6.0
 */