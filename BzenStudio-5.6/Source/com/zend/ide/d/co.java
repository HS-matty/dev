package com.zend.ide.d;

import com.zend.ide.n.be;
import java.awt.Color;
import java.awt.Font;

public class co
  implements Cloneable
{
  private String a;
  private be b;
  private Color c;
  private Color d;
  private Color e;
  private Color f;
  private Color g;
  private Color h;
  private Color i;
  private Color k;
  private Color l;
  private Color m;
  private Font j;

  public String b()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public be c()
  {
    return this.b;
  }

  public void a(be parambe)
  {
    this.b = parambe;
  }

  public Font d()
  {
    return this.j;
  }

  public void a(Font paramFont)
  {
    this.j = paramFont;
  }

  public Color e()
  {
    return this.c;
  }

  public Color f()
  {
    return this.d;
  }

  public Color g()
  {
    return this.e;
  }

  public Color h()
  {
    return this.f;
  }

  public Color i()
  {
    return this.g;
  }

  public Color j()
  {
    return this.h;
  }

  public Color k()
  {
    return this.i;
  }

  public Color n()
  {
    return this.k;
  }

  public Color o()
  {
    return this.l;
  }

  public Color p()
  {
    return this.m;
  }

  public void a(Color paramColor)
  {
    this.c = paramColor;
  }

  public void b(Color paramColor)
  {
    this.d = paramColor;
  }

  public void c(Color paramColor)
  {
    this.e = paramColor;
  }

  public void d(Color paramColor)
  {
    this.f = paramColor;
  }

  public void e(Color paramColor)
  {
    this.g = paramColor;
  }

  public void f(Color paramColor)
  {
    this.h = paramColor;
  }

  public void g(Color paramColor)
  {
    this.i = paramColor;
  }

  public void h(Color paramColor)
  {
    this.k = paramColor;
  }

  public void i(Color paramColor)
  {
    this.l = paramColor;
  }

  public void j(Color paramColor)
  {
    this.m = paramColor;
  }

  public Object clone()
  {
    co localco = new co();
    localco.a(this.a);
    localco.a(this.c);
    localco.b(this.d);
    localco.c(this.e);
    localco.f(this.h);
    localco.e(this.g);
    localco.g(this.i);
    localco.h(this.k);
    localco.i(this.l);
    localco.j(this.m);
    localco.a(this.j);
    localco.d(this.f);
    localco.a((be)this.b.clone());
    return localco;
  }

  public Color b(String paramString)
  {
    if (paramString.equals("editing.background"))
      return this.c;
    if (paramString.equals("editing.bracketQuoteMatching"))
      return this.d;
    if (paramString.equals("editing.bracketMatchingErrorColor"))
      return this.e;
    if (paramString.equals("editing.searchInSelectedHighlightingColor"))
      return this.f;
    if (paramString.equals("editing.currentLineColor"))
      return this.g;
    if (paramString.equals("highlighting.breakpointColor"))
      return this.h;
    if (paramString.equals("highlighting.debugStepColor"))
      return this.i;
    if (paramString.equals("cvsDiff.diffAppend"))
      return this.k;
    if (paramString.equals("cvsDiff.diffChange"))
      return this.l;
    if (paramString.equals("cvsDiff.diffDelete"))
      return this.m;
    return null;
  }

  public void a(String paramString, Object paramObject)
  {
    if ((paramObject instanceof Color))
    {
      Color localColor = (Color)paramObject;
      if (paramString.equals("editing.background"))
        this.c = localColor;
      if (paramString.equals("editing.bracketQuoteMatching"))
        this.d = localColor;
      if (paramString.equals("editing.bracketMatchingErrorColor"))
        this.e = localColor;
      if (paramString.equals("editing.searchInSelectedHighlightingColor"))
        this.f = localColor;
      if (paramString.equals("editing.currentLineColor"))
        this.g = localColor;
      if (paramString.equals("highlighting.breakpointColor"))
        this.h = localColor;
      if (paramString.equals("highlighting.debugStepColor"))
        this.i = localColor;
      if (paramString.equals("cvsDiff.diffAppend"))
        this.k = localColor;
      if (paramString.equals("cvsDiff.diffChange"))
        this.l = localColor;
      if (paramString.equals("cvsDiff.diffDelete"))
        this.m = localColor;
    }
    else if ((paramObject instanceof Font))
    {
      this.j = ((Font)paramObject);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.co
 * JD-Core Version:    0.6.0
 */