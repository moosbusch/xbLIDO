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
package io.github.moosbusch.museum.inject.lido;

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
import io.github.moosbusch.museum.document.lido.LidoXmlDocument;
import io.github.moosbusch.museum.document.lido.impl.DefaultLidoObjectFactory;
import io.github.moosbusch.museum.inject.MuseumXmlModule;

/**
 *
 * @author moosbusch
 */
public interface LidoModule extends MuseumXmlModule, GmlModule, Smil20Module, XLinkModule {

    @Override
    public LidoXmlDocument<? extends DefaultLidoObjectFactory> createDocument();

    public ActorComplexType createLidoActorComplexType();

    public LidoComplexType createLidoLidoComplexType();

    public LidoDocument createLidoLidoDocument();

    public LidoWrapDocument createLidoLidoWrapDocument();

    public LidoWrapDocument.LidoWrap createLidoLidoWrap();

    public LidoWrapDocument.LidoWrap.Lido createLidoLido();

    public ActorInRoleComplexType createLidoActorInRoleComplexType();

    public ActorInRoleSetComplexType createLidoActorInRoleSetComplexType();

    public ActorSetComplexType createLidoActorSetComplexType();

    public AddedSearchTermAttribute createLidoAddedSearchTermAttribute();

    public AdministrativeMetadataComplexType createLidoAdministrativeMetadataComplexType();

    public AdministrativeMetadataDocument createLidoAdministrativeMetadataDocument();

    public AppellationComplexType createLidoAppellationComplexType();

    public ClassificationWrapDocument createLidoClassificationWrapDocument();

    public ClassificationWrap createLidoClassificationWrap();

    public Classification createLidoClassification();

    public ConceptComplexType createLidoConceptComplexType();

    public DateComplexType createLidoDateComplexType();

    public DateSetComplexType createLidoDateSetComplexType();

    public DescriptiveMetadataComplexType createLidoDescriptiveMetadataComplexType();

    public DescriptiveMetadataDocument createLidoDescriptiveMetadataDocument();

    public DescriptiveNoteComplexType createLidoDescriptiveNoteComplexType();

    public DisplayStateEditionWrapDocument createLidoDisplayStateEditionWrapDocument();

    public DisplayStateEditionWrap createLidoDisplayStateEditionWrap();

    public EncodinganalogAttribute createLidoEncodinganalogAttribute();

    public EventComplexType createLidoEventComplexType();

    public EventSetComplexType createLidoEventSetComplexType();

    public EventWrapDocument createLidoEventWrapDocument();

    public EventWrap createLidoEventWrap();

    public EventSet createLidoEvent();

    public GeographicalEntityAttribute createLidoGeographicalEntityAttribute();

    public GmlComplexType createLidoGmlComplexType();

    public IdentifierComplexType createLidoIdentifierComplexType();

    public InscriptionsWrapDocument createLidoInscriptionsWrapDocument();

    public InscriptionsWrap createLidoInscriptionsWrap();

    public Inscriptions createLidoInscriptions();

    public LabelAttribute createLidoLabelAttribute();

    public LegalBodyRefComplexType createLidoLegalBodyRefComplexType();

    public MaterialsTechComplexType createLidoMaterialsTechComplexType();

    public MaterialsTechSetComplexType createLidoMaterialsTechSetComplexType();

    public MeasurementsSetComplexType createLidoMeasurementsSetComplexType();

    public ObjectClassificationWrapDocument createLidoObjectClassificationWrapDocument();

    public ObjectClassificationWrap createLidoObjectClassificationWrap();

    public ObjectComplexType createLidoObjectComplexType();

    public ObjectDescriptionWrapDocument createLidoObjectDescriptionWrapDocument();

    public ObjectDescriptionWrap createLidoObjectDescriptionWrap();

    public ObjectIdentificationWrapDocument createLidoObjectIdentificationWrapDocument();

    public ObjectIdentificationWrap createLidoObjectIdentificationWrap();

    public ObjectMeasurementsComplexType createLidoObjectMeasurementsComplexType();

    public ObjectMeasurementsSetComplexType createLidoObjectMeasurementsSetComplexType();

    public ObjectMeasurementsWrapDocument createLidoObjectMeasurementsWrapDocument();

    public ObjectMeasurementsWrap createLidoObjectMeasurementsWrap();

    public ObjectMeasurementsSet createLidoObjectMeasurements();

    public ObjectRelationWrapDocument createLidoObjectRelationWrapDocument();

    public ObjectRelationWrap createLidoObjectRelationWrap();

    public ObjectSetComplexType createLidoObjectSetComplexType();

    public ObjectWorkTypeWrapDocument createLidoObjectWorkTypeWrapDocument();

    public ObjectWorkTypeWrap createLidoObjectWorkTypeWrap();

    public ObjectWorkType createLidoObjectWorkType();

    public PlaceComplexType createLidoPlaceComplexType();

    public PlaceSetComplexType createLidoPlaceSetComplexType();

    public PoliticalEntityAttribute createLidoPoliticalEntityAttribute();

    public PrefAttribute createLidoPrefAttribute();

    public RecordInfoSetComplexType createLidoRecordInfoSetComplexType();

    public RecordWrapDocument createLidoRecordWrapDocument();

    public RecordWrap createLidoRecordWrap();

    public RelatedencodingAttribute createLidoRelatedencodingAttribute();

    public RelatedEventSetComplexType createLidoRelatedEventSetComplexType();

    public RelatedWorkSetComplexType createLidoRelatedWorkSetComplexType();

    public RelatedWorksWrapDocument createLidoRelatedWorksWrapDocument();

    public RelatedWorksWrap createLidoRelatedWorksWrap();

    public RelatedWorkSet createLidoRelatedWorks();

    public RepositoryWrapDocument createLidoRepositoryWrapDocument();

    public RepositoryWrap createLidoRepositoryWrap();

    public RepositorySetComplexType createLidoRepository();

    public ResourceSetComplexType createLidoResourceSetComplexType();

    public ResourceWrapDocument createLidoResourceWrapDocument();

    public ResourceWrap createLidoResourceWrap();

    public ResourceSet createLidoResource();

    public RightsComplexType createLidoRightsComplexType();

    public RightsWorkWrapDocument createLidoRightsWorkWrapDocument();

    public RightsWorkWrap createLidoRightsWorkWrap();

    public RightsWorkSet createLidoRightsWork();

    public SortorderAttribute createLidoSortorderAttribute();

    public SourceAttribute createLidoSourceAttribute();

    public SubjectComplexType createLidoSubjectComplexType();

    public SubjectSetComplexType createLidoSubjectSetComplexType();

    public SubjectWrapDocument createLidoSubjectWrapDocument();

    public SubjectWrap createLidoSubjectWrap();

    public SubjectSet createLidoSubject();

    public TermComplexType createLidoTermComplexType();

    public TextComplexType createLidoTextComplexType();

    public TitleWrapDocument createLidoTitleWrapDocument();

    public TitleWrap createLidoTitleWrap();

    public TitleSet createLidoTitle();

    public TypeAttribute createLidoTypeAttribute();

    public WebResourceComplexType createLidoWebResourceComplexType();

    public AppellationComplexType.AppellationValue createLidoAppellationValue();

    public RecordWrap.RecordSource createLidoRecordSource();
}