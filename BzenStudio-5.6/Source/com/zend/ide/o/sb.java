package com.zend.ide.o;

import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class sb extends AbstractAction
{
  final fp a;

  public sb(fp paramfp)
  {
    super(ct.a(1699), cv.b("outputbufferview.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    fp.a(this.a, "html_text_view");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.sb
 * JD-Core Version:    0.6.0
 */