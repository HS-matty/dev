package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.ab;
import com.zend.ide.o.fk;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;

public class bh extends AbstractAction
{
  final bo b;

  public bh(bo parambo)
  {
    super("AssignValueAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    m localm = (m)this.b.getLastSelectedPathComponent();
    a locala = (a)localm.getUserObject();
    String str = (String)ba.a(this.b.c().getTopLevelAncestor(), ct.a(115), ct.a(114), 1, null, null, null);
    if ((str == null) || (str.equals("")))
      return;
    this.b.j.a().a(locala, str, 0);
    this.b.j.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bh
 * JD-Core Version:    0.6.0
 */