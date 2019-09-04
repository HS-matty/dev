package com.zend.ide.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

class de
  implements ActionListener
{
  final br a;

  de(br parambr)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Runtime localRuntime = Runtime.getRuntime();
    int i = (int)(localRuntime.maxMemory() / 1048576L);
    int j = i - (int)(localRuntime.freeMemory() / 1048576L);
    br.e(this.a).setText(j + "M  of " + i + "M");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.de
 * JD-Core Version:    0.6.0
 */