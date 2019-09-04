package com.zend.ide.desktop;

import com.zend.ide.k.e;
import com.zend.ide.k.f;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ff extends AbstractAction
{
  private e a = null;
  final fa b;

  public ff(fa paramfa)
  {
    super("closeMessageComponentActionKey");
  }

  public ff(fa paramfa, e parame)
  {
    this(paramfa);
    this.a = parame;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a == null)
    {
      e locale = this.b.b();
      if (locale.x().c())
        this.b.b(locale);
    }
    else
    {
      this.b.b(this.a);
      fa.a(this.b).e();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ff
 * JD-Core Version:    0.6.0
 */