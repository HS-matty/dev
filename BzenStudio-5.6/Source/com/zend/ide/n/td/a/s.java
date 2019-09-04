package com.zend.ide.n.td.a;

import C;
import com.zend.ide.n.gx;
import com.zend.ide.n.td.ec;
import com.zend.ide.n.td.fb;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import com.zend.ide.n.td.lb;
import com.zend.ide.n.td.ob;
import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ComponentListener;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.event.DocumentEvent.EventType;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.Position.Bias;
import javax.swing.text.Segment;
import javax.swing.text.TabExpander;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

public class s extends View
  implements TabExpander, lb
{
  private static final boolean a = System.getProperty("debugMode") != null;
  private static final Color b = new Color(235, 235, 235);
  private static k c = new k();
  private jb d;
  private boolean e;
  private boolean f;
  private View g;
  private Object h = new Object();
  private a i;
  private int j;
  private j k;
  private boolean l = true;
  protected FontMetrics m;
  ArrayList n = new ArrayList();
  int o;
  Font p;
  int q;
  int r;
  int s;
  int t;
  Color u;
  Color v;
  int w;

  public s(Element paramElement)
  {
    super(paramElement);
    try
    {
      k();
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  private void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
    g();
    if (!this.f)
      h();
  }

  public boolean a()
  {
    return this.f;
  }

  public boolean b()
  {
    return this.e;
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.e = paramBoolean2;
    b(paramBoolean1);
  }

  public boolean c()
  {
    return (c.b()) && (this.l);
  }

  public int d()
  {
    return c.a();
  }

  public View getParent()
  {
    return this.g;
  }

  public void a(gx paramgx)
  {
    boolean bool1 = paramgx.getLineWrap();
    if (paramgx.a() != null)
      a(paramgx.a());
    if (bool1)
    {
      Dimension localDimension = paramgx.getSize();
      Insets localInsets = paramgx.getInsets();
      this.j = (localDimension.width - localInsets.left - localInsets.right);
      this.m = paramgx.getFontMetrics(paramgx.getFont());
      boolean bool2 = paramgx.getWrapStyleWord();
      a(true, bool2);
    }
    else
    {
      this.m = paramgx.getFontMetrics(paramgx.getFont());
      g();
    }
    if (paramgx != null)
      SwingUtilities.invokeLater(new c(this, paramgx));
    this.l = paramgx.a();
  }

  public void setParent(View paramView)
  {
    super.setParent(paramView);
    if (paramView != null)
      this.g = paramView;
  }

  protected int e()
  {
    Integer localInteger = (Integer)getDocument().getProperty("tabSize");
    int i1 = localInteger != null ? localInteger.intValue() : 8;
    return i1;
  }

  protected int a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Iterator paramIterator)
    throws BadLocationException
  {
    paramGraphics.setColor(this.u);
    int i1 = paramInt1;
    int i2 = paramInt3;
    int i3 = paramInt4;
    int i4 = 0;
    int i5 = -1;
    if (paramIterator.hasNext())
    {
      while (paramIterator.hasNext())
      {
        gb localgb = (gb)paramIterator.next();
        int i6 = localgb.d();
        int i7 = localgb.e();
        if (i6 == i7)
        {
          i1 = a(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
          continue;
        }
        if (i6 == i3)
          if (paramIterator.hasNext())
          {
            localgb = (gb)paramIterator.next();
            i6 = localgb.d();
            i7 = localgb.e();
            if (i6 == i7)
            {
              i1 = a(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
              break;
            }
          }
          else
          {
            i1 = a(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
            break;
          }
        i7++;
        if (i7 > i5)
        {
          i5 = i7;
          if ((i6 < i3) && (i6 >= i2))
            paramInt4 = i6;
          i1 = a(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
          ob localob = localgb.i();
          Segment localSegment = o.b();
          localSegment.array = localob.b();
          localSegment.count = localob.c();
          localSegment.offset = 0;
          localSegment.first();
          Color localColor = paramGraphics.getColor();
          Font localFont = null;
          paramGraphics.setColor(localob.e());
          if (localob.a() != null)
          {
            paramGraphics.setFont(localob.a());
            localFont = paramGraphics.getFont();
          }
          i1 = i.a(this, localSegment, i1, paramInt2, paramGraphics, this, paramInt4);
          o.a(localSegment);
          paramGraphics.setColor(localColor);
          if (localob.a() != null)
            paramGraphics.setFont(localFont);
          i4 = i3 - i7;
          if (i7 >= i3)
            break;
          paramInt3 = localgb.e() + 1;
        }
      }
      if (i4 > 0)
        i1 = a(paramGraphics, i1, paramInt2, i3 - i4, i3 - i4 + i4);
    }
    else
    {
      i1 = a(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
    }
    return i1;
  }

  protected int a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws BadLocationException
  {
    paramGraphics.setColor(this.u);
    Document localDocument = getDocument();
    Segment localSegment = o.b();
    localDocument.getText(paramInt3, paramInt4 - paramInt3, localSegment);
    int i1 = i.a(this, localSegment, paramInt1, paramInt2, paramGraphics, this, paramInt3);
    o.a(localSegment);
    return i1;
  }

  protected int b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Iterator paramIterator)
    throws BadLocationException
  {
    paramGraphics.setColor(this.v);
    int i1 = paramInt1;
    int i2 = paramInt3;
    int i3 = paramInt4;
    int i4 = 0;
    int i5 = -1;
    if (paramIterator.hasNext())
    {
      while (paramIterator.hasNext())
      {
        gb localgb = (gb)paramIterator.next();
        int i6 = localgb.d();
        if (i6 == i3)
          if (paramIterator.hasNext())
          {
            localgb = (gb)paramIterator.next();
            i6 = localgb.d();
          }
          else
          {
            i1 = b(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
            break;
          }
        int i7 = localgb.e() + 1;
        if (i7 > i5)
        {
          i5 = i7;
          if ((i6 < i3) && (i6 >= i2))
            paramInt4 = i6;
          i1 = b(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
          ob localob = localgb.i();
          Segment localSegment = o.b();
          localSegment.array = localob.b();
          localSegment.count = localob.c();
          localSegment.offset = 0;
          localSegment.first();
          i1 = i.a(this, localSegment, i1, paramInt2, paramGraphics, this, paramInt4);
          o.a(localSegment);
          i4 = i3 - i7;
          if (i7 >= i3)
            break;
          paramInt3 = localgb.e() + 1;
        }
      }
      if (i4 > 0)
        i1 = b(paramGraphics, i1, paramInt2, i3 - i4, i3 - i4 + i4);
    }
    else
    {
      i1 = b(paramGraphics, i1, paramInt2, paramInt3, paramInt4);
    }
    return i1;
  }

  protected int b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws BadLocationException
  {
    paramGraphics.setColor(this.v);
    Document localDocument = getDocument();
    Segment localSegment = o.b();
    localDocument.getText(paramInt3, paramInt4 - paramInt3, localSegment);
    int i1 = i.a(this, localSegment, paramInt1, paramInt2, paramGraphics, this, paramInt3);
    o.a(localSegment);
    return i1;
  }

  protected void f()
  {
    Container localContainer = getContainer();
    if (localContainer != null)
    {
      Font localFont = localContainer.getFont();
      if (this.p != localFont)
      {
        this.p = localFont;
        this.m = localContainer.getFontMetrics(this.p);
        h();
        if (this.m != null)
          this.q = (e() * this.m.charWidth('m'));
      }
    }
  }

  public float getPreferredSpan(int paramInt)
  {
    f();
    switch (paramInt)
    {
    case 0:
      if (a())
        return l();
      return a(this.n);
    case 1:
      return this.k.b() * this.m.getHeight();
    }
    throw new IllegalArgumentException("Invalid axis: " + paramInt);
  }

  public void paint(Graphics paramGraphics, Shape paramShape)
  {
    Shape localShape = paramShape;
    paramShape = a(paramShape);
    Rectangle localRectangle1 = (Rectangle)paramShape;
    this.r = localRectangle1.x;
    JTextComponent localJTextComponent = (JTextComponent)getContainer();
    Highlighter localHighlighter = localJTextComponent.getHighlighter();
    paramGraphics.setFont(localJTextComponent.getFont());
    this.s = localJTextComponent.getSelectionStart();
    this.t = localJTextComponent.getSelectionEnd();
    this.u = (localJTextComponent.isEnabled() ? localJTextComponent.getForeground() : localJTextComponent.getDisabledTextColor());
    Caret localCaret = localJTextComponent.getCaret();
    this.v = ((localCaret.isSelectionVisible()) && (localHighlighter != null) ? localJTextComponent.getSelectedTextColor() : this.u);
    f();
    Rectangle localRectangle2 = paramGraphics.getClipBounds();
    int i1 = this.m.getHeight();
    int i2 = localRectangle1.y + localRectangle1.height - (localRectangle2.y + localRectangle2.height);
    int i3 = Math.max(0, i2 / i1);
    int i4 = localRectangle2.y - localRectangle1.y;
    int i5 = Math.max(0, i4 / i1);
    int i6 = localRectangle1.height / i1;
    if (localRectangle1.height % i1 != 0)
      i6++;
    Rectangle localRectangle3 = a(paramShape, i5);
    int i7 = localRectangle3.y + this.m.getAscent();
    int i8 = localRectangle3.x;
    int i9 = this.k.b();
    int i10 = Math.min(i9, i6 - i3);
    i9--;
    Object localObject = (localHighlighter instanceof LayeredHighlighter) ? (LayeredHighlighter)localHighlighter : null;
    for (int i11 = i5; i11 < i10; i11++)
    {
      e locale = this.k.b(i11);
      if (localObject != null)
        if (i11 == i9)
        {
          localObject.paintLayeredHighlights(paramGraphics, locale.a(), locale.b(), localShape, localJTextComponent, this);
        }
        else
        {
          int i12 = locale.b() - 1;
          if ((i11 + 1 < this.k.b()) && (this.k.b(i11 + 1).c() == locale.c()))
            i12++;
          localObject.paintLayeredHighlights(paramGraphics, locale.a(), i12, localShape, localJTextComponent, this);
        }
      if (c())
      {
        Color localColor = paramGraphics.getColor();
        paramGraphics.setColor(b);
        int i13 = this.m.charWidth('m') * d();
        paramGraphics.drawLine(i13, localRectangle1.y, i13, localRectangle1.y + localRectangle1.height);
        paramGraphics.setColor(localColor);
      }
      a(i11, locale.a(), locale.b(), paramGraphics, i8, i7);
      i7 += i1;
      if (i11 != 0)
        continue;
      i8 -= this.w;
    }
  }

  private int a(int paramInt1, int paramInt2, int paramInt3, Graphics paramGraphics, int paramInt4, int paramInt5)
  {
    try
    {
      paramInt3 = Math.min(getDocument().getLength(), paramInt3);
      if (paramInt1 == 0)
        paramInt4 += this.w;
      Iterator localIterator = null;
      if ((this.s == this.t) || (this.v == this.u))
      {
        localIterator = i().a(paramInt2, paramInt3);
        paramInt4 = a(paramGraphics, paramInt4, paramInt5, paramInt2, paramInt3, localIterator);
      }
      else if ((paramInt2 >= this.s) && (paramInt2 <= this.t) && (paramInt3 >= this.s) && (paramInt3 <= this.t))
      {
        localIterator = i().a(paramInt2, paramInt3);
        paramInt4 = b(paramGraphics, paramInt4, paramInt5, paramInt2, paramInt3, localIterator);
      }
      else if ((this.s >= paramInt2) && (this.s <= paramInt3))
      {
        gb localgb;
        if ((this.t >= paramInt2) && (this.t <= paramInt3))
        {
          localIterator = i().a(paramInt2, this.s);
          localgb = ((fb)localIterator).a();
          paramInt4 = a(paramGraphics, paramInt4, paramInt5, paramInt2, this.s, localIterator);
          localIterator = i().a(this.s, this.t);
          boolean bool2 = localIterator.hasNext();
          if (localgb != null)
          {
            int i2 = localgb.e();
            if (i2 > this.s)
              paramInt4 = b(paramGraphics, paramInt4, paramInt5, Math.min(i2 + 1, this.t), this.t, localIterator);
          }
          else
          {
            paramInt4 = b(paramGraphics, paramInt4, paramInt5, this.s, this.t, localIterator);
          }
          localIterator = i().a(this.t, paramInt3);
          if ((bool2) && (this.t > this.s) && (!localIterator.hasNext()))
            paramInt4 = a(paramGraphics, paramInt4, paramInt5, this.t + 1, paramInt3, localIterator);
          else
            paramInt4 = a(paramGraphics, paramInt4, paramInt5, this.t, paramInt3, localIterator);
        }
        else
        {
          localIterator = i().a(paramInt2, this.s);
          localgb = ((fb)localIterator).a();
          paramInt4 = a(paramGraphics, paramInt4, paramInt5, paramInt2, this.s, localIterator);
          localIterator = i().a(this.s, paramInt3);
          if (localgb != null)
          {
            int i1 = localgb.e();
            if (i1 > this.s)
              paramInt4 = b(paramGraphics, paramInt4, paramInt5, Math.min(i1 + 1, paramInt3), paramInt3, localIterator);
          }
          else
          {
            paramInt4 = b(paramGraphics, paramInt4, paramInt5, this.s, paramInt3, localIterator);
          }
        }
      }
      else if ((this.t >= paramInt2) && (this.t <= paramInt3))
      {
        localIterator = i().a(paramInt2, this.t);
        boolean bool1 = localIterator.hasNext();
        paramInt4 = b(paramGraphics, paramInt4, paramInt5, paramInt2, this.t, localIterator);
        localIterator = i().a(this.t, paramInt3);
        if ((bool1) && (this.t > this.s) && (!localIterator.hasNext()))
          paramInt4 = a(paramGraphics, paramInt4, paramInt5, this.t + 1, paramInt3, localIterator);
        else
          paramInt4 = a(paramGraphics, paramInt4, paramInt5, this.t, paramInt3, localIterator);
      }
      else
      {
        localIterator = i().a(paramInt2, paramInt3);
        paramInt4 = a(paramGraphics, paramInt4, paramInt5, paramInt2, paramInt3, localIterator);
      }
      return paramInt4;
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    throw new b("Can't render line: " + paramInt1);
  }

  Shape a(Shape paramShape)
  {
    return paramShape;
  }

  public int a(int paramInt)
  {
    return this.k.d(paramInt);
  }

  public int b(int paramInt)
  {
    if (paramInt >= this.k.b())
      return -1;
    return this.k.b(paramInt).c();
  }

  public int c(int paramInt)
  {
    return this.k.b(paramInt).b();
  }

  public Shape modelToView(int paramInt, Shape paramShape, Position.Bias paramBias)
    throws BadLocationException
  {
    Document localDocument = getDocument();
    Element localElement = getElement();
    int i1 = localElement.getElementIndex(paramInt);
    int i2 = paramShape.getBounds().y;
    Rectangle localRectangle = a(paramShape, i1);
    e locale1 = -1;
    int i3 = -1;
    int i4 = this.k.f(paramInt);
    e locale3;
    if (i4 > -1)
    {
      e locale2 = this.k.b(i4);
      locale1 = locale2.a();
      i3 = locale2.b();
      localRectangle.y = (this.m.getHeight() * i4);
      if (i4 > 0)
      {
        locale3 = this.k.b(i4 - 1);
        if ((locale3.c() == locale2.c()) && (paramBias == Position.Bias.Backward) && (locale3.b() == paramInt))
        {
          i4--;
          localRectangle.y = (this.m.getHeight() * i4);
          locale1 = locale3.a();
          i3 = locale3.b();
        }
      }
    }
    this.r = localRectangle.x;
    int i5 = 0;
    if ((locale1 > -1) && (i() != null))
    {
      locale3 = locale1;
      int i6 = i3;
      int i7 = paramInt - locale3;
      Iterator localIterator = i().a(locale3, i6);
      int i8;
      if (localIterator.hasNext())
      {
        i8 = 0;
        Object localObject;
        while (localIterator.hasNext())
        {
          gb localgb = (gb)localIterator.next();
          localObject = localgb.e() + 1;
          if ((localgb.d() < paramInt) && (localObject > i8))
          {
            i8 = localObject;
            Segment localSegment2 = o.b();
            localDocument.getText(locale3, localgb.d() - locale3, localSegment2);
            i5 += i.a(localSegment2, this.m, this.r, this, locale3);
            o.a(localSegment2);
            i7 -= localObject - locale3;
            locale3 = localObject;
            char[] arrayOfChar = localgb.i().b();
            localSegment2 = o.b();
            localSegment2.array = arrayOfChar;
            if (arrayOfChar.length > 0)
            {
              localSegment2.count = arrayOfChar.length;
              localSegment2.offset = 0;
              localSegment2.first();
            }
            i5 += i.a(localSegment2, this.m, this.r, this, locale3);
            o.a(localSegment2);
          }
        }
        if (i7 > 0)
        {
          int i9 = localDocument.getLength();
          if (i7 > i9)
            i7 = i9;
          localObject = o.b();
          localDocument.getText(locale3, i7, (Segment)localObject);
          i5 += i.a((Segment)localObject, this.m, this.r, this, locale3);
          o.a((Segment)localObject);
        }
      }
      else if ((i7 > 0) && (localDocument.getLength() > 0))
      {
        i8 = localDocument.getLength();
        if (i7 > i8)
          i7 = i8;
        Segment localSegment1 = o.b();
        localDocument.getText(locale3, i7, localSegment1);
        i5 = i.a(localSegment1, this.m, this.r, this, locale3);
        o.a(localSegment1);
      }
    }
    localRectangle.y += i2;
    localRectangle.x += i5;
    localRectangle.width = 1;
    localRectangle.height = this.m.getHeight();
    return (Shape)localRectangle;
  }

  public int viewToModel(float paramFloat1, float paramFloat2, Shape paramShape, Position.Bias[] paramArrayOfBias)
  {
    paramArrayOfBias[0] = Position.Bias.Forward;
    Rectangle localRectangle = paramShape.getBounds();
    Document localDocument = getDocument();
    int i1 = (int)paramFloat1;
    int i2 = (int)paramFloat2;
    if (i2 < localRectangle.y)
    {
      i3 = getStartOffset();
      return i3;
    }
    if (i2 > localRectangle.y + localRectangle.height)
    {
      i3 = getEndOffset() - 1;
      return i3;
    }
    int i3 = Math.abs((i2 - localRectangle.y) / this.m.getHeight());
    if (i3 >= this.k.b())
    {
      int i4 = getEndOffset() - 1;
      return i4;
    }
    e locale = this.k.b(i3);
    if (i3 == 0)
    {
      localRectangle.x += this.w;
      localRectangle.width -= this.w;
    }
    int i5;
    if (i1 < localRectangle.x)
    {
      i5 = locale.a();
      return i5;
    }
    int i6;
    if (i1 > localRectangle.x + localRectangle.width)
    {
      i5 = 1;
      if (i3 + 1 < this.k.b())
        i5 = this.k.b(i3 + 1).c() - this.k.b(i3).c();
      i6 = locale.b() - i5;
      return i6;
    }
    try
    {
      i5 = locale.a();
      i6 = locale.b() - 1;
      if ((i3 + 1 < this.k.b()) && (this.k.b(i3 + 1).c() == locale.c()))
        i6++;
      Segment localSegment = o.b();
      localDocument.getText(i5, i6 - i5, localSegment);
      this.r = localRectangle.x;
      int i7 = i5 + i.a(localSegment, this.m, this.r, i1, this, i5);
      o.a(localSegment);
      Iterator localIterator = i().a(i5, i6);
      while (localIterator.hasNext())
      {
        gb localgb = (gb)localIterator.next();
        int i8 = localgb.d();
        if (i8 < i7)
        {
          int i9 = localgb.e() + 1;
          int i10 = localgb.i().c();
          int i11 = i7 - i8 <= i10 / 2 ? 1 : 0;
          i7 = i7 + localgb.h() - i10;
          if ((i7 > i8) && (i7 <= i9))
            if (i11 != 0)
              i7 = i8;
            else
              i7 = i9;
        }
      }
      i7 = Math.min(i7, i6);
      return i7;
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return -1;
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory)
  {
    if (a())
      try
      {
        a(paramDocumentEvent);
        getContainer().repaint();
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    else
      a(paramDocumentEvent, paramShape, paramViewFactory);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory)
  {
    if (a())
      try
      {
        a(paramDocumentEvent);
        getContainer().repaint();
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    else
      a(paramDocumentEvent, paramShape, paramViewFactory);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory)
  {
    if (a())
      try
      {
        a(paramDocumentEvent);
        getContainer().repaint();
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    else
      a(paramDocumentEvent, paramShape, paramViewFactory);
  }

  public void setSize(float paramFloat1, float paramFloat2)
  {
    super.setSize(paramFloat1, paramFloat2);
    f();
  }

  public float nextTabStop(float paramFloat, int paramInt)
  {
    if (this.q == 0)
      return paramFloat;
    int i1 = ((int)paramFloat - this.r) / this.q;
    return this.r + (i1 + 1) * this.q;
  }

  public int getNextVisualPositionFrom(int paramInt1, Position.Bias paramBias, Shape paramShape, int paramInt2, Position.Bias[] paramArrayOfBias)
    throws BadLocationException
  {
    paramArrayOfBias[0] = Position.Bias.Forward;
    Object localObject1;
    switch (paramInt2)
    {
    case 1:
    case 5:
      if (paramInt1 == -1)
      {
        paramInt1 = paramInt2 == 1 ? Math.max(0, getEndOffset() - 1) : getStartOffset();
      }
      else
      {
        localObject1 = (JTextComponent)getContainer();
        Object localObject2 = localObject1 != null ? ((JTextComponent)localObject1).getCaret() : null;
        Point localPoint;
        if (localObject2 != null)
          localPoint = localObject2.getMagicCaretPosition();
        else
          localPoint = null;
        int i1;
        if (localPoint == null)
        {
          localObject3 = ((JTextComponent)localObject1).modelToView(paramInt1);
          i1 = localObject3 == null ? 0 : ((Rectangle)localObject3).x;
        }
        else
        {
          i1 = localPoint.x;
        }
        if (paramInt2 == 1)
          paramInt1 = i.a((JTextComponent)localObject1, paramInt1, i1);
        else
          paramInt1 = i.b((JTextComponent)localObject1, paramInt1, i1);
        Object localObject3 = i().a(paramInt1);
        if ((localObject3 != null) && (((gb)localObject3).c()) && (paramInt1 > ((gb)localObject3).d()) && (paramInt1 <= ((gb)localObject3).e() + 1))
          if (paramInt2 == 1)
            paramInt1 = ((gb)localObject3).d();
          else
            paramInt1 = ((gb)localObject3).e() + 1;
      }
      break;
    case 7:
      if (paramInt1 == -1)
      {
        paramInt1 = Math.max(0, getEndOffset() - 1);
      }
      else
      {
        localObject1 = i().a(paramInt1 - 1);
        if ((localObject1 != null) && (((gb)localObject1).c()) && (paramInt1 > ((gb)localObject1).d()) && (paramInt1 <= ((gb)localObject1).e() + 1))
          paramInt1 = ((gb)localObject1).d();
        else
          paramInt1 = Math.max(0, paramInt1 - 1);
      }
      break;
    case 3:
      if (paramInt1 == -1)
      {
        paramInt1 = getStartOffset();
      }
      else
      {
        localObject1 = i().a(paramInt1);
        if ((localObject1 != null) && (((gb)localObject1).c()) && (paramInt1 + 1 > ((gb)localObject1).d()) && (paramInt1 <= ((gb)localObject1).e()))
          paramInt1 = ((gb)localObject1).e() + 1;
        else
          paramInt1 = Math.min(paramInt1 + 1, getDocument().getLength());
      }
      break;
    case 2:
    case 4:
    case 6:
    default:
      throw new IllegalArgumentException("Bad direction: " + paramInt2);
    }
    return paramInt1;
  }

  public int getStartOffset()
  {
    if (this.k.b() > 0)
      return this.k.b(0).a();
    return super.getStartOffset();
  }

  public int getEndOffset()
  {
    if (this.k.b() > 0)
      return this.k.b(this.k.b() - 1).b();
    return super.getEndOffset();
  }

  public void g()
  {
    try
    {
      a(getStartOffset(), getEndOffset(), true);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  protected void a(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory)
  {
    Container localContainer = getContainer();
    f();
    Element localElement1 = getElement();
    DocumentEvent.ElementChange localElementChange = paramDocumentEvent.getChange(localElement1);
    Object localObject1 = localElementChange != null ? localElementChange.getChildrenAdded() : null;
    Object localObject2 = localElementChange != null ? localElementChange.getChildrenRemoved() : null;
    try
    {
      a(paramDocumentEvent);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    int i2;
    int i3;
    if (((localObject1 != null) && (localObject1.length > 0)) || ((localObject2 != null) && (localObject2.length > 0)))
    {
      int i1;
      if (localObject1 != null)
      {
        i1 = a(this.n);
        for (i2 = 0; i2 < localObject1.length; i2++)
        {
          i3 = b(localObject1[i2].getStartOffset(), localObject1[i2].getEndOffset());
          if (i3 <= i1)
            continue;
          i1 = i3;
          this.n.clear();
          this.n.add(localObject1[i2]);
        }
      }
      if (localObject2 != null)
        for (i1 = 0; i1 < localObject2.length; i1++)
        {
          if (!this.n.contains(localObject2[i1]))
            continue;
          h();
          break;
        }
      preferenceChanged(null, true, true);
      localContainer.repaint();
    }
    else
    {
      Element localElement2 = getElement();
      i2 = localElement2.getElementIndex(paramDocumentEvent.getOffset());
      a(i2, i2, paramShape, localContainer);
      if (paramDocumentEvent.getType() == DocumentEvent.EventType.INSERT)
      {
        i3 = a(this.n);
        Element localElement3 = localElement2.getElement(i2);
        if (this.n.contains(localElement3))
        {
          preferenceChanged(null, true, false);
        }
        else if (b(localElement3.getStartOffset(), localElement3.getEndOffset()) > i3)
        {
          this.n.clear();
          this.n.add(localElement3);
          preferenceChanged(null, true, false);
        }
      }
      else if ((paramDocumentEvent.getType() == DocumentEvent.EventType.REMOVE) && (this.n.contains(localElement2.getElement(i2))))
      {
        h();
        preferenceChanged(null, true, false);
      }
    }
  }

  protected void a(int paramInt1, int paramInt2, Shape paramShape, Component paramComponent)
  {
    if (paramShape != null)
    {
      Rectangle localRectangle1 = a(paramShape, paramInt1);
      Rectangle localRectangle2 = a(paramShape, paramInt2);
      if ((localRectangle1 != null) && (localRectangle2 != null))
      {
        Rectangle localRectangle3 = localRectangle1.union(localRectangle2);
        paramComponent.repaint(localRectangle3.x, localRectangle3.y, localRectangle3.width, localRectangle3.height);
      }
      else
      {
        paramComponent.repaint();
      }
    }
  }

  protected Rectangle a(Shape paramShape, int paramInt)
  {
    Rectangle localRectangle1 = null;
    f();
    if (this.m != null)
    {
      Rectangle localRectangle2 = paramShape.getBounds();
      if (paramInt == 0)
      {
        localRectangle2.x += this.w;
        localRectangle2.width -= this.w;
      }
      localRectangle1 = new Rectangle(localRectangle2.x, localRectangle2.y + paramInt * this.m.getHeight(), localRectangle2.width, this.m.getHeight());
    }
    return localRectangle1;
  }

  private void h()
  {
    if (a())
      return;
    Element localElement1 = getElement();
    this.n.clear();
    if (this.k.b() == 0)
    {
      Element localElement2 = localElement1.getElement(0);
      this.n.add(localElement2);
      return;
    }
    this.o = -1;
    for (int i1 = 0; i1 < this.k.b(); i1++)
    {
      e locale = this.k.b(i1);
      int i2 = locale.c();
      int i3 = i2;
      if (i1 + 1 < this.k.b())
        i3 = this.k.b(i1 + 1).c() - 1;
      int i4 = locale.a();
      int i5 = b(i4, locale.b());
      if (i5 <= this.o)
        continue;
      this.n.clear();
      this.o = i5;
      for (int i6 = i2; i6 <= i3; i6++)
        this.n.add(localElement1.getElement(i6));
    }
  }

  private d a(int paramInt1, int paramInt2)
  {
    d locald = new d(null);
    ArrayList localArrayList = new ArrayList();
    Element localElement1 = getElement();
    if (this.k.b() == 0)
    {
      Element localElement2 = localElement1.getElement(0);
      localArrayList.add(localElement2);
      locald.a = localArrayList;
      locald.b = b(localElement2.getStartOffset(), localElement2.getEndOffset());
      return locald;
    }
    int i1 = -1;
    int i2 = localElement1.getElementIndex(paramInt1);
    int i3 = localElement1.getElementIndex(paramInt2);
    int i4 = this.k.d(i2);
    int i5 = this.k.d(i3);
    for (int i6 = i4; i6 <= i5; i6++)
    {
      e locale = this.k.b(i6);
      int i7 = locale.c();
      int i8 = i7;
      if (i6 + 1 < i5)
        i8 = this.k.b(i6 + 1).c() - 1;
      int i9 = locale.a();
      int i10 = b(i9, locale.b());
      if (i10 <= i1)
        continue;
      localArrayList.clear();
      i1 = i10;
      for (int i11 = i7; i11 <= i8; i11++)
        localArrayList.add(localElement1.getElement(i11));
    }
    locald.a = localArrayList;
    locald.b = i1;
    return locald;
  }

  private int a(ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 0)
      return 0;
    return b(((Element)paramArrayList.get(0)).getStartOffset(), ((Element)paramArrayList.get(paramArrayList.size() - 1)).getEndOffset());
  }

  private int b(int paramInt1, int paramInt2)
  {
    Document localDocument = getDocument();
    int i1 = paramInt2 - paramInt1;
    int i2 = 0;
    try
    {
      jb localjb = i();
      if (localjb == null)
        return i2;
      Iterator localIterator = localjb.a(paramInt1, paramInt2);
      Object localObject;
      if (localIterator.hasNext())
      {
        while (localIterator.hasNext())
        {
          localObject = (gb)localIterator.next();
          if (((gb)localObject).c())
          {
            Segment localSegment = o.b();
            localDocument.getText(paramInt1, ((gb)localObject).d() - paramInt1, localSegment);
            i2 += i.a(localSegment, this.m, this.r, this, paramInt1);
            o.a(localSegment);
            i1 -= ((gb)localObject).e() + 1 - paramInt1;
            paramInt1 = ((gb)localObject).e() + 1;
            char[] arrayOfChar = ((gb)localObject).i().b();
            localSegment = o.b();
            localSegment.array = arrayOfChar;
            if (arrayOfChar.length > 0)
            {
              localSegment.count = arrayOfChar.length;
              localSegment.offset = 0;
              localSegment.first();
            }
            i2 += i.a(localSegment, this.m, this.r, this, paramInt1);
            o.a(localSegment);
          }
        }
        if (i1 > 0)
        {
          localObject = o.b();
          localDocument.getText(paramInt1, i1, (Segment)localObject);
          i2 += i.a((Segment)localObject, this.m, this.r, this, paramInt1);
          o.a((Segment)localObject);
        }
      }
      else
      {
        localObject = o.b();
        localDocument.getText(paramInt1, i1, (Segment)localObject);
        i2 = i.a((Segment)localObject, this.m, this.r, this, paramInt1);
        o.a((Segment)localObject);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      i2 = 0;
    }
    return i2;
  }

  private jb i()
  {
    if (this.d == null)
    {
      Container localContainer1 = getContainer();
      if ((localContainer1 != null) && ((localContainer1 instanceof hb)))
      {
        this.d = ((hb)localContainer1).a();
        if (this.d != null)
          this.d.a(this);
      }
      Container localContainer2 = getContainer();
      if ((localContainer2 != null) && (localContainer2.getParent() != null))
        localContainer2 = localContainer2.getParent();
      if (localContainer2 != null)
        localContainer2.addComponentListener(m());
    }
    return this.d;
  }

  public jb j()
  {
    return this.d;
  }

  public void a(jb paramjb)
  {
    synchronized (this.h)
    {
      if (this.d != null)
        this.d.b(this);
      this.d = paramjb;
      if (this.d != null)
        this.d.a(this);
    }
  }

  private void k()
    throws BadLocationException
  {
    Element localElement1 = getElement();
    if ((this.k != null) && (this.k.b() > 0))
      for (i1 = 0; i1 < this.k.b(); i1++)
        g.a(this.k.b(i1));
    if (this.k == null)
      this.k = new j(localElement1);
    else
      this.k.c();
    int i1 = localElement1.getElementCount() - 1;
    ArrayList localArrayList = a(0, i1, 0, localElement1.getEndOffset(), localElement1);
    e[] arrayOfe = null;
    if (localArrayList != null)
    {
      arrayOfe = new e[localArrayList.size()];
      localArrayList.toArray(arrayOfe);
    }
    else
    {
      int i2 = localElement1.getElementCount();
      Document localDocument2 = getDocument();
      arrayOfe = new e[i2];
      for (int i3 = 0; i3 < i2; i3++)
      {
        Element localElement2 = localElement1.getElement(i3);
        e locale = g.b();
        locale.a(i3);
        locale.a(localDocument2.createPosition(localElement2.getStartOffset()));
        locale.b(localDocument2.createPosition(localElement2.getEndOffset()));
        arrayOfe[i3] = locale;
      }
    }
    this.k.a(0, 0, arrayOfe, arrayOfe.length);
    if (this.k.b() == 0)
    {
      Document localDocument1 = getDocument();
      this.k.a(new e(localDocument1.createPosition(0), localDocument1.createPosition(1), 0));
    }
  }

  private void a(DocumentEvent paramDocumentEvent)
    throws BadLocationException
  {
    if (paramDocumentEvent.getType() == DocumentEvent.EventType.CHANGE)
      return;
    int i1 = paramDocumentEvent.getOffset();
    Element localElement = getElement();
    DocumentEvent.ElementChange localElementChange = paramDocumentEvent.getChange(localElement);
    int i2 = this.k.b();
    int i3;
    int i4;
    int i5;
    int i8;
    int i9;
    Object localObject;
    if (localElementChange == null)
    {
      if (!a())
        if (paramDocumentEvent.getType() == DocumentEvent.EventType.INSERT)
        {
          String str = paramDocumentEvent.getClass().getSimpleName();
          if ((str.length() != 21) || (!str.equals("UndoRedoDocumentEvent")))
            return;
        }
        else
        {
          return;
        }
      i3 = localElement.getElementIndex(i1);
      i4 = this.k.d(i3);
      i5 = this.k.e(i4);
      e locale = this.k.b(i4);
      int i7 = locale.a();
      i8 = locale.b();
      i9 = localElement.getElementIndex(i7);
      ArrayList localArrayList1 = a(i9, i3, i7, i8, localElement);
      localObject = null;
      if (localArrayList1 != null)
      {
        localObject = new e[localArrayList1.size()];
        localArrayList1.toArray(localObject);
      }
      else
      {
        localObject = new e[0];
      }
      this.k.a(i4, i5 - i4 + 1, localObject, localObject.length);
    }
    else
    {
      i3 = localElementChange.getIndex();
      i4 = i3 == 0 ? 1 : 0;
      if (i4 == 0)
        i3--;
      i5 = 0;
      int i6 = 0;
      if (this.k.b() > 0)
      {
        i5 = this.k.d(i3);
        arrayOfElement = localElementChange.getChildrenRemoved();
        i8 = i3 + arrayOfElement.length;
        if (i4 != 0)
          i8--;
        i9 = this.k.d(i8);
        i6 = this.k.e(i9);
      }
      Element[] arrayOfElement = localElementChange.getChildrenAdded();
      i8 = arrayOfElement[0].getStartOffset();
      i9 = arrayOfElement[(arrayOfElement.length - 1)].getEndOffset();
      int i10 = localElement.getElementIndex(i8);
      if ((i4 == 0) && (i10 > 0))
      {
        i10--;
        localObject = localElement.getElement(i10);
        i8 = ((Element)localObject).getStartOffset();
      }
      int i11 = localElement.getElementIndex(i9 - 1);
      gb localgb = i().a(i8);
      if (localgb != null)
      {
        int i12 = localgb.d();
        i10 = localElement.getElementIndex(i12);
        i8 = localElement.getElement(i10).getStartOffset();
        i5 = this.k.d(i10);
      }
      ArrayList localArrayList2 = a(i10, i11, i8, i9, localElement);
      e[] arrayOfe = null;
      if (localArrayList2 != null)
      {
        arrayOfe = new e[localArrayList2.size()];
        localArrayList2.toArray(arrayOfe);
      }
      else
      {
        arrayOfe = new e[0];
      }
      if (this.k.b() > 0)
        this.k.a(i5, i6 - i5 + 1, arrayOfe, arrayOfe.length);
      else
        this.k.a(0, 0, arrayOfe, arrayOfe.length);
    }
    f();
    if (a())
    {
      if (i2 != this.k.b())
        preferenceChanged(null, true, false);
    }
    else if (i2 == this.k.b())
      preferenceChanged(null, true, true);
    else
      preferenceChanged(null, true, false);
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
    throws BadLocationException
  {
    Element localElement = getElement();
    int i1 = this.k.b();
    int i2 = localElement.getElementIndex(paramInt1);
    int i3 = localElement.getElementIndex(paramInt2);
    int i4 = localElement.getElement(i2).getStartOffset();
    int i5 = localElement.getElement(i3).getEndOffset();
    ArrayList localArrayList = a(i2, i3, i4, i5, localElement);
    e[] arrayOfe = null;
    if (localArrayList != null)
    {
      arrayOfe = new e[localArrayList.size()];
      localArrayList.toArray(arrayOfe);
    }
    else
    {
      arrayOfe = new e[0];
    }
    int i6 = this.k.d(i2);
    int i7 = this.k.d(i3);
    if ((!paramBoolean) && (i7 > 0) && (i7 > i6))
      i7--;
    if ((i6 < 0) || (i7 < 0))
    {
      if (a)
        System.out.println("Folding mapper index is -1: Ignoring foldsChanged");
      return;
    }
    int i8 = this.k.e(i7);
    this.k.a(i6, i8 - i6 + 1, arrayOfe, arrayOfe.length);
    int i9 = i6 + arrayOfe.length - 1;
    if ((i9 > 0) && (i9 + 1 < this.k.b()))
    {
      e locale1 = this.k.b(i9);
      e locale2 = this.k.b(i9 + 1);
      if ((locale1.c() >= locale2.c()) || (locale1.b() > locale2.a()))
        this.k.c(i9 + 1);
    }
    f();
    int i10 = 0;
    int i11 = 0;
    if (this.n.size() > 0)
    {
      i10 = ((Element)this.n.get(0)).getStartOffset();
      i11 = ((Element)this.n.get(this.n.size() - 1)).getEndOffset();
    }
    if (!a())
    {
      if (paramBoolean)
      {
        if (((i10 >= paramInt1) && (i10 <= paramInt2)) || ((i11 >= paramInt2) && (i11 <= paramInt2)))
          h();
      }
      else
      {
        d locald = a(paramInt1, paramInt2);
        if (locald.b > this.o)
        {
          this.n = locald.a;
          this.o = locald.b;
        }
      }
      if (i1 == this.k.b())
        preferenceChanged(null, true, true);
      else
        preferenceChanged(null, true, false);
    }
    else if (i1 != this.k.b())
    {
      preferenceChanged(null, true, false);
    }
  }

  private ArrayList a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Element paramElement)
    throws BadLocationException
  {
    jb localjb = i();
    Document localDocument = getDocument();
    ArrayList localArrayList = new ArrayList(Math.max(0, paramInt2 - paramInt1 + 1));
    if (localjb == null)
    {
      localArrayList.add(new e(localDocument.createPosition(paramInt3), localDocument.createPosition(paramInt4), paramInt1));
      return localArrayList;
    }
    Iterator localIterator = localjb.a(paramInt3, paramInt4);
    Object localObject = null;
    List localList = localjb.b(paramInt3);
    if ((localList != null) && (localList.size() > 0))
      for (i1 = 0; i1 < localList.size(); i1++)
      {
        gb localgb1 = (gb)localList.get(i1);
        i3 = localgb1.d();
        if ((!localgb1.c()) || (i3 > paramInt3) || (localgb1.e() <= paramInt3))
          continue;
        localObject = localgb1;
        paramInt3 = i3;
        paramInt1 = paramElement.getElementIndex(i3);
        break;
      }
    int i1 = 0;
    int i2 = 0;
    int i3 = -1;
    for (int i4 = paramInt1; i4 <= paramInt2; i4++)
    {
      int i5 = i4;
      Element localElement = paramElement.getElement(i4);
      int i6 = localElement.getStartOffset();
      int i7 = localElement.getEndOffset();
      i1 = i6;
      i2 = i7;
      int i8;
      int i9;
      while ((localObject != null) || (localIterator.hasNext()))
      {
        if (localObject == null)
          do
            localObject = (gb)localIterator.next();
          while ((localIterator.hasNext()) && (((gb)localObject).e() < i3));
        i8 = ((gb)localObject).d();
        if ((i8 >= i7) || (i8 <= i3))
          break;
        i9 = ((gb)localObject).e() + 1;
        int i10 = paramElement.getElementIndex(i9 - 1);
        i3 = i9;
        if (i4 != i10)
        {
          i4 = i10;
          i7 = paramElement.getElement(i4).getEndOffset();
          i2 = i7;
        }
        localObject = null;
      }
      if (a())
      {
        for (i8 = i1; i8 < i2; i8 = i9 == i8 ? i2 : i9)
        {
          i9 = c(i8, i2);
          gb localgb2 = localjb.a(i9);
          if ((localgb2 != null) && (i9 > localgb2.d()) && (i9 <= localgb2.e()))
            i9 = localgb2.d();
          e locale2 = g.b();
          locale2.a(i5);
          locale2.a(localDocument.createPosition(i8));
          locale2.b(localDocument.createPosition(i9));
          localArrayList.add(locale2);
        }
      }
      else
      {
        e locale1 = g.b();
        locale1.a(i5);
        locale1.a(localDocument.createPosition(i1));
        locale1.b(localDocument.createPosition(i2));
        localArrayList.add(locale1);
      }
    }
    return (ArrayList)localArrayList;
  }

  protected int c(int paramInt1, int paramInt2)
  {
    Segment localSegment1 = o.b();
    int i1 = getDocument().getLength();
    Iterator localIterator = i().a(paramInt1, paramInt2);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList(5);
    int i2 = paramInt1;
    int i3 = 0;
    gb localgb1 = null;
    gb localgb2 = null;
    int i4 = -1;
    if (localIterator.hasNext())
    {
      while (localIterator.hasNext())
      {
        localgb1 = (gb)localIterator.next();
        localArrayList1.add(localgb1);
        int i5 = localgb1.e();
        if ((i5 > i4) && (i5 <= paramInt2))
        {
          i4 = i5;
          localgb2 = localgb1;
          Segment localSegment2 = o.b();
          localArrayList2.add(localSegment2);
          a(localSegment2, i2, localgb1.d());
          i2 = Math.min(i5 + 1, i1);
        }
      }
      Object localObject;
      if ((localgb2 != null) && (i4 + 1 < paramInt2))
      {
        localObject = o.b();
        localArrayList2.add(localObject);
        a((Segment)localObject, i4 + 1, paramInt2);
      }
      if (localArrayList2.size() > 0)
      {
        localObject = q.a(localArrayList2, localgb2.i().b());
        for (i7 = 0; i7 < localArrayList2.size(); i7++)
          o.a((Segment)localArrayList2.get(i7));
        localSegment1.array = ((C)localObject);
        if (localObject.length > 0)
        {
          localSegment1.count = localObject.length;
          localSegment1.offset = 0;
          localSegment1.first();
        }
      }
    }
    else
    {
      a(localSegment1, paramInt1, paramInt2);
    }
    if ((paramInt2 - paramInt1 > 0) && (localSegment1.count == 0))
      a(localSegment1, paramInt1, paramInt2);
    int i7 = l();
    int i6;
    if (i7 + this.r > 0)
    {
      if (b())
        i6 = paramInt1 + i.b(localSegment1, this.m, this.r, this.r + i7, this, paramInt1);
      else
        i6 = paramInt1 + i.a(localSegment1, this.m, this.r, this.r + i7, this, paramInt1, false);
    }
    else
      i6 = paramInt2;
    o.a(localSegment1);
    i4 = -1;
    if (localArrayList1.size() > 0)
      for (int i8 = 0; i8 < localArrayList1.size(); i8++)
      {
        gb localgb3 = (gb)localArrayList1.get(i8);
        int i9 = localgb3.g();
        if ((i9 <= i4) || (i6 < localgb3.f()))
          continue;
        i4 = i9;
        i3 += localgb3.h() - localgb3.i().c();
      }
    return i6 + i3;
  }

  private void a(Segment paramSegment, int paramInt1, int paramInt2)
  {
    try
    {
      Document localDocument = getDocument();
      localDocument.getText(paramInt1, paramInt2 - paramInt1, paramSegment);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a("Error loading text: p0 = " + paramInt1 + ", p1 = " + paramInt2);
      cl.a(localBadLocationException);
    }
  }

  public int l()
  {
    Container localContainer = getContainer();
    if (localContainer == null)
      return this.j;
    if (localContainer.getParent() != null)
      localContainer = localContainer.getParent();
    Dimension localDimension = localContainer.getSize();
    Insets localInsets = localContainer.getInsets();
    int i1 = localDimension.width - localInsets.left - localInsets.right;
    if (i1 > 0)
      this.j = i1;
    return this.j;
  }

  public ComponentListener m()
  {
    synchronized (this.h)
    {
      if (this.i == null)
        this.i = new a(this, null);
    }
    return this.i;
  }

  public void a(ec paramec)
  {
    try
    {
      gb localgb = paramec.a();
      if (localgb.c())
        a(localgb.d(), localgb.e(), true);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void b(ec paramec)
  {
    try
    {
      ArrayList localArrayList = a(paramec.b());
      gb localgb1 = null;
      gb localgb2 = null;
      if (localArrayList.size() > 0)
      {
        localgb1 = (gb)localArrayList.get(0);
        localgb2 = (gb)localArrayList.get(localArrayList.size() - 1);
      }
      if ((localgb1 != null) && (localgb2 != null))
      {
        int i1 = localgb2.e();
        int i2 = localgb1.e();
        if (i2 > i1)
          i1 = i2;
        a(localgb1.d(), i1, true);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void c(ec paramec)
  {
    try
    {
      gb localgb = paramec.a();
      if (localgb.c())
        a(localgb.d(), localgb.e(), false);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void a(ec paramec, boolean paramBoolean)
  {
    try
    {
      ArrayList localArrayList = a(paramec.b());
      gb localgb1 = null;
      gb localgb2 = null;
      if (localArrayList.size() > 0)
      {
        localgb1 = (gb)localArrayList.get(0);
        localgb2 = (gb)localArrayList.get(localArrayList.size() - 1);
      }
      if (paramBoolean)
      {
        if ((!paramec.b().isEmpty()) && (localArrayList.isEmpty()))
          return;
        a(getStartOffset(), getEndOffset(), false);
      }
      else if ((localgb1 != null) && (localgb2 != null))
      {
        int i1 = localgb2.e();
        int i2 = localgb1.e();
        if (i2 > i1)
          i1 = i2;
        a(localgb1.d(), i1, false);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void d(ec paramec)
  {
    try
    {
      gb localgb = paramec.a();
      a(localgb.d(), localgb.e(), false);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void e(ec paramec)
  {
    try
    {
      gb localgb = paramec.a();
      a(localgb.d(), localgb.e(), true);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void f(ec paramec)
  {
    try
    {
      ArrayList localArrayList = a(paramec.b());
      gb localgb1 = null;
      gb localgb2 = null;
      if (localArrayList.size() > 0)
      {
        localgb1 = (gb)localArrayList.get(0);
        localgb2 = (gb)localArrayList.get(localArrayList.size() - 1);
      }
      if ((localgb1 != null) && (localgb2 != null))
      {
        int i1 = localgb2.e();
        int i2 = localgb1.e();
        if (i2 > i1)
          i1 = i2;
        int i3 = localgb1.d();
        List localList = j().b(i1);
        if (localList != null)
          for (int i4 = 0; i4 < localList.size() - 1; i4++)
          {
            gb localgb3 = (gb)localList.get(i4);
            if (!localArrayList.contains(localgb3))
              continue;
            i1 = localgb3.g();
          }
        a(i3, i1, true);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void g(ec paramec)
  {
    try
    {
      gb localgb1 = j().f();
      gb localgb2 = j().g();
      if ((localgb1 != null) && (localgb2 != null))
      {
        int i1 = localgb2.e();
        int i2 = localgb1.e();
        if (i2 > i1)
          i1 = i2;
        a(localgb1.d(), i1, true);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void h(ec paramec)
  {
    try
    {
      ArrayList localArrayList = a(paramec.b());
      gb localgb1 = null;
      gb localgb2 = null;
      if (localArrayList.size() > 0)
      {
        localgb1 = (gb)localArrayList.get(0);
        localgb2 = (gb)localArrayList.get(localArrayList.size() - 1);
      }
      if ((localgb1 != null) && (localgb2 != null))
      {
        int i1 = localgb2.e();
        int i2 = localgb1.e();
        if (i2 > i1)
          i1 = i2;
        a(localgb1.d(), i1, false);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  private ArrayList a(List paramList)
  {
    if (paramList == null)
      return new ArrayList(0);
    ArrayList localArrayList = new ArrayList(paramList.size());
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      gb localgb = (gb)paramList.get(i1);
      if (!localgb.c())
        continue;
      localArrayList.add(localgb);
    }
    return localArrayList;
  }

  static void a(s params)
    throws BadLocationException
  {
    params.k();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.s
 * JD-Core Version:    0.6.0
 */