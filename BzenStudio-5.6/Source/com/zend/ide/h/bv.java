package com.zend.ide.h;

import com.zend.ide.util.ct;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JComboBox;

class bv extends FocusAdapter
{
  final br a;

  bv(br parambr)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    if (br.a(this.a).getSelectedItem().toString().equals(ct.a(226)))
      br.a(this.a).setSelectedItem(((be)this.a.n()).o());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bv
 * JD-Core Version:    0.6.0
 */