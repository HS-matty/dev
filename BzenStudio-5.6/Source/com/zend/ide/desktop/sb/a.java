package com.zend.ide.desktop.sb;

import com.zend.ide.desktop.cj;
import com.zend.ide.eb.k;
import com.zend.ide.n.bw;
import com.zend.ide.util.c.m;
import com.zend.ide.util.cu;
import com.zend.ide.util.s;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class a
  implements cu
{
  private cj a;
  private k b;
  private bw c;

  public a(cj paramcj)
  {
    this.a = paramcj;
    this.c = this.a.X();
    a();
  }

  private void a()
  {
    s locals = (s)this.c.q();
    m localm1 = new m(new c(this));
    locals.a("keys.codeSnippets", localm1, "textComponent", true);
    this.a.a("keys.codeSnippets", localm1, "default", false);
    m localm2 = new m(new b(this));
    locals.a("keys.newCodeSnippet", localm2, "textComponent", true);
    this.a.a("keys.newCodeSnippet", localm2, "default", false);
    this.c.c().getActionMap().put("snippetsAction", localm1);
    this.c.c().getActionMap().put("newSnippetAction", localm2);
  }

  static k a(a parama)
  {
    return parama.b;
  }

  static k a(a parama, k paramk)
  {
    return parama.b = paramk;
  }

  static bw b(a parama)
  {
    return parama.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.sb.a
 * JD-Core Version:    0.6.0
 */