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
 * An XML DirectedObservationAtDistanceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DirectedObservationAtDistanceTypeImpl extends net.opengis.gml.impl.DirectedObservationTypeImpl implements net.opengis.gml.DirectedObservationAtDistanceType
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationAtDistanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "distance");
    
    
    /**
     * Gets the "distance" element
     */
    public net.opengis.gml.MeasureType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "distance" element
     */
    @Inject(optional=true) public void setDistance(net.opengis.gml.MeasureType distance)
    {
        generatedSetterHelperImpl(distance, DISTANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "distance" element
     */
    public net.opengis.gml.MeasureType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(DISTANCE$0);
            return target;
        }
    }
}
