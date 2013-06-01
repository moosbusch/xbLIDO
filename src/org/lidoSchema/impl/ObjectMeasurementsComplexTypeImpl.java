/*
 * XML Type:  objectMeasurementsComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ObjectMeasurementsComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * An XML objectMeasurementsComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ObjectMeasurementsComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectMeasurementsComplexType
{
    private static final long serialVersionUID = 1L;

    public ObjectMeasurementsComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MEASUREMENTSSET$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "measurementsSet");
    private static final javax.xml.namespace.QName EXTENTMEASUREMENTS$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "extentMeasurements");
    private static final javax.xml.namespace.QName QUALIFIERMEASUREMENTS$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "qualifierMeasurements");
    private static final javax.xml.namespace.QName FORMATMEASUREMENTS$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "formatMeasurements");
    private static final javax.xml.namespace.QName SHAPEMEASUREMENTS$8 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "shapeMeasurements");
    private static final javax.xml.namespace.QName SCALEMEASUREMENTS$10 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "scaleMeasurements");


    /**
     * Gets a List of "measurementsSet" elements
     */
    public java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet> getMeasurementsSetList()
    {
        final class MeasurementsSetList extends java.util.AbstractList<org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet>
        {
            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet get(int i)
                { return ObjectMeasurementsComplexTypeImpl.this.getMeasurementsSetArray(i); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet set(int i, org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet o)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet old = ObjectMeasurementsComplexTypeImpl.this.getMeasurementsSetArray(i);
                ObjectMeasurementsComplexTypeImpl.this.setMeasurementsSetArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet o)
                { ObjectMeasurementsComplexTypeImpl.this.insertNewMeasurementsSet(i).set(o); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet remove(int i)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet old = ObjectMeasurementsComplexTypeImpl.this.getMeasurementsSetArray(i);
                ObjectMeasurementsComplexTypeImpl.this.removeMeasurementsSet(i);
                return old;
            }

            @Override
            public int size()
                { return ObjectMeasurementsComplexTypeImpl.this.sizeOfMeasurementsSetArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new MeasurementsSetList();
        }
    }

    /**
     * Gets array of all "measurementsSet" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet[] getMeasurementsSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet> targetList = new java.util.ArrayList<org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet>();
            get_store().find_all_element_users(MEASUREMENTSSET$0, targetList);
            org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet[] result = new org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "measurementsSet" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet getMeasurementsSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet)get_store().find_element_user(MEASUREMENTSSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "measurementsSet" element
     */
    public int sizeOfMeasurementsSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREMENTSSET$0);
        }
    }

    /**
     * Sets array of all "measurementsSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMeasurementsSetArray(org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet[] measurementsSetArray)
    {
        check_orphaned();
        arraySetterHelper(measurementsSetArray, MEASUREMENTSSET$0);
    }

    /**
     * Sets ith "measurementsSet" element
     */
    @Inject(optional=true) public void setMeasurementsSetArray(int i, org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet measurementsSet)
    {
        generatedSetterHelperImpl(measurementsSet, MEASUREMENTSSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "measurementsSet" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet insertNewMeasurementsSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet)get_store().insert_element_user(MEASUREMENTSSET$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "measurementsSet" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet addNewMeasurementsSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet)get_store().add_element_user(MEASUREMENTSSET$0);
            return target;
        }
    }

    /**
     * Removes the ith "measurementsSet" element
     */
    public void removeMeasurementsSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREMENTSSET$0, i);
        }
    }

    /**
     * Gets a List of "extentMeasurements" elements
     */
    public java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements> getExtentMeasurementsList()
    {
        final class ExtentMeasurementsList extends java.util.AbstractList<org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements>
        {
            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements get(int i)
                { return ObjectMeasurementsComplexTypeImpl.this.getExtentMeasurementsArray(i); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements set(int i, org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements o)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getExtentMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.setExtentMeasurementsArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements o)
                { ObjectMeasurementsComplexTypeImpl.this.insertNewExtentMeasurements(i).set(o); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements remove(int i)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getExtentMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.removeExtentMeasurements(i);
                return old;
            }

            @Override
            public int size()
                { return ObjectMeasurementsComplexTypeImpl.this.sizeOfExtentMeasurementsArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ExtentMeasurementsList();
        }
    }

    /**
     * Gets array of all "extentMeasurements" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements[] getExtentMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements> targetList = new java.util.ArrayList<org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements>();
            get_store().find_all_element_users(EXTENTMEASUREMENTS$2, targetList);
            org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements[] result = new org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "extentMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements getExtentMeasurementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements)get_store().find_element_user(EXTENTMEASUREMENTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "extentMeasurements" element
     */
    public int sizeOfExtentMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENTMEASUREMENTS$2);
        }
    }

    /**
     * Sets array of all "extentMeasurements" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setExtentMeasurementsArray(org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements[] extentMeasurementsArray)
    {
        check_orphaned();
        arraySetterHelper(extentMeasurementsArray, EXTENTMEASUREMENTS$2);
    }

    /**
     * Sets ith "extentMeasurements" element
     */
    @Inject(optional=true) public void setExtentMeasurementsArray(int i, org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements extentMeasurements)
    {
        generatedSetterHelperImpl(extentMeasurements, EXTENTMEASUREMENTS$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "extentMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements insertNewExtentMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements)get_store().insert_element_user(EXTENTMEASUREMENTS$2, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "extentMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements addNewExtentMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements)get_store().add_element_user(EXTENTMEASUREMENTS$2);
            return target;
        }
    }

    /**
     * Removes the ith "extentMeasurements" element
     */
    public void removeExtentMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENTMEASUREMENTS$2, i);
        }
    }

    /**
     * Gets a List of "qualifierMeasurements" elements
     */
    public java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements> getQualifierMeasurementsList()
    {
        final class QualifierMeasurementsList extends java.util.AbstractList<org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements>
        {
            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements get(int i)
                { return ObjectMeasurementsComplexTypeImpl.this.getQualifierMeasurementsArray(i); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements set(int i, org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements o)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getQualifierMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.setQualifierMeasurementsArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements o)
                { ObjectMeasurementsComplexTypeImpl.this.insertNewQualifierMeasurements(i).set(o); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements remove(int i)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getQualifierMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.removeQualifierMeasurements(i);
                return old;
            }

            @Override
            public int size()
                { return ObjectMeasurementsComplexTypeImpl.this.sizeOfQualifierMeasurementsArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new QualifierMeasurementsList();
        }
    }

    /**
     * Gets array of all "qualifierMeasurements" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements[] getQualifierMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements> targetList = new java.util.ArrayList<org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements>();
            get_store().find_all_element_users(QUALIFIERMEASUREMENTS$4, targetList);
            org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements[] result = new org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "qualifierMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements getQualifierMeasurementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "qualifierMeasurements" element
     */
    public int sizeOfQualifierMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUALIFIERMEASUREMENTS$4);
        }
    }

    /**
     * Sets array of all "qualifierMeasurements" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setQualifierMeasurementsArray(org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements[] qualifierMeasurementsArray)
    {
        check_orphaned();
        arraySetterHelper(qualifierMeasurementsArray, QUALIFIERMEASUREMENTS$4);
    }

    /**
     * Sets ith "qualifierMeasurements" element
     */
    @Inject(optional=true) public void setQualifierMeasurementsArray(int i, org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements qualifierMeasurements)
    {
        generatedSetterHelperImpl(qualifierMeasurements, QUALIFIERMEASUREMENTS$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualifierMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements insertNewQualifierMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements)get_store().insert_element_user(QUALIFIERMEASUREMENTS$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "qualifierMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements addNewQualifierMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements)get_store().add_element_user(QUALIFIERMEASUREMENTS$4);
            return target;
        }
    }

    /**
     * Removes the ith "qualifierMeasurements" element
     */
    public void removeQualifierMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUALIFIERMEASUREMENTS$4, i);
        }
    }

    /**
     * Gets a List of "formatMeasurements" elements
     */
    public java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements> getFormatMeasurementsList()
    {
        final class FormatMeasurementsList extends java.util.AbstractList<org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements>
        {
            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements get(int i)
                { return ObjectMeasurementsComplexTypeImpl.this.getFormatMeasurementsArray(i); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements set(int i, org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements o)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getFormatMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.setFormatMeasurementsArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements o)
                { ObjectMeasurementsComplexTypeImpl.this.insertNewFormatMeasurements(i).set(o); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements remove(int i)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getFormatMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.removeFormatMeasurements(i);
                return old;
            }

            @Override
            public int size()
                { return ObjectMeasurementsComplexTypeImpl.this.sizeOfFormatMeasurementsArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new FormatMeasurementsList();
        }
    }

    /**
     * Gets array of all "formatMeasurements" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements[] getFormatMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements> targetList = new java.util.ArrayList<org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements>();
            get_store().find_all_element_users(FORMATMEASUREMENTS$6, targetList);
            org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements[] result = new org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "formatMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements getFormatMeasurementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements)get_store().find_element_user(FORMATMEASUREMENTS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "formatMeasurements" element
     */
    public int sizeOfFormatMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATMEASUREMENTS$6);
        }
    }

    /**
     * Sets array of all "formatMeasurements" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setFormatMeasurementsArray(org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements[] formatMeasurementsArray)
    {
        check_orphaned();
        arraySetterHelper(formatMeasurementsArray, FORMATMEASUREMENTS$6);
    }

    /**
     * Sets ith "formatMeasurements" element
     */
    @Inject(optional=true) public void setFormatMeasurementsArray(int i, org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements formatMeasurements)
    {
        generatedSetterHelperImpl(formatMeasurements, FORMATMEASUREMENTS$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "formatMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements insertNewFormatMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements)get_store().insert_element_user(FORMATMEASUREMENTS$6, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "formatMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements addNewFormatMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements)get_store().add_element_user(FORMATMEASUREMENTS$6);
            return target;
        }
    }

    /**
     * Removes the ith "formatMeasurements" element
     */
    public void removeFormatMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATMEASUREMENTS$6, i);
        }
    }

    /**
     * Gets a List of "shapeMeasurements" elements
     */
    public java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements> getShapeMeasurementsList()
    {
        final class ShapeMeasurementsList extends java.util.AbstractList<org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements>
        {
            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements get(int i)
                { return ObjectMeasurementsComplexTypeImpl.this.getShapeMeasurementsArray(i); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements set(int i, org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements o)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getShapeMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.setShapeMeasurementsArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements o)
                { ObjectMeasurementsComplexTypeImpl.this.insertNewShapeMeasurements(i).set(o); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements remove(int i)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getShapeMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.removeShapeMeasurements(i);
                return old;
            }

            @Override
            public int size()
                { return ObjectMeasurementsComplexTypeImpl.this.sizeOfShapeMeasurementsArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ShapeMeasurementsList();
        }
    }

    /**
     * Gets array of all "shapeMeasurements" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements[] getShapeMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements> targetList = new java.util.ArrayList<org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements>();
            get_store().find_all_element_users(SHAPEMEASUREMENTS$8, targetList);
            org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements[] result = new org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "shapeMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements getShapeMeasurementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements)get_store().find_element_user(SHAPEMEASUREMENTS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "shapeMeasurements" element
     */
    public int sizeOfShapeMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPEMEASUREMENTS$8);
        }
    }

    /**
     * Sets array of all "shapeMeasurements" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setShapeMeasurementsArray(org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements[] shapeMeasurementsArray)
    {
        check_orphaned();
        arraySetterHelper(shapeMeasurementsArray, SHAPEMEASUREMENTS$8);
    }

    /**
     * Sets ith "shapeMeasurements" element
     */
    @Inject(optional=true) public void setShapeMeasurementsArray(int i, org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements shapeMeasurements)
    {
        generatedSetterHelperImpl(shapeMeasurements, SHAPEMEASUREMENTS$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "shapeMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements insertNewShapeMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements)get_store().insert_element_user(SHAPEMEASUREMENTS$8, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "shapeMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements addNewShapeMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements)get_store().add_element_user(SHAPEMEASUREMENTS$8);
            return target;
        }
    }

    /**
     * Removes the ith "shapeMeasurements" element
     */
    public void removeShapeMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPEMEASUREMENTS$8, i);
        }
    }

    /**
     * Gets a List of "scaleMeasurements" elements
     */
    public java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements> getScaleMeasurementsList()
    {
        final class ScaleMeasurementsList extends java.util.AbstractList<org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements>
        {
            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements get(int i)
                { return ObjectMeasurementsComplexTypeImpl.this.getScaleMeasurementsArray(i); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements set(int i, org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements o)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getScaleMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.setScaleMeasurementsArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements o)
                { ObjectMeasurementsComplexTypeImpl.this.insertNewScaleMeasurements(i).set(o); }

            @Override
            public org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements remove(int i)
            {
                org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements old = ObjectMeasurementsComplexTypeImpl.this.getScaleMeasurementsArray(i);
                ObjectMeasurementsComplexTypeImpl.this.removeScaleMeasurements(i);
                return old;
            }

            @Override
            public int size()
                { return ObjectMeasurementsComplexTypeImpl.this.sizeOfScaleMeasurementsArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ScaleMeasurementsList();
        }
    }

    /**
     * Gets array of all "scaleMeasurements" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements[] getScaleMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements> targetList = new java.util.ArrayList<org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements>();
            get_store().find_all_element_users(SCALEMEASUREMENTS$10, targetList);
            org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements[] result = new org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "scaleMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements getScaleMeasurementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements)get_store().find_element_user(SCALEMEASUREMENTS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "scaleMeasurements" element
     */
    public int sizeOfScaleMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCALEMEASUREMENTS$10);
        }
    }

    /**
     * Sets array of all "scaleMeasurements" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setScaleMeasurementsArray(org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements[] scaleMeasurementsArray)
    {
        check_orphaned();
        arraySetterHelper(scaleMeasurementsArray, SCALEMEASUREMENTS$10);
    }

    /**
     * Sets ith "scaleMeasurements" element
     */
    @Inject(optional=true) public void setScaleMeasurementsArray(int i, org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements scaleMeasurements)
    {
        generatedSetterHelperImpl(scaleMeasurements, SCALEMEASUREMENTS$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "scaleMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements insertNewScaleMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements)get_store().insert_element_user(SCALEMEASUREMENTS$10, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "scaleMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements addNewScaleMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements)get_store().add_element_user(SCALEMEASUREMENTS$10);
            return target;
        }
    }

    /**
     * Removes the ith "scaleMeasurements" element
     */
    public void removeScaleMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCALEMEASUREMENTS$10, i);
        }
    }
    /**
     * An XML measurementsSet(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class MeasurementsSetImpl extends org.lidoSchema.impl.MeasurementsSetComplexTypeImpl implements org.lidoSchema.ObjectMeasurementsComplexType.MeasurementsSet
    {
        private static final long serialVersionUID = 1L;

        public MeasurementsSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
    /**
     * An XML extentMeasurements(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ObjectMeasurementsComplexType$ExtentMeasurements.
     */
    public static class ExtentMeasurementsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ObjectMeasurementsComplexType.ExtentMeasurements
    {
        private static final long serialVersionUID = 1L;

        public ExtentMeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }

        protected ExtentMeasurementsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }

        private static final javax.xml.namespace.QName LANG$0 =
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        private static final javax.xml.namespace.QName SORTORDER$6 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }

        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }

        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }

        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                return target;
            }
        }

        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }

        /**
         * Sets the "encodinganalog" attribute
         */
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.setStringValue(encodinganalog);
            }
        }

        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.set(encodinganalog);
            }
        }

        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$2);
            }
        }

        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                return target;
            }
        }

        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }

        /**
         * Sets the "label" attribute
         */
        @Inject(optional=true) public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
                }
                target.setStringValue(label);
            }
        }

        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
                }
                target.set(label);
            }
        }

        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$4);
            }
        }

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$6) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$6);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$6);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$6);
            }
        }
    }
    /**
     * An XML qualifierMeasurements(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ObjectMeasurementsComplexType$QualifierMeasurements.
     */
    public static class QualifierMeasurementsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ObjectMeasurementsComplexType.QualifierMeasurements
    {
        private static final long serialVersionUID = 1L;

        public QualifierMeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }

        protected QualifierMeasurementsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }

        private static final javax.xml.namespace.QName LANG$0 =
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        private static final javax.xml.namespace.QName SORTORDER$6 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }

        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }

        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }

        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                return target;
            }
        }

        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }

        /**
         * Sets the "encodinganalog" attribute
         */
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.setStringValue(encodinganalog);
            }
        }

        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.set(encodinganalog);
            }
        }

        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$2);
            }
        }

        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                return target;
            }
        }

        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }

        /**
         * Sets the "label" attribute
         */
        @Inject(optional=true) public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
                }
                target.setStringValue(label);
            }
        }

        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
                }
                target.set(label);
            }
        }

        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$4);
            }
        }

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$6) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$6);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$6);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$6);
            }
        }
    }
    /**
     * An XML formatMeasurements(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ObjectMeasurementsComplexType$FormatMeasurements.
     */
    public static class FormatMeasurementsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ObjectMeasurementsComplexType.FormatMeasurements
    {
        private static final long serialVersionUID = 1L;

        public FormatMeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }

        protected FormatMeasurementsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }

        private static final javax.xml.namespace.QName LANG$0 =
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        private static final javax.xml.namespace.QName SORTORDER$6 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }

        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }

        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }

        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                return target;
            }
        }

        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }

        /**
         * Sets the "encodinganalog" attribute
         */
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.setStringValue(encodinganalog);
            }
        }

        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.set(encodinganalog);
            }
        }

        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$2);
            }
        }

        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                return target;
            }
        }

        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }

        /**
         * Sets the "label" attribute
         */
        @Inject(optional=true) public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
                }
                target.setStringValue(label);
            }
        }

        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
                }
                target.set(label);
            }
        }

        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$4);
            }
        }

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$6) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$6);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$6);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$6);
            }
        }
    }
    /**
     * An XML shapeMeasurements(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ObjectMeasurementsComplexType$ShapeMeasurements.
     */
    public static class ShapeMeasurementsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ObjectMeasurementsComplexType.ShapeMeasurements
    {
        private static final long serialVersionUID = 1L;

        public ShapeMeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }

        protected ShapeMeasurementsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }

        private static final javax.xml.namespace.QName LANG$0 =
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        private static final javax.xml.namespace.QName SORTORDER$6 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }

        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }

        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }

        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                return target;
            }
        }

        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }

        /**
         * Sets the "encodinganalog" attribute
         */
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.setStringValue(encodinganalog);
            }
        }

        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.set(encodinganalog);
            }
        }

        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$2);
            }
        }

        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                return target;
            }
        }

        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }

        /**
         * Sets the "label" attribute
         */
        @Inject(optional=true) public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
                }
                target.setStringValue(label);
            }
        }

        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
                }
                target.set(label);
            }
        }

        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$4);
            }
        }

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$6) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$6);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$6);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$6);
            }
        }
    }
    /**
     * An XML scaleMeasurements(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ObjectMeasurementsComplexType$ScaleMeasurements.
     */
    public static class ScaleMeasurementsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ObjectMeasurementsComplexType.ScaleMeasurements
    {
        private static final long serialVersionUID = 1L;

        public ScaleMeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }

        protected ScaleMeasurementsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }

        private static final javax.xml.namespace.QName LANG$0 =
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        private static final javax.xml.namespace.QName SORTORDER$6 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }

        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }

        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }

        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                return target;
            }
        }

        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }

        /**
         * Sets the "encodinganalog" attribute
         */
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.setStringValue(encodinganalog);
            }
        }

        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.set(encodinganalog);
            }
        }

        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$2);
            }
        }

        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                return target;
            }
        }

        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }

        /**
         * Sets the "label" attribute
         */
        @Inject(optional=true) public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
                }
                target.setStringValue(label);
            }
        }

        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
                }
                target.set(label);
            }
        }

        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$4);
            }
        }

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$6) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$6);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$6);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$6);
            }
        }
    }
}
