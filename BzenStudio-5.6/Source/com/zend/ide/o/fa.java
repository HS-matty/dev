package com.zend.ide.o;

import com.zend.ide.n.bw;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class fa extends AbstractAction
{
  final fk a;

  public fa(fk paramfk)
  {
    super("StepOverAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.n();
    if (!fk.d(this.a))
    {
      this.a.bd().a(0, true);
      this.a.P();
      return;
    }
    this.a.Z();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fa
 * JD-Core Version:    0.6.0
 */