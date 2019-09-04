package com.zend.ide.desktop;

import com.zend.ide.util.bi;
import com.zend.ide.util.g;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class dc extends AbstractAction
{
  final cj a;

  public dc(cj paramcj)
  {
    super("OpenHelpTicketAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = bi.a("PICKUP_DEPOT_URL", "http://www.zend.com/store/pickup.php");
    cj.a(this.a).e().a(str, false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dc
 * JD-Core Version:    0.6.0
 */