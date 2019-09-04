package com.zend.ide.d;

import com.zend.ide.util.bh;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Hashtable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class z
  implements ItemListener
{
  final od a;

  z(od paramod)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    try
    {
      String str = (String)paramItemEvent.getItemSelectable().getSelectedObjects()[0];
      if (!od.a(this.a).containsKey(str))
      {
        bh localbh = new bh(str);
        od.a(this.a).put(str, localbh);
        ((DefaultComboBoxModel)od.b(this.a).getModel()).addElement(localbh);
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.z
 * JD-Core Version:    0.6.0
 */