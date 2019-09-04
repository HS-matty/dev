package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class sb extends AbstractAction
{
  final pd a;

  public sb(pd parampd)
  {
    super(ct.a(1479), cv.b("sql/hexView.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    pd.b(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.sb
 * JD-Core Version:    0.6.0
 */