package com.zend.ide.p.e;

import com.zend.ide.p.e.a.p;
import com.zend.ide.y.n;
import java.util.Hashtable;
import javax.swing.InputMap;
import javax.swing.UIDefaults;
import javax.swing.UIDefaults.LazyInputMap;
import javax.swing.UIManager;

public class c
{
  public void c()
  {
    d();
    e();
  }

  protected UIDefaults b()
  {
    return UIManager.getDefaults();
  }

  protected void d()
  {
    UIDefaults localUIDefaults = b();
    localUIDefaults.put("FontsLabelUI", p.class.getName());
    localUIDefaults.put("ToolTipUI", e.class.getName());
    localUIDefaults.put("ScrollPane.ancestorInputMap", new UIDefaults.LazyInputMap(new Object[] { "RIGHT", "unitScrollRight", "KP_RIGHT", "unitScrollRight", "ctrl DOWN", "unitScrollDown", "KP_DOWN", "unitScrollDown", "LEFT", "unitScrollLeft", "KP_LEFT", "unitScrollLeft", "ctrl UP", "unitScrollUp", "KP_UP", "unitScrollUp", "PAGE_UP", "scrollUp", "PAGE_DOWN", "scrollDown", "ctrl PAGE_UP", "scrollLeft", "ctrl PAGE_DOWN", "scrollRight", "ctrl HOME", "scrollHome", "ctrl END", "scrollEnd" }));
  }

  protected void e()
  {
    Hashtable localHashtable = new Hashtable();
    b().put("listenerSupports", localHashtable);
    n localn = new n((InputMap)UIManager.get("TextArea.focusInputMap"));
    localHashtable.put("TextArea.focusInputMap", localn);
    a(localn);
    localn = new n((InputMap)UIManager.get("TextPane.focusInputMap"));
    localHashtable.put("TextPane.focusInputMap", localn);
    a(localn);
    localn = new n((InputMap)UIManager.get("EditorPane.focusInputMap"));
    localHashtable.put("EditorPane.focusInputMap", localn);
    a(localn);
    localn = new n((InputMap)UIManager.get("TextField.focusInputMap"));
    localHashtable.put("TextField.focusInputMap", localn);
    a(localn);
    localn = new n((InputMap)UIManager.get("PasswordField.focusInputMap"));
    localHashtable.put("PasswordField.focusInputMap", localn);
    a(localn);
    localn = new n((InputMap)UIManager.get("FormattedTextField.focusInputMap"));
    localHashtable.put("FormattedTextField.focusInputMap", localn);
    a(localn);
    localn = new n((InputMap)UIManager.get("List.focusInputMap"));
    localHashtable.put("List.focusInputMap", localn);
    a(localn);
  }

  static void a(n paramn)
  {
    paramn.a("phpEditorPane.copy", "copy-to-clipboard");
    paramn.a("phpEditorPane.paste", "paste-from-clipboard");
    paramn.a("phpEditorPane.cut", "cut-to-clipboard");
    paramn.a("phpEditorPane.selectAll", "select-all");
    paramn.a("phpEditorPane.beginLine", "caret-begin-line");
    paramn.a("phpEditorPane.endLine", "caret-end-line");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.c
 * JD-Core Version:    0.6.0
 */