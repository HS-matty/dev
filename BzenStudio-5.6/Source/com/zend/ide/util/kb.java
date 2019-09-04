package com.zend.ide.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position.Bias;
import javax.swing.text.View;

public class kb
  implements Printable, Pageable, cu
{
  private View a;
  private int b = -1;
  private int c;
  private eb d;
  private PageFormat e;
  private JTextArea f;
  private boolean g;
  private int h;

  public kb(JTextArea paramJTextArea, PageFormat paramPageFormat, eb parameb)
  {
    this.e = paramPageFormat;
    this.d = parameb;
    this.f = paramJTextArea;
    this.h = -1;
    if (parameb.i() != null)
      paramJTextArea.setFont(parameb.i());
    if (parameb.g())
    {
      paramJTextArea.setLineWrap(true);
      paramJTextArea.setWrapStyleWord(true);
    }
    else
    {
      paramJTextArea.setLineWrap(false);
      paramJTextArea.setWrapStyleWord(false);
    }
    paramPageFormat.setOrientation(parameb.f());
    this.a = paramJTextArea.getUI().getRootView(paramJTextArea);
    a();
    this.c = paramJTextArea.getFontMetrics(paramJTextArea.getFont()).getHeight();
  }

  private void a()
  {
    int i = (int)this.e.getImageableWidth();
    int j = 2147483647;
    if ((this.f.getWrapStyleWord()) || (this.f.getLineWrap()))
      j = (int)this.e.getImageableHeight();
    float f1 = b(i);
    float f2 = a(j);
    this.a.setSize(f1, f2);
  }

  public int print(Graphics paramGraphics, PageFormat paramPageFormat, int paramInt)
    throws PrinterException
  {
    int i = (int)paramPageFormat.getImageableX();
    int j = (int)paramPageFormat.getImageableY();
    int k = (int)paramPageFormat.getImageableWidth();
    int m = 2147483647;
    int n = (int)paramPageFormat.getImageableHeight();
    int i1 = a(n);
    if (this.f.getLineWrap())
      m = n;
    Rectangle localRectangle1 = new Rectangle();
    localRectangle1.width = b(k);
    localRectangle1.height = a(m);
    localRectangle1.x = (i + k - localRectangle1.width - this.d.q());
    localRectangle1.y = (j + this.d.n());
    Rectangle localRectangle2 = new Rectangle(localRectangle1);
    localRectangle1.width -= this.d.q();
    Graphics2D localGraphics2D = (Graphics2D)paramGraphics;
    a(localGraphics2D, i, j, k, n, paramInt + 1);
    if (this.b == -1)
      this.b = (i1 % this.c);
    localRectangle2.height = (i1 - this.b);
    localRectangle2.width = (k - this.d.q());
    localRectangle2.x = i;
    paramGraphics.setClip(localRectangle2);
    if (!this.g)
    {
      this.a.setSize(localRectangle1.width, localRectangle1.height);
      this.g = true;
    }
    double d1 = paramInt * (i1 - this.b);
    if (this.d.j())
    {
      a(localGraphics2D, localRectangle1, localRectangle2, d1, paramInt);
    }
    else
    {
      if (this.d.a())
        a(localGraphics2D, i + this.d.p(), localRectangle2.height, localRectangle1, paramInt);
      localGraphics2D.translate(0.0D, -d1);
      this.a.paint(paramGraphics, localRectangle1);
    }
    paramGraphics.dispose();
    return 0;
  }

  private void a(Graphics2D paramGraphics2D, Rectangle paramRectangle1, Rectangle paramRectangle2, double paramDouble, int paramInt)
  {
    double d1 = this.a.getPreferredSpan(1);
    int i = this.d.k();
    int j = this.d.l();
    Rectangle localRectangle1 = new Rectangle(0, 0, 2147483647, (int)d1);
    try
    {
      Rectangle localRectangle2 = this.a.modelToView(i, Position.Bias.Forward, j, Position.Bias.Forward, localRectangle1).getBounds();
      int k = paramRectangle2.height;
      paramRectangle2.height = Math.min(paramRectangle2.height, localRectangle2.height - (int)paramDouble);
      paramGraphics2D.setClip(paramRectangle2);
      if (this.d.a())
        a(paramGraphics2D, (int)this.e.getImageableX() + this.d.p(), k, paramRectangle1, paramInt);
      paramGraphics2D.translate(0.0D, -paramDouble);
      paramRectangle1.translate(0, -localRectangle2.y);
      this.a.paint(paramGraphics2D, paramRectangle1);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  private void a(Graphics2D paramGraphics2D, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Rectangle localRectangle = new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4);
    Color localColor1 = paramGraphics2D.getColor();
    Color localColor2 = this.d.c() ? this.d.h() : Color.BLACK;
    paramGraphics2D.setColor(localColor2);
    int i = localRectangle.y + 8;
    int j = localRectangle.height + localRectangle.y - 2;
    Font localFont;
    String str;
    int k;
    if (this.d.d())
    {
      localRectangle.y += this.d.n() - 2;
      localRectangle.height -= this.d.n();
      localFont = cv.e().deriveFont(8.0F);
      paramGraphics2D.setFont(localFont);
      str = this.d.s();
      if (str == null)
        str = "Zend Studio";
      k = SwingUtilities.computeStringWidth(this.f.getFontMetrics(localFont), str);
      paramGraphics2D.drawString(str, localRectangle.width / 2 - k / 2 + localRectangle.x, i);
    }
    if (this.d.e())
    {
      localRectangle.height -= this.d.o();
      localFont = cv.e().deriveFont(2, 8.0F);
      paramGraphics2D.setFont(localFont);
      str = ct.a(1361) + String.valueOf(paramInt5);
      k = SwingUtilities.computeStringWidth(this.f.getFontMetrics(localFont), str);
      paramGraphics2D.drawString(str, localRectangle.width / 2 - k / 2 + localRectangle.x, j);
    }
    if (this.d.b())
      paramGraphics2D.draw(localRectangle);
    paramGraphics2D.setColor(localColor1);
  }

  private void a(Graphics2D paramGraphics2D, int paramInt1, int paramInt2, Rectangle paramRectangle, int paramInt3)
  {
    paramGraphics2D.setColor(new Color(250, 249, 249));
    int i = (int)this.e.getImageableX() + 1 + 1;
    int j = (int)this.e.getImageableY() + 1;
    int k = (int)this.e.getImageableHeight() - this.d.o() - 2;
    paramGraphics2D.fillRect(i, j, paramRectangle.x - i - 4, k - 2);
    paramGraphics2D.setColor(Color.black);
    Position.Bias[] arrayOfBias = new Position.Bias[1];
    int m = 0;
    if (this.d.j())
    {
      Rectangle localRectangle1 = new Rectangle(0, 0, 2147483647, (int)this.a.getPreferredSpan(1));
      try
      {
        m = this.a.modelToView(this.d.k(), localRectangle1, Position.Bias.Forward).getBounds().y;
      }
      catch (BadLocationException localBadLocationException)
      {
      }
    }
    m += paramInt3 * paramInt2;
    float f1 = this.a.viewToModel(0.0F, m, new Rectangle(0, 0, paramRectangle.width, (int)this.a.getPreferredSpan(1)), arrayOfBias);
    Element localElement1 = this.a.getElement();
    int n = localElement1.getElementIndex((int)f1);
    paramGraphics2D.setFont(this.f.getFont());
    Element localElement2 = localElement1.getElement(n);
    try
    {
      Rectangle localRectangle2 = this.a.modelToView(localElement2.getStartOffset(), paramRectangle, Position.Bias.Forward).getBounds();
      int i1 = localRectangle2.y - m;
      int i2 = i1 - m + this.c - 4;
      paramGraphics2D.drawString("" + (n + 1), paramInt1, i2 + m);
      n++;
      while ((localElement2 = localElement1.getElement(n)) != null)
      {
        localRectangle2 = this.a.modelToView(localElement2.getStartOffset(), paramRectangle, Position.Bias.Forward).getBounds();
        int i4 = localRectangle2.y - m;
        if (i4 - paramRectangle.y >= paramInt2)
          break;
        int i3;
        i2 += i4 - i1;
        i1 = i4;
        paramGraphics2D.drawString("" + (n + 1), paramInt1, i3 + m);
        n++;
      }
    }
    catch (Throwable localThrowable)
    {
    }
  }

  private int a(double paramDouble)
  {
    return (int)(paramDouble - (this.d.o() + this.d.n()));
  }

  private int b(double paramDouble)
  {
    if (this.d.a())
    {
      int i = this.a.getElement().getElementCount();
      FontMetrics localFontMetrics = this.f.getFontMetrics(this.f.getFont());
      return (int)(paramDouble - (this.d.q() + this.d.a(localFontMetrics, i)));
    }
    return (int)(paramDouble - (this.d.q() + this.d.p()));
  }

  public int getNumberOfPages()
  {
    if (this.h != -1)
      return this.h;
    int i = 1;
    double d1 = this.a.getPreferredSpan(1);
    int j = a(this.e.getImageableHeight());
    int k = j % this.c;
    if (this.d.j())
    {
      int m = this.d.k();
      int n = this.d.l();
      int i1 = (int)this.a.getPreferredSpan(0);
      Rectangle localRectangle1 = new Rectangle(0, 0, i1, (int)d1);
      try
      {
        Rectangle localRectangle2 = this.a.modelToView(m, Position.Bias.Forward, n, Position.Bias.Forward, localRectangle1).getBounds();
        if (j - k != 0)
          i = (int)Math.ceil(localRectangle2.getHeight() / (j - k));
      }
      catch (BadLocationException localBadLocationException)
      {
      }
    }
    else if (j - k != 0)
    {
      i = (int)Math.ceil(d1 / (j - k));
    }
    this.h = i;
    return i;
  }

  public PageFormat getPageFormat(int paramInt)
    throws IndexOutOfBoundsException
  {
    return this.e;
  }

  public Printable getPrintable(int paramInt)
    throws IndexOutOfBoundsException
  {
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kb
 * JD-Core Version:    0.6.0
 */