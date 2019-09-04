package com.zend.ide.n;

import java.util.ArrayList;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.Position;

class bv
{
  private Highlighter.HighlightPainter a;
  private Position b;
  private Position c;
  private ArrayList d = new ArrayList();
  private ArrayList e = new ArrayList();
  final bu f;

  public bv(bu parambu, Position paramPosition1, Position paramPosition2, Highlighter.HighlightPainter paramHighlightPainter)
  {
    this.a = paramHighlightPainter;
    this.b = paramPosition1;
    this.c = paramPosition2;
  }

  public void a(dz paramdz)
  {
    DefaultHighlighter localDefaultHighlighter = bu.b(this.f, paramdz);
    Object localObject = null;
    try
    {
      localObject = localDefaultHighlighter.addHighlight(this.b.getOffset(), this.c.getOffset(), this.a);
    }
    catch (Exception localException)
    {
    }
    if (localObject != null)
    {
      this.d.add(paramdz);
      this.e.add(localObject);
    }
  }

  public void b(dz paramdz)
  {
    for (int i = 0; i < this.d.size(); i++)
    {
      dz localdz = (dz)this.d.get(i);
      if (localdz != paramdz)
        continue;
      DefaultHighlighter localDefaultHighlighter = bu.b(this.f, paramdz);
      this.d.remove(i);
      Object localObject = this.e.remove(i);
      localDefaultHighlighter.removeHighlight(localObject);
    }
  }

  public void b()
  {
    while (this.d.size() > 0)
    {
      dz localdz = (dz)this.d.remove(0);
      DefaultHighlighter localDefaultHighlighter = bu.b(this.f, localdz);
      Object localObject = this.e.remove(0);
      localDefaultHighlighter.removeHighlight(localObject);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bv
 * JD-Core Version:    0.6.0
 */