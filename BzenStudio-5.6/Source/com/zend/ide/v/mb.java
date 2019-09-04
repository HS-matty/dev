package com.zend.ide.v;

import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.m.bf;
import com.zend.ide.p.a.a;
import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.text.Document;

class mb extends AbstractAction
{
  final kb a;

  private mb(kb paramkb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = this.a.f.k();
    bf localbf = kb.a(this.a).a(str);
    if (localbf == null)
      return;
    com.zend.ide.f.yb.d.a().a(localbf);
    Document localDocument = this.a.f.getDocument();
    try
    {
      bp.d().a(new a(localDocument), str);
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
  }

  mb(kb paramkb, l paraml)
  {
    this(paramkb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.mb
 * JD-Core Version:    0.6.0
 */