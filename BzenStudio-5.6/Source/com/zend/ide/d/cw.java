package com.zend.ide.d;

import com.zend.ide.n.bw;
import com.zend.ide.w.b.bs;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.ListModel;

class cw extends MouseAdapter
{
  final dn a;

  private cw(dn paramdn)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    int i = dn.a(this.a, dn.b(this.a).b(dn.b(this.a).d().getCaretPosition()));
    if ((i != -1) && (i < this.a.a.getModel().getSize()))
      this.a.a.setSelectedIndex(i);
  }

  cw(dn paramdn, dj paramdj)
  {
    this(paramdn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cw
 * JD-Core Version:    0.6.0
 */