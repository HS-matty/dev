package com.zend.ide.d;

import com.zend.ide.n.gz;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.ListModel;

class bp extends MouseAdapter
{
  final dd a;

  bp(dd paramdd)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    int i = dd.a(this.a, dd.b(this.a, dd.a(this.a).getCaretPosition()));
    if ((i != -1) && (i < this.a.a.getModel().getSize()))
      this.a.a.setSelectedIndex(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bp
 * JD-Core Version:    0.6.0
 */