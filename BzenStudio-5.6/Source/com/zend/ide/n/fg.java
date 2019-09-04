package com.zend.ide.n;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ActionEvent;

class fg extends yb
{
  private String d;
  private String e;
  private String f;
  private String g;
  final cg h;

  public fg(cg paramcg, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    super(paramcg, paramString1, paramString2, paramString3);
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Boolean localBoolean = (Boolean)b.a("completion.xhtmlTagStyle").c();
    this.a = (localBoolean.booleanValue() ? this.f : this.d);
    this.b = (localBoolean.booleanValue() ? this.g : this.e);
    super.actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fg
 * JD-Core Version:    0.6.0
 */