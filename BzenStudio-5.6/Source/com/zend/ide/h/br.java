package com.zend.ide.h;

import com.zend.ide.p.d.bc;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.r.s;
import com.zend.ide.util.bn;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.eo;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

public class br extends r
  implements cu, com.zend.ide.r.r
{
  private JComboBox d;
  private JPanel e;
  private JPanel f;
  private Hashtable g = new Hashtable();

  public br(bn parambn)
  {
    super(parambn);
    b(parambn);
    h();
    p.e().a(this);
  }

  private void b(bn parambn)
  {
    this.e = new bq(this, new BorderLayout(), parambn);
    this.f = new JPanel(new BorderLayout());
    g();
    this.f.add(this.d, "Center");
    this.e.add(parambn.c(), "Center");
    this.e.add(this.f, "South");
  }

  private void g()
  {
    Iterator localIterator = p.e().a(true);
    while (localIterator.hasNext())
    {
      o localo = (o)localIterator.next();
      s locals = localo.j();
      this.g.put(locals.getDescription(), locals);
    }
    this.d = new JComboBox(this.g.values().toArray());
    this.d.setToolTipText("");
    ((DefaultComboBoxModel)this.d.getModel()).insertElementAt(ct.a(226), this.d.getModel().getSize());
    this.d.addItemListener(new bp(this));
    this.d.getEditor().getEditorComponent().addFocusListener(new bv(this));
  }

  public JComponent c()
  {
    return this.e;
  }

  protected void a(Object paramObject)
  {
  }

  protected void h()
  {
  }

  protected void a(FileFilter paramFileFilter)
  {
    String str = paramFileFilter.getDescription();
    if (this.g.get(paramFileFilter.toString()) != null)
    {
      this.d.setEditable(false);
      ((be)n()).a((FileFilter)this.g.get(str));
      n().i();
    }
    else
    {
      bc localbc = new bc(str);
      this.g.put(str, paramFileFilter);
      ((DefaultComboBoxModel)this.d.getModel()).insertElementAt(paramFileFilter, this.d.getModel().getSize());
      ((be)n()).a(localbc);
      n().i();
    }
    this.d.getModel().setSelectedItem(this.g.get(str));
  }

  public void a(bo parambo)
  {
    String str = ((FileFilter)this.d.getModel().getSelectedItem()).getDescription();
    if (str.equals(parambo.b().b()))
      n().i();
  }

  public void a(o paramo)
  {
    if (this.g.containsKey(paramo.b()))
      return;
    s locals = paramo.j();
    this.g.put(locals.getDescription(), locals);
    ((DefaultComboBoxModel)this.d.getModel()).insertElementAt(locals, this.d.getModel().getSize());
  }

  public void c(o paramo)
  {
    if (!this.g.containsKey(paramo.b()))
      return;
    FileFilter localFileFilter1 = (FileFilter)this.d.getModel().getSelectedItem();
    FileFilter localFileFilter2 = (FileFilter)this.g.get(paramo.b());
    this.g.remove(localFileFilter2.getDescription());
    ((DefaultComboBoxModel)this.d.getModel()).removeElement(localFileFilter2);
    if (localFileFilter1.equals(localFileFilter2))
    {
      n().i();
      this.d.revalidate();
      this.d.repaint();
    }
  }

  static JComboBox a(br parambr)
  {
    return parambr.d;
  }

  static Hashtable b(br parambr)
  {
    return parambr.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.br
 * JD-Core Version:    0.6.0
 */