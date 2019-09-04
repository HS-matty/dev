package com.zend.ide.l;

import com.zend.ide.util.bh;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Hashtable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class bc
  implements ItemListener
{
  final by a;

  bc(by paramby)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    try
    {
      String str = (String)paramItemEvent.getItemSelectable().getSelectedObjects()[0];
      if (!by.a(this.a).containsKey(str))
      {
        bh localbh = new bh(str);
        by.a(this.a).put(str, localbh);
        ((DefaultComboBoxModel)by.b(this.a).getModel()).addElement(localbh);
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bc
 * JD-Core Version:    0.6.0
 */