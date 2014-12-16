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
 * A document containing one _TimeObject(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeObjectDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.TimeObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeObject");
    private static final org.apache.xmlbeans.QNameSet TIMEOBJECT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeEdge"),
    });
    
    
    /**
     * Gets the "_TimeObject" element
     */
    public net.opengis.gml.AbstractTimeObjectType getTimeObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.AbstractTimeObjectType)get_store().find_element_user(TIMEOBJECT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeObject" element
     */
     public void setTimeObject(net.opengis.gml.AbstractTimeObjectType timeObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.AbstractTimeObjectType)get_store().find_element_user(TIMEOBJECT$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeObjectType)get_store().add_element_user(TIMEOBJECT$0);
            }
            target.set(timeObject);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeObject" element
     */
    public net.opengis.gml.AbstractTimeObjectType addNewTimeObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.AbstractTimeObjectType)get_store().add_element_user(TIMEOBJECT$0);
            return target;
        }
    }
}
