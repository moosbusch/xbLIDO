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
 * An XML VerticalDatumType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class VerticalDatumTypeImpl extends net.opengis.gml.impl.AbstractDatumTypeImpl implements net.opengis.gml.VerticalDatumType
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUMTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalDatumType");
    
    
    /**
     * Gets the "verticalDatumType" element
     */
    public net.opengis.gml.VerticalDatumTypeType getVerticalDatumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumTypeType target = null;
            target = (net.opengis.gml.VerticalDatumTypeType)get_store().find_element_user(VERTICALDATUMTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "verticalDatumType" element
     */
    public boolean isSetVerticalDatumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICALDATUMTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "verticalDatumType" element
     */
    @Inject(optional=true) public void setVerticalDatumType(net.opengis.gml.VerticalDatumTypeType verticalDatumType)
    {
        generatedSetterHelperImpl(verticalDatumType, VERTICALDATUMTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalDatumType" element
     */
    public net.opengis.gml.VerticalDatumTypeType addNewVerticalDatumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumTypeType target = null;
            target = (net.opengis.gml.VerticalDatumTypeType)get_store().add_element_user(VERTICALDATUMTYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "verticalDatumType" element
     */
    public void unsetVerticalDatumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICALDATUMTYPE$0, 0);
        }
    }
}
