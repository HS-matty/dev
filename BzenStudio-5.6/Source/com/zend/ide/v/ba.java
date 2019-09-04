package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.td.hb;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.JTextComponent;

class ba extends AbstractAction
{
  final d a;

  private ba(d paramd)
  {
    super("CloneViewAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bw localbw1 = this.a.b("clone");
    JTextComponent localJTextComponent1 = localbw1.e();
    bw localbw2 = this.a.u();
    JTextComponent localJTextComponent2 = null;
    if (localbw2 != null)
    {
      localJTextComponent2 = localbw2.e();
      localJTextComponent1.setDocument(localJTextComponent2.getDocument());
      if (((localJTextComponent2 instanceof hb)) && ((localJTextComponent1 instanceof hb)))
        ((hb)localJTextComponent1).a(((hb)localJTextComponent2).a());
    }
    this.a.b(localbw1);
  }

  ba(d paramd, l paraml)
  {
    this(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.ba
 * JD-Core Version:    0.6.0
 */