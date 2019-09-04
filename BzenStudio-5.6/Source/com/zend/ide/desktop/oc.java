package com.zend.ide.desktop;

import com.zend.ide.util.ct;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class oc
  implements PropertyChangeListener
{
  final cj a;

  private oc(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    String str1 = bool ? ct.a(1757) : ct.a(512);
    JMenu localJMenu = cj.i(this.a).b("editMenu");
    for (int i = 0; i < localJMenu.getItemCount(); i++)
    {
      JMenuItem localJMenuItem = localJMenu.getItem(i);
      if (localJMenuItem == null)
        continue;
      String str2 = localJMenuItem.getText();
      if ((str2 == null) || ((!str2.equals(ct.a(1757))) && (!str2.equals(ct.a(512)))))
        continue;
      localJMenuItem.setText(str1);
      return;
    }
  }

  oc(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.oc
 * JD-Core Version:    0.6.0
 */