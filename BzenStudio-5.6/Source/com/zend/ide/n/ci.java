package com.zend.ide.n;

import com.zend.ide.util.ct;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import java.util.StringTokenizer;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

public class ci extends ca
{
  public ci()
  {
    super("ImproveEditorTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    Object localObject = new gp(new gd(this, "toUpperCase", true), b());
    localActionMap.put("toUpperCase", (Action)localObject);
    locals.a("keys.toUpperCase", (Action)localObject, "textComponent", false);
    localObject = new gp(new gd(this, "toLowerCase", false), b());
    localActionMap.put("toLowerCase", (Action)localObject);
    locals.a("keys.toLowerCase", (Action)localObject, "textComponent", false);
    localObject = new gp(new ge(this), b());
    localActionMap.put("duplicateSelection", (Action)localObject);
    locals.a("keys.duplicateSelection", (Action)localObject, "textComponent", false);
    localObject = new gp(new gf(this), b());
    localActionMap.put("eraseLine", (Action)localObject);
    locals.a("keys.eraseLine", (Action)localObject, "textComponent", false);
    localObject = new gg(this);
    localActionMap.put("gotoLine", (Action)localObject);
    locals.a("keys.gotoLine", (Action)localObject, "textComponent", false);
    localObject = new iv(this);
    localActionMap.put("toggleLineWrap", (Action)localObject);
    locals.a("keys.toggleLineWrap", (Action)localObject, "textComponent", false);
  }

  protected void d()
  {
    c().a("editnig.toUpperCase", "toUpperCase");
    c().a("editnig.toLowerCase", "toLowerCase");
    c().a("phpEditorPane.duplicateSelection", "duplicateSelection");
    c().a("phpEditorPane.eraseLine", "eraseLine");
    c().a("editor.gotoLine", "gotoLine");
    c().a("editor.toggleLineWrap", "toggleLineWrap");
  }

  public static final void b(bw parambw)
  {
    parambw.grabFocus();
    String str = JOptionPane.showInputDialog(parambw.c(), ct.a(490), ct.a(64), -1);
    if (str == null)
      return;
    StringTokenizer localStringTokenizer = new StringTokenizer(str, " , . :");
    int i = -1;
    int j = 1;
    try
    {
      i = Integer.parseInt(localStringTokenizer.nextToken());
      j = Integer.parseInt(localStringTokenizer.nextToken());
    }
    catch (Exception localException)
    {
    }
    try
    {
      parambw.a(i - 1, true);
      parambw.d(parambw.getLineStartOffset(i - 1));
      parambw.b(j);
      parambw.grabFocus();
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ci
 * JD-Core Version:    0.6.0
 */