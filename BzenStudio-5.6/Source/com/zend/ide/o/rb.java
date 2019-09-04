package com.zend.ide.o;

import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class rb extends AbstractAction
{
  final fp a;

  public rb(fp paramfp)
  {
    super(ct.a(1697), cv.b("browseroutputview.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    fp.a(this.a, "browser_view");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.rb
 * JD-Core Version:    0.6.0
 */