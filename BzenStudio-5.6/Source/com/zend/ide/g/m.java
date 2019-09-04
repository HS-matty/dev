package com.zend.ide.g;

import com.zend.ide.bc.a;
import com.zend.ide.util.bp;
import com.zend.ide.util.cu;
import com.zend.ide.util.en;
import com.zend.ide.util.u;
import com.zend.ide.y.e;
import com.zend.ide.y.i;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JComponent;

public class m extends en
  implements cu
{
  private HashMap e = new HashMap(5);
  private String g = "tabbedOutputComponent";
  protected com.zend.ide.y.f h = new com.zend.ide.y.f();
  protected e i = new e(this.h);
  private i j;
  public static String k = "ShowInBrowserAction";

  public m()
  {
    super("tabbedOutputComponent");
    e();
    setPreferredSize(new Dimension(400, 300));
    i();
    a.a(this, "DEBUG_OUTPUT_WINDOW");
  }

  private void i()
  {
    this.j = new i(this);
    this.j.a("debugging.showInBrowser", k);
    this.j.a("editorComponent.closeDocument", "closeAction");
  }

  public l b(String paramString)
  {
    return (l)this.e.get(paramString);
  }

  public Iterator j()
  {
    return this.e.values().iterator();
  }

  public void a(l paraml)
  {
    if (super.a(paraml.c()) == -1)
    {
      addTab(paraml.c().getName(), null, paraml.c(), paraml.g());
      c(paraml);
    }
    setSelectedComponent(paraml.c());
  }

  public void a(String paramString1, String paramString2)
  {
    l locall = b(paramString1);
    if (locall == null)
      locall = b(paramString1, paramString2);
    locall.e();
    setSelectedComponent(locall.c());
  }

  private l b(String paramString1, String paramString2)
  {
    l locall = k();
    bp.a(locall);
    addTab(paramString1, null, locall.c(), paramString2);
    locall.c().setName(paramString1);
    locall.b(paramString2);
    c(locall);
    return locall;
  }

  protected l k()
  {
    return new n();
  }

  public boolean a(int paramInt, boolean paramBoolean)
  {
    Component localComponent = getComponentAt(paramInt);
    boolean bool = super.a(paramInt, paramBoolean);
    if (bool)
      a(localComponent.getName());
    return bool;
  }

  protected void c(l paraml)
  {
    paraml.d("outputComponent");
    paraml.a(this);
    this.e.put(paraml.c().getName(), paraml);
    this.c.e();
  }

  private void a(String paramString)
  {
    this.e.remove(paramString);
    this.c.e();
  }

  public void c(String paramString)
  {
    this.g = paramString;
  }

  public String r()
  {
    return this.g;
  }

  protected void e()
  {
    this.c = new f(this);
    this.c.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.m
 * JD-Core Version:    0.6.0
 */