package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SpinnerModel;

class hd extends JPanel
{
  private ke a;
  private JToolBar b;
  private JToolBar c;
  private JButton d;
  private JButton e;
  private JButton f;
  private JButton g;
  private JButton h;
  private JButton i;
  final v j;

  public hd(v paramv)
  {
    a();
  }

  private void a()
  {
    setLayout(new GridLayout(1, 2));
    v.a(this.j, new rd(this.j, this.j.j(), 1, 3000, 50));
    this.a = new ke(v.a(this.j), 4);
    this.a.getModel().addChangeListener(new ge(this));
    JFormattedTextField localJFormattedTextField = this.a.a();
    localJFormattedTextField.addKeyListener(new w(this, localJFormattedTextField));
    this.b = new JToolBar("limitsToolbar", 0);
    this.c = new JToolBar("navigationToolbar", 0);
    this.b.setRollover(true);
    this.c.setRollover(true);
    this.c.setLayout(new FlowLayout(2));
    this.b.setLayout(new FlowLayout(0));
    this.b.setFloatable(false);
    this.c.setFloatable(false);
    this.b.add(new JLabel(ct.a(1491)));
    this.b.add(this.a);
    this.e = new JButton(new jc(this.j));
    this.d = new JButton(new ic(this.j));
    this.f = new JButton(new kc(this.j));
    this.g = new JButton(new lc(this.j));
    this.h = new JButton(new gc(this.j));
    this.i = new JButton(new hc(this.j));
    this.e.setToolTipText(ct.a(588));
    this.d.setToolTipText(ct.a(589));
    this.f.setToolTipText(ct.a(354));
    this.g.setToolTipText(ct.a(1492));
    this.h.setToolTipText(ct.a(1493));
    this.i.setToolTipText(ct.a(1494));
    this.c.add(this.g);
    this.c.add(this.f);
    this.c.add(this.e);
    this.c.add(this.d);
    add(this.b);
    add(this.c);
    this.b.setBackground(getBackground());
    this.c.setBackground(getBackground());
    a(false);
  }

  public void a(boolean paramBoolean)
  {
    this.h.setEnabled(paramBoolean);
    this.i.setEnabled(paramBoolean);
  }

  public void setBackground(Color paramColor)
  {
    super.setBackground(paramColor);
    if ((this.b != null) && (this.c != null))
    {
      this.b.setBackground(paramColor);
      this.c.setBackground(paramColor);
    }
  }

  public void b(boolean paramBoolean)
  {
    this.d.setEnabled(paramBoolean);
  }

  public void c(boolean paramBoolean)
  {
    this.e.setEnabled(paramBoolean);
  }

  public void d(boolean paramBoolean)
  {
    this.g.setEnabled(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.hd
 * JD-Core Version:    0.6.0
 */