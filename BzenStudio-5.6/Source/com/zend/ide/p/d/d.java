package com.zend.ide.p.d;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

class d extends FocusAdapter
{
  final bw a;

  d(bw parambw)
  {
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
    if (!this.a.getFileChooser().isMultiSelectionEnabled())
    {
      bw.g(this.a).clearSelection();
      bw.h(this.a).selectAll();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.d
 * JD-Core Version:    0.6.0
 */