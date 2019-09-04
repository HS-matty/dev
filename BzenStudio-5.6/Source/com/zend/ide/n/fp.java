package com.zend.ide.n;

import com.zend.ide.hb.gb;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.JTextComponent;

public class fp extends AbstractAction
{
  final cf a;

  public fp(cf paramcf)
  {
    super("find");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b().grabFocus();
    JTextComponent localJTextComponent = this.a.b().e();
    String str = localJTextComponent.getSelectedText();
    cf.a(this.a).a(str);
    cf.a(this.a).a(localJTextComponent);
    cf.a(this.a).a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fp
 * JD-Core Version:    0.6.0
 */