package com.zend.ide.v;

import com.zend.ide.n.dz;
import com.zend.ide.n.ek;
import java.util.Hashtable;
import javax.swing.event.DocumentEvent;

class z extends ek
{
  private Hashtable i = new Hashtable();
  final d j;

  private z(d paramd)
  {
    super(paramd);
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    if (a(((dz)paramDocumentEvent.getDocument()).k(), "fireInsertUpdate", paramDocumentEvent))
      super.insertUpdate(paramDocumentEvent);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    if (a(((dz)paramDocumentEvent.getDocument()).k(), "fireRemoveUpdate", paramDocumentEvent))
      super.removeUpdate(paramDocumentEvent);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    if (a(((dz)paramDocumentEvent.getDocument()).k(), "fireChangedUpdate", paramDocumentEvent))
      super.changedUpdate(paramDocumentEvent);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if (a(paramString, "fireDocumentSaved", new Boolean(paramBoolean)))
      super.a(paramString, paramBoolean);
  }

  public void a(String paramString1, String paramString2)
  {
    b(paramString1, paramString2);
    if (a(paramString2, "fireDocumentNameChanged", paramString2))
      super.a(paramString1, paramString2);
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    d(paramdz);
    super.a(paramdz, true);
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    super.b(paramdz, true);
  }

  private boolean a(String paramString1, String paramString2, Object paramObject)
  {
    Hashtable localHashtable;
    if (this.i.containsKey(paramString1))
    {
      localHashtable = (Hashtable)this.i.get(paramString1);
    }
    else
    {
      localHashtable = new Hashtable();
      this.i.put(paramString1, localHashtable);
    }
    return a(localHashtable, paramString2, paramObject);
  }

  private boolean a(Hashtable paramHashtable, String paramString, Object paramObject)
  {
    if (paramObject == null)
    {
      paramHashtable.remove(paramString);
      return true;
    }
    Object localObject = paramHashtable.get(paramString);
    if ((localObject == null) || (!localObject.equals(paramObject)))
    {
      paramHashtable.put(paramString, paramObject);
      return true;
    }
    return false;
  }

  private void d(dz paramdz)
  {
    this.i.remove(paramdz.k());
  }

  public void b(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (this.i.containsKey(paramString1)))
    {
      Object localObject = this.i.remove(paramString1);
      if ((paramString2 != null) && (!this.i.containsKey(paramString2)))
        this.i.put(paramString2, localObject);
    }
  }

  z(d paramd, l paraml)
  {
    this(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.z
 * JD-Core Version:    0.6.0
 */