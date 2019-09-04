package com.zend.ide.hb;

import com.zend.ide.n.gx;
import com.zend.ide.util.cl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

public class vb extends DefaultHighlighter
{
  private jb a = new jb(this);
  private gx b;
  private int c;
  private int d;
  private PropertyChangeListener e = new ib(this);
  private e f;
  private DefaultHighlighter.DefaultHighlightPainter g;
  final gb h;

  public vb(gb paramgb)
  {
    b();
  }

  public boolean a()
  {
    return super.getHighlights().length > 0;
  }

  void b()
  {
    f localf = new f();
    this.f = new e(localf);
    localf.a("editing.searchInSelectedHighlightingColor", this.e);
    this.f.a("editing.searchInSelectedHighlightingColor");
  }

  public void a(gx paramgx, int paramInt1, int paramInt2)
  {
    c();
    this.c = paramInt1;
    this.d = paramInt2;
    this.b = paramgx;
    paramgx.a(this, 1);
    paramgx.addCaretListener(this.a);
    try
    {
      addHighlight(paramInt1, paramInt2, this.g);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    gb.e(this.h).a();
  }

  public void c()
  {
    if (a())
    {
      removeAllHighlights();
      this.b.removeCaretListener(this.a);
      this.b.a(this);
      gb.e(this.h).a();
    }
  }

  public gx d()
  {
    return this.b;
  }

  public int e()
  {
    return this.c;
  }

  public int f()
  {
    return this.d;
  }

  private void a(Color paramColor)
  {
    this.g = new DefaultHighlighter.DefaultHighlightPainter(paramColor);
  }

  static int a(vb paramvb)
  {
    return paramvb.c;
  }

  static void a(vb paramvb, Color paramColor)
  {
    paramvb.a(paramColor);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.vb
 * JD-Core Version:    0.6.0
 */