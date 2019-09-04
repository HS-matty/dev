package com.zend.ide.fb;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class s
  implements k, p, cu
{
  public static final Object a = "NavigationToolbar";
  private JPanel b;
  private db c;
  private JButton d;
  private JButton e;
  private JButton f;
  private JButton g;
  private o h;

  public s()
  {
    a();
  }

  public void a(o paramo)
  {
    this.h = paramo;
    paramo.a(this);
  }

  public Component a()
  {
    return this.b;
  }

  public Object b()
  {
    return a;
  }

  private void a()
  {
    this.b = new JPanel(new BorderLayout());
    JToolBar localJToolBar = new JToolBar();
    localJToolBar.setRollover(true);
    localJToolBar.setFloatable(false);
    this.c = new db();
    JButton localJButton = new JButton(cv.b("brwsr_new_icon.gif"));
    localJButton.addActionListener(new t(this));
    localJButton.setToolTipText(ct.a(1676));
    localJToolBar.add(localJButton);
    this.e = new JButton(cv.b("brwsr_back_icon.gif"));
    this.e.addActionListener(new u(this));
    this.e.setToolTipText(ct.a(1677));
    localJToolBar.add(this.e);
    this.e.setEnabled(false);
    this.d = new JButton(cv.b("brwsr_frwd_icon.gif"));
    this.d.addActionListener(new v(this));
    this.d.setToolTipText(ct.a(1678));
    localJToolBar.add(this.d);
    this.d.setEnabled(false);
    this.f = new JButton(cv.b("brwsr_stop_icon.gif"));
    this.f.addActionListener(new w(this));
    this.f.setToolTipText(ct.a(1679));
    localJToolBar.add(this.f);
    this.g = new JButton(cv.b("brwsr_refresh_icon.gif"));
    this.g.addActionListener(new x(this));
    this.g.setToolTipText(ct.a(1680));
    localJToolBar.add(this.g);
    this.c.setEditable(true);
    this.c.addActionListener(new y(this));
    localJToolBar.add(this.c);
    this.b.add(localJToolBar);
    this.b.setPreferredSize(new Dimension(this.b.getPreferredSize().width, 26));
  }

  public void a(boolean paramBoolean)
  {
    this.e.setEnabled(paramBoolean);
  }

  public void b(boolean paramBoolean)
  {
    this.d.setEnabled(paramBoolean);
  }

  public void a(String paramString)
  {
  }

  public void b(String paramString)
  {
    SwingUtilities.invokeLater(new z(this));
  }

  public void c(String paramString)
  {
    SwingUtilities.invokeLater(new ib(this, paramString));
  }

  public void a(j paramj)
  {
    if (paramj == null)
    {
      this.e.setEnabled(false);
      this.d.setEnabled(false);
      this.c.a("", false);
      return;
    }
    this.e.setEnabled(paramj.b());
    this.d.setEnabled(paramj.c());
    this.c.a(this.h.e(), false);
  }

  public void d(String paramString)
  {
    SwingUtilities.invokeLater(new jb(this, paramString));
  }

  static o a(s params)
  {
    return params.h;
  }

  static db b(s params)
  {
    return params.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.s
 * JD-Core Version:    0.6.0
 */