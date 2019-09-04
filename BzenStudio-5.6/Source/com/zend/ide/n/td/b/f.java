package com.zend.ide.n.td.b;

import com.zend.ide.n.bw;
import com.zend.ide.n.gx;
import com.zend.ide.n.td.jb;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;

public class f extends c
{
  public f(bw parambw)
  {
    super(parambw, "Collapse All");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    gx localgx = (gx)this.a.e();
    jb localjb = localgx.a();
    if (localjb != null)
    {
      localjb.d();
      SwingUtilities.invokeLater(new a(this, localgx));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.b.f
 * JD-Core Version:    0.6.0
 */