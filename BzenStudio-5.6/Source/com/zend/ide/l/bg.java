package com.zend.ide.l;

import com.zend.ide.h.be;
import com.zend.ide.j.y;
import com.zend.ide.util.s;
import java.io.File;
import java.util.Map;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class bg extends s
{
  final bk g;

  public bg(bk parambk)
  {
  }

  public void b()
  {
    ActionMap localActionMap1 = bk.a(this.g).c().getActionMap();
    Object localObject = localActionMap1.get("RemoveFromProjectAction");
    ((be)this.g.f()).getActionMap().put("RemoveFromProjectAction", (Action)localObject);
    a("keys.removeFromProject", (Action)localObject, "root", true);
    a("keys.removeFromProject", (Action)localObject, "MULTIPLE_ROOTS_SELECTION", true);
    localObject = localActionMap1.get("RemoveAllFromProjectAction");
    a("keys.removeAllFromProject", (Action)localObject, "root", true);
    a("keys.removeAllFromProject", (Action)localObject, "projectsTab", true);
    ActionMap localActionMap2 = ((be)this.g.f()).getActionMap();
    s locals = (s)((be)this.g.f()).q();
    locals.a("keys.delete", "file", true);
    locals.a("keys.delete", "multipleSelection", true);
    locals.a("keys.delete", "directory", true);
    localObject = new ab(this.g);
    localActionMap2.put("deleteProjectFileAction", (Action)localObject);
    a("keys.deleteProjectFile", (Action)localObject, "file", true);
    a("keys.deleteProjectFile", (Action)localObject, "multipleSelection", true);
    a("keys.deleteProjectFile", (Action)localObject, "directory", true);
    a("keys.deleteProjectFile", (Action)localObject, "root", true);
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke(127, 0);
    ((be)this.g.f()).getInputMap().remove(localKeyStroke);
  }

  private String d(String paramString)
  {
    be localbe = (be)this.g.f();
    File[] arrayOfFile = localbe.b();
    if ((arrayOfFile == null) || (arrayOfFile.length == 0))
      return paramString;
    int i = 1;
    for (int j = 0; (i != 0) && (j < arrayOfFile.length); j++)
    {
      File localFile = arrayOfFile[j];
      if (bk.a(this.g).g().m(localFile))
        continue;
      i = 0;
    }
    if (i != 0)
      return arrayOfFile.length == 1 ? "root" : "MULTIPLE_ROOTS_SELECTION";
    return paramString;
  }

  public void c(Map paramMap, String paramString)
  {
    String str = d(paramString);
    d(paramMap, str);
    b(paramMap, str);
    super.c(paramMap, paramString);
  }

  public void a(Map paramMap, String paramString)
  {
    d(paramMap, paramString);
    super.a(paramMap, paramString);
  }

  private void d(Map paramMap, String paramString)
  {
    if (paramString == "root")
      paramMap.remove("keys.delete");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bg
 * JD-Core Version:    0.6.0
 */