package com.zend.ide.n.td.b;

import com.zend.ide.n.bw;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import java.awt.event.ActionEvent;
import javax.swing.text.JTextComponent;

public class i extends c
{
  public i(bw parambw)
  {
    super(parambw, "Collapse Fold in Scope");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.a.e();
    hb localhb = (hb)localJTextComponent;
    jb localjb = localhb.a();
    if (localjb != null)
    {
      gb localgb = localjb.c(localJTextComponent.getCaretPosition());
      if (localgb != null)
        localjb.a(localgb);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.b.i
 * JD-Core Version:    0.6.0
 */