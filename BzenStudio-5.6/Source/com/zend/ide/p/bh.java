package com.zend.ide.p;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ComponentEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import javax.swing.JComponent;

class bh extends JComponent
{
  int a = 5;
  int b = 5;
  int c = 10;
  int d;
  int e;
  int f;
  int g;
  final bl h;

  bh(bl parambl)
  {
    enableEvents(101L);
  }

  protected void processComponentEvent(ComponentEvent paramComponentEvent)
  {
    b();
  }

  public void b()
  {
    Dimension localDimension = getSize();
    this.d = this.a;
    this.e = this.b;
    this.f = (localDimension.width - 2 * this.a);
    this.g = (localDimension.height - 2 * this.b);
  }

  public void paintComponent(Graphics paramGraphics)
  {
    Graphics2D localGraphics2D = (Graphics2D)paramGraphics;
    localGraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    localGraphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    GeneralPath localGeneralPath = new GeneralPath();
    double d1 = 0.0D;
    int i = this.f - 2 * this.c;
    int j = this.g - 2 * this.c;
    if (this.h.l)
    {
      i -= this.c;
      j -= this.c;
    }
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < this.h.c; k++)
    {
      double d2 = d1 + this.h.j[k];
      double d3 = Math.min(90.0D - d1, 90.0D - d2);
      double d4 = Math.max(90.0D - d1, 90.0D - d2);
      Arc2D.Double localDouble = new Arc2D.Double(this.d, this.e, i, j, d3, d4 - d3, 2);
      double d5 = (d3 + d4) / 2.0D * 3.141592653589793D / 180.0D;
      AffineTransform localAffineTransform2 = AffineTransform.getTranslateInstance(this.c * Math.cos(d5), -this.c * Math.sin(d5));
      localAffineTransform2.translate(this.c, this.c);
      Shape localShape2 = localAffineTransform2.createTransformedShape(localDouble);
      localArrayList.add(localShape2);
      localGeneralPath.append(localShape2, false);
      d1 = d2;
    }
    if (this.h.l)
    {
      AffineTransform localAffineTransform1 = AffineTransform.getTranslateInstance(this.c, this.c);
      localGraphics2D.setColor(Color.gray);
      Shape localShape1 = localAffineTransform1.createTransformedShape(localGeneralPath);
      localGraphics2D.fill(localShape1);
    }
    for (int m = 0; m < this.h.c; m++)
    {
      localGraphics2D.setColor((Color)bk.a(this.h.m).get(m));
      localGraphics2D.fill((Shape)localArrayList.get(m));
    }
    localGraphics2D.setColor(this.h.k);
    localGraphics2D.draw(localGeneralPath);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bh
 * JD-Core Version:    0.6.0
 */