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
 * A document containing one _TimeReferenceSystem(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeReferenceSystemDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.TimeReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem");
    private static final org.apache.xmlbeans.QNameSet TIMEREFERENCESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem"),
    });
    
    
    /**
     * Gets the "_TimeReferenceSystem" element
     */
    public net.opengis.gml.AbstractTimeReferenceSystemType getTimeReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().find_element_user(TIMEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeReferenceSystem" element
     */
     public void setTimeReferenceSystem(net.opengis.gml.AbstractTimeReferenceSystemType timeReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().find_element_user(TIMEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().add_element_user(TIMEREFERENCESYSTEM$0);
            }
            target.set(timeReferenceSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeReferenceSystem" element
     */
    public net.opengis.gml.AbstractTimeReferenceSystemType addNewTimeReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().add_element_user(TIMEREFERENCESYSTEM$0);
            return target;
        }
    }
}
