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
package net.opengis.gml.impl; 
/**
 * A document containing one _TimeGeometricPrimitive(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeGeometricPrimitiveDocumentImpl extends net.opengis.gml.impl.TimePrimitiveDocumentImpl implements net.opengis.gml.TimeGeometricPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeGeometricPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEGEOMETRICPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive");
    private static final org.apache.xmlbeans.QNameSet TIMEGEOMETRICPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant"),
    });
    
    
    /**
     * Gets the "_TimeGeometricPrimitive" element
     */
    public net.opengis.gml.AbstractTimeGeometricPrimitiveType getTimeGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().find_element_user(TIMEGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeGeometricPrimitive" element
     */
     public void setTimeGeometricPrimitive(net.opengis.gml.AbstractTimeGeometricPrimitiveType timeGeometricPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().find_element_user(TIMEGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().add_element_user(TIMEGEOMETRICPRIMITIVE$0);
            }
            target.set(timeGeometricPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeGeometricPrimitive" element
     */
    public net.opengis.gml.AbstractTimeGeometricPrimitiveType addNewTimeGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().add_element_user(TIMEGEOMETRICPRIMITIVE$0);
            return target;
        }
    }
}
