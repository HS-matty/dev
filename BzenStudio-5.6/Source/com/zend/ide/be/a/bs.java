package com.zend.ide.be.a;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class bs extends JPanel
{
  private JLabel a;
  private Border b;
  private GridBagConstraints c;
  private JPanel d;
  private JPanel e;
  private JProgressBar f;

  public bs()
  {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(2, 0, 1, 0));
    this.b = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(1), BorderFactory.createEmptyBorder(1, 10, 1, 10));
    this.e = new JPanel(new BorderLayout());
    this.a = new JLabel();
    this.a.setBorder(this.b);
    this.e.add(this.a, "Center");
    add(this.e, "Center");
    this.d = new JPanel();
    this.d.setBorder(null);
    GridBagLayout localGridBagLayout = new GridBagLayout();
    this.d.setLayout(localGridBagLayout);
    this.c = new GridBagConstraints();
    this.c.fill = 1;
    add(this.d, "East");
  }

  public void a(String paramString)
  {
    this.a.setText(paramString);
  }

  public String b()
  {
    return this.a.getText();
  }

  public void a(JComponent paramJComponent)
  {
    paramJComponent.setBorder(this.b);
    this.d.add(paramJComponent, this.c);
  }

  protected JProgressBar a()
  {
    if (this.f == null)
    {
      this.f = new JProgressBar();
      this.f.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(1), BorderFactory.createEmptyBorder(2, 2, 2, 2)));
      this.e.add(this.f, "East");
    }
    return this.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bs
 * JD-Core Version:    0.6.0
 */