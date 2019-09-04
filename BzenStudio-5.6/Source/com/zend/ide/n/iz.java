package com.zend.ide.n;

import com.zend.ide.n.td.ec;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.lb;
import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ToolTipManager;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

class iz extends JPanel
  implements lb
{
  private static final Cursor a = Cursor.getPredefinedCursor(12);
  private ArrayList b;
  private ArrayList c;
  private dm d;

  public iz(dm paramdm)
  {
    this.d = paramdm;
    this.b = new ArrayList();
    this.c = new ArrayList();
    setLayout(null);
    setBorder(BorderFactory.createEtchedBorder(Color.white, Color.GRAY));
    setPreferredSize(new Dimension(13, 100));
    iw localiw = new iw(this);
    addMouseListener(localiw);
    addMouseMotionListener(localiw);
    ToolTipManager.sharedInstance().registerComponent(this);
  }

  public void a(is paramis)
  {
    synchronized (this.b)
    {
      ArrayList localArrayList = paramis.e() == 0 ? this.b : this.c;
      for (int i = localArrayList.size(); i > 0; i--)
      {
        is localis = (is)localArrayList.get(i - 1);
        if (paramis.c() <= localis.c())
          continue;
        localArrayList.add(i, paramis);
        break;
      }
      if (i == 0)
        localArrayList.add(0, paramis);
    }
    repaint();
  }

  public void b(is paramis)
  {
    synchronized (this.b)
    {
      ArrayList localArrayList = paramis.e() == 0 ? this.b : this.c;
      localArrayList.remove(paramis);
    }
    repaint();
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    int i = b();
    int j = this.d.p();
    JTextComponent localJTextComponent = this.d.e();
    Document localDocument = localJTextComponent.getDocument();
    int k = localDocument.getLength();
    Element localElement1 = localDocument.getDefaultRootElement();
    int m = i > localJTextComponent.getHeight() ? 1 : 0;
    synchronized (this.b)
    {
      try
      {
        Iterator localIterator = this.c.iterator();
        is localis;
        int n;
        while (localIterator.hasNext())
        {
          localis = (is)localIterator.next();
          if (localis.c() > k)
            continue;
          if (m != 0)
          {
            Element localElement2 = localElement1.getElement(localis.c());
            if (localElement2 == null)
              continue;
            int i2 = localElement2.getStartOffset();
            n = localJTextComponent.modelToView(i2).y;
          }
          else
          {
            n = (int)(localis.c() / j * i);
          }
          paramGraphics.setColor(localis.b());
          paramGraphics.fillRect(2, n, 9, 2);
        }
        localIterator = this.b.iterator();
        while (localIterator.hasNext())
        {
          localis = (is)localIterator.next();
          if (localis.c() > k)
            continue;
          if (m != 0)
          {
            n = localJTextComponent.modelToView(localis.c()).y;
          }
          else
          {
            int i1 = localElement1.getElementIndex(localis.c());
            n = (int)(i1 / j * i);
          }
          paramGraphics.setColor(localis.b());
          paramGraphics.fillRect(2, n, 9, 2);
        }
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  private is a(int paramInt)
  {
    int i = b();
    int j = this.d.p();
    Element localElement = this.d.getDocument().getDefaultRootElement();
    int k = i > this.d.e().getHeight() ? 1 : 0;
    synchronized (this.b)
    {
      try
      {
        Iterator localIterator = this.c.iterator();
        is localis;
        int n;
        int m;
        while (localIterator.hasNext())
        {
          localis = (is)localIterator.next();
          if (k != 0)
          {
            n = localElement.getElement(localis.c()).getStartOffset();
            m = this.d.e().modelToView(n).y;
          }
          else
          {
            m = (int)(localis.c() / j * i);
          }
          if (paramInt < m - 1)
            break;
          if (paramInt <= m + 1)
            return localis;
        }
        localIterator = this.b.iterator();
        while (localIterator.hasNext())
        {
          localis = (is)localIterator.next();
          if (k != 0)
          {
            m = this.d.e().modelToView(localis.c()).y;
          }
          else
          {
            n = localElement.getElementIndex(localis.c());
            m = (int)(n / j * i);
          }
          if (paramInt < m - 1)
            break;
          if (paramInt <= m + 1)
            return localis;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  private int b()
  {
    int i = getHeight();
    JScrollPane localJScrollPane = this.d.o();
    JScrollBar localJScrollBar1 = localJScrollPane.getHorizontalScrollBar();
    if (localJScrollBar1.isVisible())
      i -= localJScrollBar1.getHeight();
    JScrollBar localJScrollBar2 = localJScrollPane.getVerticalScrollBar();
    if ((localJScrollBar2.isVisible()) && (localJScrollBar2.getComponentCount() > 2))
      i -= localJScrollBar2.getComponent(1).getHeight();
    return i;
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    String str = null;
    is localis = a(paramMouseEvent.getY());
    if (localis != null)
      str = localis.d();
    return str;
  }

  public void a(ec paramec)
  {
  }

  public void b(ec paramec)
  {
  }

  public void c(ec paramec)
  {
    gb localgb = paramec.a();
    if ((localgb != null) && (localgb.c()))
      repaint();
  }

  public void a(ec paramec, boolean paramBoolean)
  {
    repaint();
  }

  public void d(ec paramec)
  {
    repaint();
  }

  public void e(ec paramec)
  {
    repaint();
  }

  public void f(ec paramec)
  {
    repaint();
  }

  public void g(ec paramec)
  {
    repaint();
  }

  public void h(ec paramec)
  {
    repaint();
  }

  static Cursor c()
  {
    return a;
  }

  static is a(iz paramiz, int paramInt)
  {
    return paramiz.a(paramInt);
  }

  static dm b(iz paramiz)
  {
    return paramiz.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.iz
 * JD-Core Version:    0.6.0
 */