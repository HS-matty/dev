package com.zend.ide.cb.a;

import com.zend.ide.bc.a;
import com.zend.ide.cb.c.w;
import com.zend.ide.n.gz;
import com.zend.ide.n.hl;
import com.zend.ide.util.bn;
import com.zend.ide.util.bp;
import com.zend.ide.util.cl;
import com.zend.ide.util.s;
import java.awt.Rectangle;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;

public class l
  implements k
{
  private static final String a = System.getProperty("line.separator");
  private static final be b = new be();
  private Highlighter c;
  private gz d;
  private JScrollPane e;
  private String f;
  private w g;
  private Action h;

  public l(String paramString, w paramw)
  {
    this.f = paramString;
    this.g = paramw;
    a();
  }

  private void a()
  {
    this.c = new DefaultHighlighter();
    this.d = new gz();
    bp.a(this.d);
    this.d.setEditable(false);
    this.d.a(null, this.c, -1);
    this.d.setLineWrap(true);
    this.d.setWrapStyleWord(true);
    this.e = new JScrollPane(this.d);
    this.h = new bc(this);
    this.d.e().getKeymap().addActionForKeyStroke(KeyStroke.getKeyStroke(10, 2), this.h);
    b();
    a.a(this.e, "SQL_MESSAGES");
  }

  private void b()
  {
    if ((this.d.q() instanceof s))
    {
      s locals = (s)this.d.q();
      locals.a("keys.cut", "textComponent", true);
      locals.a("keys.paste", "textComponent", true);
      locals.a("keys.selectAll", "textComponent", false);
      ActionMap localActionMap = this.d.getActionMap();
      Object localObject = localActionMap.get("copy-to-clipboard");
      locals.a("keys.copy", (Action)localObject, "textComponent", true);
      localObject = localActionMap.get("select-all");
      locals.a("keys.selectAll", (Action)localObject, "textComponent", true);
      localObject = new ac(this, null);
      locals.a("keys.clear", (Action)localObject, "textComponent", true);
    }
  }

  public void b(String paramString)
  {
    this.d.append(paramString);
    this.d.append(a);
    int i = this.d.getDocument().getLength() - a.length();
    a(i);
    try
    {
      Element localElement = this.d.getDocument().getDefaultRootElement();
      int j = localElement.getElement(localElement.getElementCount() - 1).getStartOffset();
      Rectangle localRectangle = this.d.modelToView(j);
      if (localRectangle != null)
        SwingUtilities.invokeLater(new m(this, localRectangle));
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }

  public JComponent a()
  {
    return this.e;
  }

  public void c()
  {
  }

  public void a(String paramString)
  {
    this.f = paramString;
  }

  public String d()
  {
    return this.f;
  }

  public boolean e()
  {
    this.d.grabFocus();
    return true;
  }

  private void a(int paramInt)
  {
    try
    {
      this.c.addHighlight(paramInt, paramInt + 1, b);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void a(bn parambn)
  {
    if (parambn != null)
      this.d.a(parambn);
  }

  public void a(hl paramhl)
  {
    this.d.a(paramhl);
    this.d.repaint();
  }

  static gz a(l paraml)
  {
    return paraml.d;
  }

  static w b(l paraml)
  {
    return paraml.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.l
 * JD-Core Version:    0.6.0
 */