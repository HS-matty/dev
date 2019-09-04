package com.zend.ide.d;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class gc
  implements ActionListener
{
  final sd a;

  gc(sd paramsd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (sd.a(this.a).isSelected())
    {
      String str = b.a("debugging.serverHost").c().toString();
      if (str.endsWith("/"))
        sd.b(this.a).setText(str + "ZendPlatform");
      else
        sd.b(this.a).setText(str + "/ZendPlatform");
      sd.b(this.a).setEnabled(false);
    }
    else
    {
      sd.b(this.a).setEnabled(true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.gc
 * JD-Core Version:    0.6.0
 */