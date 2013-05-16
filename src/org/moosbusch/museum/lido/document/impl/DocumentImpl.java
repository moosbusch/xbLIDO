/*

 *
 */
package org.moosbusch.museum.lido.document.impl;

import java.io.IOException;
import java.io.InputStream;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.lido.document.spi.AbstractDocument;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument<LIDOObjectFactory> {

    public DocumentImpl() {
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    @Override
    protected LIDOObjectFactory createObjectFactory() {
        return new LIDOObjectFactory();
    }

}
