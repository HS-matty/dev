package com.zend.ide.i;

import com.zend.ide.p.bb;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.text.Document;

public class s extends p
{
  public s(Frame paramFrame)
  {
    super(paramFrame);
    setTitle("Profile URL");
    setName("profilerURL");
  }

  public String e()
  {
    StringBuffer localStringBuffer = new StringBuffer(f());
    char c = localStringBuffer.toString().indexOf('?') == -1 ? '?' : '&';
    localStringBuffer.append(c);
    localStringBuffer.append(q());
    localStringBuffer.append("&start_profile=1");
    if (i())
      localStringBuffer.append("&debug_start_session=1");
    if (!s())
      localStringBuffer.append("&no_remote=1");
    localStringBuffer.append("&original_url=" + f());
    return localStringBuffer.toString();
  }

  protected String r()
  {
    return "PROFILER_DIALOG";
  }

  protected Component l()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    z localz = new z(ct.a(1148));
    this.e = new m(this);
    localz.setLabelFor(this.e.getEditor().getEditorComponent());
    this.f = new m(this);
    BasicComboBoxEditor localBasicComboBoxEditor = (BasicComboBoxEditor)this.e.getEditor();
    ((JTextField)localBasicComboBoxEditor.getEditorComponent()).getDocument().addDocumentListener(new q(this));
    this.g = new bb("Profile First Page Only");
    this.h = new bb("Profile All Pages");
    this.i = new bb("Start Profile From:");
    this.j = new x("Continue Profile From This Page");
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.g);
    localButtonGroup.add(this.h);
    localButtonGroup.add(this.i);
    this.g.setSelected(true);
    o();
    localz.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    localJPanel1.add(localz, "West");
    localJPanel1.add(this.e, "Center");
    localJPanel2.add(this.i, "West");
    localJPanel2.add(this.f, "Center");
    JPanel localJPanel3 = new JPanel(new GridBagLayout());
    localJPanel3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.insets = new Insets(5, 5, 0, 5);
    localJPanel3.add(localJPanel1, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(5, 5, 5, 5);
    localJPanel3.add(t(), localGridBagConstraints);
    this.q.setSelected(true);
    return localJPanel3;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.s
 * JD-Core Version:    0.6.0
 */