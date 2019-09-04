package com.zend.ide.gb.a;

import com.zend.ide.util.ct;
import javax.swing.JList;

class j
  implements Runnable
{
  final i a;

  j(i parami)
  {
  }

  public void run()
  {
    pb.a(this.a.a, ct.a(1311) + 1);
    pb.c(this.a.a).setSelectedIndex(0);
    pb.c(this.a.a).updateUI();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.j
 * JD-Core Version:    0.6.0
 */