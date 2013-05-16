/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.lido.inject.impl;

import com.google.inject.Provides;
import net.opengis.gml.AbsoluteExternalPositionalAccuracyDocument;
import net.opengis.gml.AbsoluteExternalPositionalAccuracyType;
import net.opengis.gml.AbstractContinuousCoverageType;
import net.opengis.gml.AbstractCoordinateOperationBaseType;
import net.opengis.gml.AbstractCoordinateOperationType;
import net.opengis.gml.AbstractCoordinateSystemBaseType;
import net.opengis.gml.AbstractCoordinateSystemType;
import net.opengis.gml.AbstractCoverageType;
import net.opengis.gml.AbstractCurveSegmentType;
import net.opengis.gml.AbstractCurveType;
import net.opengis.gml.AbstractDatumBaseType;
import net.opengis.gml.AbstractDatumType;
import net.opengis.gml.AbstractDiscreteCoverageType;
import net.opengis.gml.AbstractFeatureCollectionType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AbstractGeneralConversionType;
import net.opengis.gml.AbstractGeneralDerivedCRSType;
import net.opengis.gml.AbstractGeneralOperationParameterRefDocument;
import net.opengis.gml.AbstractGeneralOperationParameterRefType;
import net.opengis.gml.AbstractGeneralOperationParameterType;
import net.opengis.gml.AbstractGeneralParameterValueType;
import net.opengis.gml.AbstractGeneralTransformationType;
import net.opengis.gml.AbstractGeometricAggregateType;
import net.opengis.gml.AbstractGeometricPrimitiveType;
import net.opengis.gml.AbstractGeometryType;
import net.opengis.gml.AbstractGriddedSurfaceType;
import net.opengis.gml.AbstractMetaDataType;
import net.opengis.gml.AbstractParametricCurveSurfaceType;
import net.opengis.gml.AbstractPositionalAccuracyType;
import net.opengis.gml.AbstractReferenceSystemBaseType;
import net.opengis.gml.AbstractReferenceSystemType;
import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.AbstractRingType;
import net.opengis.gml.AbstractSolidType;
import net.opengis.gml.AbstractStyleType;
import net.opengis.gml.AbstractSurfacePatchType;
import net.opengis.gml.AbstractSurfaceType;
import net.opengis.gml.AbstractTimeComplexType;
import net.opengis.gml.AbstractTimeGeometricPrimitiveType;
import net.opengis.gml.AbstractTimeObjectType;
import net.opengis.gml.AbstractTimePrimitiveType;
import net.opengis.gml.AbstractTimeReferenceSystemType;
import net.opengis.gml.AbstractTimeSliceType;
import net.opengis.gml.AbstractTimeTopologyPrimitiveType;
import net.opengis.gml.AbstractTopoPrimitiveType;
import net.opengis.gml.AbstractTopologyType;
import net.opengis.gml.AesheticCriteriaType;
import net.opengis.gml.AffinePlacementDocument;
import net.opengis.gml.AffinePlacementType;
import net.opengis.gml.AnchorPointDocument;
import net.opengis.gml.AngleChoiceType;
import net.opengis.gml.AngleDocument;
import net.opengis.gml.AngleType;
import net.opengis.gml.ArcByBulgeDocument;
import net.opengis.gml.ArcByBulgeType;
import net.opengis.gml.ArcByCenterPointDocument;
import net.opengis.gml.ArcByCenterPointType;
import net.opengis.gml.ArcDocument;
import net.opengis.gml.ArcMinutesType;
import net.opengis.gml.ArcSecondsType;
import net.opengis.gml.ArcStringByBulgeDocument;
import net.opengis.gml.ArcStringByBulgeType;
import net.opengis.gml.ArcStringDocument;
import net.opengis.gml.ArcStringType;
import net.opengis.gml.ArcType;
import net.opengis.gml.AreaType;
import net.opengis.gml.ArrayAssociationType;
import net.opengis.gml.ArrayDocument;
import net.opengis.gml.ArrayType;
import net.opengis.gml.AssociationDocument;
import net.opengis.gml.AssociationType;
import net.opengis.gml.AxisAbbrevDocument;
import net.opengis.gml.AxisDirectionDocument;
import net.opengis.gml.AxisIDDocument;
import net.opengis.gml.BSplineDocument;
import net.opengis.gml.BSplineType;
import net.opengis.gml.BagDocument;
import net.opengis.gml.BagType;
import net.opengis.gml.BaseCRSDocument;
import net.opengis.gml.BaseCurveDocument;
import net.opengis.gml.BaseStyleDescriptorType;
import net.opengis.gml.BaseSurfaceDocument;
import net.opengis.gml.BaseUnitDocument;
import net.opengis.gml.BaseUnitType;
import net.opengis.gml.BezierDocument;
import net.opengis.gml.BezierType;
import net.opengis.gml.BooleanDocument;
import net.opengis.gml.BooleanList;
import net.opengis.gml.BooleanListDocument;
import net.opengis.gml.BooleanOrNull;
import net.opengis.gml.BooleanOrNullList;
import net.opengis.gml.BooleanPropertyType;
import net.opengis.gml.BooleanValueDocument;
import net.opengis.gml.BoundedByDocument;
import net.opengis.gml.BoundedFeatureType;
import net.opengis.gml.BoundingBoxDocument;
import net.opengis.gml.BoundingPolygonDocument;
import net.opengis.gml.BoundingShapeType;
import net.opengis.gml.CRSDocument;
import net.opengis.gml.CRSRefType;
import net.opengis.gml.CalDate;
import net.opengis.gml.CartesianCSDocument;
import net.opengis.gml.CartesianCSRefDocument;
import net.opengis.gml.CartesianCSRefType;
import net.opengis.gml.CartesianCSType;
import net.opengis.gml.CatalogSymbolDocument;
import net.opengis.gml.CategoryDocument;
import net.opengis.gml.CategoryExtentDocument;
import net.opengis.gml.CategoryExtentType;
import net.opengis.gml.CategoryListDocument;
import net.opengis.gml.CategoryPropertyType;
import net.opengis.gml.CenterLineOfDocument;
import net.opengis.gml.CenterOfDocument;
import net.opengis.gml.CircleByCenterPointDocument;
import net.opengis.gml.CircleByCenterPointType;
import net.opengis.gml.CircleDocument;
import net.opengis.gml.CircleType;
import net.opengis.gml.ClothoidDocument;
import net.opengis.gml.ClothoidType;
import net.opengis.gml.CodeListType;
import net.opengis.gml.CodeOrNullListType;
import net.opengis.gml.CodeType;
import net.opengis.gml.ColumnIndexDocument;
import net.opengis.gml.CompassPointDocument;
import net.opengis.gml.CompassPointEnumeration;
import net.opengis.gml.CompositeCurveDocument;
import net.opengis.gml.CompositeCurvePropertyType;
import net.opengis.gml.CompositeCurveType;
import net.opengis.gml.CompositeSolidDocument;
import net.opengis.gml.CompositeSolidPropertyType;
import net.opengis.gml.CompositeSolidType;
import net.opengis.gml.CompositeSurfaceDocument;
import net.opengis.gml.CompositeSurfacePropertyType;
import net.opengis.gml.CompositeSurfaceType;
import net.opengis.gml.CompositeValueDocument;
import net.opengis.gml.CompositeValueType;
import net.opengis.gml.CompoundCRSDocument;
import net.opengis.gml.CompoundCRSRefDocument;
import net.opengis.gml.CompoundCRSRefType;
import net.opengis.gml.CompoundCRSType;
import net.opengis.gml.ConcatenatedOperationDocument;
import net.opengis.gml.ConcatenatedOperationRefDocument;
import net.opengis.gml.ConcatenatedOperationRefType;
import net.opengis.gml.ConcatenatedOperationType;
import net.opengis.gml.ConeDocument;
import net.opengis.gml.ConeType;
import net.opengis.gml.ContainerDocument;
import net.opengis.gml.ContainerPropertyType;
import net.opengis.gml.ContinuousCoverageDocument;
import net.opengis.gml.ConventionalUnitDocument;
import net.opengis.gml.ConventionalUnitType;
import net.opengis.gml.ConversionDocument;
import net.opengis.gml.ConversionRefDocument;
import net.opengis.gml.ConversionRefType;
import net.opengis.gml.ConversionToPreferredUnitDocument;
import net.opengis.gml.ConversionToPreferredUnitType;
import net.opengis.gml.ConversionType;
import net.opengis.gml.CoordDocument;
import net.opengis.gml.CoordType;
import net.opengis.gml.CoordinateOperationDocument;
import net.opengis.gml.CoordinateOperationIDDocument;
import net.opengis.gml.CoordinateOperationNameDocument;
import net.opengis.gml.CoordinateOperationRefDocument;
import net.opengis.gml.CoordinateOperationRefType;
import net.opengis.gml.CoordinateReferenceSystemDocument;
import net.opengis.gml.CoordinateReferenceSystemRefDocument;
import net.opengis.gml.CoordinateReferenceSystemRefType;
import net.opengis.gml.CoordinateSystemAxisBaseType;
import net.opengis.gml.CoordinateSystemAxisDocument;
import net.opengis.gml.CoordinateSystemAxisRefDocument;
import net.opengis.gml.CoordinateSystemAxisRefType;
import net.opengis.gml.CoordinateSystemAxisType;
import net.opengis.gml.CoordinateSystemDocument;
import net.opengis.gml.CoordinateSystemRefDocument;
import net.opengis.gml.CoordinateSystemRefType;
import net.opengis.gml.CoordinatesDocument;
import net.opengis.gml.CoordinatesType;
import net.opengis.gml.CountDocument;
import net.opengis.gml.CountExtentDocument;
import net.opengis.gml.CountExtentType;
import net.opengis.gml.CountListDocument;
import net.opengis.gml.CountPropertyType;
import net.opengis.gml.CovarianceDocument;
import net.opengis.gml.CovarianceElementType;
import net.opengis.gml.CovarianceMatrixDocument;
import net.opengis.gml.CovarianceMatrixType;
import net.opengis.gml.CoverageDocument;
import net.opengis.gml.CoverageFunctionDocument;
import net.opengis.gml.CoverageFunctionType;
import net.opengis.gml.CrsRefDocument;
import net.opengis.gml.CsIDDocument;
import net.opengis.gml.CsNameDocument;
import net.opengis.gml.CubicSplineDocument;
import net.opengis.gml.CubicSplineType;
import net.opengis.gml.CurveArrayPropertyDocument;
import net.opengis.gml.CurveArrayPropertyType;
import net.opengis.gml.CurveDocument;
import net.opengis.gml.CurveInterpolationType;
import net.opengis.gml.CurveMemberDocument;
import net.opengis.gml.CurveMembersDocument;
import net.opengis.gml.CurvePropertyDocument;
import net.opengis.gml.CurvePropertyType;
import net.opengis.gml.CurveSegmentArrayPropertyType;
import net.opengis.gml.CurveSegmentDocument;
import net.opengis.gml.CurveType;
import net.opengis.gml.CylinderDocument;
import net.opengis.gml.CylinderType;
import net.opengis.gml.CylindricalCSDocument;
import net.opengis.gml.CylindricalCSRefDocument;
import net.opengis.gml.CylindricalCSRefType;
import net.opengis.gml.CylindricalCSType;
import net.opengis.gml.DMSAngleType;
import net.opengis.gml.DataBlockDocument;
import net.opengis.gml.DataBlockType;
import net.opengis.gml.DataSourceDocument;
import net.opengis.gml.DatumDocument;
import net.opengis.gml.DatumIDDocument;
import net.opengis.gml.DatumNameDocument;
import net.opengis.gml.DatumRefDocument;
import net.opengis.gml.DatumRefType;
import net.opengis.gml.DecimalMinutesDocument;
import net.opengis.gml.DecimalMinutesType;
import net.opengis.gml.DefaultStyleDocument;
import net.opengis.gml.DefaultStylePropertyType;
import net.opengis.gml.DefinedByConversionDocument;
import net.opengis.gml.DefinitionCollectionDocument;
import net.opengis.gml.DefinitionDocument;
import net.opengis.gml.DefinitionMemberDocument;
import net.opengis.gml.DefinitionProxyDocument;
import net.opengis.gml.DefinitionProxyType;
import net.opengis.gml.DefinitionRefDocument;
import net.opengis.gml.DefinitionType;
import net.opengis.gml.DegreeValueType;
import net.opengis.gml.DegreesDocument;
import net.opengis.gml.DegreesType;
import net.opengis.gml.DerivationUnitTermDocument;
import net.opengis.gml.DerivationUnitTermType;
import net.opengis.gml.DerivedCRSDocument;
import net.opengis.gml.DerivedCRSRefDocument;
import net.opengis.gml.DerivedCRSRefType;
import net.opengis.gml.DerivedCRSType;
import net.opengis.gml.DerivedCRSTypeDocument;
import net.opengis.gml.DerivedCRSTypeType;
import net.opengis.gml.DerivedUnitDocument;
import net.opengis.gml.DerivedUnitType;
import net.opengis.gml.DescriptionDocument;
import net.opengis.gml.DictionaryDocument;
import net.opengis.gml.DictionaryEntryDocument;
import net.opengis.gml.DictionaryEntryType;
import net.opengis.gml.DictionaryType;
import net.opengis.gml.DirectPositionListType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.DirectedEdgeDocument;
import net.opengis.gml.DirectedEdgePropertyType;
import net.opengis.gml.DirectedFaceDocument;
import net.opengis.gml.DirectedFacePropertyType;
import net.opengis.gml.DirectedNodeDocument;
import net.opengis.gml.DirectedNodePropertyType;
import net.opengis.gml.DirectedObservationAtDistanceDocument;
import net.opengis.gml.DirectedObservationAtDistanceType;
import net.opengis.gml.DirectedObservationDocument;
import net.opengis.gml.DirectedObservationType;
import net.opengis.gml.DirectedTopoSolidDocument;
import net.opengis.gml.DirectedTopoSolidPropertyType;
import net.opengis.gml.DirectionDocument;
import net.opengis.gml.DirectionPropertyType;
import net.opengis.gml.DirectionVectorDocument;
import net.opengis.gml.DirectionVectorType;
import net.opengis.gml.DiscreteCoverageDocument;
import net.opengis.gml.DmsAngleDocument;
import net.opengis.gml.DmsAngleValueDocument;
import net.opengis.gml.DomainSetDocument;
import net.opengis.gml.DomainSetType;
import net.opengis.gml.DoubleList;
import net.opengis.gml.DoubleOrNull;
import net.opengis.gml.DoubleOrNullList;
import net.opengis.gml.DoubleOrNullTupleListDocument;
import net.opengis.gml.DrawingTypeType;
import net.opengis.gml.DurationDocument;
import net.opengis.gml.DynamicFeatureCollectionType;
import net.opengis.gml.DynamicFeatureType;
import net.opengis.gml.EdgeDocument;
import net.opengis.gml.EdgeOfDocument;
import net.opengis.gml.EdgeType;
import net.opengis.gml.EllipsoidBaseType;
import net.opengis.gml.EllipsoidDocument;
import net.opengis.gml.EllipsoidIDDocument;
import net.opengis.gml.EllipsoidNameDocument;
import net.opengis.gml.EllipsoidRefDocument;
import net.opengis.gml.EllipsoidRefType;
import net.opengis.gml.EllipsoidType;
import net.opengis.gml.EllipsoidalCSDocument;
import net.opengis.gml.EllipsoidalCSRefDocument;
import net.opengis.gml.EllipsoidalCSRefType;
import net.opengis.gml.EllipsoidalCSType;
import net.opengis.gml.EngineeringCRSDocument;
import net.opengis.gml.EngineeringCRSRefDocument;
import net.opengis.gml.EngineeringCRSRefType;
import net.opengis.gml.EngineeringCRSType;
import net.opengis.gml.EngineeringDatumDocument;
import net.opengis.gml.EngineeringDatumRefDocument;
import net.opengis.gml.EngineeringDatumRefType;
import net.opengis.gml.EngineeringDatumType;
import net.opengis.gml.EnvelopeDocument;
import net.opengis.gml.EnvelopeType;
import net.opengis.gml.EnvelopeWithTimePeriodDocument;
import net.opengis.gml.EnvelopeWithTimePeriodType;
import net.opengis.gml.ExtentOfDocument;
import net.opengis.gml.ExtentType;
import net.opengis.gml.ExteriorDocument;
import net.opengis.gml.FaceDocument;
import net.opengis.gml.FaceType;
import net.opengis.gml.FeatureArrayPropertyType;
import net.opengis.gml.FeatureCollectionDocument;
import net.opengis.gml.FeatureCollectionType;
import net.opengis.gml.FeatureDocument;
import net.opengis.gml.FeatureMemberDocument;
import net.opengis.gml.FeatureMembersDocument;
import net.opengis.gml.FeaturePropertyDocument;
import net.opengis.gml.FeaturePropertyType;
import net.opengis.gml.FeatureStyleDocument;
import net.opengis.gml.FeatureStylePropertyType;
import net.opengis.gml.FeatureStyleType;
import net.opengis.gml.FileDocument;
import net.opengis.gml.FileType;
import net.opengis.gml.FileValueModelType;
import net.opengis.gml.FormulaType;
import net.opengis.gml.GMLDocument;
import net.opengis.gml.GeneralConversionDocument;
import net.opengis.gml.GeneralConversionRefDocument;
import net.opengis.gml.GeneralConversionRefType;
import net.opengis.gml.GeneralDerivedCRSDocument;
import net.opengis.gml.GeneralOperationParameterDocument;
import net.opengis.gml.GeneralParameterValueDocument;
import net.opengis.gml.GeneralTransformationDocument;
import net.opengis.gml.GeneralTransformationRefDocument;
import net.opengis.gml.GeneralTransformationRefType;
import net.opengis.gml.GenericMetaDataDocument;
import net.opengis.gml.GenericMetaDataType;
import net.opengis.gml.GeocentricCRSDocument;
import net.opengis.gml.GeocentricCRSRefDocument;
import net.opengis.gml.GeocentricCRSRefType;
import net.opengis.gml.GeocentricCRSType;
import net.opengis.gml.GeodesicDocument;
import net.opengis.gml.GeodesicStringDocument;
import net.opengis.gml.GeodesicStringType;
import net.opengis.gml.GeodesicType;
import net.opengis.gml.GeodeticDatumDocument;
import net.opengis.gml.GeodeticDatumRefDocument;
import net.opengis.gml.GeodeticDatumRefType;
import net.opengis.gml.GeodeticDatumType;
import net.opengis.gml.GeographicCRSDocument;
import net.opengis.gml.GeographicCRSRefDocument;
import net.opengis.gml.GeographicCRSRefType;
import net.opengis.gml.GeographicCRSType;
import net.opengis.gml.GeometricAggregateDocument;
import net.opengis.gml.GeometricComplexDocument;
import net.opengis.gml.GeometricComplexPropertyType;
import net.opengis.gml.GeometricComplexType;
import net.opengis.gml.GeometricPrimitiveDocument;
import net.opengis.gml.GeometricPrimitivePropertyType;
import net.opengis.gml.GeometryArrayPropertyType;
import net.opengis.gml.GeometryDocument;
import net.opengis.gml.GeometryMemberDocument;
import net.opengis.gml.GeometryMembersDocument;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.GeometryStyleDocument;
import net.opengis.gml.GeometryStylePropertyType;
import net.opengis.gml.GeometryStyleType;
import net.opengis.gml.GraphStyleDocument;
import net.opengis.gml.GraphStylePropertyType;
import net.opengis.gml.GraphStyleType;
import net.opengis.gml.GraphTypeType;
import net.opengis.gml.GreenwichLongitudeDocument;
import net.opengis.gml.GridCoverageDocument;
import net.opengis.gml.GridCoverageType;
import net.opengis.gml.GridDocument;
import net.opengis.gml.GridDomainDocument;
import net.opengis.gml.GridDomainType;
import net.opengis.gml.GridEnvelopeType;
import net.opengis.gml.GridFunctionDocument;
import net.opengis.gml.GridFunctionType;
import net.opengis.gml.GridLengthType;
import net.opengis.gml.GridLimitsType;
import net.opengis.gml.GridType;
import net.opengis.gml.GriddedSurfaceDocument;
import net.opengis.gml.GroupIDDocument;
import net.opengis.gml.GroupNameDocument;
import net.opengis.gml.HistoryDocument;
import net.opengis.gml.HistoryPropertyType;
import net.opengis.gml.IdAttribute;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.ImageCRSDocument;
import net.opengis.gml.ImageCRSRefDocument;
import net.opengis.gml.ImageCRSRefType;
import net.opengis.gml.ImageCRSType;
import net.opengis.gml.ImageDatumDocument;
import net.opengis.gml.ImageDatumRefDocument;
import net.opengis.gml.ImageDatumRefType;
import net.opengis.gml.ImageDatumType;
import net.opengis.gml.ImplicitGeometryDocument;
import net.opengis.gml.IncludesCRSDocument;
import net.opengis.gml.IncludesElementDocument;
import net.opengis.gml.IncludesParameterDocument;
import net.opengis.gml.IncludesValueDocument;
import net.opengis.gml.IncrementOrder;
import net.opengis.gml.IndexMapDocument;
import net.opengis.gml.IndexMapType;
import net.opengis.gml.IndirectEntryDocument;
import net.opengis.gml.IndirectEntryType;
import net.opengis.gml.InnerBoundaryIsDocument;
import net.opengis.gml.IntegerList;
import net.opengis.gml.IntegerOrNull;
import net.opengis.gml.IntegerOrNullList;
import net.opengis.gml.IntegerValueDocument;
import net.opengis.gml.IntegerValueListDocument;
import net.opengis.gml.InteriorDocument;
import net.opengis.gml.InverseFlatteningDocument;
import net.opengis.gml.IsSphereDocument;
import net.opengis.gml.IsolatedDocument;
import net.opengis.gml.IsolatedPropertyType;
import net.opengis.gml.KnotPropertyType;
import net.opengis.gml.KnotType;
import net.opengis.gml.KnotTypesType;
import net.opengis.gml.LabelStyleDocument;
import net.opengis.gml.LabelStylePropertyType;
import net.opengis.gml.LabelStyleType;
import net.opengis.gml.LabelType;
import net.opengis.gml.LengthType;
import net.opengis.gml.LineStringDocument;
import net.opengis.gml.LineStringMemberDocument;
import net.opengis.gml.LineStringPropertyDocument;
import net.opengis.gml.LineStringPropertyType;
import net.opengis.gml.LineStringSegmentArrayPropertyType;
import net.opengis.gml.LineStringSegmentDocument;
import net.opengis.gml.LineStringSegmentType;
import net.opengis.gml.LineStringType;
import net.opengis.gml.LineTypeType;
import net.opengis.gml.LinearCSDocument;
import net.opengis.gml.LinearCSRefDocument;
import net.opengis.gml.LinearCSRefType;
import net.opengis.gml.LinearCSType;
import net.opengis.gml.LinearRingDocument;
import net.opengis.gml.LinearRingPropertyType;
import net.opengis.gml.LinearRingType;
import net.opengis.gml.LocationDocument;
import net.opengis.gml.LocationKeyWordDocument;
import net.opengis.gml.LocationPropertyType;
import net.opengis.gml.LocationStringDocument;
import net.opengis.gml.MappingRuleDocument;
import net.opengis.gml.MaximalComplexDocument;
import net.opengis.gml.MaximumOccursDocument;
import net.opengis.gml.MeasureDescriptionDocument;
import net.opengis.gml.MeasureDocument;
import net.opengis.gml.MeasureListType;
import net.opengis.gml.MeasureOrNullListType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.MemberDocument;
import net.opengis.gml.MembersDocument;
import net.opengis.gml.MeridianIDDocument;
import net.opengis.gml.MeridianNameDocument;
import net.opengis.gml.MetaDataDocument;
import net.opengis.gml.MetaDataPropertyDocument;
import net.opengis.gml.MetaDataPropertyType;
import net.opengis.gml.MethodFormulaDocument;
import net.opengis.gml.MethodIDDocument;
import net.opengis.gml.MethodNameDocument;
import net.opengis.gml.MinimumOccursDocument;
import net.opengis.gml.MinutesDocument;
import net.opengis.gml.ModifiedCoordinateDocument;
import net.opengis.gml.MovingObjectStatusDocument;
import net.opengis.gml.MovingObjectStatusType;
import net.opengis.gml.MultiCenterLineOfDocument;
import net.opengis.gml.MultiCenterOfDocument;
import net.opengis.gml.MultiCoverageDocument;
import net.opengis.gml.MultiCurveCoverageDocument;
import net.opengis.gml.MultiCurveCoverageType;
import net.opengis.gml.MultiCurveDocument;
import net.opengis.gml.MultiCurveDomainDocument;
import net.opengis.gml.MultiCurveDomainType;
import net.opengis.gml.MultiCurvePropertyDocument;
import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiCurveType;
import net.opengis.gml.MultiEdgeOfDocument;
import net.opengis.gml.MultiExtentOfDocument;
import net.opengis.gml.MultiGeometryDocument;
import net.opengis.gml.MultiGeometryPropertyDocument;
import net.opengis.gml.MultiGeometryPropertyType;
import net.opengis.gml.MultiGeometryType;
import net.opengis.gml.MultiLineStringDocument;
import net.opengis.gml.MultiLineStringPropertyType;
import net.opengis.gml.MultiLineStringType;
import net.opengis.gml.MultiLocationDocument;
import net.opengis.gml.MultiPointCoverageDocument;
import net.opengis.gml.MultiPointCoverageType;
import net.opengis.gml.MultiPointDocument;
import net.opengis.gml.MultiPointDomainDocument;
import net.opengis.gml.MultiPointDomainType;
import net.opengis.gml.MultiPointPropertyDocument;
import net.opengis.gml.MultiPointPropertyType;
import net.opengis.gml.MultiPointType;
import net.opengis.gml.MultiPolygonDocument;
import net.opengis.gml.MultiPolygonPropertyType;
import net.opengis.gml.MultiPolygonType;
import net.opengis.gml.MultiPositionDocument;
import net.opengis.gml.MultiSolidCoverageDocument;
import net.opengis.gml.MultiSolidCoverageType;
import net.opengis.gml.MultiSolidDocument;
import net.opengis.gml.MultiSolidDomainDocument;
import net.opengis.gml.MultiSolidDomainType;
import net.opengis.gml.MultiSolidPropertyDocument;
import net.opengis.gml.MultiSolidPropertyType;
import net.opengis.gml.MultiSolidType;
import net.opengis.gml.MultiSurfaceCoverageDocument;
import net.opengis.gml.MultiSurfaceCoverageType;
import net.opengis.gml.MultiSurfaceDocument;
import net.opengis.gml.MultiSurfaceDomainDocument;
import net.opengis.gml.MultiSurfaceDomainType;
import net.opengis.gml.MultiSurfacePropertyDocument;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.MultiSurfaceType;
import net.opengis.gml.NCNameList;
import net.opengis.gml.NameDocument;
import net.opengis.gml.NameList;
import net.opengis.gml.NameOrNull;
import net.opengis.gml.NameOrNullList;
import net.opengis.gml.NodeDocument;
import net.opengis.gml.NodeType;
import net.opengis.gml.NullDocument;
import net.opengis.gml.NullEnumeration;
import net.opengis.gml.NullType;
import net.opengis.gml.ObjectDocument;
import net.opengis.gml.ObliqueCartesianCSDocument;
import net.opengis.gml.ObliqueCartesianCSRefDocument;
import net.opengis.gml.ObliqueCartesianCSRefType;
import net.opengis.gml.ObliqueCartesianCSType;
import net.opengis.gml.ObservationDocument;
import net.opengis.gml.ObservationType;
import net.opengis.gml.OffsetCurveDocument;
import net.opengis.gml.OffsetCurveType;
import net.opengis.gml.OperationDocument;
import net.opengis.gml.OperationMethodBaseType;
import net.opengis.gml.OperationMethodDocument;
import net.opengis.gml.OperationMethodRefDocument;
import net.opengis.gml.OperationMethodRefType;
import net.opengis.gml.OperationMethodType;
import net.opengis.gml.OperationParameterBaseType;
import net.opengis.gml.OperationParameterDocument;
import net.opengis.gml.OperationParameterGroupBaseType;
import net.opengis.gml.OperationParameterGroupDocument;
import net.opengis.gml.OperationParameterGroupRefDocument;
import net.opengis.gml.OperationParameterGroupRefType;
import net.opengis.gml.OperationParameterGroupType;
import net.opengis.gml.OperationParameterRefDocument;
import net.opengis.gml.OperationParameterRefType;
import net.opengis.gml.OperationParameterType;
import net.opengis.gml.OperationRefDocument;
import net.opengis.gml.OperationRefType;
import net.opengis.gml.OperationVersionDocument;
import net.opengis.gml.OrientableCurveDocument;
import net.opengis.gml.OrientableCurveType;
import net.opengis.gml.OrientableSurfaceDocument;
import net.opengis.gml.OrientableSurfaceType;
import net.opengis.gml.OriginDocument;
import net.opengis.gml.OuterBoundaryIsDocument;
import net.opengis.gml.ParameterIDDocument;
import net.opengis.gml.ParameterNameDocument;
import net.opengis.gml.ParameterValueDocument;
import net.opengis.gml.ParameterValueGroupDocument;
import net.opengis.gml.ParameterValueGroupType;
import net.opengis.gml.ParameterValueType;
import net.opengis.gml.ParametricCurveSurfaceDocument;
import net.opengis.gml.PassThroughOperationDocument;
import net.opengis.gml.PassThroughOperationRefDocument;
import net.opengis.gml.PassThroughOperationRefType;
import net.opengis.gml.PassThroughOperationType;
import net.opengis.gml.PatchesDocument;
import net.opengis.gml.PixelInCellDocument;
import net.opengis.gml.PixelInCellType;
import net.opengis.gml.PointArrayPropertyDocument;
import net.opengis.gml.PointArrayPropertyType;
import net.opengis.gml.PointDocument;
import net.opengis.gml.PointMemberDocument;
import net.opengis.gml.PointMembersDocument;
import net.opengis.gml.PointPropertyDocument;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.PointRepDocument;
import net.opengis.gml.PointType;
import net.opengis.gml.PolarCSDocument;
import net.opengis.gml.PolarCSRefDocument;
import net.opengis.gml.PolarCSRefType;
import net.opengis.gml.PolarCSType;
import net.opengis.gml.PolygonDocument;
import net.opengis.gml.PolygonMemberDocument;
import net.opengis.gml.PolygonPatchArrayPropertyType;
import net.opengis.gml.PolygonPatchDocument;
import net.opengis.gml.PolygonPatchType;
import net.opengis.gml.PolygonPatchesDocument;
import net.opengis.gml.PolygonPropertyDocument;
import net.opengis.gml.PolygonPropertyType;
import net.opengis.gml.PolygonType;
import net.opengis.gml.PolyhedralSurfaceDocument;
import net.opengis.gml.PolyhedralSurfaceType;
import net.opengis.gml.PosDocument;
import net.opengis.gml.PosListDocument;
import net.opengis.gml.PositionDocument;
import net.opengis.gml.PositionalAccuracyDocument;
import net.opengis.gml.PrimeMeridianBaseType;
import net.opengis.gml.PrimeMeridianDocument;
import net.opengis.gml.PrimeMeridianRefDocument;
import net.opengis.gml.PrimeMeridianRefType;
import net.opengis.gml.PrimeMeridianType;
import net.opengis.gml.PriorityLocationDocument;
import net.opengis.gml.PriorityLocationPropertyType;
import net.opengis.gml.ProjectedCRSDocument;
import net.opengis.gml.ProjectedCRSRefDocument;
import net.opengis.gml.ProjectedCRSRefType;
import net.opengis.gml.ProjectedCRSType;
import net.opengis.gml.QNameList;
import net.opengis.gml.QuantityDocument;
import net.opengis.gml.QuantityExtentDocument;
import net.opengis.gml.QuantityExtentType;
import net.opengis.gml.QuantityListDocument;
import net.opengis.gml.QuantityPropertyType;
import net.opengis.gml.QuantityTypeDocument;
import net.opengis.gml.QueryGrammarEnumeration;
import net.opengis.gml.RangeParametersDocument;
import net.opengis.gml.RangeParametersType;
import net.opengis.gml.RangeSetDocument;
import net.opengis.gml.RangeSetType;
import net.opengis.gml.RealizationEpochDocument;
import net.opengis.gml.RectangleDocument;
import net.opengis.gml.RectangleType;
import net.opengis.gml.RectifiedGridCoverageDocument;
import net.opengis.gml.RectifiedGridCoverageType;
import net.opengis.gml.RectifiedGridDocument;
import net.opengis.gml.RectifiedGridDomainDocument;
import net.opengis.gml.RectifiedGridDomainType;
import net.opengis.gml.RectifiedGridType;
import net.opengis.gml.ReferenceDocument;
import net.opengis.gml.ReferenceSystemDocument;
import net.opengis.gml.ReferenceSystemRefDocument;
import net.opengis.gml.ReferenceSystemRefType;
import net.opengis.gml.ReferenceType;
import net.opengis.gml.RelatedTimeType;
import net.opengis.gml.RelativeInternalPositionalAccuracyDocument;
import net.opengis.gml.RelativeInternalPositionalAccuracyType;
import net.opengis.gml.RemarksDocument;
import net.opengis.gml.RemoteSchemaAttribute;
import net.opengis.gml.ResultDocument;
import net.opengis.gml.ResultOfDocument;
import net.opengis.gml.RingDocument;
import net.opengis.gml.RingPropertyType;
import net.opengis.gml.RingType;
import net.opengis.gml.RoughConversionToPreferredUnitDocument;
import net.opengis.gml.RowIndexDocument;
import net.opengis.gml.ScalarValuePropertyType;
import net.opengis.gml.ScaleType;
import net.opengis.gml.ScopeDocument;
import net.opengis.gml.SecondDefiningParameterDocument;
import net.opengis.gml.SecondDefiningParameterType;
import net.opengis.gml.SecondsDocument;
import net.opengis.gml.SegmentsDocument;
import net.opengis.gml.SemiMajorAxisDocument;
import net.opengis.gml.SemiMinorAxisDocument;
import net.opengis.gml.SequenceRuleNames;
import net.opengis.gml.SequenceRuleType;
import net.opengis.gml.SignType;
import net.opengis.gml.SingleOperationDocument;
import net.opengis.gml.SingleOperationRefDocument;
import net.opengis.gml.SingleOperationRefType;
import net.opengis.gml.SolidArrayPropertyDocument;
import net.opengis.gml.SolidArrayPropertyType;
import net.opengis.gml.SolidDocument;
import net.opengis.gml.SolidMemberDocument;
import net.opengis.gml.SolidMembersDocument;
import net.opengis.gml.SolidPropertyDocument;
import net.opengis.gml.SolidPropertyType;
import net.opengis.gml.SolidType;
import net.opengis.gml.SourceCRSDocument;
import net.opengis.gml.SourceDimensionsDocument;
import net.opengis.gml.SpeedType;
import net.opengis.gml.SphereDocument;
import net.opengis.gml.SphereType;
import net.opengis.gml.SphericalCSDocument;
import net.opengis.gml.SphericalCSRefDocument;
import net.opengis.gml.SphericalCSRefType;
import net.opengis.gml.SphericalCSType;
import net.opengis.gml.SrsIDDocument;
import net.opengis.gml.SrsNameDocument;
import net.opengis.gml.StatusDocument;
import net.opengis.gml.StrictAssociationDocument;
import net.opengis.gml.StringOrNull;
import net.opengis.gml.StringOrRefType;
import net.opengis.gml.StringValueDocument;
import net.opengis.gml.StyleDocument;
import net.opengis.gml.StyleType;
import net.opengis.gml.StyleVariationType;
import net.opengis.gml.SubComplexDocument;
import net.opengis.gml.SubjectDocument;
import net.opengis.gml.SuccessionType;
import net.opengis.gml.SuperComplexDocument;
import net.opengis.gml.SurfaceArrayPropertyDocument;
import net.opengis.gml.SurfaceArrayPropertyType;
import net.opengis.gml.SurfaceDocument;
import net.opengis.gml.SurfaceInterpolationType;
import net.opengis.gml.SurfaceMemberDocument;
import net.opengis.gml.SurfaceMembersDocument;
import net.opengis.gml.SurfacePatchArrayPropertyType;
import net.opengis.gml.SurfacePatchDocument;
import net.opengis.gml.SurfacePropertyDocument;
import net.opengis.gml.SurfacePropertyType;
import net.opengis.gml.SurfaceType;
import net.opengis.gml.SymbolDocument;
import net.opengis.gml.SymbolType;
import net.opengis.gml.SymbolTypeEnumeration;
import net.opengis.gml.TargetCRSDocument;
import net.opengis.gml.TargetDimensionsDocument;
import net.opengis.gml.TargetDocument;
import net.opengis.gml.TargetPropertyType;
import net.opengis.gml.TemporalCRSDocument;
import net.opengis.gml.TemporalCRSRefDocument;
import net.opengis.gml.TemporalCRSRefType;
import net.opengis.gml.TemporalCRSType;
import net.opengis.gml.TemporalCSDocument;
import net.opengis.gml.TemporalCSRefDocument;
import net.opengis.gml.TemporalCSRefType;
import net.opengis.gml.TemporalCSType;
import net.opengis.gml.TemporalDatumBaseType;
import net.opengis.gml.TemporalDatumDocument;
import net.opengis.gml.TemporalDatumRefDocument;
import net.opengis.gml.TemporalDatumRefType;
import net.opengis.gml.TemporalDatumType;
import net.opengis.gml.TemporalExtentDocument;
import net.opengis.gml.TimeCalendarDocument;
import net.opengis.gml.TimeCalendarEraDocument;
import net.opengis.gml.TimeCalendarEraPropertyType;
import net.opengis.gml.TimeCalendarEraType;
import net.opengis.gml.TimeCalendarPropertyType;
import net.opengis.gml.TimeCalendarType;
import net.opengis.gml.TimeClockDocument;
import net.opengis.gml.TimeClockPropertyType;
import net.opengis.gml.TimeClockType;
import net.opengis.gml.TimeComplexDocument;
import net.opengis.gml.TimeCoordinateSystemDocument;
import net.opengis.gml.TimeCoordinateSystemType;
import net.opengis.gml.TimeEdgeDocument;
import net.opengis.gml.TimeEdgePropertyType;
import net.opengis.gml.TimeEdgeType;
import net.opengis.gml.TimeGeometricPrimitiveDocument;
import net.opengis.gml.TimeGeometricPrimitivePropertyType;
import net.opengis.gml.TimeIndeterminateValueType;
import net.opengis.gml.TimeInstantDocument;
import net.opengis.gml.TimeInstantPropertyType;
import net.opengis.gml.TimeInstantType;
import net.opengis.gml.TimeIntervalDocument;
import net.opengis.gml.TimeIntervalLengthType;
import net.opengis.gml.TimeNodeDocument;
import net.opengis.gml.TimeNodePropertyType;
import net.opengis.gml.TimeNodeType;
import net.opengis.gml.TimeObjectDocument;
import net.opengis.gml.TimeOrdinalEraDocument;
import net.opengis.gml.TimeOrdinalEraPropertyType;
import net.opengis.gml.TimeOrdinalEraType;
import net.opengis.gml.TimeOrdinalReferenceSystemDocument;
import net.opengis.gml.TimeOrdinalReferenceSystemType;
import net.opengis.gml.TimePeriodDocument;
import net.opengis.gml.TimePeriodPropertyType;
import net.opengis.gml.TimePeriodType;
import net.opengis.gml.TimePositionDocument;
import net.opengis.gml.TimePositionType;
import net.opengis.gml.TimePositionUnion;
import net.opengis.gml.TimePrimitiveDocument;
import net.opengis.gml.TimePrimitivePropertyType;
import net.opengis.gml.TimeReferenceSystemDocument;
import net.opengis.gml.TimeSliceDocument;
import net.opengis.gml.TimeTopologyComplexDocument;
import net.opengis.gml.TimeTopologyComplexPropertyType;
import net.opengis.gml.TimeTopologyComplexType;
import net.opengis.gml.TimeTopologyPrimitiveDocument;
import net.opengis.gml.TimeTopologyPrimitivePropertyType;
import net.opengis.gml.TimeType;
import net.opengis.gml.TimeUnitType;
import net.opengis.gml.TinDocument;
import net.opengis.gml.TinType;
import net.opengis.gml.TopoComplexDocument;
import net.opengis.gml.TopoComplexMemberType;
import net.opengis.gml.TopoComplexPropertyDocument;
import net.opengis.gml.TopoComplexType;
import net.opengis.gml.TopoCurveDocument;
import net.opengis.gml.TopoCurvePropertyDocument;
import net.opengis.gml.TopoCurvePropertyType;
import net.opengis.gml.TopoCurveType;
import net.opengis.gml.TopoPointDocument;
import net.opengis.gml.TopoPointPropertyDocument;
import net.opengis.gml.TopoPointPropertyType;
import net.opengis.gml.TopoPointType;
import net.opengis.gml.TopoPrimitiveArrayAssociationType;
import net.opengis.gml.TopoPrimitiveDocument;
import net.opengis.gml.TopoPrimitiveMemberDocument;
import net.opengis.gml.TopoPrimitiveMemberType;
import net.opengis.gml.TopoPrimitiveMembersDocument;
import net.opengis.gml.TopoSolidDocument;
import net.opengis.gml.TopoSolidType;
import net.opengis.gml.TopoSurfaceDocument;
import net.opengis.gml.TopoSurfacePropertyDocument;
import net.opengis.gml.TopoSurfacePropertyType;
import net.opengis.gml.TopoSurfaceType;
import net.opengis.gml.TopoVolumeDocument;
import net.opengis.gml.TopoVolumePropertyDocument;
import net.opengis.gml.TopoVolumePropertyType;
import net.opengis.gml.TopoVolumeType;
import net.opengis.gml.TopologyDocument;
import net.opengis.gml.TopologyStyleDocument;
import net.opengis.gml.TopologyStylePropertyType;
import net.opengis.gml.TopologyStyleType;
import net.opengis.gml.TrackDocument;
import net.opengis.gml.TrackType;
import net.opengis.gml.TransformAttribute;
import net.opengis.gml.TransformationDocument;
import net.opengis.gml.TransformationRefDocument;
import net.opengis.gml.TransformationRefType;
import net.opengis.gml.TransformationType;
import net.opengis.gml.TriangleDocument;
import net.opengis.gml.TrianglePatchArrayPropertyType;
import net.opengis.gml.TrianglePatchesDocument;
import net.opengis.gml.TriangleType;
import net.opengis.gml.TriangulatedSurfaceDocument;
import net.opengis.gml.TriangulatedSurfaceType;
import net.opengis.gml.TupleListDocument;
import net.opengis.gml.UnitDefinitionDocument;
import net.opengis.gml.UnitDefinitionType;
import net.opengis.gml.UnitOfMeasureDocument;
import net.opengis.gml.UnitOfMeasureType;
import net.opengis.gml.UomAttribute;
import net.opengis.gml.UserDefinedCSDocument;
import net.opengis.gml.UserDefinedCSRefDocument;
import net.opengis.gml.UserDefinedCSRefType;
import net.opengis.gml.UserDefinedCSType;
import net.opengis.gml.UsesAxisDocument;
import net.opengis.gml.UsesCSDocument;
import net.opengis.gml.UsesCartesianCSDocument;
import net.opengis.gml.UsesEllipsoidDocument;
import net.opengis.gml.UsesEllipsoidalCSDocument;
import net.opengis.gml.UsesEngineeringDatumDocument;
import net.opengis.gml.UsesGeodeticDatumDocument;
import net.opengis.gml.UsesImageDatumDocument;
import net.opengis.gml.UsesMethodDocument;
import net.opengis.gml.UsesObliqueCartesianCSDocument;
import net.opengis.gml.UsesOperationDocument;
import net.opengis.gml.UsesParameterDocument;
import net.opengis.gml.UsesPrimeMeridianDocument;
import net.opengis.gml.UsesSingleOperationDocument;
import net.opengis.gml.UsesSphericalCSDocument;
import net.opengis.gml.UsesTemporalCSDocument;
import net.opengis.gml.UsesTemporalDatumDocument;
import net.opengis.gml.UsesValueDocument;
import net.opengis.gml.UsesVerticalCSDocument;
import net.opengis.gml.UsesVerticalDatumDocument;
import net.opengis.gml.UsingDocument;
import net.opengis.gml.ValidAreaDocument;
import net.opengis.gml.ValidTimeDocument;
import net.opengis.gml.ValueArrayDocument;
import net.opengis.gml.ValueArrayPropertyType;
import net.opengis.gml.ValueArrayType;
import net.opengis.gml.ValueComponentDocument;
import net.opengis.gml.ValueComponentsDocument;
import net.opengis.gml.ValueDocument;
import net.opengis.gml.ValueFileDocument;
import net.opengis.gml.ValueListDocument;
import net.opengis.gml.ValueOfParameterDocument;
import net.opengis.gml.ValuePropertyDocument;
import net.opengis.gml.ValuePropertyType;
import net.opengis.gml.ValuesOfGroupDocument;
import net.opengis.gml.VectorDocument;
import net.opengis.gml.VectorType;
import net.opengis.gml.VersionDocument;
import net.opengis.gml.VerticalCRSDocument;
import net.opengis.gml.VerticalCRSRefDocument;
import net.opengis.gml.VerticalCRSRefType;
import net.opengis.gml.VerticalCRSType;
import net.opengis.gml.VerticalCSDocument;
import net.opengis.gml.VerticalCSRefDocument;
import net.opengis.gml.VerticalCSRefType;
import net.opengis.gml.VerticalCSType;
import net.opengis.gml.VerticalDatumDocument;
import net.opengis.gml.VerticalDatumRefDocument;
import net.opengis.gml.VerticalDatumRefType;
import net.opengis.gml.VerticalDatumType;
import net.opengis.gml.VerticalDatumTypeDocument;
import net.opengis.gml.VerticalDatumTypeType;
import net.opengis.gml.VerticalExtentDocument;
import net.opengis.gml.VolumeType;
import org.lidoSchema.ActorComplexType;
import org.lidoSchema.ActorInRoleComplexType;
import org.lidoSchema.ActorInRoleSetComplexType;
import org.lidoSchema.ActorSetComplexType;
import org.lidoSchema.AddedSearchTermAttribute;
import org.lidoSchema.AdministrativeMetadataComplexType;
import org.lidoSchema.AdministrativeMetadataDocument;
import org.lidoSchema.AppellationComplexType;
import org.lidoSchema.ClassificationWrapDocument;
import org.lidoSchema.ConceptComplexType;
import org.lidoSchema.DateComplexType;
import org.lidoSchema.DateSetComplexType;
import org.lidoSchema.DescriptiveMetadataComplexType;
import org.lidoSchema.DescriptiveMetadataDocument;
import org.lidoSchema.DescriptiveNoteComplexType;
import org.lidoSchema.DisplayStateEditionWrapDocument;
import org.lidoSchema.EncodinganalogAttribute;
import org.lidoSchema.EventComplexType;
import org.lidoSchema.EventSetComplexType;
import org.lidoSchema.EventWrapDocument;
import org.lidoSchema.GeographicalEntityAttribute;
import org.lidoSchema.GmlComplexType;
import org.lidoSchema.IdentifierComplexType;
import org.lidoSchema.InscriptionsWrapDocument;
import org.lidoSchema.LabelAttribute;
import org.lidoSchema.LegalBodyRefComplexType;
import org.lidoSchema.LidoComplexType;
import org.lidoSchema.LidoDocument;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.MaterialsTechComplexType;
import org.lidoSchema.MaterialsTechSetComplexType;
import org.lidoSchema.MeasurementsSetComplexType;
import org.lidoSchema.ObjectClassificationWrapDocument;
import org.lidoSchema.ObjectComplexType;
import org.lidoSchema.ObjectDescriptionWrapDocument;
import org.lidoSchema.ObjectIdentificationWrapDocument;
import org.lidoSchema.ObjectMeasurementsComplexType;
import org.lidoSchema.ObjectMeasurementsSetComplexType;
import org.lidoSchema.ObjectMeasurementsWrapDocument;
import org.lidoSchema.ObjectRelationWrapDocument;
import org.lidoSchema.ObjectSetComplexType;
import org.lidoSchema.ObjectWorkTypeWrapDocument;
import org.lidoSchema.PlaceComplexType;
import org.lidoSchema.PlaceSetComplexType;
import org.lidoSchema.PoliticalEntityAttribute;
import org.lidoSchema.PrefAttribute;
import org.lidoSchema.RecordInfoSetComplexType;
import org.lidoSchema.RecordWrapDocument;
import org.lidoSchema.RelatedEventSetComplexType;
import org.lidoSchema.RelatedWorkSetComplexType;
import org.lidoSchema.RelatedWorksWrapDocument;
import org.lidoSchema.RelatedencodingAttribute;
import org.lidoSchema.RepositorySetComplexType;
import org.lidoSchema.RepositoryWrapDocument;
import org.lidoSchema.ResourceSetComplexType;
import org.lidoSchema.ResourceWrapDocument;
import org.lidoSchema.RightsComplexType;
import org.lidoSchema.RightsWorkWrapDocument;
import org.lidoSchema.SortorderAttribute;
import org.lidoSchema.SourceAttribute;
import org.lidoSchema.SubjectComplexType;
import org.lidoSchema.SubjectSetComplexType;
import org.lidoSchema.SubjectWrapDocument;
import org.lidoSchema.TermComplexType;
import org.lidoSchema.TextComplexType;
import org.lidoSchema.TitleWrapDocument;
import org.lidoSchema.TypeAttribute;
import org.lidoSchema.WebResourceComplexType;
import org.moosbusch.museum.lido.document.Document;
import org.moosbusch.museum.lido.document.impl.DocumentImpl;
import org.moosbusch.museum.lido.inject.spi.AbstractLIDOModule;
import org.w3.x1999.xlink.ActuateAttribute;
import org.w3.x1999.xlink.ActuateType;
import org.w3.x1999.xlink.ArcroleAttribute;
import org.w3.x1999.xlink.ArcroleType;
import org.w3.x1999.xlink.Extended;
import org.w3.x1999.xlink.FromAttribute;
import org.w3.x1999.xlink.FromType;
import org.w3.x1999.xlink.HrefAttribute;
import org.w3.x1999.xlink.HrefType;
import org.w3.x1999.xlink.LocatorDocument;
import org.w3.x1999.xlink.LocatorType;
import org.w3.x1999.xlink.ResourceDocument;
import org.w3.x1999.xlink.ResourceType;
import org.w3.x1999.xlink.RoleAttribute;
import org.w3.x1999.xlink.RoleType;
import org.w3.x1999.xlink.ShowAttribute;
import org.w3.x1999.xlink.ShowType;
import org.w3.x1999.xlink.Simple;
import org.w3.x1999.xlink.TitleAttrType;
import org.w3.x1999.xlink.TitleAttribute;
import org.w3.x1999.xlink.TitleDocument;
import org.w3.x1999.xlink.TitleEltType;
import org.w3.x1999.xlink.ToAttribute;
import org.w3.x1999.xlink.ToType;
import org.w3.x1999.xlink.TypeType;
import org.w3.x2001.smil20.AnimateColorDocument;
import org.w3.x2001.smil20.AnimateColorPrototype;
import org.w3.x2001.smil20.AnimateDocument;
import org.w3.x2001.smil20.AnimateMotionDocument;
import org.w3.x2001.smil20.AnimateMotionPrototype;
import org.w3.x2001.smil20.AnimatePrototype;
import org.w3.x2001.smil20.FillDefaultType;
import org.w3.x2001.smil20.FillTimingAttrsType;
import org.w3.x2001.smil20.NonNegativeDecimalType;
import org.w3.x2001.smil20.RestartDefaultType;
import org.w3.x2001.smil20.RestartTimingType;
import org.w3.x2001.smil20.SetDocument;
import org.w3.x2001.smil20.SetPrototype;
import org.w3.x2001.smil20.SyncBehaviorDefaultType;
import org.w3.x2001.smil20.SyncBehaviorType;
import org.w3.x2001.smil20.language.AnimateColorType;
import org.w3.x2001.smil20.language.AnimateMotionType;
import org.w3.x2001.smil20.language.AnimateType;
import org.w3.x2001.smil20.language.SetType;

/**
 *
 * @author moosbusch
 */
public class LIDOModuleImpl extends AbstractLIDOModule {

    @Override
    protected void configure() {
    }

    @Provides
    public Document<? extends LIDOObjectFactory> createDocument() {
        return new DocumentImpl();
    }

    @Provides
    public AnimateMotionType createAnimateMotionType() {
        AnimateMotionType result = AnimateMotionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RepositorySetComplexType createRepository() {
        RepositorySetComplexType result = RepositorySetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimateColorDocument createAnimateColorDocument() {
        AnimateColorDocument result = AnimateColorDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimateColorType createAnimateColorType() {
        AnimateColorType result = AnimateColorType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimateDocument createAnimateDocument() {
        AnimateDocument result = AnimateDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimateMotionDocument createAnimateMotionDocument() {
        AnimateMotionDocument result = AnimateMotionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimateType createAnimateType() {
        AnimateType result = AnimateType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SetDocument createSetDocument() {
        SetDocument result = SetDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SetType createSetType() {
        SetType result = SetType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimateColorPrototype createAnimateColorPrototype() {
        AnimateColorPrototype result = AnimateColorPrototype.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimateMotionPrototype createAnimateMotionPrototype() {
        AnimateMotionPrototype result = AnimateMotionPrototype.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnimatePrototype createAnimatePrototype() {
        AnimatePrototype result = AnimatePrototype.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FillDefaultType createFillDefaultType() {
        FillDefaultType result = FillDefaultType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FillTimingAttrsType createFillTimingAttrsType() {
        FillTimingAttrsType result = FillTimingAttrsType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NonNegativeDecimalType createNonNegativeDecimalType() {
        NonNegativeDecimalType result = NonNegativeDecimalType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RestartDefaultType createRestartDefaultType() {
        RestartDefaultType result = RestartDefaultType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RestartTimingType createRestartTimingType() {
        RestartTimingType result = RestartTimingType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SetPrototype createSetPrototype() {
        SetPrototype result = SetPrototype.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SyncBehaviorDefaultType createSyncBehaviorDefaultType() {
        SyncBehaviorDefaultType result = SyncBehaviorDefaultType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SyncBehaviorType createSyncBehaviorType() {
        SyncBehaviorType result = SyncBehaviorType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ActuateAttribute createActuateAttribute() {
        ActuateAttribute result = ActuateAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ActuateType createActuateType() {
        ActuateType result = ActuateType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcDocument createArcDocument() {
        ArcDocument result = ArcDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcroleAttribute createArcroleAttribute() {
        ArcroleAttribute result = ArcroleAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcroleType createArcroleType() {
        ArcroleType result = ArcroleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcType createArcType() {
        ArcType result = ArcType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Extended createExtended() {
        Extended result = Extended.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FromAttribute createFromAttribute() {
        FromAttribute result = FromAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FromType createFromType() {
        FromType result = FromType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public HrefAttribute createHrefAttribute() {
        HrefAttribute result = HrefAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public HrefType createHrefType() {
        HrefType result = HrefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LabelAttribute createLabelAttribute() {
        LabelAttribute result = LabelAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LabelType createLabelType() {
        LabelType result = LabelType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LocatorDocument createLocatorDocument() {
        LocatorDocument result = LocatorDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LocatorType createLocatorType() {
        LocatorType result = LocatorType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResourceDocument createResourceDocument() {
        ResourceDocument result = ResourceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResourceType createResourceType() {
        ResourceType result = ResourceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RoleAttribute createRoleAttribute() {
        RoleAttribute result = RoleAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RoleType createRoleType() {
        RoleType result = RoleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ShowAttribute createShowAttribute() {
        ShowAttribute result = ShowAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ShowType createShowType() {
        ShowType result = ShowType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Simple createSimple() {
        Simple result = Simple.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TitleAttribute createTitleAttribute() {
        TitleAttribute result = TitleAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TitleAttrType createTitleAttrType() {
        TitleAttrType result = TitleAttrType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TitleDocument createTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TitleEltType createTitleEltType() {
        TitleEltType result = TitleEltType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ToAttribute createToAttribute() {
        ToAttribute result = ToAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ToType createToType() {
        ToType result = ToType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TypeAttribute createTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TypeType createTypeType() {
        TypeType result = TypeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ActorComplexType createActorComplexType() {
        ActorComplexType result = ActorComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ActorInRoleComplexType createActorInRoleComplexType() {
        ActorInRoleComplexType result = ActorInRoleComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ActorInRoleSetComplexType createActorInRoleSetComplexType() {
        ActorInRoleSetComplexType result = ActorInRoleSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ActorSetComplexType createActorSetComplexType() {
        ActorSetComplexType result = ActorSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AddedSearchTermAttribute createAddedSearchTermAttribute() {
        AddedSearchTermAttribute result = AddedSearchTermAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AdministrativeMetadataComplexType createAdministrativeMetadataComplexType() {
        AdministrativeMetadataComplexType result = AdministrativeMetadataComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AppellationComplexType createAppellationComplexType() {
        AppellationComplexType result = AppellationComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ClassificationWrapDocument createClassificationWrapDocument() {
        ClassificationWrapDocument result = ClassificationWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConceptComplexType createConceptComplexType() {
        ConceptComplexType result = ConceptComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DateComplexType createDateComplexType() {
        DateComplexType result = DateComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DateSetComplexType createDateSetComplexType() {
        DateSetComplexType result = DateSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DescriptiveMetadataComplexType createDescriptiveMetadataComplexType() {
        DescriptiveMetadataComplexType result = DescriptiveMetadataComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DescriptiveNoteComplexType createDescriptiveNoteComplexType() {
        DescriptiveNoteComplexType result = DescriptiveNoteComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EncodinganalogAttribute createEncodinganalogAttribute() {
        EncodinganalogAttribute result = EncodinganalogAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EventComplexType createEventComplexType() {
        EventComplexType result = EventComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EventSetComplexType createEventSetComplexType() {
        EventSetComplexType result = EventSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EventWrapDocument createEventWrapDocument() {
        EventWrapDocument result = EventWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeographicalEntityAttribute createGeographicalEntityAttribute() {
        GeographicalEntityAttribute result = GeographicalEntityAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GmlComplexType createGmlComplexType() {
        GmlComplexType result = GmlComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IdentifierComplexType createIdentifierComplexType() {
        IdentifierComplexType result = IdentifierComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public InscriptionsWrapDocument createInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LegalBodyRefComplexType createLegalBodyRefComplexType() {
        LegalBodyRefComplexType result = LegalBodyRefComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LidoComplexType createLidoComplexType() {
        LidoComplexType result = LidoComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LidoDocument createLidoDocument() {
        LidoDocument result = LidoDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LidoWrapDocument createLidoWrapDocument() {
        LidoWrapDocument result = LidoWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MaterialsTechComplexType createMaterialsTechComplexType() {
        MaterialsTechComplexType result = MaterialsTechComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MaterialsTechSetComplexType createMaterialsTechSetComplexType() {
        MaterialsTechSetComplexType result = MaterialsTechSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeasurementsSetComplexType createMeasurementsSetComplexType() {
        MeasurementsSetComplexType result = MeasurementsSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectClassificationWrapDocument createObjectClassificationWrapDocument() {
        ObjectClassificationWrapDocument result = ObjectClassificationWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectComplexType createObjectComplexType() {
        ObjectComplexType result = ObjectComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectDescriptionWrapDocument createObjectDescriptionWrapDocument() {
        ObjectDescriptionWrapDocument result = ObjectDescriptionWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectIdentificationWrapDocument createObjectIdentificationWrapDocument() {
        ObjectIdentificationWrapDocument result = ObjectIdentificationWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectMeasurementsComplexType createObjectMeasurementsComplexType() {
        ObjectMeasurementsComplexType result = ObjectMeasurementsComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectMeasurementsSetComplexType createObjectMeasurementsSetComplexType() {
        ObjectMeasurementsSetComplexType result = ObjectMeasurementsSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectMeasurementsWrapDocument createObjectMeasurementsWrapDocument() {
        ObjectMeasurementsWrapDocument result = ObjectMeasurementsWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectRelationWrapDocument createObjectRelationWrapDocument() {
        ObjectRelationWrapDocument result = ObjectRelationWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectSetComplexType createObjectSetComplexType() {
        ObjectSetComplexType result = ObjectSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PlaceComplexType createPlaceComplexType() {
        PlaceComplexType result = PlaceComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PlaceSetComplexType createPlaceSetComplexType() {
        PlaceSetComplexType result = PlaceSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PoliticalEntityAttribute createPoliticalEntityAttribute() {
        PoliticalEntityAttribute result = PoliticalEntityAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrefAttribute createPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RecordInfoSetComplexType createRecordInfoSetComplexType() {
        RecordInfoSetComplexType result = RecordInfoSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RecordWrapDocument createRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelatedencodingAttribute createRelatedencodingAttribute() {
        RelatedencodingAttribute result = RelatedencodingAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelatedEventSetComplexType createRelatedEventSetComplexType() {
        RelatedEventSetComplexType result = RelatedEventSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelatedWorkSetComplexType createRelatedWorkSetComplexType() {
        RelatedWorkSetComplexType result = RelatedWorkSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RepositoryWrapDocument createRepositoryWrapDocument() {
        RepositoryWrapDocument result = RepositoryWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResourceSetComplexType createResourceSetComplexType() {
        ResourceSetComplexType result = ResourceSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResourceWrapDocument createResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RightsComplexType createRightsComplexType() {
        RightsComplexType result = RightsComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RightsWorkWrapDocument createRightsWorkWrapDocument() {
        RightsWorkWrapDocument result = RightsWorkWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SortorderAttribute createSortorderAttribute() {
        SortorderAttribute result = SortorderAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SourceAttribute createSourceAttribute() {
        SourceAttribute result = SourceAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SubjectComplexType createSubjectComplexType() {
        SubjectComplexType result = SubjectComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SubjectSetComplexType createSubjectSetComplexType() {
        SubjectSetComplexType result = SubjectSetComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SubjectWrapDocument createSubjectWrapDocument() {
        SubjectWrapDocument result = SubjectWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TermComplexType createTermComplexType() {
        TermComplexType result = TermComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TextComplexType createTextComplexType() {
        TextComplexType result = TextComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TitleWrapDocument createTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public WebResourceComplexType createWebResourceComplexType() {
        WebResourceComplexType result = WebResourceComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbsoluteExternalPositionalAccuracyDocument createAbsoluteExternalPositionalAccuracyDocument() {
        AbsoluteExternalPositionalAccuracyDocument result =
                AbsoluteExternalPositionalAccuracyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbsoluteExternalPositionalAccuracyType createAbsoluteExternalPositionalAccuracyType() {
        AbsoluteExternalPositionalAccuracyType result = AbsoluteExternalPositionalAccuracyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractContinuousCoverageType createAbstractContinuousCoverageType() {
        AbstractContinuousCoverageType result = AbstractContinuousCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractCoordinateOperationBaseType createAbstractCoordinateOperationBaseType() {
        AbstractCoordinateOperationBaseType result = AbstractCoordinateOperationBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractCoordinateOperationType createAbstractCoordinateOperationType() {
        AbstractCoordinateOperationType result = AbstractCoordinateOperationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractCoordinateSystemBaseType createAbstractCoordinateSystemBaseType() {
        AbstractCoordinateSystemBaseType result = AbstractCoordinateSystemBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractCoordinateSystemType createAbstractCoordinateSystemType() {
        AbstractCoordinateSystemType result = AbstractCoordinateSystemType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractCoverageType createAbstractCoverageType() {
        AbstractCoverageType result = AbstractCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractCurveSegmentType createAbstractCurveSegmentType() {
        AbstractCurveSegmentType result = AbstractCurveSegmentType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractCurveType createAbstractCurveType() {
        AbstractCurveType result = AbstractCurveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractDatumBaseType createAbstractDatumBaseType() {
        AbstractDatumBaseType result = AbstractDatumBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractDatumType createAbstractDatumType() {
        AbstractDatumType result = AbstractDatumType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractDiscreteCoverageType createAbstractDiscreteCoverageType() {
        AbstractDiscreteCoverageType result = AbstractDiscreteCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractFeatureCollectionType createAbstractFeatureCollectionType() {
        AbstractFeatureCollectionType result = AbstractFeatureCollectionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractFeatureType createAbstractFeatureType() {
        AbstractFeatureType result = AbstractFeatureType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeneralConversionType createAbstractGeneralConversionType() {
        AbstractGeneralConversionType result = AbstractGeneralConversionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeneralDerivedCRSType createAbstractGeneralDerivedCRSType() {
        AbstractGeneralDerivedCRSType result = AbstractGeneralDerivedCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeneralOperationParameterRefDocument createAbstractGeneralOperationParameterRefDocument() {
        AbstractGeneralOperationParameterRefDocument result =
                AbstractGeneralOperationParameterRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeneralOperationParameterRefType createAbstractGeneralOperationParameterRefType() {
        AbstractGeneralOperationParameterRefType result =
                AbstractGeneralOperationParameterRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeneralOperationParameterType createAbstractGeneralOperationParameterType() {
        AbstractGeneralOperationParameterType result =
                AbstractGeneralOperationParameterType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeneralParameterValueType createAbstractGeneralParameterValueType() {
        AbstractGeneralParameterValueType result = AbstractGeneralParameterValueType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeneralTransformationType createAbstractGeneralTransformationType() {
        AbstractGeneralTransformationType result = AbstractGeneralTransformationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeometricAggregateType createAbstractGeometricAggregateType() {
        AbstractGeometricAggregateType result = AbstractGeometricAggregateType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeometricPrimitiveType createAbstractGeometricPrimitiveType() {
        AbstractGeometricPrimitiveType result = AbstractGeometricPrimitiveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGeometryType createAbstractGeometryType() {
        AbstractGeometryType result = AbstractGeometryType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGMLType createAbstractGMLType() {
        AbstractGMLType result = AbstractGMLType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractGriddedSurfaceType createAbstractGriddedSurfaceType() {
        AbstractGriddedSurfaceType result = AbstractGriddedSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractMetaDataType createAbstractMetaDataType() {
        AbstractMetaDataType result = AbstractMetaDataType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractParametricCurveSurfaceType createAbstractParametricCurveSurfaceType() {
        AbstractParametricCurveSurfaceType result = AbstractParametricCurveSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractPositionalAccuracyType createAbstractPositionalAccuracyType() {
        AbstractPositionalAccuracyType result = AbstractPositionalAccuracyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractReferenceSystemBaseType createAbstractReferenceSystemBaseType() {
        AbstractReferenceSystemBaseType result = AbstractReferenceSystemBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractReferenceSystemType createAbstractReferenceSystemType() {
        AbstractReferenceSystemType result = AbstractReferenceSystemType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractRingPropertyType createAbstractRingPropertyType() {
        AbstractRingPropertyType result = AbstractRingPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractRingType createAbstractRingType() {
        AbstractRingType result = AbstractRingType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractSolidType createAbstractSolidType() {
        AbstractSolidType result = AbstractSolidType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractStyleType createAbstractStyleType() {
        AbstractStyleType result = AbstractStyleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractSurfacePatchType createAbstractSurfacePatchType() {
        AbstractSurfacePatchType result = AbstractSurfacePatchType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractSurfaceType createAbstractSurfaceType() {
        AbstractSurfaceType result = AbstractSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTimeComplexType createAbstractTimeComplexType() {
        AbstractTimeComplexType result = AbstractTimeComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTimeGeometricPrimitiveType createAbstractTimeGeometricPrimitiveType() {
        AbstractTimeGeometricPrimitiveType result = AbstractTimeGeometricPrimitiveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTimeObjectType createAbstractTimeObjectType() {
        AbstractTimeObjectType result = AbstractTimeObjectType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTimePrimitiveType createAbstractTimePrimitiveType() {
        AbstractTimePrimitiveType result = AbstractTimePrimitiveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTimeReferenceSystemType createAbstractTimeReferenceSystemType() {
        AbstractTimeReferenceSystemType result = AbstractTimeReferenceSystemType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTimeSliceType createAbstractTimeSliceType() {
        AbstractTimeSliceType result = AbstractTimeSliceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTimeTopologyPrimitiveType createAbstractTimeTopologyPrimitiveType() {
        AbstractTimeTopologyPrimitiveType result = AbstractTimeTopologyPrimitiveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTopologyType createAbstractTopologyType() {
        AbstractTopologyType result = AbstractTopologyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AbstractTopoPrimitiveType createAbstractTopoPrimitiveType() {
        AbstractTopoPrimitiveType result = AbstractTopoPrimitiveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AesheticCriteriaType createAesheticCriteriaType() {
        AesheticCriteriaType result = AesheticCriteriaType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AffinePlacementDocument createAffinePlacementDocument() {
        AffinePlacementDocument result = AffinePlacementDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AffinePlacementType createAffinePlacementType() {
        AffinePlacementType result = AffinePlacementType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AnchorPointDocument createAnchorPointDocument() {
        AnchorPointDocument result = AnchorPointDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AngleChoiceType createAngleChoiceType() {
        AngleChoiceType result = AngleChoiceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AngleDocument createAngleDocument() {
        AngleDocument result = AngleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AngleType createAngleType() {
        AngleType result = AngleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcByBulgeDocument createArcByBulgeDocument() {
        ArcByBulgeDocument result = ArcByBulgeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcByBulgeType createArcByBulgeType() {
        ArcByBulgeType result = ArcByBulgeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcByCenterPointDocument createArcByCenterPointDocument() {
        ArcByCenterPointDocument result = ArcByCenterPointDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcByCenterPointType createArcByCenterPointType() {
        ArcByCenterPointType result = ArcByCenterPointType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcMinutesType createArcMinutesType() {
        ArcMinutesType result = ArcMinutesType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcSecondsType createArcSecondsType() {
        ArcSecondsType result = ArcSecondsType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcStringByBulgeDocument createArcStringByBulgeDocument() {
        ArcStringByBulgeDocument result = ArcStringByBulgeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcStringByBulgeType createArcStringByBulgeType() {
        ArcStringByBulgeType result = ArcStringByBulgeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcStringDocument createArcStringDocument() {
        ArcStringDocument result = ArcStringDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArcStringType createArcStringType() {
        ArcStringType result = ArcStringType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AreaType createAreaType() {
        AreaType result = AreaType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArrayAssociationType createArrayAssociationType() {
        ArrayAssociationType result = ArrayAssociationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArrayDocument createArrayDocument() {
        ArrayDocument result = ArrayDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ArrayType createArrayType() {
        ArrayType result = ArrayType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AssociationDocument createAssociationDocument() {
        AssociationDocument result = AssociationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AssociationType createAssociationType() {
        AssociationType result = AssociationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AxisAbbrevDocument createAxisAbbrevDocument() {
        AxisAbbrevDocument result = AxisAbbrevDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AxisDirectionDocument createAxisDirectionDocument() {
        AxisDirectionDocument result = AxisDirectionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AxisIDDocument createAxisIDDocument() {
        AxisIDDocument result = AxisIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BagDocument createBagDocument() {
        BagDocument result = BagDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BagType createBagType() {
        BagType result = BagType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BaseCRSDocument createBaseCRSDocument() {
        BaseCRSDocument result = BaseCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BaseCurveDocument createBaseCurveDocument() {
        BaseCurveDocument result = BaseCurveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BaseStyleDescriptorType createBaseStyleDescriptorType() {
        BaseStyleDescriptorType result = BaseStyleDescriptorType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BaseSurfaceDocument createBaseSurfaceDocument() {
        BaseSurfaceDocument result = BaseSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BaseUnitDocument createBaseUnitDocument() {
        BaseUnitDocument result = BaseUnitDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BaseUnitType createBaseUnitType() {
        BaseUnitType result = BaseUnitType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BezierDocument createBezierDocument() {
        BezierDocument result = BezierDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BezierType createBezierType() {
        BezierType result = BezierType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BooleanDocument createBooleanDocument() {
        BooleanDocument result = BooleanDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BooleanList createBooleanList() {
        BooleanList result = BooleanList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BooleanListDocument createBooleanListDocument() {
        BooleanListDocument result = BooleanListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BooleanOrNull createBooleanOrNull() {
        BooleanOrNull result = BooleanOrNull.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BooleanOrNullList createBooleanOrNullList() {
        BooleanOrNullList result = BooleanOrNullList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BooleanPropertyType createBooleanPropertyType() {
        BooleanPropertyType result = BooleanPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BooleanValueDocument createBooleanValueDocument() {
        BooleanValueDocument result = BooleanValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BoundedByDocument createBoundedByDocument() {
        BoundedByDocument result = BoundedByDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BoundedFeatureType createBoundedFeatureType() {
        BoundedFeatureType result = BoundedFeatureType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BoundingBoxDocument createBoundingBoxDocument() {
        BoundingBoxDocument result = BoundingBoxDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BoundingPolygonDocument createBoundingPolygonDocument() {
        BoundingPolygonDocument result = BoundingPolygonDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BoundingShapeType createBoundingShapeType() {
        BoundingShapeType result = BoundingShapeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BSplineDocument createBSplineDocument() {
        BSplineDocument result = BSplineDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public BSplineType createBSplineType() {
        BSplineType result = BSplineType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CalDate createCalDate() {
        CalDate result = CalDate.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CartesianCSDocument createCartesianCSDocument() {
        CartesianCSDocument result = CartesianCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CartesianCSRefDocument createCartesianCSRefDocument() {
        CartesianCSRefDocument result = CartesianCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CartesianCSRefType createCartesianCSRefType() {
        CartesianCSRefType result = CartesianCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CartesianCSType createCartesianCSType() {
        CartesianCSType result = CartesianCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CatalogSymbolDocument createCatalogSymbolDocument() {
        CatalogSymbolDocument result = CatalogSymbolDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CategoryDocument createCategoryDocument() {
        CategoryDocument result = CategoryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CategoryExtentDocument createCategoryExtentDocument() {
        CategoryExtentDocument result = CategoryExtentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CategoryExtentType createCategoryExtentType() {
        CategoryExtentType result = CategoryExtentType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CategoryListDocument createCategoryListDocument() {
        CategoryListDocument result = CategoryListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CategoryPropertyType createCategoryPropertyType() {
        CategoryPropertyType result = CategoryPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CenterLineOfDocument createCenterLineOfDocument() {
        CenterLineOfDocument result = CenterLineOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CenterOfDocument createCenterOfDocument() {
        CenterOfDocument result = CenterOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CircleByCenterPointDocument createCircleByCenterPointDocument() {
        CircleByCenterPointDocument result = CircleByCenterPointDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CircleByCenterPointType createCircleByCenterPointType() {
        CircleByCenterPointType result = CircleByCenterPointType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CircleDocument createCircleDocument() {
        CircleDocument result = CircleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CircleType createCircleType() {
        CircleType result = CircleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ClothoidDocument createClothoidDocument() {
        ClothoidDocument result = ClothoidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ClothoidType createClothoidType() {
        ClothoidType result = ClothoidType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CodeListType createCodeListType() {
        CodeListType result = CodeListType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CodeOrNullListType createCodeOrNullListType() {
        CodeOrNullListType result = CodeOrNullListType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CodeType createCodeType() {
        CodeType result = CodeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ColumnIndexDocument createColumnIndexDocument() {
        ColumnIndexDocument result = ColumnIndexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompassPointDocument createCompassPointDocument() {
        CompassPointDocument result = CompassPointDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompassPointEnumeration createCompassPointEnumeration() {
        CompassPointEnumeration result = CompassPointEnumeration.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeCurveDocument createCompositeCurveDocument() {
        CompositeCurveDocument result = CompositeCurveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeCurvePropertyType createCompositeCurvePropertyType() {
        CompositeCurvePropertyType result = CompositeCurvePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeCurveType createCompositeCurveType() {
        CompositeCurveType result = CompositeCurveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeSolidDocument createCompositeSolidDocument() {
        CompositeSolidDocument result = CompositeSolidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeSolidPropertyType createCompositeSolidPropertyType() {
        CompositeSolidPropertyType result = CompositeSolidPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeSolidType createCompositeSolidType() {
        CompositeSolidType result = CompositeSolidType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeSurfaceDocument createCompositeSurfaceDocument() {
        CompositeSurfaceDocument result = CompositeSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeSurfacePropertyType createCompositeSurfacePropertyType() {
        CompositeSurfacePropertyType result = CompositeSurfacePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeSurfaceType createCompositeSurfaceType() {
        CompositeSurfaceType result = CompositeSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeValueDocument createCompositeValueDocument() {
        CompositeValueDocument result = CompositeValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompositeValueType createCompositeValueType() {
        CompositeValueType result = CompositeValueType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompoundCRSDocument createCompoundCRSDocument() {
        CompoundCRSDocument result = CompoundCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompoundCRSRefDocument createCompoundCRSRefDocument() {
        CompoundCRSRefDocument result = CompoundCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompoundCRSRefType createCompoundCRSRefType() {
        CompoundCRSRefType result = CompoundCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CompoundCRSType createCompoundCRSType() {
        CompoundCRSType result = CompoundCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConcatenatedOperationDocument createConcatenatedOperationDocument() {
        ConcatenatedOperationDocument result = ConcatenatedOperationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConcatenatedOperationRefDocument createConcatenatedOperationRefDocument() {
        ConcatenatedOperationRefDocument result = ConcatenatedOperationRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConcatenatedOperationRefType createConcatenatedOperationRefType() {
        ConcatenatedOperationRefType result = ConcatenatedOperationRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConcatenatedOperationType createConcatenatedOperationType() {
        ConcatenatedOperationType result = ConcatenatedOperationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConeDocument createConeDocument() {
        ConeDocument result = ConeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConeType createConeType() {
        ConeType result = ConeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ContainerDocument createContainerDocument() {
        ContainerDocument result = ContainerDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ContainerPropertyType createContainerPropertyType() {
        ContainerPropertyType result = ContainerPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ContinuousCoverageDocument createContinuousCoverageDocument() {
        ContinuousCoverageDocument result = ContinuousCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConventionalUnitDocument createConventionalUnitDocument() {
        ConventionalUnitDocument result = ConventionalUnitDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConventionalUnitType createConventionalUnitType() {
        ConventionalUnitType result = ConventionalUnitType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConversionDocument createConversionDocument() {
        ConversionDocument result = ConversionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConversionRefDocument createConversionRefDocument() {
        ConversionRefDocument result = ConversionRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConversionRefType createConversionRefType() {
        ConversionRefType result = ConversionRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConversionToPreferredUnitDocument createConversionToPreferredUnitDocument() {
        ConversionToPreferredUnitDocument result = ConversionToPreferredUnitDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConversionToPreferredUnitType createConversionToPreferredUnitType() {
        ConversionToPreferredUnitType result = ConversionToPreferredUnitType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConversionType createConversionType() {
        ConversionType result = ConversionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordDocument createCoordDocument() {
        CoordDocument result = CoordDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateOperationDocument createCoordinateOperationDocument() {
        CoordinateOperationDocument result = CoordinateOperationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateOperationIDDocument createCoordinateOperationIDDocument() {
        CoordinateOperationIDDocument result = CoordinateOperationIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateOperationNameDocument createCoordinateOperationNameDocument() {
        CoordinateOperationNameDocument result = CoordinateOperationNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateOperationRefDocument createCoordinateOperationRefDocument() {
        CoordinateOperationRefDocument result = CoordinateOperationRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateOperationRefType createCoordinateOperationRefType() {
        CoordinateOperationRefType result = CoordinateOperationRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateReferenceSystemDocument createCoordinateReferenceSystemDocument() {
        CoordinateReferenceSystemDocument result = CoordinateReferenceSystemDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateReferenceSystemRefDocument createCoordinateReferenceSystemRefDocument() {
        CoordinateReferenceSystemRefDocument result = CoordinateReferenceSystemRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateReferenceSystemRefType createCoordinateReferenceSystemRefType() {
        CoordinateReferenceSystemRefType result = CoordinateReferenceSystemRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinatesDocument createCoordinatesDocument() {
        CoordinatesDocument result = CoordinatesDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinatesType createCoordinatesType() {
        CoordinatesType result = CoordinatesType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemAxisBaseType createCoordinateSystemAxisBaseType() {
        CoordinateSystemAxisBaseType result = CoordinateSystemAxisBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemAxisDocument createCoordinateSystemAxisDocument() {
        CoordinateSystemAxisDocument result = CoordinateSystemAxisDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemAxisRefDocument createCoordinateSystemAxisRefDocument() {
        CoordinateSystemAxisRefDocument result = CoordinateSystemAxisRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemAxisRefType createCoordinateSystemAxisRefType() {
        CoordinateSystemAxisRefType result = CoordinateSystemAxisRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemAxisType createCoordinateSystemAxisType() {
        CoordinateSystemAxisType result = CoordinateSystemAxisType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemDocument createCoordinateSystemDocument() {
        CoordinateSystemDocument result = CoordinateSystemDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemRefDocument createCoordinateSystemRefDocument() {
        CoordinateSystemRefDocument result = CoordinateSystemRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordinateSystemRefType createCoordinateSystemRefType() {
        CoordinateSystemRefType result = CoordinateSystemRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoordType createCoordType() {
        CoordType result = CoordType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CountDocument createCountDocument() {
        CountDocument result = CountDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CountExtentDocument createCountExtentDocument() {
        CountExtentDocument result = CountExtentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CountExtentType createCountExtentType() {
        CountExtentType result = CountExtentType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CountListDocument createCountListDocument() {
        CountListDocument result = CountListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CountPropertyType createCountPropertyType() {
        CountPropertyType result = CountPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CovarianceDocument createCovarianceDocument() {
        CovarianceDocument result = CovarianceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CovarianceElementType createCovarianceElementType() {
        CovarianceElementType result = CovarianceElementType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CovarianceMatrixDocument createCovarianceMatrixDocument() {
        CovarianceMatrixDocument result = CovarianceMatrixDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CovarianceMatrixType createCovarianceMatrixType() {
        CovarianceMatrixType result = CovarianceMatrixType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoverageDocument createCoverageDocument() {
        CoverageDocument result = CoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoverageFunctionDocument createCoverageFunctionDocument() {
        CoverageFunctionDocument result = CoverageFunctionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CoverageFunctionType createCoverageFunctionType() {
        CoverageFunctionType result = CoverageFunctionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CRSDocument createCRSDocument() {
        CRSDocument result = CRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CrsRefDocument createCrsRefDocument() {
        CrsRefDocument result = CrsRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CRSRefType createCRSRefType() {
        CRSRefType result = CRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CsIDDocument createCsIDDocument() {
        CsIDDocument result = CsIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CsNameDocument createCsNameDocument() {
        CsNameDocument result = CsNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CubicSplineDocument createCubicSplineDocument() {
        CubicSplineDocument result = CubicSplineDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CubicSplineType createCubicSplineType() {
        CubicSplineType result = CubicSplineType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveArrayPropertyDocument createCurveArrayPropertyDocument() {
        CurveArrayPropertyDocument result = CurveArrayPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveArrayPropertyType createCurveArrayPropertyType() {
        CurveArrayPropertyType result = CurveArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveDocument createCurveDocument() {
        CurveDocument result = CurveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveInterpolationType createCurveInterpolationType() {
        CurveInterpolationType result = CurveInterpolationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveMemberDocument createCurveMemberDocument() {
        CurveMemberDocument result = CurveMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurvePropertyDocument createCurvePropertyDocument() {
        CurvePropertyDocument result = CurvePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurvePropertyType createCurvePropertyType() {
        CurvePropertyType result = CurvePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveSegmentArrayPropertyType createCurveSegmentArrayPropertyType() {
        CurveSegmentArrayPropertyType result = CurveSegmentArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveSegmentDocument createCurveSegmentDocument() {
        CurveSegmentDocument result = CurveSegmentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveType createCurveType() {
        CurveType result = CurveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CylinderDocument createCylinderDocument() {
        CylinderDocument result = CylinderDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CylinderType createCylinderType() {
        CylinderType result = CylinderType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CylindricalCSDocument createCylindricalCSDocument() {
        CylindricalCSDocument result = CylindricalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CylindricalCSRefDocument createCylindricalCSRefDocument() {
        CylindricalCSRefDocument result = CylindricalCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CylindricalCSRefType createCylindricalCSRefType() {
        CylindricalCSRefType result = CylindricalCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CylindricalCSType createCylindricalCSType() {
        CylindricalCSType result = CylindricalCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DataBlockDocument createDataBlockDocument() {
        DataBlockDocument result = DataBlockDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DataBlockType createDataBlockType() {
        DataBlockType result = DataBlockType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DataSourceDocument createDataSourceDocument() {
        DataSourceDocument result = DataSourceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DatumDocument createDatumDocument() {
        DatumDocument result = DatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DatumIDDocument createDatumIDDocument() {
        DatumIDDocument result = DatumIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DatumNameDocument createDatumNameDocument() {
        DatumNameDocument result = DatumNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DatumRefDocument createDatumRefDocument() {
        DatumRefDocument result = DatumRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DatumRefType createDatumRefType() {
        DatumRefType result = DatumRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DecimalMinutesDocument createDecimalMinutesDocument() {
        DecimalMinutesDocument result = DecimalMinutesDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DecimalMinutesType createDecimalMinutesType() {
        DecimalMinutesType result = DecimalMinutesType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefaultStyleDocument createDefaultStyleDocument() {
        DefaultStyleDocument result = DefaultStyleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefaultStylePropertyType createDefaultStylePropertyType() {
        DefaultStylePropertyType result = DefaultStylePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinedByConversionDocument createDefinedByConversionDocument() {
        DefinedByConversionDocument result = DefinedByConversionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinitionCollectionDocument createDefinitionCollectionDocument() {
        DefinitionCollectionDocument result = DefinitionCollectionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinitionDocument createDefinitionDocument() {
        DefinitionDocument result = DefinitionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinitionMemberDocument createDefinitionMemberDocument() {
        DefinitionMemberDocument result = DefinitionMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinitionProxyDocument createDefinitionProxyDocument() {
        DefinitionProxyDocument result = DefinitionProxyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinitionProxyType createDefinitionProxyType() {
        DefinitionProxyType result = DefinitionProxyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinitionRefDocument createDefinitionRefDocument() {
        DefinitionRefDocument result = DefinitionRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DefinitionType createDefinitionType() {
        DefinitionType result = DefinitionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DegreesDocument createDegreesDocument() {
        DegreesDocument result = DegreesDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DegreesType createDegreesType() {
        DegreesType result = DegreesType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DegreeValueType createDegreeValueType() {
        DegreeValueType result = DegreeValueType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivationUnitTermDocument createDerivationUnitTermDocument() {
        DerivationUnitTermDocument result = DerivationUnitTermDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivationUnitTermType createDerivationUnitTermType() {
        DerivationUnitTermType result = DerivationUnitTermType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedCRSDocument createDerivedCRSDocument() {
        DerivedCRSDocument result = DerivedCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedCRSRefDocument createDerivedCRSRefDocument() {
        DerivedCRSRefDocument result = DerivedCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedCRSRefType createDerivedCRSRefType() {
        DerivedCRSRefType result = DerivedCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedCRSType createDerivedCRSType() {
        DerivedCRSType result = DerivedCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedCRSTypeDocument createDerivedCRSTypeDocument() {
        DerivedCRSTypeDocument result = DerivedCRSTypeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedCRSTypeType createDerivedCRSTypeType() {
        DerivedCRSTypeType result = DerivedCRSTypeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedUnitDocument createDerivedUnitDocument() {
        DerivedUnitDocument result = DerivedUnitDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DerivedUnitType createDerivedUnitType() {
        DerivedUnitType result = DerivedUnitType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DescriptionDocument createDescriptionDocument() {
        DescriptionDocument result = DescriptionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DictionaryDocument createDictionaryDocument() {
        DictionaryDocument result = DictionaryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DictionaryEntryDocument createDictionaryEntryDocument() {
        DictionaryEntryDocument result = DictionaryEntryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DictionaryEntryType createDictionaryEntryType() {
        DictionaryEntryType result = DictionaryEntryType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DictionaryType createDictionaryType() {
        DictionaryType result = DictionaryType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedEdgeDocument createDirectedEdgeDocument() {
        DirectedEdgeDocument result = DirectedEdgeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedEdgePropertyType createDirectedEdgePropertyType() {
        DirectedEdgePropertyType result = DirectedEdgePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedFaceDocument createDirectedFaceDocument() {
        DirectedFaceDocument result = DirectedFaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedFacePropertyType createDirectedFacePropertyType() {
        DirectedFacePropertyType result = DirectedFacePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedNodeDocument createDirectedNodeDocument() {
        DirectedNodeDocument result = DirectedNodeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedNodePropertyType createDirectedNodePropertyType() {
        DirectedNodePropertyType result = DirectedNodePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedObservationAtDistanceDocument createDirectedObservationAtDistanceDocument() {
        DirectedObservationAtDistanceDocument result = DirectedObservationAtDistanceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedObservationAtDistanceType createDirectedObservationAtDistanceType() {
        DirectedObservationAtDistanceType result = DirectedObservationAtDistanceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedObservationDocument createDirectedObservationDocument() {
        DirectedObservationDocument result = DirectedObservationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedObservationType createDirectedObservationType() {
        DirectedObservationType result = DirectedObservationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedTopoSolidDocument createDirectedTopoSolidDocument() {
        DirectedTopoSolidDocument result = DirectedTopoSolidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectedTopoSolidPropertyType createDirectedTopoSolidPropertyType() {
        DirectedTopoSolidPropertyType result = DirectedTopoSolidPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectionDocument createDirectionDocument() {
        DirectionDocument result = DirectionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectionPropertyType createDirectionPropertyType() {
        DirectionPropertyType result = DirectionPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectionVectorDocument createDirectionVectorDocument() {
        DirectionVectorDocument result = DirectionVectorDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectionVectorType createDirectionVectorType() {
        DirectionVectorType result = DirectionVectorType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectPositionListType createDirectPositionListType() {
        DirectPositionListType result = DirectPositionListType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DirectPositionType createDirectPositionType() {
        DirectPositionType result = DirectPositionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DiscreteCoverageDocument createDiscreteCoverageDocument() {
        DiscreteCoverageDocument result = DiscreteCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DmsAngleDocument createDmsAngleDocument() {
        DmsAngleDocument result = DmsAngleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DMSAngleType createDMSAngleType() {
        DMSAngleType result = DMSAngleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DmsAngleValueDocument createDmsAngleValueDocument() {
        DmsAngleValueDocument result = DmsAngleValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DomainSetDocument createDomainSetDocument() {
        DomainSetDocument result = DomainSetDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DomainSetType createDomainSetType() {
        DomainSetType result = DomainSetType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DoubleList createDoubleList() {
        DoubleList result = DoubleList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DoubleOrNull createDoubleOrNull() {
        DoubleOrNull result = DoubleOrNull.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DoubleOrNullList createDoubleOrNullList() {
        DoubleOrNullList result = DoubleOrNullList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DoubleOrNullTupleListDocument createDoubleOrNullTupleListDocument() {
        DoubleOrNullTupleListDocument result = DoubleOrNullTupleListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DrawingTypeType createDrawingTypeType() {
        DrawingTypeType result = DrawingTypeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DurationDocument createDurationDocument() {
        DurationDocument result = DurationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DynamicFeatureCollectionType createDynamicFeatureCollectionType() {
        DynamicFeatureCollectionType result = DynamicFeatureCollectionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DynamicFeatureType createDynamicFeatureType() {
        DynamicFeatureType result = DynamicFeatureType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EdgeDocument createEdgeDocument() {
        EdgeDocument result = EdgeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EdgeOfDocument createEdgeOfDocument() {
        EdgeOfDocument result = EdgeOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EdgeType createEdgeType() {
        EdgeType result = EdgeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidalCSDocument createEllipsoidalCSDocument() {
        EllipsoidalCSDocument result = EllipsoidalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidalCSRefDocument createEllipsoidalCSRefDocument() {
        EllipsoidalCSRefDocument result = EllipsoidalCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidalCSRefType createEllipsoidalCSRefType() {
        EllipsoidalCSRefType result = EllipsoidalCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidalCSType createEllipsoidalCSType() {
        EllipsoidalCSType result = EllipsoidalCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidBaseType createEllipsoidBaseType() {
        EllipsoidBaseType result = EllipsoidBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidDocument createEllipsoidDocument() {
        EllipsoidDocument result = EllipsoidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidIDDocument createEllipsoidIDDocument() {
        EllipsoidIDDocument result = EllipsoidIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidNameDocument createEllipsoidNameDocument() {
        EllipsoidNameDocument result = EllipsoidNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidRefDocument createEllipsoidRefDocument() {
        EllipsoidRefDocument result = EllipsoidRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidRefType createEllipsoidRefType() {
        EllipsoidRefType result = EllipsoidRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EllipsoidType createEllipsoidType() {
        EllipsoidType result = EllipsoidType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringCRSDocument createEngineeringCRSDocument() {
        EngineeringCRSDocument result = EngineeringCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringCRSRefDocument createEngineeringCRSRefDocument() {
        EngineeringCRSRefDocument result = EngineeringCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringCRSRefType createEngineeringCRSRefType() {
        EngineeringCRSRefType result = EngineeringCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringCRSType createEngineeringCRSType() {
        EngineeringCRSType result = EngineeringCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringDatumDocument createEngineeringDatumDocument() {
        EngineeringDatumDocument result = EngineeringDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringDatumRefDocument createEngineeringDatumRefDocument() {
        EngineeringDatumRefDocument result = EngineeringDatumRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringDatumRefType createEngineeringDatumRefType() {
        EngineeringDatumRefType result = EngineeringDatumRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EngineeringDatumType createEngineeringDatumType() {
        EngineeringDatumType result = EngineeringDatumType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EnvelopeDocument createEnvelopeDocument() {
        EnvelopeDocument result = EnvelopeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EnvelopeType createEnvelopeType() {
        EnvelopeType result = EnvelopeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EnvelopeWithTimePeriodDocument createEnvelopeWithTimePeriodDocument() {
        EnvelopeWithTimePeriodDocument result = EnvelopeWithTimePeriodDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EnvelopeWithTimePeriodType createEnvelopeWithTimePeriodType() {
        EnvelopeWithTimePeriodType result = EnvelopeWithTimePeriodType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ExtentOfDocument createExtentOfDocument() {
        ExtentOfDocument result = ExtentOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ExtentType createExtentType() {
        ExtentType result = ExtentType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ExteriorDocument createExteriorDocument() {
        ExteriorDocument result = ExteriorDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FaceDocument createFaceDocument() {
        FaceDocument result = FaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FaceType createFaceType() {
        FaceType result = FaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureArrayPropertyType createFeatureArrayPropertyType() {
        FeatureArrayPropertyType result = FeatureArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureCollectionDocument createFeatureCollectionDocument() {
        FeatureCollectionDocument result = FeatureCollectionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureCollectionType createFeatureCollectionType() {
        FeatureCollectionType result = FeatureCollectionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureDocument createFeatureDocument() {
        FeatureDocument result = FeatureDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureMemberDocument createFeatureMemberDocument() {
        FeatureMemberDocument result = FeatureMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureMembersDocument createFeatureMembersDocument() {
        FeatureMembersDocument result = FeatureMembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeaturePropertyDocument createFeaturePropertyDocument() {
        FeaturePropertyDocument result = FeaturePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeaturePropertyType createFeaturePropertyType() {
        FeaturePropertyType result = FeaturePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureStyleDocument createFeatureStyleDocument() {
        FeatureStyleDocument result = FeatureStyleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureStylePropertyType createFeatureStylePropertyType() {
        FeatureStylePropertyType result = FeatureStylePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FeatureStyleType createFeatureStyleType() {
        FeatureStyleType result = FeatureStyleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FileDocument createFileDocument() {
        FileDocument result = FileDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FileType createFileType() {
        FileType result = FileType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FileValueModelType createFileValueModelType() {
        FileValueModelType result = FileValueModelType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public FormulaType createFormulaType() {
        FormulaType result = FormulaType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralConversionDocument createGeneralConversionDocument() {
        GeneralConversionDocument result = GeneralConversionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralConversionRefDocument createGeneralConversionRefDocument() {
        GeneralConversionRefDocument result = GeneralConversionRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralConversionRefType createGeneralConversionRefType() {
        GeneralConversionRefType result = GeneralConversionRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralDerivedCRSDocument createGeneralDerivedCRSDocument() {
        GeneralDerivedCRSDocument result = GeneralDerivedCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralOperationParameterDocument createGeneralOperationParameterDocument() {
        GeneralOperationParameterDocument result = GeneralOperationParameterDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralParameterValueDocument createGeneralParameterValueDocument() {
        GeneralParameterValueDocument result = GeneralParameterValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralTransformationDocument createGeneralTransformationDocument() {
        GeneralTransformationDocument result = GeneralTransformationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralTransformationRefDocument createGeneralTransformationRefDocument() {
        GeneralTransformationRefDocument result = GeneralTransformationRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeneralTransformationRefType createGeneralTransformationRefType() {
        GeneralTransformationRefType result = GeneralTransformationRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GenericMetaDataDocument createGenericMetaDataDocument() {
        GenericMetaDataDocument result = GenericMetaDataDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GenericMetaDataType createGenericMetaDataType() {
        GenericMetaDataType result = GenericMetaDataType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeocentricCRSDocument createGeocentricCRSDocument() {
        GeocentricCRSDocument result = GeocentricCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeocentricCRSRefDocument createGeocentricCRSRefDocument() {
        GeocentricCRSRefDocument result = GeocentricCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeocentricCRSRefType createGeocentricCRSRefType() {
        GeocentricCRSRefType result = GeocentricCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeocentricCRSType createGeocentricCRSType() {
        GeocentricCRSType result = GeocentricCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodesicDocument createGeodesicDocument() {
        GeodesicDocument result = GeodesicDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodesicStringDocument createGeodesicStringDocument() {
        GeodesicStringDocument result = GeodesicStringDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodesicStringType createGeodesicStringType() {
        GeodesicStringType result = GeodesicStringType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodesicType createGeodesicType() {
        GeodesicType result = GeodesicType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodeticDatumDocument createGeodeticDatumDocument() {
        GeodeticDatumDocument result = GeodeticDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodeticDatumRefDocument createGeodeticDatumRefDocument() {
        GeodeticDatumRefDocument result = GeodeticDatumRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodeticDatumRefType createGeodeticDatumRefType() {
        GeodeticDatumRefType result = GeodeticDatumRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeodeticDatumType createGeodeticDatumType() {
        GeodeticDatumType result = GeodeticDatumType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeographicCRSDocument createGeographicCRSDocument() {
        GeographicCRSDocument result = GeographicCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeographicCRSRefDocument createGeographicCRSRefDocument() {
        GeographicCRSRefDocument result = GeographicCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeographicCRSRefType createGeographicCRSRefType() {
        GeographicCRSRefType result = GeographicCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeographicCRSType createGeographicCRSType() {
        GeographicCRSType result = GeographicCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometricAggregateDocument createGeometricAggregateDocument() {
        GeometricAggregateDocument result = GeometricAggregateDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometricComplexDocument createGeometricComplexDocument() {
        GeometricComplexDocument result = GeometricComplexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometricComplexPropertyType createGeometricComplexPropertyType() {
        GeometricComplexPropertyType result = GeometricComplexPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometricComplexType createGeometricComplexType() {
        GeometricComplexType result = GeometricComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometricPrimitiveDocument createGeometricPrimitiveDocument() {
        GeometricPrimitiveDocument result = GeometricPrimitiveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometricPrimitivePropertyType createGeometricPrimitivePropertyType() {
        GeometricPrimitivePropertyType result = GeometricPrimitivePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryArrayPropertyType createGeometryArrayPropertyType() {
        GeometryArrayPropertyType result = GeometryArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryDocument createGeometryDocument() {
        GeometryDocument result = GeometryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryMemberDocument createGeometryMemberDocument() {
        GeometryMemberDocument result = GeometryMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryMembersDocument createGeometryMembersDocument() {
        GeometryMembersDocument result = GeometryMembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryPropertyType createGeometryPropertyType() {
        GeometryPropertyType result = GeometryPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryStyleDocument createGeometryStyleDocument() {
        GeometryStyleDocument result = GeometryStyleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryStylePropertyType createGeometryStylePropertyType() {
        GeometryStylePropertyType result = GeometryStylePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GeometryStyleType createGeometryStyleType() {
        GeometryStyleType result = GeometryStyleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GMLDocument createGMLDocument() {
        GMLDocument result = GMLDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GraphStyleDocument createGraphStyleDocument() {
        GraphStyleDocument result = GraphStyleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GraphStylePropertyType createGraphStylePropertyType() {
        GraphStylePropertyType result = GraphStylePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GraphStyleType createGraphStyleType() {
        GraphStyleType result = GraphStyleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GraphTypeType createGraphTypeType() {
        GraphTypeType result = GraphTypeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GreenwichLongitudeDocument createGreenwichLongitudeDocument() {
        GreenwichLongitudeDocument result = GreenwichLongitudeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridCoverageDocument createGridCoverageDocument() {
        GridCoverageDocument result = GridCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridCoverageType createGridCoverageType() {
        GridCoverageType result = GridCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GriddedSurfaceDocument createGriddedSurfaceDocument() {
        GriddedSurfaceDocument result = GriddedSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridDocument createGridDocument() {
        GridDocument result = GridDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridDomainDocument createGridDomainDocument() {
        GridDomainDocument result = GridDomainDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridDomainType createGridDomainType() {
        GridDomainType result = GridDomainType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridEnvelopeType createGridEnvelopeType() {
        GridEnvelopeType result = GridEnvelopeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridFunctionDocument createGridFunctionDocument() {
        GridFunctionDocument result = GridFunctionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridFunctionType createGridFunctionType() {
        GridFunctionType result = GridFunctionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridLengthType createGridLengthType() {
        GridLengthType result = GridLengthType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridLimitsType createGridLimitsType() {
        GridLimitsType result = GridLimitsType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GridType createGridType() {
        GridType result = GridType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GroupIDDocument createGroupIDDocument() {
        GroupIDDocument result = GroupIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public GroupNameDocument createGroupNameDocument() {
        GroupNameDocument result = GroupNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public HistoryDocument createHistoryDocument() {
        HistoryDocument result = HistoryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public HistoryPropertyType createHistoryPropertyType() {
        HistoryPropertyType result = HistoryPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IdAttribute createIdAttribute() {
        IdAttribute result = IdAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IdentifierType createIdentifierType() {
        IdentifierType result = IdentifierType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageCRSDocument createImageCRSDocument() {
        ImageCRSDocument result = ImageCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageCRSRefDocument createImageCRSRefDocument() {
        ImageCRSRefDocument result = ImageCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageCRSRefType createImageCRSRefType() {
        ImageCRSRefType result = ImageCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageCRSType createImageCRSType() {
        ImageCRSType result = ImageCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageDatumDocument createImageDatumDocument() {
        ImageDatumDocument result = ImageDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageDatumRefDocument createImageDatumRefDocument() {
        ImageDatumRefDocument result = ImageDatumRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageDatumRefType createImageDatumRefType() {
        ImageDatumRefType result = ImageDatumRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImageDatumType createImageDatumType() {
        ImageDatumType result = ImageDatumType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ImplicitGeometryDocument createImplicitGeometryDocument() {
        ImplicitGeometryDocument result = ImplicitGeometryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IncludesCRSDocument createIncludesCRSDocument() {
        IncludesCRSDocument result = IncludesCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IncludesElementDocument createIncludesElementDocument() {
        IncludesElementDocument result = IncludesElementDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IncludesParameterDocument createIncludesParameterDocument() {
        IncludesParameterDocument result = IncludesParameterDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IncludesValueDocument createIncludesValueDocument() {
        IncludesValueDocument result = IncludesValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IncrementOrder createIncrementOrder() {
        IncrementOrder result = IncrementOrder.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IndexMapDocument createIndexMapDocument() {
        IndexMapDocument result = IndexMapDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IndexMapType createIndexMapType() {
        IndexMapType result = IndexMapType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IndirectEntryDocument createIndirectEntryDocument() {
        IndirectEntryDocument result = IndirectEntryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IndirectEntryType createIndirectEntryType() {
        IndirectEntryType result = IndirectEntryType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public InnerBoundaryIsDocument createInnerBoundaryIsDocument() {
        InnerBoundaryIsDocument result = InnerBoundaryIsDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IntegerList createIntegerList() {
        IntegerList result = IntegerList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IntegerOrNull createIntegerOrNull() {
        IntegerOrNull result = IntegerOrNull.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IntegerOrNullList createIntegerOrNullList() {
        IntegerOrNullList result = IntegerOrNullList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IntegerValueDocument createIntegerValueDocument() {
        IntegerValueDocument result = IntegerValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IntegerValueListDocument createIntegerValueListDocument() {
        IntegerValueListDocument result = IntegerValueListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public InteriorDocument createInteriorDocument() {
        InteriorDocument result = InteriorDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public InverseFlatteningDocument createInverseFlatteningDocument() {
        InverseFlatteningDocument result = InverseFlatteningDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IsolatedDocument createIsolatedDocument() {
        IsolatedDocument result = IsolatedDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IsolatedPropertyType createIsolatedPropertyType() {
        IsolatedPropertyType result = IsolatedPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public IsSphereDocument createIsSphereDocument() {
        IsSphereDocument result = IsSphereDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public KnotPropertyType createKnotPropertyType() {
        KnotPropertyType result = KnotPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public KnotType createKnotType() {
        KnotType result = KnotType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public KnotTypesType createKnotTypesType() {
        KnotTypesType result = KnotTypesType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LabelStyleDocument createLabelStyleDocument() {
        LabelStyleDocument result = LabelStyleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LabelStylePropertyType createLabelStylePropertyType() {
        LabelStylePropertyType result = LabelStylePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LabelStyleType createLabelStyleType() {
        LabelStyleType result = LabelStyleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LengthType createLengthType() {
        LengthType result = LengthType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LinearCSDocument createLinearCSDocument() {
        LinearCSDocument result = LinearCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LinearCSRefDocument createLinearCSRefDocument() {
        LinearCSRefDocument result = LinearCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LinearCSRefType createLinearCSRefType() {
        LinearCSRefType result = LinearCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LinearCSType createLinearCSType() {
        LinearCSType result = LinearCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LinearRingDocument createLinearRingDocument() {
        LinearRingDocument result = LinearRingDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LinearRingPropertyType createLinearRingPropertyType() {
        LinearRingPropertyType result = LinearRingPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LinearRingType createLinearRingType() {
        LinearRingType result = LinearRingType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringDocument createLineStringDocument() {
        LineStringDocument result = LineStringDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringMemberDocument createLineStringMemberDocument() {
        LineStringMemberDocument result = LineStringMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringPropertyDocument createLineStringPropertyDocument() {
        LineStringPropertyDocument result = LineStringPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringPropertyType createLineStringPropertyType() {
        LineStringPropertyType result = LineStringPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringSegmentArrayPropertyType createLineStringSegmentArrayPropertyType() {
        LineStringSegmentArrayPropertyType result = LineStringSegmentArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringSegmentDocument createLineStringSegmentDocument() {
        LineStringSegmentDocument result = LineStringSegmentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringSegmentType createLineStringSegmentType() {
        LineStringSegmentType result = LineStringSegmentType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineStringType createLineStringType() {
        LineStringType result = LineStringType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LineTypeType createLineTypeType() {
        LineTypeType result = LineTypeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LocationDocument createLocationDocument() {
        LocationDocument result = LocationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LocationKeyWordDocument createLocationKeyWordDocument() {
        LocationKeyWordDocument result = LocationKeyWordDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LocationPropertyType createLocationPropertyType() {
        LocationPropertyType result = LocationPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LocationStringDocument createLocationStringDocument() {
        LocationStringDocument result = LocationStringDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MappingRuleDocument createMappingRuleDocument() {
        MappingRuleDocument result = MappingRuleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MaximalComplexDocument createMaximalComplexDocument() {
        MaximalComplexDocument result = MaximalComplexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MaximumOccursDocument createMaximumOccursDocument() {
        MaximumOccursDocument result = MaximumOccursDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeasureDescriptionDocument createMeasureDescriptionDocument() {
        MeasureDescriptionDocument result = MeasureDescriptionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeasureDocument createMeasureDocument() {
        MeasureDocument result = MeasureDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeasureListType createMeasureListType() {
        MeasureListType result = MeasureListType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeasureOrNullListType createMeasureOrNullListType() {
        MeasureOrNullListType result = MeasureOrNullListType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeasureType createMeasureType() {
        MeasureType result = MeasureType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MemberDocument createMemberDocument() {
        MemberDocument result = MemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MembersDocument createMembersDocument() {
        MembersDocument result = MembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeridianIDDocument createMeridianIDDocument() {
        MeridianIDDocument result = MeridianIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MeridianNameDocument createMeridianNameDocument() {
        MeridianNameDocument result = MeridianNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MetaDataDocument createMetaDataDocument() {
        MetaDataDocument result = MetaDataDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MetaDataPropertyDocument createMetaDataPropertyDocument() {
        MetaDataPropertyDocument result = MetaDataPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MetaDataPropertyType createMetaDataPropertyType() {
        MetaDataPropertyType result = MetaDataPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MethodFormulaDocument createMethodFormulaDocument() {
        MethodFormulaDocument result = MethodFormulaDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MethodIDDocument createMethodIDDocument() {
        MethodIDDocument result = MethodIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MethodNameDocument createMethodNameDocument() {
        MethodNameDocument result = MethodNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MinimumOccursDocument createMinimumOccursDocument() {
        MinimumOccursDocument result = MinimumOccursDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MinutesDocument createMinutesDocument() {
        MinutesDocument result = MinutesDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ModifiedCoordinateDocument createModifiedCoordinateDocument() {
        ModifiedCoordinateDocument result = ModifiedCoordinateDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MovingObjectStatusDocument createMovingObjectStatusDocument() {
        MovingObjectStatusDocument result = MovingObjectStatusDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MovingObjectStatusType createMovingObjectStatusType() {
        MovingObjectStatusType result = MovingObjectStatusType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCenterLineOfDocument createMultiCenterLineOfDocument() {
        MultiCenterLineOfDocument result = MultiCenterLineOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCenterOfDocument createMultiCenterOfDocument() {
        MultiCenterOfDocument result = MultiCenterOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCoverageDocument createMultiCoverageDocument() {
        MultiCoverageDocument result = MultiCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurveCoverageDocument createMultiCurveCoverageDocument() {
        MultiCurveCoverageDocument result = MultiCurveCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurveCoverageType createMultiCurveCoverageType() {
        MultiCurveCoverageType result = MultiCurveCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurveDocument createMultiCurveDocument() {
        MultiCurveDocument result = MultiCurveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurveDomainDocument createMultiCurveDomainDocument() {
        MultiCurveDomainDocument result = MultiCurveDomainDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurveDomainType createMultiCurveDomainType() {
        MultiCurveDomainType result = MultiCurveDomainType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurvePropertyDocument createMultiCurvePropertyDocument() {
        MultiCurvePropertyDocument result = MultiCurvePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurvePropertyType createMultiCurvePropertyType() {
        MultiCurvePropertyType result = MultiCurvePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiCurveType createMultiCurveType() {
        MultiCurveType result = MultiCurveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiEdgeOfDocument createMultiEdgeOfDocument() {
        MultiEdgeOfDocument result = MultiEdgeOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiExtentOfDocument createMultiExtentOfDocument() {
        MultiExtentOfDocument result = MultiExtentOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiGeometryDocument createMultiGeometryDocument() {
        MultiGeometryDocument result = MultiGeometryDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiGeometryPropertyDocument createMultiGeometryPropertyDocument() {
        MultiGeometryPropertyDocument result = MultiGeometryPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiGeometryPropertyType createMultiGeometryPropertyType() {
        MultiGeometryPropertyType result = MultiGeometryPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiGeometryType createMultiGeometryType() {
        MultiGeometryType result = MultiGeometryType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiLineStringDocument createMultiLineStringDocument() {
        MultiLineStringDocument result = MultiLineStringDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiLineStringPropertyType createMultiLineStringPropertyType() {
        MultiLineStringPropertyType result = MultiLineStringPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiLineStringType createMultiLineStringType() {
        MultiLineStringType result = MultiLineStringType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiLocationDocument createMultiLocationDocument() {
        MultiLocationDocument result = MultiLocationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointCoverageDocument createMultiPointCoverageDocument() {
        MultiPointCoverageDocument result = MultiPointCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointCoverageType createMultiPointCoverageType() {
        MultiPointCoverageType result = MultiPointCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointDocument createMultiPointDocument() {
        MultiPointDocument result = MultiPointDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointDomainDocument createMultiPointDomainDocument() {
        MultiPointDomainDocument result = MultiPointDomainDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointDomainType createMultiPointDomainType() {
        MultiPointDomainType result = MultiPointDomainType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointPropertyDocument createMultiPointPropertyDocument() {
        MultiPointPropertyDocument result = MultiPointPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointPropertyType createMultiPointPropertyType() {
        MultiPointPropertyType result = MultiPointPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPointType createMultiPointType() {
        MultiPointType result = MultiPointType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPolygonDocument createMultiPolygonDocument() {
        MultiPolygonDocument result = MultiPolygonDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPolygonPropertyType createMultiPolygonPropertyType() {
        MultiPolygonPropertyType result = MultiPolygonPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPolygonType createMultiPolygonType() {
        MultiPolygonType result = MultiPolygonType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiPositionDocument createMultiPositionDocument() {
        MultiPositionDocument result = MultiPositionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidCoverageDocument createMultiSolidCoverageDocument() {
        MultiSolidCoverageDocument result = MultiSolidCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidCoverageType createMultiSolidCoverageType() {
        MultiSolidCoverageType result = MultiSolidCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidDocument createMultiSolidDocument() {
        MultiSolidDocument result = MultiSolidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidDomainDocument createMultiSolidDomainDocument() {
        MultiSolidDomainDocument result = MultiSolidDomainDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidDomainType createMultiSolidDomainType() {
        MultiSolidDomainType result = MultiSolidDomainType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidPropertyDocument createMultiSolidPropertyDocument() {
        MultiSolidPropertyDocument result = MultiSolidPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidPropertyType createMultiSolidPropertyType() {
        MultiSolidPropertyType result = MultiSolidPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSolidType createMultiSolidType() {
        MultiSolidType result = MultiSolidType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfaceCoverageDocument createMultiSurfaceCoverageDocument() {
        MultiSurfaceCoverageDocument result = MultiSurfaceCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfaceCoverageType createMultiSurfaceCoverageType() {
        MultiSurfaceCoverageType result = MultiSurfaceCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfaceDocument createMultiSurfaceDocument() {
        MultiSurfaceDocument result = MultiSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfaceDomainDocument createMultiSurfaceDomainDocument() {
        MultiSurfaceDomainDocument result = MultiSurfaceDomainDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfaceDomainType createMultiSurfaceDomainType() {
        MultiSurfaceDomainType result = MultiSurfaceDomainType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfacePropertyDocument createMultiSurfacePropertyDocument() {
        MultiSurfacePropertyDocument result = MultiSurfacePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfacePropertyType createMultiSurfacePropertyType() {
        MultiSurfacePropertyType result = MultiSurfacePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MultiSurfaceType createMultiSurfaceType() {
        MultiSurfaceType result = MultiSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NameDocument createNameDocument() {
        NameDocument result = NameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NameList createNameList() {
        NameList result = NameList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NameOrNull createNameOrNull() {
        NameOrNull result = NameOrNull.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NameOrNullList createNameOrNullList() {
        NameOrNullList result = NameOrNullList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NCNameList createNCNameList() {
        NCNameList result = NCNameList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NodeDocument createNodeDocument() {
        NodeDocument result = NodeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NodeType createNodeType() {
        NodeType result = NodeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NullDocument createNullDocument() {
        NullDocument result = NullDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NullEnumeration createNullEnumeration() {
        NullEnumeration result = NullEnumeration.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NullType createNullType() {
        NullType result = NullType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectDocument createObjectDocument() {
        ObjectDocument result = ObjectDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObliqueCartesianCSDocument createObliqueCartesianCSDocument() {
        ObliqueCartesianCSDocument result = ObliqueCartesianCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObliqueCartesianCSRefDocument createObliqueCartesianCSRefDocument() {
        ObliqueCartesianCSRefDocument result = ObliqueCartesianCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObliqueCartesianCSRefType createObliqueCartesianCSRefType() {
        ObliqueCartesianCSRefType result = ObliqueCartesianCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObliqueCartesianCSType createObliqueCartesianCSType() {
        ObliqueCartesianCSType result = ObliqueCartesianCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObservationDocument createObservationDocument() {
        ObservationDocument result = ObservationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObservationType createObservationType() {
        ObservationType result = ObservationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OffsetCurveDocument createOffsetCurveDocument() {
        OffsetCurveDocument result = OffsetCurveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OffsetCurveType createOffsetCurveType() {
        OffsetCurveType result = OffsetCurveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationDocument createOperationDocument() {
        OperationDocument result = OperationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationMethodBaseType createOperationMethodBaseType() {
        OperationMethodBaseType result = OperationMethodBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationMethodDocument createOperationMethodDocument() {
        OperationMethodDocument result = OperationMethodDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationMethodRefDocument createOperationMethodRefDocument() {
        OperationMethodRefDocument result = OperationMethodRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationMethodRefType createOperationMethodRefType() {
        OperationMethodRefType result = OperationMethodRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationMethodType createOperationMethodType() {
        OperationMethodType result = OperationMethodType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterBaseType createOperationParameterBaseType() {
        OperationParameterBaseType result = OperationParameterBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterDocument createOperationParameterDocument() {
        OperationParameterDocument result = OperationParameterDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterGroupBaseType createOperationParameterGroupBaseType() {
        OperationParameterGroupBaseType result = OperationParameterGroupBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterGroupDocument createOperationParameterGroupDocument() {
        OperationParameterGroupDocument result = OperationParameterGroupDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterGroupRefDocument createOperationParameterGroupRefDocument() {
        OperationParameterGroupRefDocument result = OperationParameterGroupRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterGroupRefType createOperationParameterGroupRefType() {
        OperationParameterGroupRefType result = OperationParameterGroupRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterGroupType createOperationParameterGroupType() {
        OperationParameterGroupType result = OperationParameterGroupType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterRefDocument createOperationParameterRefDocument() {
        OperationParameterRefDocument result = OperationParameterRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterRefType createOperationParameterRefType() {
        OperationParameterRefType result = OperationParameterRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationParameterType createOperationParameterType() {
        OperationParameterType result = OperationParameterType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationRefDocument createOperationRefDocument() {
        OperationRefDocument result = OperationRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationRefType createOperationRefType() {
        OperationRefType result = OperationRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OperationVersionDocument createOperationVersionDocument() {
        OperationVersionDocument result = OperationVersionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OrientableCurveDocument createOrientableCurveDocument() {
        OrientableCurveDocument result = OrientableCurveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OrientableCurveType createOrientableCurveType() {
        OrientableCurveType result = OrientableCurveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OrientableSurfaceDocument createOrientableSurfaceDocument() {
        OrientableSurfaceDocument result = OrientableSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OrientableSurfaceType createOrientableSurfaceType() {
        OrientableSurfaceType result = OrientableSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OriginDocument createOriginDocument() {
        OriginDocument result = OriginDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public OuterBoundaryIsDocument createOuterBoundaryIsDocument() {
        OuterBoundaryIsDocument result = OuterBoundaryIsDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ParameterIDDocument createParameterIDDocument() {
        ParameterIDDocument result = ParameterIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ParameterNameDocument createParameterNameDocument() {
        ParameterNameDocument result = ParameterNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ParameterValueDocument createParameterValueDocument() {
        ParameterValueDocument result = ParameterValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ParameterValueGroupDocument createParameterValueGroupDocument() {
        ParameterValueGroupDocument result = ParameterValueGroupDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ParameterValueGroupType createParameterValueGroupType() {
        ParameterValueGroupType result = ParameterValueGroupType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ParameterValueType createParameterValueType() {
        ParameterValueType result = ParameterValueType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ParametricCurveSurfaceDocument createParametricCurveSurfaceDocument() {
        ParametricCurveSurfaceDocument result = ParametricCurveSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PassThroughOperationDocument createPassThroughOperationDocument() {
        PassThroughOperationDocument result = PassThroughOperationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PassThroughOperationRefDocument createPassThroughOperationRefDocument() {
        PassThroughOperationRefDocument result = PassThroughOperationRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PassThroughOperationRefType createPassThroughOperationRefType() {
        PassThroughOperationRefType result = PassThroughOperationRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PassThroughOperationType createPassThroughOperationType() {
        PassThroughOperationType result = PassThroughOperationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PatchesDocument createPatchesDocument() {
        PatchesDocument result = PatchesDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PixelInCellDocument createPixelInCellDocument() {
        PixelInCellDocument result = PixelInCellDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PixelInCellType createPixelInCellType() {
        PixelInCellType result = PixelInCellType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointArrayPropertyDocument createPointArrayPropertyDocument() {
        PointArrayPropertyDocument result = PointArrayPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointArrayPropertyType createPointArrayPropertyType() {
        PointArrayPropertyType result = PointArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointDocument createPointDocument() {
        PointDocument result = PointDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointMemberDocument createPointMemberDocument() {
        PointMemberDocument result = PointMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointMembersDocument createPointMembersDocument() {
        PointMembersDocument result = PointMembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointPropertyDocument createPointPropertyDocument() {
        PointPropertyDocument result = PointPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointPropertyType createPointPropertyType() {
        PointPropertyType result = PointPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointRepDocument createPointRepDocument() {
        PointRepDocument result = PointRepDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PointType createPointType() {
        PointType result = PointType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolarCSDocument createPolarCSDocument() {
        PolarCSDocument result = PolarCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolarCSRefDocument createPolarCSRefDocument() {
        PolarCSRefDocument result = PolarCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolarCSRefType createPolarCSRefType() {
        PolarCSRefType result = PolarCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolarCSType createPolarCSType() {
        PolarCSType result = PolarCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonDocument createPolygonDocument() {
        PolygonDocument result = PolygonDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonMemberDocument createPolygonMemberDocument() {
        PolygonMemberDocument result = PolygonMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonPatchArrayPropertyType createPolygonPatchArrayPropertyType() {
        PolygonPatchArrayPropertyType result = PolygonPatchArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonPatchDocument createPolygonPatchDocument() {
        PolygonPatchDocument result = PolygonPatchDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonPatchesDocument createPolygonPatchesDocument() {
        PolygonPatchesDocument result = PolygonPatchesDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonPatchType createPolygonPatchType() {
        PolygonPatchType result = PolygonPatchType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonPropertyDocument createPolygonPropertyDocument() {
        PolygonPropertyDocument result = PolygonPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonPropertyType createPolygonPropertyType() {
        PolygonPropertyType result = PolygonPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolygonType createPolygonType() {
        PolygonType result = PolygonType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolyhedralSurfaceDocument createPolyhedralSurfaceDocument() {
        PolyhedralSurfaceDocument result = PolyhedralSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PolyhedralSurfaceType createPolyhedralSurfaceType() {
        PolyhedralSurfaceType result = PolyhedralSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PosDocument createPosDocument() {
        PosDocument result = PosDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PositionalAccuracyDocument createPositionalAccuracyDocument() {
        PositionalAccuracyDocument result = PositionalAccuracyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PositionDocument createPositionDocument() {
        PositionDocument result = PositionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PosListDocument createPosListDocument() {
        PosListDocument result = PosListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrimeMeridianBaseType createPrimeMeridianBaseType() {
        PrimeMeridianBaseType result = PrimeMeridianBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrimeMeridianDocument createPrimeMeridianDocument() {
        PrimeMeridianDocument result = PrimeMeridianDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrimeMeridianRefDocument createPrimeMeridianRefDocument() {
        PrimeMeridianRefDocument result = PrimeMeridianRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrimeMeridianRefType createPrimeMeridianRefType() {
        PrimeMeridianRefType result = PrimeMeridianRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrimeMeridianType createPrimeMeridianType() {
        PrimeMeridianType result = PrimeMeridianType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PriorityLocationDocument createPriorityLocationDocument() {
        PriorityLocationDocument result = PriorityLocationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PriorityLocationPropertyType createPriorityLocationPropertyType() {
        PriorityLocationPropertyType result = PriorityLocationPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ProjectedCRSDocument createProjectedCRSDocument() {
        ProjectedCRSDocument result = ProjectedCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ProjectedCRSRefDocument createProjectedCRSRefDocument() {
        ProjectedCRSRefDocument result = ProjectedCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ProjectedCRSRefType createProjectedCRSRefType() {
        ProjectedCRSRefType result = ProjectedCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ProjectedCRSType createProjectedCRSType() {
        ProjectedCRSType result = ProjectedCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QNameList createQNameList() {
        QNameList result = QNameList.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QuantityDocument createQuantityDocument() {
        QuantityDocument result = QuantityDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QuantityExtentDocument createQuantityExtentDocument() {
        QuantityExtentDocument result = QuantityExtentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QuantityExtentType createQuantityExtentType() {
        QuantityExtentType result = QuantityExtentType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QuantityListDocument createQuantityListDocument() {
        QuantityListDocument result = QuantityListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QuantityPropertyType createQuantityPropertyType() {
        QuantityPropertyType result = QuantityPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QuantityTypeDocument createQuantityTypeDocument() {
        QuantityTypeDocument result = QuantityTypeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public QueryGrammarEnumeration createQueryGrammarEnumeration() {
        QueryGrammarEnumeration result = QueryGrammarEnumeration.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RangeParametersDocument createRangeParametersDocument() {
        RangeParametersDocument result = RangeParametersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RangeParametersType createRangeParametersType() {
        RangeParametersType result = RangeParametersType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RangeSetDocument createRangeSetDocument() {
        RangeSetDocument result = RangeSetDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RangeSetType createRangeSetType() {
        RangeSetType result = RangeSetType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RealizationEpochDocument createRealizationEpochDocument() {
        RealizationEpochDocument result = RealizationEpochDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectangleDocument createRectangleDocument() {
        RectangleDocument result = RectangleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectangleType createRectangleType() {
        RectangleType result = RectangleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectifiedGridCoverageDocument createRectifiedGridCoverageDocument() {
        RectifiedGridCoverageDocument result = RectifiedGridCoverageDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectifiedGridCoverageType createRectifiedGridCoverageType() {
        RectifiedGridCoverageType result = RectifiedGridCoverageType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectifiedGridDocument createRectifiedGridDocument() {
        RectifiedGridDocument result = RectifiedGridDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectifiedGridDomainDocument createRectifiedGridDomainDocument() {
        RectifiedGridDomainDocument result = RectifiedGridDomainDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectifiedGridDomainType createRectifiedGridDomainType() {
        RectifiedGridDomainType result = RectifiedGridDomainType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RectifiedGridType createRectifiedGridType() {
        RectifiedGridType result = RectifiedGridType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ReferenceDocument createReferenceDocument() {
        ReferenceDocument result = ReferenceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ReferenceSystemDocument createReferenceSystemDocument() {
        ReferenceSystemDocument result = ReferenceSystemDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ReferenceSystemRefDocument createReferenceSystemRefDocument() {
        ReferenceSystemRefDocument result = ReferenceSystemRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ReferenceSystemRefType createReferenceSystemRefType() {
        ReferenceSystemRefType result = ReferenceSystemRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ReferenceType createReferenceType() {
        ReferenceType result = ReferenceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelatedTimeType createRelatedTimeType() {
        RelatedTimeType result = RelatedTimeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelativeInternalPositionalAccuracyDocument createRelativeInternalPositionalAccuracyDocument() {
        RelativeInternalPositionalAccuracyDocument result =
                RelativeInternalPositionalAccuracyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelativeInternalPositionalAccuracyType createRelativeInternalPositionalAccuracyType() {
        RelativeInternalPositionalAccuracyType result =
                RelativeInternalPositionalAccuracyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RemarksDocument createRemarksDocument() {
        RemarksDocument result = RemarksDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RemoteSchemaAttribute createRemoteSchemaAttribute() {
        RemoteSchemaAttribute result = RemoteSchemaAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResultDocument createResultDocument() {
        ResultDocument result = ResultDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResultOfDocument createResultOfDocument() {
        ResultOfDocument result = ResultOfDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RingDocument createRingDocument() {
        RingDocument result = RingDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RingPropertyType createRingPropertyType() {
        RingPropertyType result = RingPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RingType createRingType() {
        RingType result = RingType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RoughConversionToPreferredUnitDocument createRoughConversionToPreferredUnitDocument() {
        RoughConversionToPreferredUnitDocument result = RoughConversionToPreferredUnitDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RowIndexDocument createRowIndexDocument() {
        RowIndexDocument result = RowIndexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ScalarValuePropertyType createScalarValuePropertyType() {
        ScalarValuePropertyType result = ScalarValuePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ScaleType createScaleType() {
        ScaleType result = ScaleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ScopeDocument createScopeDocument() {
        ScopeDocument result = ScopeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SecondDefiningParameterDocument createSecondDefiningParameterDocument() {
        SecondDefiningParameterDocument result = SecondDefiningParameterDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SecondDefiningParameterType createSecondDefiningParameterType() {
        SecondDefiningParameterType result = SecondDefiningParameterType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SecondsDocument createSecondsDocument() {
        SecondsDocument result = SecondsDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SegmentsDocument createSegmentsDocument() {
        SegmentsDocument result = SegmentsDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SemiMajorAxisDocument createSemiMajorAxisDocument() {
        SemiMajorAxisDocument result = SemiMajorAxisDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SemiMinorAxisDocument createSemiMinorAxisDocument() {
        SemiMinorAxisDocument result = SemiMinorAxisDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SequenceRuleNames createSequenceRuleNames() {
        SequenceRuleNames result = SequenceRuleNames.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SequenceRuleType createSequenceRuleType() {
        SequenceRuleType result = SequenceRuleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SignType createSignType() {
        SignType result = SignType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SingleOperationDocument createSingleOperationDocument() {
        SingleOperationDocument result = SingleOperationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SingleOperationRefDocument createSingleOperationRefDocument() {
        SingleOperationRefDocument result = SingleOperationRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SingleOperationRefType createSingleOperationRefType() {
        SingleOperationRefType result = SingleOperationRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidArrayPropertyDocument createSolidArrayPropertyDocument() {
        SolidArrayPropertyDocument result = SolidArrayPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidArrayPropertyType createSolidArrayPropertyType() {
        SolidArrayPropertyType result = SolidArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidDocument createSolidDocument() {
        SolidDocument result = SolidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidMemberDocument createSolidMemberDocument() {
        SolidMemberDocument result = SolidMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidMembersDocument createSolidMembersDocument() {
        SolidMembersDocument result = SolidMembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidPropertyDocument createSolidPropertyDocument() {
        SolidPropertyDocument result = SolidPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidPropertyType createSolidPropertyType() {
        SolidPropertyType result = SolidPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SolidType createSolidType() {
        SolidType result = SolidType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SourceCRSDocument createSourceCRSDocument() {
        SourceCRSDocument result = SourceCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SourceDimensionsDocument createSourceDimensionsDocument() {
        SourceDimensionsDocument result = SourceDimensionsDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SpeedType createSpeedType() {
        SpeedType result = SpeedType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SphereDocument createSphereDocument() {
        SphereDocument result = SphereDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SphereType createSphereType() {
        SphereType result = SphereType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SphericalCSDocument createSphericalCSDocument() {
        SphericalCSDocument result = SphericalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SphericalCSRefDocument createSphericalCSRefDocument() {
        SphericalCSRefDocument result = SphericalCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SphericalCSRefType createSphericalCSRefType() {
        SphericalCSRefType result = SphericalCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SphericalCSType createSphericalCSType() {
        SphericalCSType result = SphericalCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SrsIDDocument createSrsIDDocument() {
        SrsIDDocument result = SrsIDDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SrsNameDocument createSrsNameDocument() {
        SrsNameDocument result = SrsNameDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StatusDocument createStatusDocument() {
        StatusDocument result = StatusDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StrictAssociationDocument createStrictAssociationDocument() {
        StrictAssociationDocument result = StrictAssociationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StringOrNull createStringOrNull() {
        StringOrNull result = StringOrNull.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StringOrRefType createStringOrRefType() {
        StringOrRefType result = StringOrRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StringValueDocument createStringValueDocument() {
        StringValueDocument result = StringValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StyleDocument createStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StyleType createStyleType() {
        StyleType result = StyleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public StyleVariationType createStyleVariationType() {
        StyleVariationType result = StyleVariationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SubComplexDocument createSubComplexDocument() {
        SubComplexDocument result = SubComplexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SubjectDocument createSubjectDocument() {
        SubjectDocument result = SubjectDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SuccessionType createSuccessionType() {
        SuccessionType result = SuccessionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SuperComplexDocument createSuperComplexDocument() {
        SuperComplexDocument result = SuperComplexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfaceArrayPropertyDocument createSurfaceArrayPropertyDocument() {
        SurfaceArrayPropertyDocument result = SurfaceArrayPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfaceArrayPropertyType createSurfaceArrayPropertyType() {
        SurfaceArrayPropertyType result = SurfaceArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfaceDocument createSurfaceDocument() {
        SurfaceDocument result = SurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfaceInterpolationType createSurfaceInterpolationType() {
        SurfaceInterpolationType result = SurfaceInterpolationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfaceMemberDocument createSurfaceMemberDocument() {
        SurfaceMemberDocument result = SurfaceMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfaceMembersDocument createSurfaceMembersDocument() {
        SurfaceMembersDocument result = SurfaceMembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfacePatchArrayPropertyType createSurfacePatchArrayPropertyType() {
        SurfacePatchArrayPropertyType result = SurfacePatchArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfacePatchDocument createSurfacePatchDocument() {
        SurfacePatchDocument result = SurfacePatchDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfacePropertyDocument createSurfacePropertyDocument() {
        SurfacePropertyDocument result = SurfacePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfacePropertyType createSurfacePropertyType() {
        SurfacePropertyType result = SurfacePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SurfaceType createSurfaceType() {
        SurfaceType result = SurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SymbolDocument createSymbolDocument() {
        SymbolDocument result = SymbolDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SymbolType createSymbolType() {
        SymbolType result = SymbolType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SymbolTypeEnumeration createSymbolTypeEnumeration() {
        SymbolTypeEnumeration result = SymbolTypeEnumeration.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TargetCRSDocument createTargetCRSDocument() {
        TargetCRSDocument result = TargetCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TargetDimensionsDocument createTargetDimensionsDocument() {
        TargetDimensionsDocument result = TargetDimensionsDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TargetDocument createTargetDocument() {
        TargetDocument result = TargetDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TargetPropertyType createTargetPropertyType() {
        TargetPropertyType result = TargetPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCRSDocument createTemporalCRSDocument() {
        TemporalCRSDocument result = TemporalCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCRSRefDocument createTemporalCRSRefDocument() {
        TemporalCRSRefDocument result = TemporalCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCRSRefType createTemporalCRSRefType() {
        TemporalCRSRefType result = TemporalCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCRSType createTemporalCRSType() {
        TemporalCRSType result = TemporalCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCSDocument createTemporalCSDocument() {
        TemporalCSDocument result = TemporalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCSRefDocument createTemporalCSRefDocument() {
        TemporalCSRefDocument result = TemporalCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCSRefType createTemporalCSRefType() {
        TemporalCSRefType result = TemporalCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalCSType createTemporalCSType() {
        TemporalCSType result = TemporalCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalDatumBaseType createTemporalDatumBaseType() {
        TemporalDatumBaseType result = TemporalDatumBaseType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalDatumDocument createTemporalDatumDocument() {
        TemporalDatumDocument result = TemporalDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalDatumRefDocument createTemporalDatumRefDocument() {
        TemporalDatumRefDocument result = TemporalDatumRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalDatumRefType createTemporalDatumRefType() {
        TemporalDatumRefType result = TemporalDatumRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalDatumType createTemporalDatumType() {
        TemporalDatumType result = TemporalDatumType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TemporalExtentDocument createTemporalExtentDocument() {
        TemporalExtentDocument result = TemporalExtentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCalendarDocument createTimeCalendarDocument() {
        TimeCalendarDocument result = TimeCalendarDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCalendarEraDocument createTimeCalendarEraDocument() {
        TimeCalendarEraDocument result = TimeCalendarEraDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCalendarEraPropertyType createTimeCalendarEraPropertyType() {
        TimeCalendarEraPropertyType result = TimeCalendarEraPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCalendarEraType createTimeCalendarEraType() {
        TimeCalendarEraType result = TimeCalendarEraType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCalendarPropertyType createTimeCalendarPropertyType() {
        TimeCalendarPropertyType result = TimeCalendarPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCalendarType createTimeCalendarType() {
        TimeCalendarType result = TimeCalendarType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeClockDocument createTimeClockDocument() {
        TimeClockDocument result = TimeClockDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeClockPropertyType createTimeClockPropertyType() {
        TimeClockPropertyType result = TimeClockPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeClockType createTimeClockType() {
        TimeClockType result = TimeClockType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeComplexDocument createTimeComplexDocument() {
        TimeComplexDocument result = TimeComplexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCoordinateSystemDocument createTimeCoordinateSystemDocument() {
        TimeCoordinateSystemDocument result = TimeCoordinateSystemDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeCoordinateSystemType createTimeCoordinateSystemType() {
        TimeCoordinateSystemType result = TimeCoordinateSystemType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeEdgeDocument createTimeEdgeDocument() {
        TimeEdgeDocument result = TimeEdgeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeEdgePropertyType createTimeEdgePropertyType() {
        TimeEdgePropertyType result = TimeEdgePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeEdgeType createTimeEdgeType() {
        TimeEdgeType result = TimeEdgeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeGeometricPrimitiveDocument createTimeGeometricPrimitiveDocument() {
        TimeGeometricPrimitiveDocument result = TimeGeometricPrimitiveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeGeometricPrimitivePropertyType createTimeGeometricPrimitivePropertyType() {
        TimeGeometricPrimitivePropertyType result = TimeGeometricPrimitivePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeIndeterminateValueType createTimeIndeterminateValueType() {
        TimeIndeterminateValueType result = TimeIndeterminateValueType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeInstantDocument createTimeInstantDocument() {
        TimeInstantDocument result = TimeInstantDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeInstantPropertyType createTimeInstantPropertyType() {
        TimeInstantPropertyType result = TimeInstantPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeInstantType createTimeInstantType() {
        TimeInstantType result = TimeInstantType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeIntervalDocument createTimeIntervalDocument() {
        TimeIntervalDocument result = TimeIntervalDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeIntervalLengthType createTimeIntervalLengthType() {
        TimeIntervalLengthType result = TimeIntervalLengthType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeNodeDocument createTimeNodeDocument() {
        TimeNodeDocument result = TimeNodeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeNodePropertyType createTimeNodePropertyType() {
        TimeNodePropertyType result = TimeNodePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeNodeType createTimeNodeType() {
        TimeNodeType result = TimeNodeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeObjectDocument createTimeObjectDocument() {
        TimeObjectDocument result = TimeObjectDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeOrdinalEraDocument createTimeOrdinalEraDocument() {
        TimeOrdinalEraDocument result = TimeOrdinalEraDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeOrdinalEraPropertyType createTimeOrdinalEraPropertyType() {
        TimeOrdinalEraPropertyType result = TimeOrdinalEraPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeOrdinalEraType createTimeOrdinalEraType() {
        TimeOrdinalEraType result = TimeOrdinalEraType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeOrdinalReferenceSystemDocument createTimeOrdinalReferenceSystemDocument() {
        TimeOrdinalReferenceSystemDocument result = TimeOrdinalReferenceSystemDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeOrdinalReferenceSystemType createTimeOrdinalReferenceSystemType() {
        TimeOrdinalReferenceSystemType result = TimeOrdinalReferenceSystemType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePeriodDocument createTimePeriodDocument() {
        TimePeriodDocument result = TimePeriodDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePeriodPropertyType createTimePeriodPropertyType() {
        TimePeriodPropertyType result = TimePeriodPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePeriodType createTimePeriodType() {
        TimePeriodType result = TimePeriodType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePositionDocument createTimePositionDocument() {
        TimePositionDocument result = TimePositionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePositionType createTimePositionType() {
        TimePositionType result = TimePositionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePositionUnion createTimePositionUnion() {
        TimePositionUnion result = TimePositionUnion.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePrimitiveDocument createTimePrimitiveDocument() {
        TimePrimitiveDocument result = TimePrimitiveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimePrimitivePropertyType createTimePrimitivePropertyType() {
        TimePrimitivePropertyType result = TimePrimitivePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeReferenceSystemDocument createTimeReferenceSystemDocument() {
        TimeReferenceSystemDocument result = TimeReferenceSystemDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeSliceDocument createTimeSliceDocument() {
        TimeSliceDocument result = TimeSliceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeTopologyComplexDocument createTimeTopologyComplexDocument() {
        TimeTopologyComplexDocument result = TimeTopologyComplexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeTopologyComplexPropertyType createTimeTopologyComplexPropertyType() {
        TimeTopologyComplexPropertyType result = TimeTopologyComplexPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeTopologyComplexType createTimeTopologyComplexType() {
        TimeTopologyComplexType result = TimeTopologyComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeTopologyPrimitiveDocument createTimeTopologyPrimitiveDocument() {
        TimeTopologyPrimitiveDocument result = TimeTopologyPrimitiveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeTopologyPrimitivePropertyType createTimeTopologyPrimitivePropertyType() {
        TimeTopologyPrimitivePropertyType result = TimeTopologyPrimitivePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeType createTimeType() {
        TimeType result = TimeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TimeUnitType createTimeUnitType() {
        TimeUnitType result = TimeUnitType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TinDocument createTinDocument() {
        TinDocument result = TinDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TinType createTinType() {
        TinType result = TinType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoComplexDocument createTopoComplexDocument() {
        TopoComplexDocument result = TopoComplexDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoComplexMemberType createTopoComplexMemberType() {
        TopoComplexMemberType result = TopoComplexMemberType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoComplexPropertyDocument createTopoComplexPropertyDocument() {
        TopoComplexPropertyDocument result = TopoComplexPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoComplexType createTopoComplexType() {
        TopoComplexType result = TopoComplexType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoCurveDocument createTopoCurveDocument() {
        TopoCurveDocument result = TopoCurveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoCurvePropertyDocument createTopoCurvePropertyDocument() {
        TopoCurvePropertyDocument result = TopoCurvePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoCurvePropertyType createTopoCurvePropertyType() {
        TopoCurvePropertyType result = TopoCurvePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoCurveType createTopoCurveType() {
        TopoCurveType result = TopoCurveType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopologyDocument createTopologyDocument() {
        TopologyDocument result = TopologyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopologyStyleDocument createTopologyStyleDocument() {
        TopologyStyleDocument result = TopologyStyleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopologyStylePropertyType createTopologyStylePropertyType() {
        TopologyStylePropertyType result = TopologyStylePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopologyStyleType createTopologyStyleType() {
        TopologyStyleType result = TopologyStyleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPointDocument createTopoPointDocument() {
        TopoPointDocument result = TopoPointDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPointPropertyDocument createTopoPointPropertyDocument() {
        TopoPointPropertyDocument result = TopoPointPropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPointPropertyType createTopoPointPropertyType() {
        TopoPointPropertyType result = TopoPointPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPointType createTopoPointType() {
        TopoPointType result = TopoPointType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPrimitiveArrayAssociationType createTopoPrimitiveArrayAssociationType() {
        TopoPrimitiveArrayAssociationType result = TopoPrimitiveArrayAssociationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPrimitiveDocument createTopoPrimitiveDocument() {
        TopoPrimitiveDocument result = TopoPrimitiveDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPrimitiveMemberDocument createTopoPrimitiveMemberDocument() {
        TopoPrimitiveMemberDocument result = TopoPrimitiveMemberDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPrimitiveMembersDocument createTopoPrimitiveMembersDocument() {
        TopoPrimitiveMembersDocument result = TopoPrimitiveMembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoPrimitiveMemberType createTopoPrimitiveMemberType() {
        TopoPrimitiveMemberType result = TopoPrimitiveMemberType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoSolidDocument createTopoSolidDocument() {
        TopoSolidDocument result = TopoSolidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoSolidType createTopoSolidType() {
        TopoSolidType result = TopoSolidType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoSurfaceDocument createTopoSurfaceDocument() {
        TopoSurfaceDocument result = TopoSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoSurfacePropertyDocument createTopoSurfacePropertyDocument() {
        TopoSurfacePropertyDocument result = TopoSurfacePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoSurfacePropertyType createTopoSurfacePropertyType() {
        TopoSurfacePropertyType result = TopoSurfacePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoSurfaceType createTopoSurfaceType() {
        TopoSurfaceType result = TopoSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoVolumeDocument createTopoVolumeDocument() {
        TopoVolumeDocument result = TopoVolumeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoVolumePropertyDocument createTopoVolumePropertyDocument() {
        TopoVolumePropertyDocument result = TopoVolumePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoVolumePropertyType createTopoVolumePropertyType() {
        TopoVolumePropertyType result = TopoVolumePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TopoVolumeType createTopoVolumeType() {
        TopoVolumeType result = TopoVolumeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TrackDocument createTrackDocument() {
        TrackDocument result = TrackDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TrackType createTrackType() {
        TrackType result = TrackType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TransformationDocument createTransformationDocument() {
        TransformationDocument result = TransformationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TransformationRefDocument createTransformationRefDocument() {
        TransformationRefDocument result = TransformationRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TransformationRefType createTransformationRefType() {
        TransformationRefType result = TransformationRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TransformationType createTransformationType() {
        TransformationType result = TransformationType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TransformAttribute createTransformAttribute() {
        TransformAttribute result = TransformAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TriangleDocument createTriangleDocument() {
        TriangleDocument result = TriangleDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TrianglePatchArrayPropertyType createTrianglePatchArrayPropertyType() {
        TrianglePatchArrayPropertyType result = TrianglePatchArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TrianglePatchesDocument createTrianglePatchesDocument() {
        TrianglePatchesDocument result = TrianglePatchesDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TriangleType createTriangleType() {
        TriangleType result = TriangleType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TriangulatedSurfaceDocument createTriangulatedSurfaceDocument() {
        TriangulatedSurfaceDocument result = TriangulatedSurfaceDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TriangulatedSurfaceType createTriangulatedSurfaceType() {
        TriangulatedSurfaceType result = TriangulatedSurfaceType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TupleListDocument createTupleListDocument() {
        TupleListDocument result = TupleListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UnitDefinitionDocument createUnitDefinitionDocument() {
        UnitDefinitionDocument result = UnitDefinitionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UnitDefinitionType createUnitDefinitionType() {
        UnitDefinitionType result = UnitDefinitionType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UnitOfMeasureDocument createUnitOfMeasureDocument() {
        UnitOfMeasureDocument result = UnitOfMeasureDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UnitOfMeasureType createUnitOfMeasureType() {
        UnitOfMeasureType result = UnitOfMeasureType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UomAttribute createUomAttribute() {
        UomAttribute result = UomAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UserDefinedCSDocument createUserDefinedCSDocument() {
        UserDefinedCSDocument result = UserDefinedCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UserDefinedCSRefDocument createUserDefinedCSRefDocument() {
        UserDefinedCSRefDocument result = UserDefinedCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UserDefinedCSRefType createUserDefinedCSRefType() {
        UserDefinedCSRefType result = UserDefinedCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UserDefinedCSType createUserDefinedCSType() {
        UserDefinedCSType result = UserDefinedCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesAxisDocument createUsesAxisDocument() {
        UsesAxisDocument result = UsesAxisDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesCartesianCSDocument createUsesCartesianCSDocument() {
        UsesCartesianCSDocument result = UsesCartesianCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesCSDocument createUsesCSDocument() {
        UsesCSDocument result = UsesCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesEllipsoidalCSDocument createUsesEllipsoidalCSDocument() {
        UsesEllipsoidalCSDocument result = UsesEllipsoidalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesEllipsoidDocument createUsesEllipsoidDocument() {
        UsesEllipsoidDocument result = UsesEllipsoidDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesEngineeringDatumDocument createUsesEngineeringDatumDocument() {
        UsesEngineeringDatumDocument result = UsesEngineeringDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesGeodeticDatumDocument createUsesGeodeticDatumDocument() {
        UsesGeodeticDatumDocument result = UsesGeodeticDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesImageDatumDocument createUsesImageDatumDocument() {
        UsesImageDatumDocument result = UsesImageDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesMethodDocument createUsesMethodDocument() {
        UsesMethodDocument result = UsesMethodDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesObliqueCartesianCSDocument createUsesObliqueCartesianCSDocument() {
        UsesObliqueCartesianCSDocument result = UsesObliqueCartesianCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesOperationDocument createUsesOperationDocument() {
        UsesOperationDocument result = UsesOperationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesParameterDocument createUsesParameterDocument() {
        UsesParameterDocument result = UsesParameterDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesPrimeMeridianDocument createUsesPrimeMeridianDocument() {
        UsesPrimeMeridianDocument result = UsesPrimeMeridianDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesSingleOperationDocument createUsesSingleOperationDocument() {
        UsesSingleOperationDocument result = UsesSingleOperationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesSphericalCSDocument createUsesSphericalCSDocument() {
        UsesSphericalCSDocument result = UsesSphericalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesTemporalCSDocument createUsesTemporalCSDocument() {
        UsesTemporalCSDocument result = UsesTemporalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesTemporalDatumDocument createUsesTemporalDatumDocument() {
        UsesTemporalDatumDocument result = UsesTemporalDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesValueDocument createUsesValueDocument() {
        UsesValueDocument result = UsesValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesVerticalCSDocument createUsesVerticalCSDocument() {
        UsesVerticalCSDocument result = UsesVerticalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsesVerticalDatumDocument createUsesVerticalDatumDocument() {
        UsesVerticalDatumDocument result = UsesVerticalDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public UsingDocument createUsingDocument() {
        UsingDocument result = UsingDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValidAreaDocument createValidAreaDocument() {
        ValidAreaDocument result = ValidAreaDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValidTimeDocument createValidTimeDocument() {
        ValidTimeDocument result = ValidTimeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueArrayDocument createValueArrayDocument() {
        ValueArrayDocument result = ValueArrayDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueArrayPropertyType createValueArrayPropertyType() {
        ValueArrayPropertyType result = ValueArrayPropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueArrayType createValueArrayType() {
        ValueArrayType result = ValueArrayType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueComponentDocument createValueComponentDocument() {
        ValueComponentDocument result = ValueComponentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueComponentsDocument createValueComponentsDocument() {
        ValueComponentsDocument result = ValueComponentsDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueDocument createValueDocument() {
        ValueDocument result = ValueDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueFileDocument createValueFileDocument() {
        ValueFileDocument result = ValueFileDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueListDocument createValueListDocument() {
        ValueListDocument result = ValueListDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValueOfParameterDocument createValueOfParameterDocument() {
        ValueOfParameterDocument result = ValueOfParameterDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValuePropertyDocument createValuePropertyDocument() {
        ValuePropertyDocument result = ValuePropertyDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValuePropertyType createValuePropertyType() {
        ValuePropertyType result = ValuePropertyType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ValuesOfGroupDocument createValuesOfGroupDocument() {
        ValuesOfGroupDocument result = ValuesOfGroupDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VectorDocument createVectorDocument() {
        VectorDocument result = VectorDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VectorType createVectorType() {
        VectorType result = VectorType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VersionDocument createVersionDocument() {
        VersionDocument result = VersionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCRSDocument createVerticalCRSDocument() {
        VerticalCRSDocument result = VerticalCRSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCRSRefDocument createVerticalCRSRefDocument() {
        VerticalCRSRefDocument result = VerticalCRSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCRSRefType createVerticalCRSRefType() {
        VerticalCRSRefType result = VerticalCRSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCRSType createVerticalCRSType() {
        VerticalCRSType result = VerticalCRSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCSDocument createVerticalCSDocument() {
        VerticalCSDocument result = VerticalCSDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCSRefDocument createVerticalCSRefDocument() {
        VerticalCSRefDocument result = VerticalCSRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCSRefType createVerticalCSRefType() {
        VerticalCSRefType result = VerticalCSRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalCSType createVerticalCSType() {
        VerticalCSType result = VerticalCSType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalDatumDocument createVerticalDatumDocument() {
        VerticalDatumDocument result = VerticalDatumDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalDatumRefDocument createVerticalDatumRefDocument() {
        VerticalDatumRefDocument result = VerticalDatumRefDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalDatumRefType createVerticalDatumRefType() {
        VerticalDatumRefType result = VerticalDatumRefType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalDatumType createVerticalDatumType() {
        VerticalDatumType result = VerticalDatumType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalDatumTypeDocument createVerticalDatumTypeDocument() {
        VerticalDatumTypeDocument result = VerticalDatumTypeDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalDatumTypeType createVerticalDatumTypeType() {
        VerticalDatumTypeType result = VerticalDatumTypeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VerticalExtentDocument createVerticalExtentDocument() {
        VerticalExtentDocument result = VerticalExtentDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public VolumeType createVolumeType() {
        VolumeType result = VolumeType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ClassificationWrapDocument.ClassificationWrap createClassificationWrap() {
        ClassificationWrapDocument.ClassificationWrap result = ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ClassificationWrapDocument.ClassificationWrap.Classification createClassification() {
        ClassificationWrapDocument.ClassificationWrap.Classification result = ClassificationWrapDocument.ClassificationWrap.Classification.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createDisplayStateEditionWrap() {
        DisplayStateEditionWrapDocument.DisplayStateEditionWrap result = DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EventWrapDocument.EventWrap createEventWrap() {
        EventWrapDocument.EventWrap result = EventWrapDocument.EventWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EventWrapDocument.EventWrap.EventSet createEvent() {
        EventWrapDocument.EventWrap.EventSet result = EventWrapDocument.EventWrap.EventSet.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public InscriptionsWrapDocument.InscriptionsWrap createInscriptionsWrap() {
        InscriptionsWrapDocument.InscriptionsWrap result = InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public InscriptionsWrapDocument.InscriptionsWrap.Inscriptions createInscriptions() {
        InscriptionsWrapDocument.InscriptionsWrap.Inscriptions result =
                InscriptionsWrapDocument.InscriptionsWrap.Inscriptions.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LidoWrapDocument.LidoWrap createLidoWrap() {
        LidoWrapDocument.LidoWrap result = LidoWrapDocument.LidoWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public LidoWrapDocument.LidoWrap.Lido createLido() {
        LidoWrapDocument.LidoWrap.Lido result = LidoWrapDocument.LidoWrap.Lido.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectClassificationWrapDocument.ObjectClassificationWrap createObjectClassificationWrap() {
        ObjectClassificationWrapDocument.ObjectClassificationWrap result = ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectDescriptionWrapDocument.ObjectDescriptionWrap createObjectDescriptionWrap() {
        ObjectDescriptionWrapDocument.ObjectDescriptionWrap result = ObjectDescriptionWrapDocument.ObjectDescriptionWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectIdentificationWrapDocument.ObjectIdentificationWrap createObjectIdentificationWrap() {
        ObjectIdentificationWrapDocument.ObjectIdentificationWrap result =
                ObjectIdentificationWrapDocument.ObjectIdentificationWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap createObjectMeasurementsWrap() {
        ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap result = ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet createObjectMeasurements() {
        ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet result =
                ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectRelationWrapDocument.ObjectRelationWrap createObjectRelationWrap() {
        ObjectRelationWrapDocument.ObjectRelationWrap result =
                ObjectRelationWrapDocument.ObjectRelationWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createObjectWorkTypeWrap() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap result =
                ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType createObjectWorkType() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType result =
                ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RecordWrapDocument.RecordWrap createRecordWrap() {
        RecordWrapDocument.RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelatedWorksWrapDocument.RelatedWorksWrap createRelatedWorksWrap() {
        RelatedWorksWrapDocument.RelatedWorksWrap result =
                RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet createRelatedWorks() {
        RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet result =
                RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RepositoryWrapDocument.RepositoryWrap createRepositoryWrap() {
        RepositoryWrapDocument.RepositoryWrap result = RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResourceWrapDocument.ResourceWrap createResourceWrap() {
        ResourceWrapDocument.ResourceWrap result = ResourceWrapDocument.ResourceWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ResourceWrapDocument.ResourceWrap.ResourceSet createResource() {
        ResourceWrapDocument.ResourceWrap.ResourceSet result = ResourceWrapDocument.ResourceWrap.ResourceSet.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RightsWorkWrapDocument.RightsWorkWrap createRightsWorkWrap() {
        RightsWorkWrapDocument.RightsWorkWrap result = RightsWorkWrapDocument.RightsWorkWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet createRightsWork() {
        RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet result = RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SubjectWrapDocument.SubjectWrap createSubjectWrap() {
        SubjectWrapDocument.SubjectWrap result = SubjectWrapDocument.SubjectWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public SubjectWrapDocument.SubjectWrap.SubjectSet createSubject() {
        SubjectWrapDocument.SubjectWrap.SubjectSet result = SubjectWrapDocument.SubjectWrap.SubjectSet.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TitleWrapDocument.TitleWrap createTitleWrap() {
        TitleWrapDocument.TitleWrap result = TitleWrapDocument.TitleWrap.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TitleWrapDocument.TitleWrap.TitleSet createTitle() {
        TitleWrapDocument.TitleWrap.TitleSet result = TitleWrapDocument.TitleWrap.TitleSet.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public CurveMembersDocument createCurveMembersDocument() {
        CurveMembersDocument result = CurveMembersDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x2001.smil20.language.AnimateColorDocument createLanguageAnimateColorDocument() {
        org.w3.x2001.smil20.language.AnimateColorDocument result = org.w3.x2001.smil20.language.AnimateColorDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x2001.smil20.language.AnimateDocument createLanguageAnimateDocument() {
        org.w3.x2001.smil20.language.AnimateDocument result = org.w3.x2001.smil20.language.AnimateDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x2001.smil20.language.AnimateMotionDocument createLanguageAnimateMotionDocument() {
        org.w3.x2001.smil20.language.AnimateMotionDocument result = org.w3.x2001.smil20.language.AnimateMotionDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x2001.smil20.language.SetDocument createLanguageSetDocument() {
        org.w3.x2001.smil20.language.SetDocument result = org.w3.x2001.smil20.language.SetDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x1999.xlink.ArcDocument createXLinkArcDocument() {
        org.w3.x1999.xlink.ArcDocument result = org.w3.x1999.xlink.ArcDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x1999.xlink.ArcType createXLinkArcType() {
        org.w3.x1999.xlink.ArcType result = org.w3.x1999.xlink.ArcType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x1999.xlink.LabelAttribute createXlinkLabelAttribute() {
        org.w3.x1999.xlink.LabelAttribute result = org.w3.x1999.xlink.LabelAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x1999.xlink.LabelType createXlinkLabelType() {
        org.w3.x1999.xlink.LabelType result = org.w3.x1999.xlink.LabelType.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public org.w3.x1999.xlink.TypeAttribute createXlinkTypeAttribute() {
        org.w3.x1999.xlink.TypeAttribute result = org.w3.x1999.xlink.TypeAttribute.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }
}
