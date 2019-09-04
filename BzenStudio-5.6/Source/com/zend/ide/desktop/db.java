package com.zend.ide.desktop;

import com.zend.ide.util.bi;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.f.a;
import com.zend.ide.util.g;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class db extends AbstractAction
{
  final cj a;

  public db(cj paramcj)
  {
    super("OpenFeedbackFormAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = ct.a(473);
    boolean bool = a.a.a();
    if (bool)
    {
      str = str + "?ea=" + a.a.a();
      str = str + "&build=" + bi.a("BUILD_ID");
    }
    else
    {
      str = str + "?version=5.5.1";
      str = str + "&os=" + cr.a();
      str = str + "&lk=" + bi.a("LICENSE_KEY");
      str = str + "&eval=" + a.a.c();
      str = str + "&days=" + a.a.d();
      str = str + "&edition=" + a.a.e();
      str = str + "&ea=" + a.a.a();
    }
    cj.a(this.a).e().a(str, false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.db
 * JD-Core Version:    0.6.0
 */