package com.zend.ide.n;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentListener;
import javax.swing.event.SwingPropertyChangeSupport;

public class ek extends ej
  implements bx, PropertyChangeListener, DocumentListener, CaretListener, cq, MouseListener, KeyListener
{
  private SwingPropertyChangeSupport d;
  private List e;
  private List f;
  private List i;
  private List g;
  private xb h = new xb();
  private gr j;

  public ek(bw parambw)
  {
    super(parambw);
    this.j = new gr(parambw);
  }

  public void b(bw parambw)
  {
    super.b(parambw);
    parambw.a(this);
    parambw.addCaretListener(this);
    parambw.addMouseListener(this);
    parambw.a(this);
    parambw.addKeyListener(this);
    parambw.a(this.h);
  }

  public void a(bw parambw)
  {
    super.c(parambw);
    parambw.b(this);
    parambw.removeCaretListener(this);
    parambw.removeMouseListener(this);
    parambw.b(this);
    parambw.removeKeyListener(this);
    parambw.b(this.h);
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (this.d != null)
      this.d.firePropertyChange(paramPropertyChangeEvent.getPropertyName(), paramPropertyChangeEvent.getOldValue(), paramPropertyChangeEvent.getNewValue());
  }

  public void a(PropertyChangeListener paramPropertyChangeListener)
  {
    if (this.d == null)
      this.d = new SwingPropertyChangeSupport(this.a);
    this.d.addPropertyChangeListener(paramPropertyChangeListener);
  }

  public void b(PropertyChangeListener paramPropertyChangeListener)
  {
    if (this.d == null)
      this.d = new SwingPropertyChangeSupport(this.a);
    this.d.removePropertyChangeListener(paramPropertyChangeListener);
  }

  public void a(CaretListener paramCaretListener)
  {
    if (this.e == null)
      this.e = new ArrayList(2);
    if (!this.e.contains(paramCaretListener))
      this.e.add(paramCaretListener);
  }

  public void b(CaretListener paramCaretListener)
  {
    if (this.e != null)
      this.e.remove(paramCaretListener);
  }

  public void caretUpdate(CaretEvent paramCaretEvent)
  {
    gr.a(this.j, paramCaretEvent);
    a(this.j, this.e);
  }

  public void a(KeyListener paramKeyListener)
  {
    if (this.i == null)
      this.i = new ArrayList(2);
    if (!this.i.contains(paramKeyListener))
      this.i.add(paramKeyListener);
  }

  public void b(KeyListener paramKeyListener)
  {
    if (this.i != null)
      this.i.remove(paramKeyListener);
  }

  public void keyTyped(KeyEvent paramKeyEvent)
  {
    if (this.i != null)
      synchronized (this.i)
      {
        int k = this.i.size();
        for (int m = 0; m < k; m++)
        {
          KeyListener localKeyListener = (KeyListener)this.i.get(m);
          localKeyListener.keyTyped(paramKeyEvent);
        }
      }
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (this.i != null)
      synchronized (this.i)
      {
        int k = this.i.size();
        for (int m = 0; m < k; m++)
        {
          KeyListener localKeyListener = (KeyListener)this.i.get(m);
          localKeyListener.keyPressed(paramKeyEvent);
        }
      }
  }

  public void keyReleased(KeyEvent paramKeyEvent)
  {
    if (this.i != null)
      synchronized (this.i)
      {
        int k = this.i.size();
        for (int m = 0; m < k; m++)
        {
          KeyListener localKeyListener = (KeyListener)this.i.get(m);
          localKeyListener.keyReleased(paramKeyEvent);
        }
      }
  }

  public void a(MouseListener paramMouseListener)
  {
    if (this.f == null)
      this.f = new ArrayList(2);
    if (!this.f.contains(paramMouseListener))
      this.f.add(paramMouseListener);
  }

  public void b(MouseListener paramMouseListener)
  {
    if (this.f != null)
      this.f.remove(paramMouseListener);
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (this.f != null)
      synchronized (this.f)
      {
        int k = this.f.size();
        for (int m = 0; m < k; m++)
        {
          MouseListener localMouseListener = (MouseListener)this.f.get(m);
          localMouseListener.mouseClicked(new i(((bw)this.a).c(), paramMouseEvent));
        }
      }
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (this.f != null)
      synchronized (this.f)
      {
        int k = this.f.size();
        for (int m = 0; m < k; m++)
        {
          MouseListener localMouseListener = (MouseListener)this.f.get(m);
          localMouseListener.mousePressed(new i(((bw)this.a).c(), paramMouseEvent));
        }
      }
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    if (this.f != null)
      synchronized (this.f)
      {
        int k = this.f.size();
        for (int m = 0; m < k; m++)
        {
          MouseListener localMouseListener = (MouseListener)this.f.get(m);
          localMouseListener.mouseReleased(new i(((bw)this.a).c(), paramMouseEvent));
        }
      }
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    if (this.f != null)
      synchronized (this.f)
      {
        int k = this.f.size();
        for (int m = 0; m < k; m++)
        {
          MouseListener localMouseListener = (MouseListener)this.f.get(m);
          localMouseListener.mouseEntered(new i(((bw)this.a).c(), paramMouseEvent));
        }
      }
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    if (this.f != null)
      synchronized (this.f)
      {
        int k = this.f.size();
        for (int m = 0; m < k; m++)
        {
          MouseListener localMouseListener = (MouseListener)this.f.get(m);
          localMouseListener.mouseExited(new i(((bw)this.a).c(), paramMouseEvent));
        }
      }
  }

  public void a(cq paramcq)
  {
    if (this.g == null)
      this.g = new ArrayList(2);
    if (!this.g.contains(paramcq))
      this.g.add(paramcq);
  }

  public void b(cq paramcq)
  {
    if (this.g != null)
      this.g.remove(paramcq);
  }

  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(paramInt1, paramInt2, this.g, paramBoolean);
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    if (paramBoolean)
      paramBoolean = ((bw)this.a).a(paramdz.k()) == null;
    a(paramdz, paramBoolean, this.c);
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    if (paramBoolean)
      paramBoolean = ((bw)this.a).c(paramdz.k()).length == 1;
    b(paramdz, paramBoolean, this.c);
  }

  public void a(dz paramdz)
  {
    a(paramdz, this.c);
  }

  public void a(boolean paramBoolean)
  {
  }

  public void b(boolean paramBoolean)
  {
    a(paramBoolean, this.c);
  }

  public void a(el paramel)
  {
    this.h.a(paramel);
  }

  public void b(el paramel)
  {
    this.h.b(paramel);
  }

  protected static final void a(CaretEvent paramCaretEvent, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int k = paramList.size();
        for (int m = 0; m < k; m++)
        {
          CaretListener localCaretListener = (CaretListener)paramList.get(m);
          localCaretListener.caretUpdate(paramCaretEvent);
        }
      }
  }

  protected static final void a(int paramInt1, int paramInt2, List paramList, boolean paramBoolean)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int k = paramList.size();
        for (int m = 0; m < k; m++)
        {
          cq localcq = (cq)paramList.get(m);
          localcq.a(paramInt1, paramInt2, paramBoolean);
        }
      }
  }

  protected static final void a(dz paramdz, boolean paramBoolean, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int k = paramList.size();
        for (int m = 0; m < k; m++)
        {
          Object localObject1 = paramList.get(m);
          if (!(localObject1 instanceof KeyListener))
            continue;
          bx localbx = (KeyListener)localObject1;
          localbx.a(paramdz, paramBoolean);
        }
      }
  }

  protected static final void b(dz paramdz, boolean paramBoolean, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int k = paramList.size();
        for (int m = 0; m < k; m++)
        {
          Object localObject1 = paramList.get(m);
          if (!(localObject1 instanceof KeyListener))
            continue;
          bx localbx = (KeyListener)localObject1;
          localbx.b(paramdz, paramBoolean);
        }
      }
  }

  protected static final void a(dz paramdz, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int k = paramList.size();
        for (int m = 0; m < k; m++)
        {
          Object localObject1 = paramList.get(m);
          if (!(localObject1 instanceof KeyListener))
            continue;
          bx localbx = (KeyListener)localObject1;
          localbx.a(paramdz);
        }
      }
  }

  protected static final void a(boolean paramBoolean, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int k = paramList.size();
        for (int m = 0; m < k; m++)
        {
          Object localObject1 = paramList.get(m);
          if (!(localObject1 instanceof KeyListener))
            continue;
          bx localbx = (KeyListener)localObject1;
          localbx.a(paramBoolean);
        }
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ek
 * JD-Core Version:    0.6.0
 */