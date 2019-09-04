package com.zend.ide.d;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class wc extends AbstractAction
{
  final ld a;

  public wc(ld paramld)
  {
    super(ct.a(116));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ld.b(this.a).a(ld.a(this.a).a());
    ld.b(this.a).b(ld.a(this.a).b());
    this.a.d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.wc
 * JD-Core Version:    0.6.0
 */