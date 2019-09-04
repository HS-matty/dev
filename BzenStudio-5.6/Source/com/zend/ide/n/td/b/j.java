package com.zend.ide.n.td.b;

import com.zend.ide.n.bw;
import com.zend.ide.n.gx;
import com.zend.ide.n.td.jb;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;

public class j extends c
{
  public j(bw parambw)
  {
    super(parambw, "Expand All");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    gx localgx = (gx)this.a.e();
    jb localjb = localgx.a();
    if (localjb != null)
    {
      localjb.c();
      SwingUtilities.invokeLater(new b(this, localgx));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.b.j
 * JD-Core Version:    0.6.0
 */