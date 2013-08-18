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
 * A document containing one minutes(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MinutesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MinutesDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinutesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINUTES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "minutes");
    
    
    /**
     * Gets the "minutes" element
     */
    public int getMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minutes" element
     */
    public net.opengis.gml.ArcMinutesType xgetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcMinutesType target = null;
            target = (net.opengis.gml.ArcMinutesType)get_store().find_element_user(MINUTES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minutes" element
     */
    @Inject(optional=true) public void setMinutes(int minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTES$0);
            }
            target.setIntValue(minutes);
        }
    }
    
    /**
     * Sets (as xml) the "minutes" element
     */
    public void xsetMinutes(net.opengis.gml.ArcMinutesType minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcMinutesType target = null;
            target = (net.opengis.gml.ArcMinutesType)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcMinutesType)get_store().add_element_user(MINUTES$0);
            }
            target.set(minutes);
        }
    }
}
