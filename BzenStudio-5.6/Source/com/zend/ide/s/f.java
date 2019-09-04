package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.p.bi;
import com.zend.ide.p.e.b;
import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public abstract class f
  implements x
{
  protected bi a = new bi();
  private Border b = new EmptyBorder(1, 1, 1, 1);
  protected Font c;
  protected int d;

  public f()
  {
    this.a.setOpaque(true);
    this.a.setBorder(this.b);
    this.a.setComponentOrientation(ComponentOrientation.UNKNOWN);
    Font localFont = cr.b();
    this.a.setFont(localFont);
    this.c = localFont.deriveFont(0x1 | localFont.getStyle());
  }

  public Component a(z paramz, d paramd, JList paramJList, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramBoolean1)
    {
      this.a.setBackground(b.b);
      this.a.setForeground(Color.white);
    }
    else
    {
      this.a.setBackground(paramJList.getBackground());
      this.a.setForeground(paramJList.getForeground());
    }
    this.a.setBorder(paramBoolean2 ? UIManager.getBorder("List.focusCellHighlightBorder") : this.b);
    int i = -1;
    if (paramInt1 > 0)
    {
      int j = paramInt1 - this.a.b();
      FontMetrics localFontMetrics = this.a.getFontMetrics(paramJList.getFont());
      i = j / localFontMetrics.charWidth('m');
    }
    if (i < -1)
    {
      StringBuffer localStringBuffer = new StringBuffer("Unexpected exception at PHPCodeDataSerializerVisitor:");
      localStringBuffer.append("totalChars: " + i);
      localStringBuffer.append("maxLength: " + paramInt1);
      cl.a(localStringBuffer.toString());
      i = -1;
    }
    this.a.a("");
    this.d = ((bd)paramz).o();
    a(paramd, i, paramBoolean1);
    return this.a;
  }

  protected abstract void a(d paramd, int paramInt, boolean paramBoolean);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.f
 * JD-Core Version:    0.6.0
 */