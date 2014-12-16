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
 * A document containing one timeInterval(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeIntervalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TimeIntervalDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeIntervalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINTERVAL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "timeInterval");
    
    
    /**
     * Gets the "timeInterval" element
     */
    public net.opengis.gml.TimeIntervalLengthType getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().find_element_user(TIMEINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timeInterval" element
     */
     public void setTimeInterval(net.opengis.gml.TimeIntervalLengthType timeInterval)
    {
        generatedSetterHelperImpl(timeInterval, TIMEINTERVAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeInterval" element
     */
    public net.opengis.gml.TimeIntervalLengthType addNewTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().add_element_user(TIMEINTERVAL$0);
            return target;
        }
    }
}
