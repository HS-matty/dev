package com.zend.ide.d;

import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.w.b;
import com.zend.ide.w.l;
import com.zend.ide.w.t;
import com.zend.ide.y.a;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pb extends JPanel
  implements a, cu, ItemListener
{
  private JComboBox a;
  private a b;
  private JPanel c;
  private l d = l.a();

  public pb()
  {
    a();
  }

  private void a()
  {
    setLayout(new BorderLayout());
    this.c = new JPanel(new BorderLayout());
    add(this.c);
    this.a = new JComboBox();
    String[] arrayOfString = this.d.e();
    for (int i = 0; i < arrayOfString.length; i++)
      this.a.addItem(arrayOfString[i]);
    JLabel localJLabel = new JLabel(ct.a(1590));
    localJLabel.setLabelFor(this.a);
    JPanel localJPanel = new JPanel(new FlowLayout(0));
    localJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray));
    localJPanel.add(localJLabel);
    localJPanel.add(this.a);
    add(localJPanel, "North");
    this.a.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (paramItemEvent.getStateChange() == 1)
    {
      String str = paramItemEvent.getItem().toString();
      b(str);
    }
  }

  private void b(String paramString)
  {
    try
    {
      b localb = this.d.a(paramString);
      this.b = localb.b();
      b();
    }
    catch (t localt)
    {
      cl.a(localt);
    }
  }

  private void b()
  {
    this.c.removeAll();
    this.c.add(this.b.c());
    this.b.f();
    this.c.validate();
    this.c.repaint();
  }

  public JComponent c()
  {
    return this;
  }

  public void a(String paramString)
  {
  }

  public void d()
  {
    if (this.b != null)
    {
      this.d.b(this.a.getSelectedItem().toString());
      this.b.d();
    }
    else
    {
      this.d.d();
    }
  }

  public void e()
  {
    if (this.b != null)
      this.b.e();
  }

  public void f()
  {
    b localb = this.d.c();
    if (localb != null)
    {
      this.a.setSelectedItem(localb.a());
      b(localb.a());
    }
    if (this.b != null)
      this.b.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.pb
 * JD-Core Version:    0.6.0
 */