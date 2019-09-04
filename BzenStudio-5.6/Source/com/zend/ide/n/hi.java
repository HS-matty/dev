package com.zend.ide.n;

import java.awt.Graphics;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.View;

public class hi extends DefaultHighlighter
{
  private JTextComponent a;
  private ArrayList b = new ArrayList();

  public void install(JTextComponent paramJTextComponent)
  {
    super.install(paramJTextComponent);
    this.a = paramJTextComponent;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((bj)localIterator.next()).a.install(paramJTextComponent);
  }

  public void deinstall(JTextComponent paramJTextComponent)
  {
    super.deinstall(paramJTextComponent);
    this.a = null;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((bj)localIterator.next()).a.deinstall(paramJTextComponent);
  }

  public void paintLayeredHighlights(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView)
  {
    int i = 0;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      bj localbj = (bj)localIterator.next();
      if ((localbj.b > 0) && (i == 0))
      {
        super.paintLayeredHighlights(paramGraphics, paramInt1, paramInt2, paramShape, paramJTextComponent, paramView);
        i = 1;
      }
      if ((localbj.a instanceof LayeredHighlighter))
        ((LayeredHighlighter)localbj.a).paintLayeredHighlights(paramGraphics, paramInt1, paramInt2, paramShape, paramJTextComponent, paramView);
    }
    if (i == 0)
      super.paintLayeredHighlights(paramGraphics, paramInt1, paramInt2, paramShape, paramJTextComponent, paramView);
  }

  public void a(Highlighter paramHighlighter, int paramInt)
  {
    bj localbj1 = new bj(paramHighlighter, paramInt, null);
    int i = 0;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      bj localbj2 = (bj)localIterator.next();
      if (paramInt < localbj2.b)
        break;
      i++;
    }
    this.b.add(i, localbj1);
    paramHighlighter.install(this.a);
  }

  public void a(Highlighter paramHighlighter)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      bj localbj = (bj)localIterator.next();
      if (localbj.a == paramHighlighter)
      {
        this.b.remove(localbj.a);
        localbj.a.deinstall(this.a);
        return;
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hi
 * JD-Core Version:    0.6.0
 */