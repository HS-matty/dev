package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.bc;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;

public class bl extends AbstractAction
{
  final bq a;

  public bl(bq parambq)
  {
    super("editNodeNameKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    o localo = (o)this.a.getLastSelectedPathComponent();
    a locala = (a)localo.getUserObject();
    String str1 = locala.c();
    String str2 = (String)ba.a(this.a.c().getTopLevelAncestor(), ct.a(119), ct.a(373), 1, null, null, str1);
    if ((str2 == null) || (str2.equals("")) || (str2.equals(str1)))
      return;
    bq.a(this.a).a(str1, str2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bl
 * JD-Core Version:    0.6.0
 */