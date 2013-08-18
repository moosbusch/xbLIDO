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
package org.moosbusch.museum.lido.inject;

import com.google.inject.Provides;
import org.lidoSchema.ActorComplexType;
import org.lidoSchema.ActorInRoleComplexType;
import org.lidoSchema.ActorInRoleSetComplexType;
import org.lidoSchema.ActorSetComplexType;
import org.lidoSchema.AddedSearchTermAttribute;
import org.lidoSchema.AdministrativeMetadataComplexType;
import org.lidoSchema.AdministrativeMetadataDocument;
import org.lidoSchema.AppellationComplexType;
import org.lidoSchema.ClassificationWrapDocument;
import org.lidoSchema.ClassificationWrapDocument.ClassificationWrap;
import org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification;
import org.lidoSchema.ConceptComplexType;
import org.lidoSchema.DateComplexType;
import org.lidoSchema.DateSetComplexType;
import org.lidoSchema.DescriptiveMetadataComplexType;
import org.lidoSchema.DescriptiveMetadataDocument;
import org.lidoSchema.DescriptiveNoteComplexType;
import org.lidoSchema.DisplayStateEditionWrapDocument;
import org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap;
import org.lidoSchema.EncodinganalogAttribute;
import org.lidoSchema.EventComplexType;
import org.lidoSchema.EventSetComplexType;
import org.lidoSchema.EventWrapDocument;
import org.lidoSchema.EventWrapDocument.EventWrap;
import org.lidoSchema.EventWrapDocument.EventWrap.EventSet;
import org.lidoSchema.GeographicalEntityAttribute;
import org.lidoSchema.GmlComplexType;
import org.lidoSchema.IdentifierComplexType;
import org.lidoSchema.InscriptionsWrapDocument;
import org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap;
import org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions;
import org.lidoSchema.LabelAttribute;
import org.lidoSchema.LegalBodyRefComplexType;
import org.lidoSchema.LidoComplexType;
import org.lidoSchema.LidoDocument;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.lidoSchema.MaterialsTechComplexType;
import org.lidoSchema.MaterialsTechSetComplexType;
import org.lidoSchema.MeasurementsSetComplexType;
import org.lidoSchema.ObjectClassificationWrapDocument;
import org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap;
import org.lidoSchema.ObjectComplexType;
import org.lidoSchema.ObjectDescriptionWrapDocument;
import org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap;
import org.lidoSchema.ObjectIdentificationWrapDocument;
import org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap;
import org.lidoSchema.ObjectMeasurementsComplexType;
import org.lidoSchema.ObjectMeasurementsSetComplexType;
import org.lidoSchema.ObjectMeasurementsWrapDocument;
import org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap;
import org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet;
import org.lidoSchema.ObjectRelationWrapDocument;
import org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap;
import org.lidoSchema.ObjectSetComplexType;
import org.lidoSchema.ObjectWorkTypeWrapDocument;
import org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap;
import org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType;
import org.lidoSchema.PlaceComplexType;
import org.lidoSchema.PlaceSetComplexType;
import org.lidoSchema.PoliticalEntityAttribute;
import org.lidoSchema.PrefAttribute;
import org.lidoSchema.RecordInfoSetComplexType;
import org.lidoSchema.RecordWrapDocument;
import org.lidoSchema.RecordWrapDocument.RecordWrap;
import org.lidoSchema.RelatedEventSetComplexType;
import org.lidoSchema.RelatedWorkSetComplexType;
import org.lidoSchema.RelatedWorksWrapDocument;
import org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap;
import org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet;
import org.lidoSchema.RelatedencodingAttribute;
import org.lidoSchema.RepositorySetComplexType;
import org.lidoSchema.RepositoryWrapDocument;
import org.lidoSchema.RepositoryWrapDocument.RepositoryWrap;
import org.lidoSchema.ResourceSetComplexType;
import org.lidoSchema.ResourceWrapDocument;
import org.lidoSchema.ResourceWrapDocument.ResourceWrap;
import org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet;
import org.lidoSchema.RightsComplexType;
import org.lidoSchema.RightsWorkWrapDocument;
import org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap;
import org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet;
import org.lidoSchema.SortorderAttribute;
import org.lidoSchema.SourceAttribute;
import org.lidoSchema.SubjectComplexType;
import org.lidoSchema.SubjectSetComplexType;
import org.lidoSchema.SubjectWrapDocument;
import org.lidoSchema.SubjectWrapDocument.SubjectWrap;
import org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet;
import org.lidoSchema.TermComplexType;
import org.lidoSchema.TextComplexType;
import org.lidoSchema.TitleWrapDocument;
import org.lidoSchema.TitleWrapDocument.TitleWrap;
import org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet;
import org.lidoSchema.TypeAttribute;
import org.lidoSchema.WebResourceComplexType;
import org.moosbusch.museum.inject.XmlModule;
import org.moosbusch.museum.lido.document.Document;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface LIDOModule extends XmlModule, GmlModule, Smil20Module, XLinkModule {

    @Provides
    @Override
    public Document<? extends LIDOObjectFactory> createDocument();

    public String getRelatedEncoding();

    @Provides
    public ActorComplexType createActorComplexType();

    @Provides
    public ActorInRoleComplexType createActorInRoleComplexType();

    @Provides
    public ActorInRoleSetComplexType createActorInRoleSetComplexType();

    @Provides
    public ActorSetComplexType createActorSetComplexType();

    @Provides
    public AddedSearchTermAttribute createAddedSearchTermAttribute();

    @Provides
    public AdministrativeMetadataComplexType createAdministrativeMetadataComplexType();

    @Provides
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument();

    @Provides
    public AppellationComplexType createAppellationComplexType();

    @Provides
    public ClassificationWrapDocument createClassificationWrapDocument();

    @Provides
    public ClassificationWrap createClassificationWrap();

    @Provides
    public Classification createClassification();

    @Provides
    public ConceptComplexType createConceptComplexType();

    @Provides
    public DateComplexType createDateComplexType();

    @Provides
    public DateSetComplexType createDateSetComplexType();

    @Provides
    public DescriptiveMetadataComplexType createDescriptiveMetadataComplexType();

    @Provides
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument();

    @Provides
    public DescriptiveNoteComplexType createDescriptiveNoteComplexType();

    @Provides
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument();

    @Provides
    public DisplayStateEditionWrap createDisplayStateEditionWrap();

    @Provides
    public EncodinganalogAttribute createEncodinganalogAttribute();

    @Provides
    public EventComplexType createEventComplexType();

    @Provides
    public EventSetComplexType createEventSetComplexType();

    @Provides
    public EventWrapDocument createEventWrapDocument();

    @Provides
    public EventWrap createEventWrap();

    @Provides
    public EventSet createEvent();

    @Provides
    public GeographicalEntityAttribute createGeographicalEntityAttribute();

    @Provides
    public GmlComplexType createGmlComplexType();

    @Provides
    public IdentifierComplexType createIdentifierComplexType();

    @Provides
    public InscriptionsWrapDocument createInscriptionsWrapDocument();

    @Provides
    public InscriptionsWrap createInscriptionsWrap();

    @Provides
    public Inscriptions createInscriptions();

    @Provides
    public LabelAttribute createLabelAttribute();

    @Provides
    public LegalBodyRefComplexType createLegalBodyRefComplexType();

    @Provides
    public LidoComplexType createLidoComplexType();

    @Provides
    public LidoDocument createLidoDocument();

    @Provides
    public LidoWrapDocument createLidoWrapDocument();

    @Provides
    public LidoWrap createLidoWrap();

    @Provides
    public Lido createLido();

    @Provides
    public MaterialsTechComplexType createMaterialsTechComplexType();

    @Provides
    public MaterialsTechSetComplexType createMaterialsTechSetComplexType();

    @Provides
    public MeasurementsSetComplexType createMeasurementsSetComplexType();

    @Provides
    public ObjectClassificationWrapDocument createObjectClassificationWrapDocument();

    @Provides
    public ObjectClassificationWrap createObjectClassificationWrap();

    @Provides
    public ObjectComplexType createObjectComplexType();

    @Provides
    public ObjectDescriptionWrapDocument createObjectDescriptionWrapDocument();

    @Provides
    public ObjectDescriptionWrap createObjectDescriptionWrap();

    @Provides
    public ObjectIdentificationWrapDocument createObjectIdentificationWrapDocument();

    @Provides
    public ObjectIdentificationWrap createObjectIdentificationWrap();

    @Provides
    public ObjectMeasurementsComplexType createObjectMeasurementsComplexType();

    @Provides
    public ObjectMeasurementsSetComplexType createObjectMeasurementsSetComplexType();

    @Provides
    public ObjectMeasurementsWrapDocument createObjectMeasurementsWrapDocument();

    @Provides
    public ObjectMeasurementsWrap createObjectMeasurementsWrap();

    @Provides
    public ObjectMeasurementsSet createObjectMeasurements();

    @Provides
    public ObjectRelationWrapDocument createObjectRelationWrapDocument();

    @Provides
    public ObjectRelationWrap createObjectRelationWrap();

    @Provides
    public ObjectSetComplexType createObjectSetComplexType();

    @Provides
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument();

    @Provides
    public ObjectWorkTypeWrap createObjectWorkTypeWrap();

    @Provides
    public ObjectWorkType createObjectWorkType();

    @Provides
    public PlaceComplexType createPlaceComplexType();

    @Provides
    public PlaceSetComplexType createPlaceSetComplexType();

    @Provides
    public PoliticalEntityAttribute createPoliticalEntityAttribute();

    @Provides
    public PrefAttribute createPrefAttribute();

    @Provides
    public RecordInfoSetComplexType createRecordInfoSetComplexType();

    @Provides
    public RecordWrapDocument createRecordWrapDocument();

    @Provides
    public RecordWrap createRecordWrap();

    @Provides
    public RelatedencodingAttribute createRelatedencodingAttribute();

    @Provides
    public RelatedEventSetComplexType createRelatedEventSetComplexType();

    @Provides
    public RelatedWorkSetComplexType createRelatedWorkSetComplexType();

    @Provides
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument();

    @Provides
    public RelatedWorksWrap createRelatedWorksWrap();

    @Provides
    public RelatedWorkSet createRelatedWorks();

    @Provides
    public RepositorySetComplexType createRepositorySetComplexType();

    @Provides
    public RepositoryWrapDocument createRepositoryWrapDocument();

    @Provides
    public RepositoryWrap createRepositoryWrap();

    @Provides
    public RepositorySetComplexType createRepository();

    @Provides
    public ResourceSetComplexType createResourceSetComplexType();

    @Provides
    public ResourceWrapDocument createResourceWrapDocument();

    @Provides
    public ResourceWrap createResourceWrap();

    @Provides
    public ResourceSet createResource();

    @Provides
    public RightsComplexType createRightsComplexType();

    @Provides
    public RightsWorkWrapDocument createRightsWorkWrapDocument();

    @Provides
    public RightsWorkWrap createRightsWorkWrap();

    @Provides
    public RightsWorkSet createRightsWork();

    @Provides
    public SortorderAttribute createSortorderAttribute();

    @Provides
    public SourceAttribute createSourceAttribute();

    @Provides
    public SubjectComplexType createSubjectComplexType();

    @Provides
    public SubjectSetComplexType createSubjectSetComplexType();

    @Provides
    public SubjectWrapDocument createSubjectWrapDocument();

    @Provides
    public SubjectWrap createSubjectWrap();

    @Provides
    public SubjectSet createSubject();

    @Provides
    public TermComplexType createTermComplexType();

    @Provides
    public TextComplexType createTextComplexType();

    @Provides
    public TitleWrapDocument createTitleWrapDocument();

    @Provides
    public TitleWrap createTitleWrap();

    @Provides
    public TitleSet createTitle();

    @Provides
    public TypeAttribute createTypeAttribute();

    @Provides
    public WebResourceComplexType createWebResourceComplexType();
}