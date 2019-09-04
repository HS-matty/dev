package com.zend.ide.n.td.a;

import com.zend.ide.n.bd;
import com.zend.ide.n.cw;
import com.zend.ide.n.gx;
import com.zend.ide.n.gz;
import com.zend.ide.n.hk;
import com.zend.ide.n.hl;
import com.zend.ide.n.kc;
import com.zend.ide.n.ob;
import com.zend.ide.p.br;
import com.zend.ide.s.bk;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.text.AbstractDocument.AbstractElement;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;
import javax.swing.text.Utilities;

public class t extends s
{
  private bk x;
  private transient Segment y = new Segment();
  private transient Segment z = new Segment();

  public t(Element paramElement)
  {
    super(paramElement);
  }

  protected int b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws BadLocationException
  {
    return super.b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected int a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws BadLocationException
  {
    gx localgx = (gx)getContainer();
    hl localhl = localgx.w();
    ob localob = null;
    if ((getContainer() instanceof gz))
      localob = ((gz)getContainer()).a();
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (localob != null)
    {
      i = localob.a();
      j = localob.b();
      k = j - i;
      localObject1 = localgx.modelToView(i);
      localObject2 = localgx.modelToView(j);
      if (((Rectangle)localObject1).y < ((Rectangle)localObject2).y)
        m = -1;
      else
        m = ((Rectangle)localObject2).x - ((Rectangle)localObject1).x;
    }
    Object localObject1 = getDocument();
    Object localObject2 = paramGraphics.getColor();
    int n = paramGraphics.getFont().getStyle();
    br.f.a(paramGraphics.getFont());
    AbstractDocument.AbstractElement localAbstractElement1 = (AbstractDocument.AbstractElement)((Document)localObject1).getDefaultRootElement();
    int i1 = localAbstractElement1.getElementIndex(paramInt3);
    AbstractDocument.AbstractElement localAbstractElement2 = (AbstractDocument.AbstractElement)localAbstractElement1.getChildAt(i1);
    int i2 = localAbstractElement2.getStartOffset();
    int i3 = localAbstractElement2.getEndOffset();
    int i4 = i3 - i2;
    int i5 = paramInt4 - paramInt3;
    int i6 = paramInt3 - i2;
    ((Document)localObject1).getText(i2, i4, this.y);
    Object localObject3 = ((cw)localAbstractElement2).b();
    if (localObject3 == null)
      return paramInt1;
    if (this.x == null)
      a();
    this.x.a(this.y);
    this.x.a(localObject3);
    int i7 = this.x.a(i6);
    int i9 = this.x.f() + i6;
    while ((i5 > 0) && (i7 != -1))
    {
      int i8 = this.x.e() - i9;
      this.x.a(i9, Math.min(i8, i5), this.z);
      bd localbd = localhl.a(i7);
      Color localColor1 = localbd.b();
      Color localColor2 = localbd.c();
      int i10 = localbd.e();
      boolean bool = localbd.f();
      int i11 = (localColor2 != null) && (localbd.d()) ? 1 : 0;
      int i12 = 0;
      if ((i11 != 0) || (bool) || (m == -1) || (i8 < k))
      {
        i12 = Utilities.getTabbedTextWidth(this.z, paramGraphics.getFontMetrics(), paramInt1, this, paramInt3);
        if (i11 != 0)
        {
          paramGraphics.setColor(localColor2);
          localObject2 = localColor2;
          int i13 = paramGraphics.getFontMetrics().getHeight();
          Rectangle localRectangle = localgx.modelToView(paramInt3);
          if (localRectangle != null)
            paramGraphics.fillRect(paramInt1, localRectangle.y, i12, i13);
        }
      }
      if (localColor1 != localObject2)
      {
        paramGraphics.setColor(localColor1);
        localObject2 = localColor1;
      }
      if (i10 != n)
      {
        paramGraphics.setFont(br.f.a(i10));
        n = i10;
      }
      if (bool)
        paramGraphics.drawLine(paramInt1, paramInt2 + 1, paramInt1 + i12, paramInt2 + 1);
      if ((localob != null) && (j > paramInt3) && (i < paramInt3 + i8))
      {
        if (m == -1)
          m = i12;
        if (i > paramInt3)
          paramInt1 = a(paramInt1, paramInt2, paramGraphics, paramInt3, i - paramInt3);
        paramGraphics.setColor(Color.BLUE);
        if (k > i8)
          paramGraphics.drawLine(paramInt1, paramInt2 + 1, paramInt1 + i12, paramInt2 + 1);
        else
          paramGraphics.drawLine(paramInt1, paramInt2 + 1, paramInt1 + m, paramInt2 + 1);
        if (paramInt4 < j)
        {
          paramInt1 = a(paramInt1, paramInt2, paramGraphics, paramInt3, paramInt4 - i);
        }
        else
        {
          paramInt1 = a(paramInt1, paramInt2, paramGraphics, paramInt3, j - Math.max(paramInt3, i), i8);
          paramGraphics.setColor((Color)localObject2);
          paramInt1 = a(paramInt1, paramInt2, paramGraphics, paramInt3, paramInt3 + i8 - j);
        }
      }
      else
      {
        paramInt1 = Utilities.drawTabbedText(this.z, paramInt1, paramInt2, paramGraphics, this, paramInt3);
      }
      paramInt3 += i8;
      i9 += i8;
      i5 = paramInt4 - paramInt3;
      i7 = this.x.s();
    }
    return paramInt1;
  }

  private int a(int paramInt1, int paramInt2, Graphics paramGraphics, int paramInt3, int paramInt4, int paramInt5)
  {
    this.z.count = Math.min(paramInt4, paramInt5);
    int i = Utilities.drawTabbedText(this.z, paramInt1, paramInt2, paramGraphics, this, paramInt3);
    this.z.offset += this.z.count;
    return i;
  }

  private int a(int paramInt1, int paramInt2, Graphics paramGraphics, int paramInt3, int paramInt4)
  {
    this.z.count = paramInt4;
    int i = Utilities.drawTabbedText(this.z, paramInt1, paramInt2, paramGraphics, this, paramInt3);
    this.z.offset += this.z.count;
    return i;
  }

  public void a()
  {
    this.x = kc.b(getDocument());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.t
 * JD-Core Version:    0.6.0
 */