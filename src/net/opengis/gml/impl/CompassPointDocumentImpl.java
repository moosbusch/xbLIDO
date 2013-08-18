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
 * A document containing one CompassPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CompassPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CompassPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompassPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPASSPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompassPoint");
    
    
    /**
     * Gets the "CompassPoint" element
     */
    public net.opengis.gml.CompassPointEnumeration.Enum getCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CompassPointEnumeration.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompassPoint" element
     */
    public net.opengis.gml.CompassPointEnumeration xgetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CompassPoint" element
     */
    @Inject(optional=true) public void setCompassPoint(net.opengis.gml.CompassPointEnumeration.Enum compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPASSPOINT$0);
            }
            target.setEnumValue(compassPoint);
        }
    }
    
    /**
     * Sets (as xml) the "CompassPoint" element
     */
    public void xsetCompassPoint(net.opengis.gml.CompassPointEnumeration compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CompassPointEnumeration)get_store().add_element_user(COMPASSPOINT$0);
            }
            target.set(compassPoint);
        }
    }
}
