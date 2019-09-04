package com.zend.ide.fb;

import com.zend.ide.util.ct;
import com.zend.ide.util.g;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class fb extends JPanel
{
  private o a;
  private JToolBar b;
  private HashMap c;
  private JPanel d;

  public fb()
  {
    a();
    this.c = new HashMap(5);
  }

  private void a()
  {
    setLayout(new BorderLayout());
    this.b = new JToolBar(0);
    this.b.setLayout(new GridBagLayout());
    this.b.setFloatable(false);
    this.b.setRollover(true);
    this.b.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));
    add(this.b, "North");
    this.d = new JPanel(new BorderLayout(10, 10));
    JPanel localJPanel = new JPanel(new FlowLayout(1));
    JLabel localJLabel = new JLabel(ct.a(1738));
    localJLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    this.d.setBackground(Color.WHITE);
    localJPanel.setBackground(Color.WHITE);
    localJPanel.add(localJLabel);
    this.d.add(localJPanel, "North");
    add(this.d, "Center");
  }

  public void a(k paramk)
  {
    if (this.c.containsKey(paramk.b()))
      return;
    if (this.c.size() >= 1)
      this.b.addSeparator(new Dimension(2, 22));
    this.c.put(paramk.b(), paramk);
    this.b.add(paramk.a(), new GridBagConstraints(-1, 0, 1, 1, Math.pow(1.0D * this.c.size(), 7.0D), 0.0D, 17, 2, new Insets(0, 0, 0, 0), 0, 0));
    paramk.a(this.a);
    revalidate();
  }

  public g b()
  {
    return this.a;
  }

  public void b()
  {
    if (this.a == null)
    {
      this.a = q.a();
      remove(this.d);
      add(this.a.g(), "Center");
    }
  }

  public boolean c()
  {
    return this.a != null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.fb
 * JD-Core Version:    0.6.0
 */