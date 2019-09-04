package com.zend.ide.d;

import com.zend.ide.p.w;
import com.zend.ide.y.m;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.JComboBox;

class ch
  implements ActionListener
{
  final dc a;

  private ch(dc paramdc)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str1 = (String)dc.a(this.a).getSelectedItem();
    if ((str1 == null) || (dc.a(this.a)))
      return;
    co localco = (co)dc.b(this.a).get(str1);
    String str2 = dc.c(this.a).b();
    String str3 = localco.b();
    if (localco != null)
    {
      if ((!str2.equals(str3)) && (dc.b(this.a).get(str2) != null) && (!m.a(str2)))
        dc.b(this.a).put(str2, dc.c(this.a).clone());
      if (!str2.equals(str3))
      {
        dc.a(this.a, (co)localco.clone());
        this.a.j();
      }
    }
    else
    {
      dc.a(this.a).setSelectedItem(str2);
    }
    dc.d(this.a).setEnabled(!m.a(dc.a(this.a).getSelectedItem().toString()));
  }

  ch(dc paramdc, cf paramcf)
  {
    this(paramdc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ch
 * JD-Core Version:    0.6.0
 */