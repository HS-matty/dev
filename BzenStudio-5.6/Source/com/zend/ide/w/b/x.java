package com.zend.ide.w.b;

import java.awt.Rectangle;
import java.util.Comparator;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class x
{
  private Rectangle a;
  private int b = -1;
  private int c = -1;
  private int d;
  private boolean e;
  private boolean f;
  private static final Comparator g = new y();

  public x()
  {
    this.d = -1;
  }

  public x(int paramInt1, int paramInt2, Rectangle paramRectangle, int paramInt3)
  {
    a(paramInt1);
    b(paramInt2);
    a(paramRectangle);
    d(paramInt3);
  }

  public x(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, null, 0);
  }

  public void a(JTextComponent paramJTextComponent, Document paramDocument)
    throws BadLocationException
  {
    Rectangle localRectangle1 = paramJTextComponent.modelToView(i.b(paramDocument, this.b));
    Rectangle localRectangle2 = paramJTextComponent.modelToView(i.b(paramDocument, this.c));
    this.a = new Rectangle(localRectangle1.x, localRectangle1.y, localRectangle1.width, localRectangle2.y + localRectangle2.height - localRectangle1.y);
  }

  public Rectangle b()
  {
    if (this.a == null)
      throw new IllegalStateException("Unable to return a valid Rectangle before a call to generateAnchorRectangle()");
    return this.a;
  }

  public void a(Rectangle paramRectangle)
  {
    this.a = paramRectangle;
  }

  public int c()
  {
    return this.b;
  }

  public void a(int paramInt)
  {
    if ((paramInt < 0) || ((paramInt > d()) && (d() != -1)))
      throw new IllegalArgumentException("Anchor start line cannot be less then zero or greater then end line(" + paramInt + ")");
    this.b = paramInt;
  }

  public int d()
  {
    return this.c;
  }

  public void b(int paramInt)
  {
    if ((paramInt < 0) || ((paramInt < c()) && (c() != -1)))
      throw new IllegalArgumentException("Anchor end line cannot be less then zero or smaller then start line(" + paramInt + ")");
    this.c = paramInt;
  }

  public boolean e()
  {
    return this.e;
  }

  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public int c(int paramInt)
  {
    Rectangle localRectangle = b();
    if (localRectangle.contains(localRectangle.x, paramInt))
      return 0;
    return localRectangle.y - paramInt;
  }

  public int f()
  {
    return this.d;
  }

  public void d(int paramInt)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("Index cannot be negative (" + paramInt + ")");
    this.d = paramInt;
  }

  public static Comparator g()
  {
    return g;
  }

  public String toString()
  {
    String str = "[com.zend.ide.sourcecontrol.difftool.DiffScrollAnchor (Index::" + f() + ") - Lines: " + c() + " - " + d();
    if (this.a != null)
      str = str + ", " + this.a + "]";
    else
      str = str + ". Anchor rectangle unresolved.]";
    return str;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof x))
    {
      x localx = (x)paramObject;
      if ((this.a != null) && (localx.a != null))
        return localx.a.equals(this.a);
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.x
 * JD-Core Version:    0.6.0
 */