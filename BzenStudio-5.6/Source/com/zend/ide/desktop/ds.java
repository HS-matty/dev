package com.zend.ide.desktop;

import com.zend.ide.n.bw;
import com.zend.ide.n.f;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ds extends MouseAdapter
{
  final br a;

  ds(br parambr)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    br.b(this.a).grabFocus();
    f.a(!f.d());
    br.b(this.a).grabFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ds
 * JD-Core Version:    0.6.0
 */