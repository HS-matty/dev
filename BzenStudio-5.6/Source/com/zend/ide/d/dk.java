package com.zend.ide.d;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public abstract class dk extends AbstractAction
{
  final dm a;

  protected dk(dm paramdm)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.d())
    {
      String str = this.a.r();
      if ((paramActionEvent.getSource() instanceof x))
      {
        x localx = (x)paramActionEvent.getSource();
        localx.setSelected(!localx.isSelected());
      }
      if (str == null)
        return;
    }
    a(paramActionEvent);
  }

  public abstract void a(ActionEvent paramActionEvent);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dk
 * JD-Core Version:    0.6.0
 */