package com.zend.ide.w.b;

import com.zend.ide.n.gp;
import com.zend.ide.n.gz;
import com.zend.ide.p.cd;
import com.zend.ide.util.s;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.beans.PropertyChangeListener;
import javax.swing.ActionMap;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.Document;

class bf
  implements ChangeListener
{
  private gz a = new gz();
  private JPanel b = new JPanel(new BorderLayout());
  private Document c;
  private JScrollPane d;
  private PropertyChangeListener e = new bh(this, null);
  private PropertyChangeListener h = new by(this, null);
  private e f;
  private JLabel g;

  public bf(String paramString, ComponentOrientation paramComponentOrientation, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a.a(false);
    this.a.setLineWrap(false);
    this.a.setWrapStyleWord(false);
    this.g = new JLabel(paramString);
    this.g.setForeground(Color.darkGray);
    Font localFont = this.g.getFont();
    localFont = localFont.deriveFont(0, 12.0F);
    this.g.setFont(localFont);
    this.a.setEditable(paramBoolean1);
    this.c = this.a.getDocument();
    this.a.a(new com.zend.ide.n.bf());
    this.a.setCaret(new bw(this));
    f localf = new f();
    localf.a("application.chosenScheme", this.e);
    localf.a("editing.lineWrap", this.h);
    localf.a("editing.wordWrap", this.h);
    this.f = new e(localf);
    this.f.a("application.chosenScheme");
    this.f.a("editing.lineWrap");
    this.f.a("editing.wordWrap");
    this.d = new cd(this.a);
    this.d.setComponentOrientation(paramComponentOrientation);
    this.b.add(this.d, "Center");
    if (paramBoolean2)
      this.b.add(this.g, "North");
    b();
  }

  public void a(String paramString)
  {
    if (paramString != null)
      this.g.setText(paramString);
  }

  public void b(String paramString)
  {
    if (paramString != null)
      this.g.setText(this.g.getText() + "  (" + paramString + ")");
  }

  private void b()
  {
    if ((this.a.q() instanceof s))
    {
      s locals = (s)this.a.q();
      locals.a("keys.cut", "textComponent", true);
      locals.a("keys.paste", "textComponent", true);
      locals.a("keys.selectAll", "textComponent", false);
      ActionMap localActionMap = this.a.getActionMap();
      gp localgp = new gp(localActionMap.get("select-all"), this.a);
      locals.a("keys.selectAll", localgp, "textComponent", true);
    }
  }

  public Component c()
  {
    return this.b;
  }

  public Document d()
  {
    return this.c;
  }

  public void c(String paramString)
  {
    this.a.append(paramString);
  }

  public void a(Document paramDocument)
  {
    if (paramDocument == null)
      return;
    this.c = paramDocument;
    this.a.setDocument(paramDocument);
  }

  public void e()
  {
    this.a.setText("");
  }

  public com.zend.ide.n.bw f()
  {
    return this.a;
  }

  public JTextArea g()
  {
    return this.a;
  }

  public void a(ChangeListener paramChangeListener)
  {
    this.d.getViewport().addChangeListener(paramChangeListener);
  }

  public void b(ChangeListener paramChangeListener)
  {
    this.d.getViewport().removeChangeListener(paramChangeListener);
  }

  public void a(Point paramPoint)
  {
    SwingUtilities.invokeLater(new bg(this, paramPoint));
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    if (this.d.getVerticalScrollBar().isShowing())
    {
      this.d.getViewport().setViewPosition(((JViewport)paramChangeEvent.getSource()).getViewPosition());
      this.d.getViewport().repaint();
    }
  }

  public int h()
  {
    return this.a.getVisibleRect().height;
  }

  public void a(Dimension paramDimension)
  {
    this.d.setMaximumSize(paramDimension);
  }

  public void b(Dimension paramDimension)
  {
    this.d.setMinimumSize(paramDimension);
  }

  public void c(Dimension paramDimension)
  {
    this.d.setPreferredSize(paramDimension);
  }

  public void i()
  {
    this.a.d(true);
  }

  public Insets j()
  {
    Insets localInsets1 = this.d.getInsets();
    Insets localInsets2 = new Insets(localInsets1.top, localInsets1.left, localInsets1.bottom, localInsets1.right);
    localInsets2.top += this.g.getHeight();
    return localInsets2;
  }

  static JScrollPane b(bf parambf)
  {
    return parambf.d;
  }

  static gz a(bf parambf)
  {
    return parambf.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bf
 * JD-Core Version:    0.6.0
 */