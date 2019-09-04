package com.zend.ide.n;

import com.zend.ide.n.b.e;
import com.zend.ide.n.b.g;
import com.zend.ide.v.x;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;

class eh extends x
{
  final cl b;

  eh(cl paramcl)
  {
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    Document localDocument = paramdz.getDocument();
    g localg = (g)localDocument.getProperty("undoTool");
    if (localg == null)
    {
      localg = cl.a(this.b, localDocument);
      localDocument.addUndoableEditListener(localg);
      localDocument.putProperty("undoTool", localg);
    }
    JTextComponent localJTextComponent = ((bw)paramdz).e();
    Keymap localKeymap = localJTextComponent.getKeymap();
    Action localAction = localKeymap.getDefaultAction();
    localKeymap.setDefaultAction(new e(localAction, cl.a(this.b)));
    ActionMap localActionMap = localJTextComponent.getActionMap();
    Object[] arrayOfObject = localActionMap.keys();
    for (int i = 0; i < arrayOfObject.length; i++)
      localActionMap.put(arrayOfObject[i], new e(localActionMap.get(arrayOfObject[i]), cl.a(this.b)));
  }

  public void a(dz paramdz)
  {
    cl.b(this.b).c();
    cl.c(this.b).c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.eh
 * JD-Core Version:    0.6.0
 */