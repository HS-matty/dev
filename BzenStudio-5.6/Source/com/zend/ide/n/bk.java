package com.zend.ide.n;

import com.zend.ide.util.cl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;

public class bk
  implements CaretListener, DocumentListener, HierarchyListener
{
  protected Color a = new Color(254, 255, 215);
  private boolean b;
  private PropertyChangeListener c = new bm(this, null);
  private PropertyChangeListener d = new bn(this, null);
  private e e;
  private gx f;
  private hm g;
  private int h = -1;
  private boolean i;
  private DefaultHighlighter j = new DefaultHighlighter();

  public bk(gx paramgx)
  {
    d();
    this.f = paramgx;
    paramgx.a(this.j, -5);
    if (this.b)
      e();
  }

  private void e()
  {
    if (this.f == null)
      return;
    b();
    this.f.a(this);
    this.f.getDocument().addDocumentListener(this);
    a(this.f.getCaretPosition());
    this.f.addHierarchyListener(this);
  }

  private void b()
  {
    if (this.f == null)
      return;
    this.f.b(this);
    this.f.getDocument().removeDocumentListener(this);
    this.j.removeAllHighlights();
    this.h = -1;
    this.f.removeHierarchyListener(this);
  }

  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent)
  {
    long l = paramHierarchyEvent.getChangeFlags();
    int k = (l & 0x4) != 0L ? 1 : 0;
    int m = (k != 0) && (this.f.isShowing()) ? 1 : 0;
    if (m != 0)
      SwingUtilities.invokeLater(new bl(this));
  }

  private void a(int paramInt)
  {
    if (!this.f.isShowing())
    {
      this.h = paramInt;
      this.i = true;
      return;
    }
    int k = 0;
    Rectangle localRectangle = null;
    try
    {
      localRectangle = this.f.modelToView(paramInt);
      if (localRectangle != null)
      {
        localRectangle.x = 0;
        k = this.f.viewToModel(localRectangle.getLocation());
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    if ((!this.i) && (k == this.h))
      return;
    this.i = false;
    this.h = k;
    c();
    if (localRectangle != null)
      this.f.repaint(localRectangle);
  }

  private void c()
  {
    this.j.removeAllHighlights();
    if (this.g == null)
      this.g = new hm(this, this.a);
    try
    {
      this.j.addHighlight(this.h, this.h + 1, this.g);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void caretUpdate(CaretEvent paramCaretEvent)
  {
    a(paramCaretEvent.getDot());
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    int k = paramDocumentEvent.getOffset();
    if ((k == this.h) || (k < 1))
      c();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    int k = paramDocumentEvent.getOffset();
    if ((k == this.h) || (k < 1))
      c();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  private void d()
  {
    f localf = new f();
    this.e = new e(localf);
    localf.a("editing.currentLineColor", this.c);
    localf.a("editing.currentLineHighlightingEnabled", this.d);
    this.e.a("editing.currentLineColor");
    this.e.a("editing.currentLineHighlightingEnabled");
  }

  static int a(bk parambk)
  {
    return parambk.h;
  }

  static void a(bk parambk, int paramInt)
  {
    parambk.a(paramInt);
  }

  static gx c(bk parambk)
  {
    return parambk.f;
  }

  static boolean a(bk parambk, boolean paramBoolean)
  {
    return parambk.b = paramBoolean;
  }

  static boolean d(bk parambk)
  {
    return parambk.b;
  }

  static void b(bk parambk)
  {
    parambk.e();
  }

  static void e(bk parambk)
  {
    parambk.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bk
 * JD-Core Version:    0.6.0
 */