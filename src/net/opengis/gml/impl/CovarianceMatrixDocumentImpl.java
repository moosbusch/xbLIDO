/*
 * An XML document type.
 * Localname: covarianceMatrix
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CovarianceMatrixDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one covarianceMatrix(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CovarianceMatrixDocumentImpl extends net.opengis.gml.impl.PositionalAccuracyDocumentImpl implements net.opengis.gml.CovarianceMatrixDocument
{
    private static final long serialVersionUID = 1L;
    
    public CovarianceMatrixDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVARIANCEMATRIX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "covarianceMatrix");
    
    
    /**
     * Gets the "covarianceMatrix" element
     */
    public net.opengis.gml.CovarianceMatrixType getCovarianceMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CovarianceMatrixType target = null;
            target = (net.opengis.gml.CovarianceMatrixType)get_store().find_element_user(COVARIANCEMATRIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "covarianceMatrix" element
     */
    @Inject(optional=true) public void setCovarianceMatrix(net.opengis.gml.CovarianceMatrixType covarianceMatrix)
    {
        generatedSetterHelperImpl(covarianceMatrix, COVARIANCEMATRIX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "covarianceMatrix" element
     */
    public net.opengis.gml.CovarianceMatrixType addNewCovarianceMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CovarianceMatrixType target = null;
            target = (net.opengis.gml.CovarianceMatrixType)get_store().add_element_user(COVARIANCEMATRIX$0);
            return target;
        }
    }
}
