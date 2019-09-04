package com.zend.ide.cb.a;

import javax.swing.DefaultListModel;
import javax.swing.JList;

class ab
  implements Runnable
{
  final s a;

  ab(s params)
  {
  }

  public void run()
  {
    s.b(this.a).ensureIndexIsVisible(s.a(this.a).size() - 1);
    s.b(this.a).setSelectedIndex(s.a(this.a).size() - 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ab
 * JD-Core Version:    0.6.0
 */