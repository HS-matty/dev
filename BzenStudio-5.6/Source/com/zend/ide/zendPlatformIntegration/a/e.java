package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.bd.c;
import com.zend.ide.util.g;
import com.zend.ide.y.b;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.TableModel;

class e
  implements MouseListener
{
  final jb a;

  e(jb paramjb)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
    {
      jb localjb = (jb)paramMouseEvent.getSource();
      int i = localjb.getSelectedRow();
      int j = 0;
      String str1 = (String)this.a.getModel().getValueAt(i, j);
      String str2 = b.a("platform.guiURL").toString() + "/server/eventreport.php?event_id=" + str1;
      boolean bool = (Boolean)b.a("desktop.internalBrowser") != null;
      bool = (bool) && ((Boolean)b.a("desktop.internalBrowser") != null);
      c.b().e().a(str2, bool);
    }
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.e
 * JD-Core Version:    0.6.0
 */