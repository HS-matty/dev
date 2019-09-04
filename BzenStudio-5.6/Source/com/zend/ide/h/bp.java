package com.zend.ide.h;

import com.zend.ide.p.d.bc;
import com.zend.ide.util.ct;
import com.zend.ide.util.eo;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Hashtable;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.filechooser.FileFilter;

class bp
  implements ItemListener
{
  final br a;

  bp(br parambr)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (br.a(this.a).getSelectedItem().toString().equals(ct.a(226)))
    {
      br.a(this.a).setEditable(true);
      br.a(this.a).getEditor().selectAll();
    }
    else if (br.b(this.a).get(br.a(this.a).getSelectedItem().toString()) != null)
    {
      br.a(this.a).setEditable(false);
      ((be)this.a.n()).a((FileFilter)br.b(this.a).get(br.a(this.a).getSelectedItem().toString()));
      this.a.n().i();
      this.a.a(br.a(this.a).getSelectedItem());
      br.a(this.a).setToolTipText(br.a(this.a).getSelectedItem().toString());
    }
    else
    {
      String str = br.a(this.a).getSelectedItem().toString().trim();
      bc localbc = new bc(str);
      br.b(this.a).put(str, localbc);
      ((DefaultComboBoxModel)br.a(this.a).getModel()).insertElementAt(localbc, br.a(this.a).getModel().getSize());
      br.a(this.a).getModel().setSelectedItem(br.b(this.a).get(str));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bp
 * JD-Core Version:    0.6.0
 */