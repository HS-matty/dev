package com.zend.ide.n;

import com.zend.ide.hb.gb;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.JTextComponent;

public class fq extends AbstractAction
{
  final cf a;

  public fq(cf paramcf)
  {
    super("find-next");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b().grabFocus();
    JTextComponent localJTextComponent = this.a.b().e();
    cf.a(this.a).a(localJTextComponent);
    cf.a(this.a).a(true, true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fq
 * JD-Core Version:    0.6.0
 */