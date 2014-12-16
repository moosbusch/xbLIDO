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
 * An XML MultiSurfaceDomainType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiSurfaceDomainTypeImpl extends net.opengis.gml.impl.DomainSetTypeImpl implements net.opengis.gml.MultiSurfaceDomainType
{
    private static final long serialVersionUID = 1L;

    public MultiSurfaceDomainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTISURFACE$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface");


    /**
     * Gets the "MultiSurface" element
     */
    public net.opengis.gml.MultiSurfaceType getMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceType target = null;
            target = (net.opengis.gml.MultiSurfaceType)get_store().find_element_user(MULTISURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "MultiSurface" element
     */
    public boolean isSetMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTISURFACE$0) != 0;
        }
    }

    /**
     * Sets the "MultiSurface" element
     */
     public void setMultiSurface(net.opengis.gml.MultiSurfaceType multiSurface)
    {
        generatedSetterHelperImpl(multiSurface, MULTISURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MultiSurface" element
     */
    public net.opengis.gml.MultiSurfaceType addNewMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceType target = null;
            target = (net.opengis.gml.MultiSurfaceType)get_store().add_element_user(MULTISURFACE$0);
            return target;
        }
    }

    /**
     * Unsets the "MultiSurface" element
     */
    public void unsetMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTISURFACE$0, 0);
        }
    }
}
