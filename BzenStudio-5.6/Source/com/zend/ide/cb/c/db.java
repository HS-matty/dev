package com.zend.ide.cb.c;

import com.zend.ide.bd.c;
import com.zend.ide.be.l;
import java.awt.Dimension;
import javax.swing.Action;
import javax.swing.JButton;

class db
  implements com.zend.ide.util.c.d
{
  final x a;

  db(x paramx)
  {
  }

  public Object k()
  {
    com.zend.ide.be.d locald = c.b().c();
    l locall = (l)locald.a("FileManagerWindowID");
    Action localAction = this.a.a.b();
    JButton localJButton = new JButton(localAction);
    localJButton.setToolTipText((String)localAction.getValue("Name"));
    localAction.putValue("Name", null);
    localJButton.setPreferredSize(new Dimension(24, 22));
    locall.a("SQL", "addServer", localJButton);
    localAction = this.a.a.c();
    localJButton = new JButton(localAction);
    localJButton.setToolTipText((String)localAction.getValue("Name"));
    localAction.putValue("Name", null);
    localJButton.setPreferredSize(new Dimension(24, 22));
    locall.a("SQL", "preferences", localJButton);
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.db
 * JD-Core Version:    0.6.0
 */