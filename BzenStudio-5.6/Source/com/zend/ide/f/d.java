package com.zend.ide.f;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTable;

class d extends WindowAdapter
{
  final da a;

  d(da paramda)
  {
  }

  public void windowActivated(WindowEvent paramWindowEvent)
  {
    if (da.a(this.a).getRowCount() > 0)
    {
      da.a(this.a).requestFocus();
      da.a(this.a).addRowSelectionInterval(0, 0);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.d
 * JD-Core Version:    0.6.0
 */