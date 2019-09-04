package com.zend.ide.n;

import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.text.Document;

public class o extends ca
  implements com.zend.ide.util.r
{
  public o()
  {
    super("BeautifyCodeTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    gp localgp = new gp(new ex(this), b());
    localActionMap.put("reformatCodeAction", localgp);
    locals.a("keys.reformatCode", localgp, "textComponent", true);
  }

  protected void d()
  {
    c().a("phpEditorPane.reformatCode", "reformatCodeAction", 0);
  }

  private void e()
  {
    gx localgx = (gx)b().e();
    if ((localgx == null) || (!localgx.isEditable()))
      return;
    int i = localgx.getSelectionStart();
    int j = localgx.getSelectionEnd();
    if (i == j)
    {
      i = 0;
      j = localgx.getDocument().getLength() - 1;
    }
    r localr = kc.a((ho)localgx.getDocument());
    localr.a(localgx, i, j);
  }

  static void a(o paramo)
  {
    paramo.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.o
 * JD-Core Version:    0.6.0
 */