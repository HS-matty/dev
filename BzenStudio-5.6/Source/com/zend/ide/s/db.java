package com.zend.ide.s;

import com.zend.ide.n.bw;
import com.zend.ide.n.ca;
import com.zend.ide.y.i;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class db extends ca
{
  private o e = new o();
  private dc f = new dc(this, null);
  public static boolean g = false;

  public db()
  {
    super("completionToolKey");
  }

  protected void a(bw parambw)
  {
    this.e.a(parambw);
    ActionMap localActionMap = parambw.c().getActionMap();
    localActionMap.put("keys.showCompletionList", new de(this, null));
    localActionMap.put("keys.showFunctionArguments", new df(this, null));
    parambw.addDocumentListener(new cm(this));
    parambw.addMouseListener(new e(this));
    parambw.a(this.f);
  }

  protected void d()
  {
    c().a("completionTool.showCompletionList", "keys.showCompletionList");
    c().a("completionTool.showFunctionArguments", "keys.showFunctionArguments");
  }

  static o a(db paramdb)
  {
    return paramdb.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.db
 * JD-Core Version:    0.6.0
 */