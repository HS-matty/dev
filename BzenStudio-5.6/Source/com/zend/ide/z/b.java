package com.zend.ide.z;

import com.zend.ide.p.eb;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class b extends MouseAdapter
{
  final y a;

  b(y paramy)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if ((y.a(this.a).getSelectedRow() != -1) && (paramMouseEvent.getClickCount() == 2))
    {
      String str = y.a(this.a).getValueAt(y.a(this.a).getSelectedRow(), 0).toString().trim();
      w.a(this.a.g).a(str, -1, y.b(this.a).h());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.b
 * JD-Core Version:    0.6.0
 */