package com.zend.ide.n;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class wd
  implements ItemListener
{
  final ct a;

  wd(ct paramct)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    b.a("editing.automaticFileReload").a(new Boolean(((x)paramItemEvent.getSource()).isSelected()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.wd
 * JD-Core Version:    0.6.0
 */