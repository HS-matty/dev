package com.zend.ide.l;

import com.zend.ide.bd.c;
import com.zend.ide.f.bg;
import com.zend.ide.f.bp;
import com.zend.ide.f.da;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class bm extends AbstractAction
{
  final g a;

  public bm(g paramg)
  {
    super("CheckIncludesAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = bp.d().c().d().a(this.a.g());
    if (!bool)
      ba.a(c.b().h(), ct.a(982), ct.a(7), 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bm
 * JD-Core Version:    0.6.0
 */