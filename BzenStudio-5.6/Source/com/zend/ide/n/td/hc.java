package com.zend.ide.n.td;

import com.zend.ide.n.bw;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class hc extends JWindow
{
  private static int a = 500;
  private fc b;
  private gc c;
  private JPanel d;
  private Timer e;
  private int f;
  private int g;
  private int h;
  private bw i;
  private Point j;
  private static int k = Toolkit.getDefaultToolkit().getScreenSize().height;
  private Border l = BorderFactory.createMatteBorder(1, 0, 1, 1, Color.DARK_GRAY);

  public hc()
  {
    a();
  }

  private void a()
  {
    this.d = new JPanel();
    setLayout(new BorderLayout());
    this.d.setLayout(new BorderLayout());
    this.c = new gc();
    JScrollPane localJScrollPane = new JScrollPane(this.c);
    localJScrollPane.setVerticalScrollBarPolicy(21);
    localJScrollPane.setHorizontalScrollBarPolicy(31);
    localJScrollPane.setBorder(BorderFactory.createEmptyBorder());
    this.d.add(localJScrollPane);
    add(this.d, "Center");
    this.d.setBorder(this.l);
    this.e = new Timer(a, new ub(this, null));
    this.e.stop();
  }

  public void a(bw parambw, int paramInt1, int paramInt2, Point paramPoint, int paramInt3)
    throws BadLocationException
  {
    if (isVisible())
      return;
    this.e.stop();
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramInt3;
    this.j = paramPoint;
    this.i = parambw;
    this.e.start();
  }

  private void b(bw parambw, int paramInt1, int paramInt2, Point paramPoint, int paramInt3)
    throws BadLocationException
  {
    this.e.stop();
    setLocationRelativeTo(parambw.c());
    setLocation(paramPoint);
    if (this.b != null)
      this.d.remove(this.b);
    Document localDocument = parambw.getDocument();
    Element localElement = localDocument.getDefaultRootElement();
    if (this.c.getDocument() != localDocument)
      this.c.setDocument(localDocument);
    this.b = new fc(this.c);
    this.b.a(paramInt1, paramInt2);
    this.d.add(this.b, "West");
    JTextComponent localJTextComponent = parambw.e();
    this.c.setSize(localJTextComponent.getSize());
    int m = localElement.getElement(paramInt1).getStartOffset();
    int n = Math.min(localDocument.getLength(), localElement.getElement(paramInt2).getEndOffset());
    Rectangle localRectangle1 = this.c.modelToView(m);
    Rectangle localRectangle2 = this.c.modelToView(n);
    int i1;
    if (this.c.getLineWrap())
    {
      i1 = localElement.getElementCount();
      if (paramInt2 < i1)
      {
        int i2 = this.c.viewToModel(new Point(localRectangle2.x, localRectangle2.height / 2 + (localRectangle2.y + localRectangle2.height)));
        int i3 = localElement.getElementIndex(i2);
        if (i3 == paramInt2 + 1)
        {
          int i4 = localElement.getElement(i3).getStartOffset();
          if (i4 < n)
          {
            paramInt2++;
            n = Math.min(localElement.getElement(paramInt2).getEndOffset(), localDocument.getLength());
            localRectangle2 = this.c.modelToView(n);
          }
        }
      }
    }
    if ((localRectangle1 != null) && (localRectangle2 != null))
    {
      i1 = 0;
      if (n != localDocument.getLength())
        i1 = localRectangle2.y - localRectangle1.y;
      else
        i1 = localRectangle2.y + localRectangle2.height - localRectangle1.y;
      if (paramPoint.y + i1 > k)
        i1 -= paramPoint.y + i1 - k;
      if (paramInt1 == paramInt2)
        i1 += 2;
      setSize(localJTextComponent.getParent().getParent().getWidth(), i1);
      this.c.a(m);
      setVisible(true);
    }
  }

  public void b()
  {
    this.e.stop();
    if (!isVisible())
      return;
    this.f = -1;
    this.g = -1;
    this.h = 0;
    this.i = null;
    this.j = null;
    setVisible(false);
  }

  static bw a(hc paramhc)
  {
    return paramhc.i;
  }

  static int b(hc paramhc)
  {
    return paramhc.f;
  }

  static int c(hc paramhc)
  {
    return paramhc.g;
  }

  static Point d(hc paramhc)
  {
    return paramhc.j;
  }

  static int e(hc paramhc)
  {
    return paramhc.h;
  }

  static void a(hc paramhc, bw parambw, int paramInt1, int paramInt2, Point paramPoint, int paramInt3)
    throws BadLocationException
  {
    paramhc.b(parambw, paramInt1, paramInt2, paramPoint, paramInt3);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.hc
 * JD-Core Version:    0.6.0
 */