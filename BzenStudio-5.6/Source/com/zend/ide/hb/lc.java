package com.zend.ide.hb;

import com.zend.ide.p.d.bc;
import com.zend.ide.util.ct;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Hashtable;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

class lc
  implements ItemListener
{
  final wc a;

  lc(wc paramwc)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (wc.d(this.a).getSelectedItem().toString().equals(ct.a(226)))
    {
      wc.d(this.a).setEditable(true);
      wc.d(this.a).getEditor().selectAll();
    }
    else if (wc.f(this.a).get(wc.d(this.a).getSelectedItem().toString()) != null)
    {
      wc.d(this.a).setEditable(false);
      wc.d(this.a).setToolTipText(wc.d(this.a).getSelectedItem().toString());
      wc.a(this.a, wc.a(this.a).getText());
    }
    else
    {
      String str = wc.d(this.a).getSelectedItem().toString().trim();
      bc localbc = new bc(str);
      wc.f(this.a).put(str, localbc);
      ((DefaultComboBoxModel)wc.d(this.a).getModel()).insertElementAt(localbc, wc.d(this.a).getModel().getSize());
      wc.d(this.a).getModel().setSelectedItem(wc.f(this.a).get(str));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.lc
 * JD-Core Version:    0.6.0
 */