package com.zend.ide.desktop;

import com.zend.ide.n.bw;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

class cp
  implements ActionListener
{
  final br a;

  cp(br parambr)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    br.c(this.a).stop();
    int i = br.b(this.a).d() + 1;
    int j = br.b(this.a).b() + 1;
    if (br.d(this.a) != null)
      br.d(this.a).setText(" " + i + " : " + j);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cp
 * JD-Core Version:    0.6.0
 */