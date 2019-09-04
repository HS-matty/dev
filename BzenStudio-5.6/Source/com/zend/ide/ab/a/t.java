package com.zend.ide.ab.a;

import com.zend.ide.util.cr;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.IOException;
import java.util.Locale;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.border.Border;

class t extends JComponent
  implements MouseWheelListener
{
  private Font a;
  private long b;
  private Insets c = new Insets(0, 0, 0, 0);
  private int d = -1;
  private int e;
  private int f;
  private final char[] g = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
  final d h;

  public t(d paramd)
  {
    setFocusable(true);
    this.a = cr.b();
    if ((cr.c() == 1) && (Locale.getDefault().equals(Locale.JAPAN)))
      this.a = new Font("Courier New", 0, 12);
    a();
    addMouseWheelListener(this);
    addMouseListener(new b(this, null));
  }

  private void a()
  {
    j localj = new j(this, "Down");
    k localk = new k(this, "Up");
    l locall = new l(this, "Right");
    m localm = new m(this, "Left");
    n localn = new n(this, "PageDown");
    o localo = new o(this, "PageUp");
    p localp = new p(this, "PgDown");
    q localq = new q(this, "PgUp");
    ActionMap localActionMap = new ActionMap();
    localActionMap.setParent(getActionMap());
    ComponentInputMap localComponentInputMap = new ComponentInputMap(this);
    localComponentInputMap.setParent(getInputMap(2));
    a(localj, localActionMap, localComponentInputMap, 40);
    a(localk, localActionMap, localComponentInputMap, 38);
    a(locall, localActionMap, localComponentInputMap, 39);
    a(localm, localActionMap, localComponentInputMap, 37);
    a(localn, localActionMap, localComponentInputMap, 34);
    a(localo, localActionMap, localComponentInputMap, 33);
    a(localp, localActionMap, localComponentInputMap, 34, 128);
    a(localq, localActionMap, localComponentInputMap, 33, 128);
    setActionMap(localActionMap);
    setInputMap(2, localComponentInputMap);
  }

  private void a(long paramLong)
  {
    this.b = paramLong;
    d.b(this.h).setValue((int)(paramLong / 16L));
  }

  private void a(Action paramAction, ActionMap paramActionMap, InputMap paramInputMap, int paramInt1, int paramInt2)
  {
    paramActionMap.put(paramAction.getValue("Name"), paramAction);
    paramInputMap.put(KeyStroke.getKeyStroke(paramInt1, paramInt2), paramAction.getValue("Name"));
  }

  private void a(Action paramAction, ActionMap paramActionMap, InputMap paramInputMap, int paramInt)
  {
    a(paramAction, paramActionMap, paramInputMap, paramInt, 0);
  }

  private int b()
  {
    if (this.d == -1)
    {
      this.d = getGraphics().getFontMetrics(this.a).getHeight();
      this.e = getGraphics().getFontMetrics(this.a).charWidth('0');
      this.f = getGraphics().getFontMetrics(this.a).getAscent();
    }
    return this.d;
  }

  public int c()
  {
    getInsets(this.c);
    return (getHeight() - 2 - this.c.top - this.c.bottom) / b();
  }

  public void paintComponent(Graphics paramGraphics)
  {
    Dimension localDimension = getSize();
    int i = localDimension.width;
    int j = localDimension.height;
    getInsets(this.c);
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, i, j);
    Border localBorder = getBorder();
    if (localBorder != null)
      localBorder.paintBorder(this, paramGraphics, 0, 0, i, j);
    Color localColor = getForeground();
    paramGraphics.setFont(this.a);
    int k = c();
    try
    {
      d.c(this.h).a(this.b);
      for (int m = 0; m < k; m++)
      {
        long l = this.b + m * 16;
        if (l >= d.d(this.h))
          break;
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(this.g[a(l, 7)]);
        localStringBuffer.append(this.g[a(l, 6)]);
        localStringBuffer.append(this.g[a(l, 5)]);
        localStringBuffer.append(this.g[a(l, 4)]);
        localStringBuffer.append(this.g[a(l, 3)]);
        localStringBuffer.append(this.g[a(l, 2)]);
        localStringBuffer.append(this.g[a(l, 1)]);
        localStringBuffer.append(this.g[a(l, 0)]);
        localStringBuffer.append(":  ");
        int[] arrayOfInt = new int[16];
        for (int n = 0; n < 16; n++)
        {
          if (l + n < d.d(this.h))
          {
            i1 = d.c(this.h).b();
            localStringBuffer.append(this.g[(i1 >> 4)]).append(this.g[(i1 & 0xF)]);
            arrayOfInt[n] = i1;
          }
          else
          {
            localStringBuffer.append("  ");
          }
          localStringBuffer.append(" ");
        }
        localStringBuffer.append("  ");
        for (n = 0; n < 16; n++)
        {
          if (l + n >= d.d(this.h))
            continue;
          if ((arrayOfInt[n] >= 32) && (arrayOfInt[n] <= 255))
            localStringBuffer.append((char)arrayOfInt[n]);
          else
            localStringBuffer.append('.');
        }
        n = (int)(d.a(this.h) - l);
        int i1 = this.d * m + this.c.top + 2 - 1;
        for (int i2 = 0; i2 < d(); i2++)
          a(paramGraphics, n, i2, d.a(), i1);
        paramGraphics.setColor(localColor);
        paramGraphics.drawString(localStringBuffer.toString(), this.c.left + 2, this.f + this.d * m + this.c.top + 2);
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      return;
    }
  }

  private int d()
  {
    switch (d.d(this.h))
    {
    case 'b':
      return 1;
    case 's':
      return 2;
    case 'f':
    case 'i':
      return 4;
    case 'd':
    case 'l':
      return 8;
    case 'c':
    case 'e':
    case 'g':
    case 'h':
    case 'j':
    case 'k':
    case 'm':
    case 'n':
    case 'o':
    case 'p':
    case 'q':
    case 'r':
    }
    return 0;
  }

  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, Color paramColor, int paramInt3)
  {
    if ((d.a(this.h) + paramInt2 < d.d(this.h)) && (d.a(this.h) + paramInt2 < this.b + c() * 16) && (paramInt1 + paramInt2 >= 0) && (paramInt1 + paramInt2 < 16))
    {
      paramGraphics.setColor(paramColor);
      paramGraphics.fillRect(((paramInt1 + paramInt2) * 3 + 11) * this.e + this.c.left + 2 - 1, paramInt3, this.e * 2 + 2, this.d);
      paramGraphics.fillRect((paramInt1 + paramInt2 + 61) * this.e + this.c.left + 2, paramInt3, this.e, this.d);
    }
  }

  private byte a(long paramLong, int paramInt)
  {
    return (byte)(int)(paramLong >> paramInt * 4 & 0xF);
  }

  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent)
  {
    long l = 16L * paramMouseWheelEvent.getUnitsToScroll();
    if (l > 0L)
    {
      if (this.b + l < d.d(this.h))
      {
        a(this.b + l);
        repaint();
        d.b(this.h).restart();
      }
    }
    else if (this.b + l >= 0L)
    {
      a(this.b + l);
      repaint();
      d.b(this.h).restart();
    }
    else
    {
      a(0L);
      repaint();
    }
  }

  static void a(t paramt, long paramLong)
  {
    paramt.a(paramLong);
  }

  static long a(t paramt)
  {
    return paramt.b;
  }

  static int b(t paramt)
  {
    return paramt.d;
  }

  static Insets c(t paramt)
  {
    return paramt.c;
  }

  static int d(t paramt)
  {
    return paramt.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.t
 * JD-Core Version:    0.6.0
 */