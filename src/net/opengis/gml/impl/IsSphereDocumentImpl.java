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
 * A document containing one isSphere(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IsSphereDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IsSphereDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsSphereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISSPHERE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "isSphere");
    
    
    /**
     * Gets the "isSphere" element
     */
    public net.opengis.gml.IsSphereDocument.IsSphere.Enum getIsSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.IsSphereDocument.IsSphere.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSphere" element
     */
    public net.opengis.gml.IsSphereDocument.IsSphere xgetIsSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsSphereDocument.IsSphere target = null;
            target = (net.opengis.gml.IsSphereDocument.IsSphere)get_store().find_element_user(ISSPHERE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isSphere" element
     */
    @Inject(optional=true) public void setIsSphere(net.opengis.gml.IsSphereDocument.IsSphere.Enum isSphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPHERE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSPHERE$0);
            }
            target.setEnumValue(isSphere);
        }
    }
    
    /**
     * Sets (as xml) the "isSphere" element
     */
    public void xsetIsSphere(net.opengis.gml.IsSphereDocument.IsSphere isSphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsSphereDocument.IsSphere target = null;
            target = (net.opengis.gml.IsSphereDocument.IsSphere)get_store().find_element_user(ISSPHERE$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IsSphereDocument.IsSphere)get_store().add_element_user(ISSPHERE$0);
            }
            target.set(isSphere);
        }
    }
    /**
     * An XML isSphere(@http://www.opengis.net/gml).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.IsSphereDocument$IsSphere.
     */
    public static class IsSphereImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.IsSphereDocument.IsSphere
    {
        private static final long serialVersionUID = 1L;
        
        public IsSphereImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IsSphereImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
