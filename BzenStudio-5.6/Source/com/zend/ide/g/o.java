package com.zend.ide.g;

import com.zend.ide.n.gx;
import java.awt.event.ActionEvent;
import javax.swing.text.TextAction;

public class o extends TextAction
{
  final n a;

  public o(n paramn)
  {
    super("CopyAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.a != null)
    {
      if (this.a.a.getSelectedText() == null)
        this.a.a.selectAll();
      this.a.a.copy();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.o
 * JD-Core Version:    0.6.0
 */