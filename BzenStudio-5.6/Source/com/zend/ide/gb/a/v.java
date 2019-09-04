package com.zend.ide.gb.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

class v
  implements ActionListener
{
  final rb a;

  v(rb paramrb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    SwingUtilities.invokeLater(new w(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.v
 * JD-Core Version:    0.6.0
 */