/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Tin(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TinDocumentImpl extends net.opengis.gml.impl.TriangulatedSurfaceDocumentImpl implements net.opengis.gml.TinDocument
{
    private static final long serialVersionUID = 1L;
    
    public TinDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin");
    
    
    /**
     * Gets the "Tin" element
     */
    public net.opengis.gml.TinType getTin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TinType target = null;
            target = (net.opengis.gml.TinType)get_store().find_element_user(TIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Tin" element
     */
    @Inject(optional=true) public void setTin(net.opengis.gml.TinType tin)
    {
        generatedSetterHelperImpl(tin, TIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Tin" element
     */
    public net.opengis.gml.TinType addNewTin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TinType target = null;
            target = (net.opengis.gml.TinType)get_store().add_element_user(TIN$0);
            return target;
        }
    }
}
