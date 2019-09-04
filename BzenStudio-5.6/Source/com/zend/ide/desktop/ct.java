package com.zend.ide.desktop;

import com.zend.ide.p.b.e;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ct extends AbstractAction
{
  private boolean b;
  private kc c = new kc(this, "Zend Platform", true, true, 2.0F, "");
  private e d;
  private lc e;
  final cj a;

  public ct(cj paramcj, boolean paramBoolean)
  {
    super(paramBoolean ? "ConfigureDebugServerAction" : "OpenAllowedHostsPageAction");
    this.b = paramBoolean;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = (String)b.a("platform.guiURL").c();
    this.e = new lc(this);
    this.e.a(str);
    this.e.b(str);
    this.e.start();
  }

  static kc a(ct paramct)
  {
    return paramct.c;
  }

  static e b(ct paramct)
  {
    return paramct.d;
  }

  static lc c(ct paramct)
  {
    return paramct.e;
  }

  static e a(ct paramct, e parame)
  {
    return paramct.d = parame;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ct
 * JD-Core Version:    0.6.0
 */