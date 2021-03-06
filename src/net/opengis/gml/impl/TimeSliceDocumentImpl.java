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
 * A document containing one _TimeSlice(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeSliceDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.TimeSliceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeSliceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESLICE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeSlice");
    private static final org.apache.xmlbeans.QNameSet TIMESLICE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeSlice"),
    });
    
    
    /**
     * Gets the "_TimeSlice" element
     */
    public net.opengis.gml.AbstractTimeSliceType getTimeSlice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().find_element_user(TIMESLICE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeSlice" element
     */
     public void setTimeSlice(net.opengis.gml.AbstractTimeSliceType timeSlice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().find_element_user(TIMESLICE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeSliceType)get_store().add_element_user(TIMESLICE$0);
            }
            target.set(timeSlice);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeSlice" element
     */
    public net.opengis.gml.AbstractTimeSliceType addNewTimeSlice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().add_element_user(TIMESLICE$0);
            return target;
        }
    }
}
