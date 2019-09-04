package com.zend.ide.d;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComboBox;

class ct extends AbstractAction
{
  final dc a;

  private ct(dc paramdc)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = dc.a(this.a).getSelectedItem().toString();
    dc.a(this.a, str);
    dc.a(this.a).setSelectedItem("Default");
  }

  ct(dc paramdc, cf paramcf)
  {
    this(paramdc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ct
 * JD-Core Version:    0.6.0
 */