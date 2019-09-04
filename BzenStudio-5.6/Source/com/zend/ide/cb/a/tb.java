package com.zend.ide.cb.a;

import com.zend.ide.cb.a.a.a;
import com.zend.ide.cb.a.a.b;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

class tb extends AbstractAction
{
  final pd a;

  public tb(pd parampd)
  {
    super(ct.a(1477), cv.b("sql/imageView.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    b localb = new b(pd.m(this.a));
    JDialog localJDialog = pd.a(this.a, ct.a(1478), localb.a(), true, true, 580, 250);
    localJDialog.setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.tb
 * JD-Core Version:    0.6.0
 */