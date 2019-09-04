package com.zend.ide.fb;

import com.zend.ide.util.cv;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ComboBoxEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class db extends JComboBox
{
  private static final ImageIcon a = cv.b("doc.gif");
  private Map b = new HashMap();
  private gb c = new gb(this);

  public db()
  {
    this.b.put("", a);
    setRenderer(new hb(this));
    setEditor(this.c);
    setEditable(true);
    addActionListener(new ab(this));
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramString.equals("about:blank")))
    {
      gb.a(this.c).setIcon(a);
      gb.b(this.c).setText("");
      return;
    }
    if (paramBoolean)
      setSelectedItem(paramString);
    else
      gb.b(this.c).setText(paramString);
    SwingUtilities.invokeLater(new bb(this));
  }

  private static String a(String paramString)
  {
    String str = "";
    try
    {
      str = new URL(paramString).getHost();
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return str;
  }

  public void requestFocus()
  {
    gb.b(this.c).requestFocus();
  }

  public void grabFocus()
  {
    gb.b(this.c).grabFocus();
  }

  public Object getSelectedItem()
  {
    Object localObject = super.getSelectedItem();
    return localObject == null ? "" : localObject.toString();
  }

  static ComboBoxEditor a(db paramdb)
  {
    return paramdb.editor;
  }

  static String b(String paramString)
  {
    return a(paramString);
  }

  static Map b(db paramdb)
  {
    return paramdb.b;
  }

  static gb c(db paramdb)
  {
    return paramdb.c;
  }

  static ImageIcon a()
  {
    return a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.db
 * JD-Core Version:    0.6.0
 */