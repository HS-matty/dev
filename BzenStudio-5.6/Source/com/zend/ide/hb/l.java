package com.zend.ide.hb;

import com.zend.ide.util.ct;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;

class l
  implements ItemListener
{
  final pb a;

  l(pb parampb)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (paramItemEvent.getStateChange() == 1)
      if (paramItemEvent.getItem().equals(ct.a(226)))
      {
        pb.e(this.a).setEditable(true);
        pb.e(this.a).getEditor().selectAll();
      }
      else
      {
        pb.e(this.a).setEditable(false);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.l
 * JD-Core Version:    0.6.0
 */