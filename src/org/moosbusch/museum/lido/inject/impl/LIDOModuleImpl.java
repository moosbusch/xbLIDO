/*
 * 
 *
 */
package org.moosbusch.museum.lido.inject.impl;

import com.google.inject.Provides;
import java.math.BigInteger;
import net.opengis.gml.AbsoluteExternalPositionalAccuracyDocument;
import net.opengis.gml.AbsoluteExternalPositionalAccuracyType;
import net.opengis.gml.AbstractGeneralOperationParameterRefDocument;
import net.opengis.gml.AbstractGeneralOperationParameterRefType;
import net.opengis.gml.AbstractGriddedSurfaceType;
import net.opengis.gml.AbstractParametricCurveSurfaceType;
import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.AbstractSolidType;
import net.opengis.gml.AbstractSurfaceType;
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
import net.opengis.gml.impl.BoundedFeatureTypeImpl;
import org.apache.xmlbeans.XmlObject;
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
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.MuseumXmlModule;
import org.moosbusch.museum.inject.MuseumXmlObjectFactory;
import org.moosbusch.museum.inject.annotation.Language;
import org.moosbusch.museum.inject.annotation.RelatedEncoding;
import org.moosbusch.museum.lido.document.Document;
import org.moosbusch.museum.lido.document.impl.DocumentImpl;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
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

    public LIDOModuleImpl(MuseumXmlObjectFactory<? extends MuseumXmlModule, ? extends XmlObject> objFactory) {
        super(objFactory);
    }

    @Override
    protected void configureImpl() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(
                getLanguage());
        binder().bind(String.class).annotatedWith(RelatedEncoding.class).toInstance(
                getRelatedEncoding());
        binder().bind(BigInteger.class).annotatedWith(SortOrder.class).toInstance(
                BigInteger.ZERO);
        binder().bind(BigInteger.class).toInstance(BigInteger.ZERO);
    }

    @Override
    protected String createRelatedEncoding() {
        return MuseumXmlDocument.DEFAULT_RELATED_ENCODING;
    }

    @Provides
    @Override
    public Document<? extends LIDOObjectFactory> createDocument() {
        return new DocumentImpl();
    }

    @Provides
    @Override
    public TemporalDatumBaseType createTemporalDatumBaseType() {
        TemporalDatumBaseType result = TemporalDatumType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PrimeMeridianBaseType createPrimeMeridianBaseType() {
        PrimeMeridianBaseType result = PrimeMeridianType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterGroupBaseType createOperationParameterGroupBaseType() {
        OperationParameterGroupBaseType result = OperationParameterGroupType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterBaseType createOperationParameterBaseType() {
        OperationParameterBaseType result = OperationParameterType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationMethodBaseType createOperationMethodBaseType() {
        OperationMethodBaseType result = OperationMethodType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidBaseType createEllipsoidBaseType() {
        EllipsoidBaseType result = EllipsoidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemAxisBaseType createCoordinateSystemAxisBaseType() {
        CoordinateSystemAxisBaseType result = CoordinateSystemAxisType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BoundedFeatureType createBoundedFeatureType() {
        BoundedFeatureType result = new BoundedFeatureTypeImpl(BoundedFeatureType.type);
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Override
    public RepositorySetComplexType createRepositorySetComplexType() {
        RepositorySetComplexType result = RepositorySetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateMotionType createAnimateMotionType() {
        AnimateMotionType result = AnimateMotionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RepositorySetComplexType createRepository() {
        RepositorySetComplexType result = RepositorySetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateColorDocument createAnimateColorDocument() {
        AnimateColorDocument result = AnimateColorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateColorType createAnimateColorType() {
        AnimateColorType result = AnimateColorType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateDocument createAnimateDocument() {
        AnimateDocument result = AnimateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateMotionDocument createAnimateMotionDocument() {
        AnimateMotionDocument result = AnimateMotionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateType createAnimateType() {
        AnimateType result = AnimateType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SetDocument createSetDocument() {
        SetDocument result = SetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SetType createSetType() {
        SetType result = SetType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateColorPrototype createAnimateColorPrototype() {
        AnimateColorPrototype result = AnimateColorPrototype.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimateMotionPrototype createAnimateMotionPrototype() {
        AnimateMotionPrototype result = AnimateMotionPrototype.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnimatePrototype createAnimatePrototype() {
        AnimatePrototype result = AnimatePrototype.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FillDefaultType createFillDefaultType() {
        FillDefaultType result = FillDefaultType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FillTimingAttrsType createFillTimingAttrsType() {
        FillTimingAttrsType result = FillTimingAttrsType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NonNegativeDecimalType createNonNegativeDecimalType() {
        NonNegativeDecimalType result = NonNegativeDecimalType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RestartDefaultType createRestartDefaultType() {
        RestartDefaultType result = RestartDefaultType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RestartTimingType createRestartTimingType() {
        RestartTimingType result = RestartTimingType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SetPrototype createSetPrototype() {
        SetPrototype result = SetPrototype.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SyncBehaviorDefaultType createSyncBehaviorDefaultType() {
        SyncBehaviorDefaultType result = SyncBehaviorDefaultType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SyncBehaviorType createSyncBehaviorType() {
        SyncBehaviorType result = SyncBehaviorType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ActuateAttribute createActuateAttribute() {
        ActuateAttribute result = ActuateAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ActuateType createActuateType() {
        ActuateType result = ActuateType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcDocument createArcDocument() {
        ArcDocument result = ArcDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcroleAttribute createArcroleAttribute() {
        ArcroleAttribute result = ArcroleAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcroleType createArcroleType() {
        ArcroleType result = ArcroleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcType createArcType() {
        ArcType result = ArcType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public Extended createExtended() {
        Extended result = Extended.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FromAttribute createFromAttribute() {
        FromAttribute result = FromAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FromType createFromType() {
        FromType result = FromType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public HrefAttribute createHrefAttribute() {
        HrefAttribute result = HrefAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public HrefType createHrefType() {
        HrefType result = HrefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LabelAttribute createLabelAttribute() {
        LabelAttribute result = LabelAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LabelType createLabelType() {
        LabelType result = LabelType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LocatorDocument createLocatorDocument() {
        LocatorDocument result = LocatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LocatorType createLocatorType() {
        LocatorType result = LocatorType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResourceDocument createResourceDocument() {
        ResourceDocument result = ResourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResourceType createResourceType() {
        ResourceType result = ResourceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RoleAttribute createRoleAttribute() {
        RoleAttribute result = RoleAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RoleType createRoleType() {
        RoleType result = RoleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ShowAttribute createShowAttribute() {
        ShowAttribute result = ShowAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ShowType createShowType() {
        ShowType result = ShowType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public Simple createSimple() {
        Simple result = Simple.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TitleAttribute createTitleAttribute() {
        TitleAttribute result = TitleAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TitleAttrType createTitleAttrType() {
        TitleAttrType result = TitleAttrType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TitleDocument createTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TitleEltType createTitleEltType() {
        TitleEltType result = TitleEltType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ToAttribute createToAttribute() {
        ToAttribute result = ToAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ToType createToType() {
        ToType result = ToType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TypeAttribute createTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TypeType createTypeType() {
        TypeType result = TypeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ActorComplexType createActorComplexType() {
        ActorComplexType result = ActorComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ActorInRoleComplexType createActorInRoleComplexType() {
        ActorInRoleComplexType result = ActorInRoleComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ActorInRoleSetComplexType createActorInRoleSetComplexType() {
        ActorInRoleSetComplexType result = ActorInRoleSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ActorSetComplexType createActorSetComplexType() {
        ActorSetComplexType result = ActorSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AddedSearchTermAttribute createAddedSearchTermAttribute() {
        AddedSearchTermAttribute result = AddedSearchTermAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AdministrativeMetadataComplexType createAdministrativeMetadataComplexType() {
        AdministrativeMetadataComplexType result = AdministrativeMetadataComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AppellationComplexType createAppellationComplexType() {
        AppellationComplexType result = AppellationComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ClassificationWrapDocument createClassificationWrapDocument() {
        ClassificationWrapDocument result = ClassificationWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConceptComplexType createConceptComplexType() {
        ConceptComplexType result = ConceptComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DateComplexType createDateComplexType() {
        DateComplexType result = DateComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DateSetComplexType createDateSetComplexType() {
        DateSetComplexType result = DateSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadataComplexType createDescriptiveMetadataComplexType() {
        DescriptiveMetadataComplexType result = DescriptiveMetadataComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteComplexType createDescriptiveNoteComplexType() {
        DescriptiveNoteComplexType result = DescriptiveNoteComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EncodinganalogAttribute createEncodinganalogAttribute() {
        EncodinganalogAttribute result = EncodinganalogAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EventComplexType createEventComplexType() {
        EventComplexType result = EventComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EventSetComplexType createEventSetComplexType() {
        EventSetComplexType result = EventSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EventWrapDocument createEventWrapDocument() {
        EventWrapDocument result = EventWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeographicalEntityAttribute createGeographicalEntityAttribute() {
        GeographicalEntityAttribute result = GeographicalEntityAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GmlComplexType createGmlComplexType() {
        GmlComplexType result = GmlComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IdentifierComplexType createIdentifierComplexType() {
        IdentifierComplexType result = IdentifierComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public InscriptionsWrapDocument createInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LegalBodyRefComplexType createLegalBodyRefComplexType() {
        LegalBodyRefComplexType result = LegalBodyRefComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LidoComplexType createLidoComplexType() {
        LidoComplexType result = LidoComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LidoDocument createLidoDocument() {
        LidoDocument result = LidoDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LidoWrapDocument createLidoWrapDocument() {
        LidoWrapDocument result = LidoWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MaterialsTechComplexType createMaterialsTechComplexType() {
        MaterialsTechComplexType result = MaterialsTechComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MaterialsTechSetComplexType createMaterialsTechSetComplexType() {
        MaterialsTechSetComplexType result = MaterialsTechSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeasurementsSetComplexType createMeasurementsSetComplexType() {
        MeasurementsSetComplexType result = MeasurementsSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectClassificationWrapDocument createObjectClassificationWrapDocument() {
        ObjectClassificationWrapDocument result = ObjectClassificationWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectComplexType createObjectComplexType() {
        ObjectComplexType result = ObjectComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectDescriptionWrapDocument createObjectDescriptionWrapDocument() {
        ObjectDescriptionWrapDocument result = ObjectDescriptionWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectIdentificationWrapDocument createObjectIdentificationWrapDocument() {
        ObjectIdentificationWrapDocument result = ObjectIdentificationWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectMeasurementsComplexType createObjectMeasurementsComplexType() {
        ObjectMeasurementsComplexType result = ObjectMeasurementsComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectMeasurementsSetComplexType createObjectMeasurementsSetComplexType() {
        ObjectMeasurementsSetComplexType result = ObjectMeasurementsSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectMeasurementsWrapDocument createObjectMeasurementsWrapDocument() {
        ObjectMeasurementsWrapDocument result = ObjectMeasurementsWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectRelationWrapDocument createObjectRelationWrapDocument() {
        ObjectRelationWrapDocument result = ObjectRelationWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectSetComplexType createObjectSetComplexType() {
        ObjectSetComplexType result = ObjectSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PlaceComplexType createPlaceComplexType() {
        PlaceComplexType result = PlaceComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PlaceSetComplexType createPlaceSetComplexType() {
        PlaceSetComplexType result = PlaceSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PoliticalEntityAttribute createPoliticalEntityAttribute() {
        PoliticalEntityAttribute result = PoliticalEntityAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PrefAttribute createPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RecordInfoSetComplexType createRecordInfoSetComplexType() {
        RecordInfoSetComplexType result = RecordInfoSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RecordWrapDocument createRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelatedencodingAttribute createRelatedencodingAttribute() {
        RelatedencodingAttribute result = RelatedencodingAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelatedEventSetComplexType createRelatedEventSetComplexType() {
        RelatedEventSetComplexType result = RelatedEventSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelatedWorkSetComplexType createRelatedWorkSetComplexType() {
        RelatedWorkSetComplexType result = RelatedWorkSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RepositoryWrapDocument createRepositoryWrapDocument() {
        RepositoryWrapDocument result = RepositoryWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResourceSetComplexType createResourceSetComplexType() {
        ResourceSetComplexType result = ResourceSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResourceWrapDocument createResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RightsComplexType createRightsComplexType() {
        RightsComplexType result = RightsComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RightsWorkWrapDocument createRightsWorkWrapDocument() {
        RightsWorkWrapDocument result = RightsWorkWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SortorderAttribute createSortorderAttribute() {
        SortorderAttribute result = SortorderAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SourceAttribute createSourceAttribute() {
        SourceAttribute result = SourceAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SubjectComplexType createSubjectComplexType() {
        SubjectComplexType result = SubjectComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SubjectSetComplexType createSubjectSetComplexType() {
        SubjectSetComplexType result = SubjectSetComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SubjectWrapDocument createSubjectWrapDocument() {
        SubjectWrapDocument result = SubjectWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TermComplexType createTermComplexType() {
        TermComplexType result = TermComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TextComplexType createTextComplexType() {
        TextComplexType result = TextComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TitleWrapDocument createTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public WebResourceComplexType createWebResourceComplexType() {
        WebResourceComplexType result = WebResourceComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbsoluteExternalPositionalAccuracyDocument createAbsoluteExternalPositionalAccuracyDocument() {
        AbsoluteExternalPositionalAccuracyDocument result =
                AbsoluteExternalPositionalAccuracyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbsoluteExternalPositionalAccuracyType createAbsoluteExternalPositionalAccuracyType() {
        AbsoluteExternalPositionalAccuracyType result = AbsoluteExternalPositionalAccuracyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbstractGeneralOperationParameterRefDocument createAbstractGeneralOperationParameterRefDocument() {
        AbstractGeneralOperationParameterRefDocument result =
                AbstractGeneralOperationParameterRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbstractGeneralOperationParameterRefType createAbstractGeneralOperationParameterRefType() {
        AbstractGeneralOperationParameterRefType result =
                AbstractGeneralOperationParameterRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbstractGriddedSurfaceType createAbstractGriddedSurfaceType() {
        AbstractGriddedSurfaceType result = AbstractGriddedSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbstractParametricCurveSurfaceType createAbstractParametricCurveSurfaceType() {
        AbstractParametricCurveSurfaceType result = AbstractParametricCurveSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbstractRingPropertyType createAbstractRingPropertyType() {
        AbstractRingPropertyType result = AbstractRingPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbstractSolidType createAbstractSolidType() {
        AbstractSolidType result = AbstractSolidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AbstractSurfaceType createAbstractSurfaceType() {
        AbstractSurfaceType result = AbstractSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AesheticCriteriaType createAesheticCriteriaType() {
        AesheticCriteriaType result = AesheticCriteriaType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AffinePlacementDocument createAffinePlacementDocument() {
        AffinePlacementDocument result = AffinePlacementDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AffinePlacementType createAffinePlacementType() {
        AffinePlacementType result = AffinePlacementType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AnchorPointDocument createAnchorPointDocument() {
        AnchorPointDocument result = AnchorPointDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AngleChoiceType createAngleChoiceType() {
        AngleChoiceType result = AngleChoiceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AngleDocument createAngleDocument() {
        AngleDocument result = AngleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AngleType createAngleType() {
        AngleType result = AngleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcByBulgeDocument createArcByBulgeDocument() {
        ArcByBulgeDocument result = ArcByBulgeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcByBulgeType createArcByBulgeType() {
        ArcByBulgeType result = ArcByBulgeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcByCenterPointDocument createArcByCenterPointDocument() {
        ArcByCenterPointDocument result = ArcByCenterPointDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcByCenterPointType createArcByCenterPointType() {
        ArcByCenterPointType result = ArcByCenterPointType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcMinutesType createArcMinutesType() {
        ArcMinutesType result = ArcMinutesType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcSecondsType createArcSecondsType() {
        ArcSecondsType result = ArcSecondsType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcStringByBulgeDocument createArcStringByBulgeDocument() {
        ArcStringByBulgeDocument result = ArcStringByBulgeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcStringByBulgeType createArcStringByBulgeType() {
        ArcStringByBulgeType result = ArcStringByBulgeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcStringDocument createArcStringDocument() {
        ArcStringDocument result = ArcStringDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArcStringType createArcStringType() {
        ArcStringType result = ArcStringType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AreaType createAreaType() {
        AreaType result = AreaType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArrayAssociationType createArrayAssociationType() {
        ArrayAssociationType result = ArrayAssociationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArrayDocument createArrayDocument() {
        ArrayDocument result = ArrayDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ArrayType createArrayType() {
        ArrayType result = ArrayType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AssociationDocument createAssociationDocument() {
        AssociationDocument result = AssociationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AssociationType createAssociationType() {
        AssociationType result = AssociationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AxisAbbrevDocument createAxisAbbrevDocument() {
        AxisAbbrevDocument result = AxisAbbrevDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AxisDirectionDocument createAxisDirectionDocument() {
        AxisDirectionDocument result = AxisDirectionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public AxisIDDocument createAxisIDDocument() {
        AxisIDDocument result = AxisIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BagDocument createBagDocument() {
        BagDocument result = BagDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BagType createBagType() {
        BagType result = BagType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BaseCRSDocument createBaseCRSDocument() {
        BaseCRSDocument result = BaseCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BaseCurveDocument createBaseCurveDocument() {
        BaseCurveDocument result = BaseCurveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BaseStyleDescriptorType createBaseStyleDescriptorType() {
        BaseStyleDescriptorType result = BaseStyleDescriptorType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BaseSurfaceDocument createBaseSurfaceDocument() {
        BaseSurfaceDocument result = BaseSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BaseUnitDocument createBaseUnitDocument() {
        BaseUnitDocument result = BaseUnitDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BaseUnitType createBaseUnitType() {
        BaseUnitType result = BaseUnitType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BezierDocument createBezierDocument() {
        BezierDocument result = BezierDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BezierType createBezierType() {
        BezierType result = BezierType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BooleanDocument createBooleanDocument() {
        BooleanDocument result = BooleanDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BooleanList createBooleanList() {
        BooleanList result = BooleanList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BooleanListDocument createBooleanListDocument() {
        BooleanListDocument result = BooleanListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BooleanOrNull createBooleanOrNull() {
        BooleanOrNull result = BooleanOrNull.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BooleanOrNullList createBooleanOrNullList() {
        BooleanOrNullList result = BooleanOrNullList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BooleanPropertyType createBooleanPropertyType() {
        BooleanPropertyType result = BooleanPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BooleanValueDocument createBooleanValueDocument() {
        BooleanValueDocument result = BooleanValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BoundedByDocument createBoundedByDocument() {
        BoundedByDocument result = BoundedByDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BoundingBoxDocument createBoundingBoxDocument() {
        BoundingBoxDocument result = BoundingBoxDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BoundingPolygonDocument createBoundingPolygonDocument() {
        BoundingPolygonDocument result = BoundingPolygonDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BoundingShapeType createBoundingShapeType() {
        BoundingShapeType result = BoundingShapeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BSplineDocument createBSplineDocument() {
        BSplineDocument result = BSplineDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public BSplineType createBSplineType() {
        BSplineType result = BSplineType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CalDate createCalDate() {
        CalDate result = CalDate.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CartesianCSDocument createCartesianCSDocument() {
        CartesianCSDocument result = CartesianCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CartesianCSRefDocument createCartesianCSRefDocument() {
        CartesianCSRefDocument result = CartesianCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CartesianCSRefType createCartesianCSRefType() {
        CartesianCSRefType result = CartesianCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CartesianCSType createCartesianCSType() {
        CartesianCSType result = CartesianCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CatalogSymbolDocument createCatalogSymbolDocument() {
        CatalogSymbolDocument result = CatalogSymbolDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CategoryDocument createCategoryDocument() {
        CategoryDocument result = CategoryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CategoryExtentDocument createCategoryExtentDocument() {
        CategoryExtentDocument result = CategoryExtentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CategoryExtentType createCategoryExtentType() {
        CategoryExtentType result = CategoryExtentType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CategoryListDocument createCategoryListDocument() {
        CategoryListDocument result = CategoryListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CategoryPropertyType createCategoryPropertyType() {
        CategoryPropertyType result = CategoryPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CenterLineOfDocument createCenterLineOfDocument() {
        CenterLineOfDocument result = CenterLineOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CenterOfDocument createCenterOfDocument() {
        CenterOfDocument result = CenterOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CircleByCenterPointDocument createCircleByCenterPointDocument() {
        CircleByCenterPointDocument result = CircleByCenterPointDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CircleByCenterPointType createCircleByCenterPointType() {
        CircleByCenterPointType result = CircleByCenterPointType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CircleDocument createCircleDocument() {
        CircleDocument result = CircleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CircleType createCircleType() {
        CircleType result = CircleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ClothoidDocument createClothoidDocument() {
        ClothoidDocument result = ClothoidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ClothoidType createClothoidType() {
        ClothoidType result = ClothoidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CodeListType createCodeListType() {
        CodeListType result = CodeListType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CodeOrNullListType createCodeOrNullListType() {
        CodeOrNullListType result = CodeOrNullListType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CodeType createCodeType() {
        CodeType result = CodeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ColumnIndexDocument createColumnIndexDocument() {
        ColumnIndexDocument result = ColumnIndexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompassPointDocument createCompassPointDocument() {
        CompassPointDocument result = CompassPointDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompassPointEnumeration createCompassPointEnumeration() {
        CompassPointEnumeration result = CompassPointEnumeration.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeCurveDocument createCompositeCurveDocument() {
        CompositeCurveDocument result = CompositeCurveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeCurvePropertyType createCompositeCurvePropertyType() {
        CompositeCurvePropertyType result = CompositeCurvePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeCurveType createCompositeCurveType() {
        CompositeCurveType result = CompositeCurveType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeSolidDocument createCompositeSolidDocument() {
        CompositeSolidDocument result = CompositeSolidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeSolidPropertyType createCompositeSolidPropertyType() {
        CompositeSolidPropertyType result = CompositeSolidPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeSolidType createCompositeSolidType() {
        CompositeSolidType result = CompositeSolidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeSurfaceDocument createCompositeSurfaceDocument() {
        CompositeSurfaceDocument result = CompositeSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeSurfacePropertyType createCompositeSurfacePropertyType() {
        CompositeSurfacePropertyType result = CompositeSurfacePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeSurfaceType createCompositeSurfaceType() {
        CompositeSurfaceType result = CompositeSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeValueDocument createCompositeValueDocument() {
        CompositeValueDocument result = CompositeValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompositeValueType createCompositeValueType() {
        CompositeValueType result = CompositeValueType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompoundCRSDocument createCompoundCRSDocument() {
        CompoundCRSDocument result = CompoundCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompoundCRSRefDocument createCompoundCRSRefDocument() {
        CompoundCRSRefDocument result = CompoundCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompoundCRSRefType createCompoundCRSRefType() {
        CompoundCRSRefType result = CompoundCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CompoundCRSType createCompoundCRSType() {
        CompoundCRSType result = CompoundCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConcatenatedOperationDocument createConcatenatedOperationDocument() {
        ConcatenatedOperationDocument result = ConcatenatedOperationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConcatenatedOperationRefDocument createConcatenatedOperationRefDocument() {
        ConcatenatedOperationRefDocument result = ConcatenatedOperationRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConcatenatedOperationRefType createConcatenatedOperationRefType() {
        ConcatenatedOperationRefType result = ConcatenatedOperationRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConcatenatedOperationType createConcatenatedOperationType() {
        ConcatenatedOperationType result = ConcatenatedOperationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConeDocument createConeDocument() {
        ConeDocument result = ConeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConeType createConeType() {
        ConeType result = ConeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ContainerDocument createContainerDocument() {
        ContainerDocument result = ContainerDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ContainerPropertyType createContainerPropertyType() {
        ContainerPropertyType result = ContainerPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ContinuousCoverageDocument createContinuousCoverageDocument() {
        ContinuousCoverageDocument result = ContinuousCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConventionalUnitDocument createConventionalUnitDocument() {
        ConventionalUnitDocument result = ConventionalUnitDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConventionalUnitType createConventionalUnitType() {
        ConventionalUnitType result = ConventionalUnitType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConversionDocument createConversionDocument() {
        ConversionDocument result = ConversionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConversionRefDocument createConversionRefDocument() {
        ConversionRefDocument result = ConversionRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConversionRefType createConversionRefType() {
        ConversionRefType result = ConversionRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConversionToPreferredUnitDocument createConversionToPreferredUnitDocument() {
        ConversionToPreferredUnitDocument result = ConversionToPreferredUnitDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConversionToPreferredUnitType createConversionToPreferredUnitType() {
        ConversionToPreferredUnitType result = ConversionToPreferredUnitType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ConversionType createConversionType() {
        ConversionType result = ConversionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordDocument createCoordDocument() {
        CoordDocument result = CoordDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateOperationDocument createCoordinateOperationDocument() {
        CoordinateOperationDocument result = CoordinateOperationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateOperationIDDocument createCoordinateOperationIDDocument() {
        CoordinateOperationIDDocument result = CoordinateOperationIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateOperationNameDocument createCoordinateOperationNameDocument() {
        CoordinateOperationNameDocument result = CoordinateOperationNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateOperationRefDocument createCoordinateOperationRefDocument() {
        CoordinateOperationRefDocument result = CoordinateOperationRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateOperationRefType createCoordinateOperationRefType() {
        CoordinateOperationRefType result = CoordinateOperationRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateReferenceSystemDocument createCoordinateReferenceSystemDocument() {
        CoordinateReferenceSystemDocument result = CoordinateReferenceSystemDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateReferenceSystemRefDocument createCoordinateReferenceSystemRefDocument() {
        CoordinateReferenceSystemRefDocument result = CoordinateReferenceSystemRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateReferenceSystemRefType createCoordinateReferenceSystemRefType() {
        CoordinateReferenceSystemRefType result = CoordinateReferenceSystemRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinatesDocument createCoordinatesDocument() {
        CoordinatesDocument result = CoordinatesDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinatesType createCoordinatesType() {
        CoordinatesType result = CoordinatesType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemAxisDocument createCoordinateSystemAxisDocument() {
        CoordinateSystemAxisDocument result = CoordinateSystemAxisDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemAxisRefDocument createCoordinateSystemAxisRefDocument() {
        CoordinateSystemAxisRefDocument result = CoordinateSystemAxisRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemAxisRefType createCoordinateSystemAxisRefType() {
        CoordinateSystemAxisRefType result = CoordinateSystemAxisRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemAxisType createCoordinateSystemAxisType() {
        CoordinateSystemAxisType result = CoordinateSystemAxisType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemDocument createCoordinateSystemDocument() {
        CoordinateSystemDocument result = CoordinateSystemDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemRefDocument createCoordinateSystemRefDocument() {
        CoordinateSystemRefDocument result = CoordinateSystemRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordinateSystemRefType createCoordinateSystemRefType() {
        CoordinateSystemRefType result = CoordinateSystemRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoordType createCoordType() {
        CoordType result = CoordType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CountDocument createCountDocument() {
        CountDocument result = CountDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CountExtentDocument createCountExtentDocument() {
        CountExtentDocument result = CountExtentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CountExtentType createCountExtentType() {
        CountExtentType result = CountExtentType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CountListDocument createCountListDocument() {
        CountListDocument result = CountListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CountPropertyType createCountPropertyType() {
        CountPropertyType result = CountPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CovarianceDocument createCovarianceDocument() {
        CovarianceDocument result = CovarianceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CovarianceElementType createCovarianceElementType() {
        CovarianceElementType result = CovarianceElementType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CovarianceMatrixDocument createCovarianceMatrixDocument() {
        CovarianceMatrixDocument result = CovarianceMatrixDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CovarianceMatrixType createCovarianceMatrixType() {
        CovarianceMatrixType result = CovarianceMatrixType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoverageDocument createCoverageDocument() {
        CoverageDocument result = CoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoverageFunctionDocument createCoverageFunctionDocument() {
        CoverageFunctionDocument result = CoverageFunctionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CoverageFunctionType createCoverageFunctionType() {
        CoverageFunctionType result = CoverageFunctionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CRSDocument createCRSDocument() {
        CRSDocument result = CRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CrsRefDocument createCrsRefDocument() {
        CrsRefDocument result = CrsRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CRSRefType createCRSRefType() {
        CRSRefType result = CRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CsIDDocument createCsIDDocument() {
        CsIDDocument result = CsIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CsNameDocument createCsNameDocument() {
        CsNameDocument result = CsNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CubicSplineDocument createCubicSplineDocument() {
        CubicSplineDocument result = CubicSplineDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CubicSplineType createCubicSplineType() {
        CubicSplineType result = CubicSplineType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveArrayPropertyDocument createCurveArrayPropertyDocument() {
        CurveArrayPropertyDocument result = CurveArrayPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveArrayPropertyType createCurveArrayPropertyType() {
        CurveArrayPropertyType result = CurveArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveDocument createCurveDocument() {
        CurveDocument result = CurveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveInterpolationType createCurveInterpolationType() {
        CurveInterpolationType result = CurveInterpolationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveMemberDocument createCurveMemberDocument() {
        CurveMemberDocument result = CurveMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurvePropertyDocument createCurvePropertyDocument() {
        CurvePropertyDocument result = CurvePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurvePropertyType createCurvePropertyType() {
        CurvePropertyType result = CurvePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveSegmentArrayPropertyType createCurveSegmentArrayPropertyType() {
        CurveSegmentArrayPropertyType result = CurveSegmentArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveSegmentDocument createCurveSegmentDocument() {
        CurveSegmentDocument result = CurveSegmentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveType createCurveType() {
        CurveType result = CurveType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CylinderDocument createCylinderDocument() {
        CylinderDocument result = CylinderDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CylinderType createCylinderType() {
        CylinderType result = CylinderType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CylindricalCSDocument createCylindricalCSDocument() {
        CylindricalCSDocument result = CylindricalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CylindricalCSRefDocument createCylindricalCSRefDocument() {
        CylindricalCSRefDocument result = CylindricalCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CylindricalCSRefType createCylindricalCSRefType() {
        CylindricalCSRefType result = CylindricalCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CylindricalCSType createCylindricalCSType() {
        CylindricalCSType result = CylindricalCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DataBlockDocument createDataBlockDocument() {
        DataBlockDocument result = DataBlockDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DataBlockType createDataBlockType() {
        DataBlockType result = DataBlockType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DataSourceDocument createDataSourceDocument() {
        DataSourceDocument result = DataSourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DatumDocument createDatumDocument() {
        DatumDocument result = DatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DatumIDDocument createDatumIDDocument() {
        DatumIDDocument result = DatumIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DatumNameDocument createDatumNameDocument() {
        DatumNameDocument result = DatumNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DatumRefDocument createDatumRefDocument() {
        DatumRefDocument result = DatumRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DatumRefType createDatumRefType() {
        DatumRefType result = DatumRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DecimalMinutesDocument createDecimalMinutesDocument() {
        DecimalMinutesDocument result = DecimalMinutesDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DecimalMinutesType createDecimalMinutesType() {
        DecimalMinutesType result = DecimalMinutesType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefaultStyleDocument createDefaultStyleDocument() {
        DefaultStyleDocument result = DefaultStyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefaultStylePropertyType createDefaultStylePropertyType() {
        DefaultStylePropertyType result = DefaultStylePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinedByConversionDocument createDefinedByConversionDocument() {
        DefinedByConversionDocument result = DefinedByConversionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinitionCollectionDocument createDefinitionCollectionDocument() {
        DefinitionCollectionDocument result = DefinitionCollectionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinitionDocument createDefinitionDocument() {
        DefinitionDocument result = DefinitionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinitionMemberDocument createDefinitionMemberDocument() {
        DefinitionMemberDocument result = DefinitionMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinitionProxyDocument createDefinitionProxyDocument() {
        DefinitionProxyDocument result = DefinitionProxyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinitionProxyType createDefinitionProxyType() {
        DefinitionProxyType result = DefinitionProxyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinitionRefDocument createDefinitionRefDocument() {
        DefinitionRefDocument result = DefinitionRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DefinitionType createDefinitionType() {
        DefinitionType result = DefinitionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DegreesDocument createDegreesDocument() {
        DegreesDocument result = DegreesDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DegreesType createDegreesType() {
        DegreesType result = DegreesType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DegreeValueType createDegreeValueType() {
        DegreeValueType result = DegreeValueType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivationUnitTermDocument createDerivationUnitTermDocument() {
        DerivationUnitTermDocument result = DerivationUnitTermDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivationUnitTermType createDerivationUnitTermType() {
        DerivationUnitTermType result = DerivationUnitTermType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedCRSDocument createDerivedCRSDocument() {
        DerivedCRSDocument result = DerivedCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedCRSRefDocument createDerivedCRSRefDocument() {
        DerivedCRSRefDocument result = DerivedCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedCRSRefType createDerivedCRSRefType() {
        DerivedCRSRefType result = DerivedCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedCRSType createDerivedCRSType() {
        DerivedCRSType result = DerivedCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedCRSTypeDocument createDerivedCRSTypeDocument() {
        DerivedCRSTypeDocument result = DerivedCRSTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedCRSTypeType createDerivedCRSTypeType() {
        DerivedCRSTypeType result = DerivedCRSTypeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedUnitDocument createDerivedUnitDocument() {
        DerivedUnitDocument result = DerivedUnitDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DerivedUnitType createDerivedUnitType() {
        DerivedUnitType result = DerivedUnitType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DescriptionDocument createDescriptionDocument() {
        DescriptionDocument result = DescriptionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DictionaryDocument createDictionaryDocument() {
        DictionaryDocument result = DictionaryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DictionaryEntryDocument createDictionaryEntryDocument() {
        DictionaryEntryDocument result = DictionaryEntryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DictionaryEntryType createDictionaryEntryType() {
        DictionaryEntryType result = DictionaryEntryType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DictionaryType createDictionaryType() {
        DictionaryType result = DictionaryType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedEdgeDocument createDirectedEdgeDocument() {
        DirectedEdgeDocument result = DirectedEdgeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedEdgePropertyType createDirectedEdgePropertyType() {
        DirectedEdgePropertyType result = DirectedEdgePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedFaceDocument createDirectedFaceDocument() {
        DirectedFaceDocument result = DirectedFaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedFacePropertyType createDirectedFacePropertyType() {
        DirectedFacePropertyType result = DirectedFacePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedNodeDocument createDirectedNodeDocument() {
        DirectedNodeDocument result = DirectedNodeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedNodePropertyType createDirectedNodePropertyType() {
        DirectedNodePropertyType result = DirectedNodePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedObservationAtDistanceDocument createDirectedObservationAtDistanceDocument() {
        DirectedObservationAtDistanceDocument result = DirectedObservationAtDistanceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedObservationAtDistanceType createDirectedObservationAtDistanceType() {
        DirectedObservationAtDistanceType result = DirectedObservationAtDistanceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedObservationDocument createDirectedObservationDocument() {
        DirectedObservationDocument result = DirectedObservationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedObservationType createDirectedObservationType() {
        DirectedObservationType result = DirectedObservationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedTopoSolidDocument createDirectedTopoSolidDocument() {
        DirectedTopoSolidDocument result = DirectedTopoSolidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectedTopoSolidPropertyType createDirectedTopoSolidPropertyType() {
        DirectedTopoSolidPropertyType result = DirectedTopoSolidPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectionDocument createDirectionDocument() {
        DirectionDocument result = DirectionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectionPropertyType createDirectionPropertyType() {
        DirectionPropertyType result = DirectionPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectionVectorDocument createDirectionVectorDocument() {
        DirectionVectorDocument result = DirectionVectorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectionVectorType createDirectionVectorType() {
        DirectionVectorType result = DirectionVectorType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectPositionListType createDirectPositionListType() {
        DirectPositionListType result = DirectPositionListType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DirectPositionType createDirectPositionType() {
        DirectPositionType result = DirectPositionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DiscreteCoverageDocument createDiscreteCoverageDocument() {
        DiscreteCoverageDocument result = DiscreteCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DmsAngleDocument createDmsAngleDocument() {
        DmsAngleDocument result = DmsAngleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DMSAngleType createDMSAngleType() {
        DMSAngleType result = DMSAngleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DmsAngleValueDocument createDmsAngleValueDocument() {
        DmsAngleValueDocument result = DmsAngleValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DomainSetDocument createDomainSetDocument() {
        DomainSetDocument result = DomainSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DomainSetType createDomainSetType() {
        DomainSetType result = DomainSetType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DoubleList createDoubleList() {
        DoubleList result = DoubleList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DoubleOrNull createDoubleOrNull() {
        DoubleOrNull result = DoubleOrNull.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DoubleOrNullList createDoubleOrNullList() {
        DoubleOrNullList result = DoubleOrNullList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DoubleOrNullTupleListDocument createDoubleOrNullTupleListDocument() {
        DoubleOrNullTupleListDocument result = DoubleOrNullTupleListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DrawingTypeType createDrawingTypeType() {
        DrawingTypeType result = DrawingTypeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DurationDocument createDurationDocument() {
        DurationDocument result = DurationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DynamicFeatureCollectionType createDynamicFeatureCollectionType() {
        DynamicFeatureCollectionType result = DynamicFeatureCollectionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DynamicFeatureType createDynamicFeatureType() {
        DynamicFeatureType result = DynamicFeatureType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EdgeDocument createEdgeDocument() {
        EdgeDocument result = EdgeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EdgeOfDocument createEdgeOfDocument() {
        EdgeOfDocument result = EdgeOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EdgeType createEdgeType() {
        EdgeType result = EdgeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidalCSDocument createEllipsoidalCSDocument() {
        EllipsoidalCSDocument result = EllipsoidalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidalCSRefDocument createEllipsoidalCSRefDocument() {
        EllipsoidalCSRefDocument result = EllipsoidalCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidalCSRefType createEllipsoidalCSRefType() {
        EllipsoidalCSRefType result = EllipsoidalCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidalCSType createEllipsoidalCSType() {
        EllipsoidalCSType result = EllipsoidalCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidDocument createEllipsoidDocument() {
        EllipsoidDocument result = EllipsoidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidIDDocument createEllipsoidIDDocument() {
        EllipsoidIDDocument result = EllipsoidIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidNameDocument createEllipsoidNameDocument() {
        EllipsoidNameDocument result = EllipsoidNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidRefDocument createEllipsoidRefDocument() {
        EllipsoidRefDocument result = EllipsoidRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidRefType createEllipsoidRefType() {
        EllipsoidRefType result = EllipsoidRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EllipsoidType createEllipsoidType() {
        EllipsoidType result = EllipsoidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringCRSDocument createEngineeringCRSDocument() {
        EngineeringCRSDocument result = EngineeringCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringCRSRefDocument createEngineeringCRSRefDocument() {
        EngineeringCRSRefDocument result = EngineeringCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringCRSRefType createEngineeringCRSRefType() {
        EngineeringCRSRefType result = EngineeringCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringCRSType createEngineeringCRSType() {
        EngineeringCRSType result = EngineeringCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringDatumDocument createEngineeringDatumDocument() {
        EngineeringDatumDocument result = EngineeringDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringDatumRefDocument createEngineeringDatumRefDocument() {
        EngineeringDatumRefDocument result = EngineeringDatumRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringDatumRefType createEngineeringDatumRefType() {
        EngineeringDatumRefType result = EngineeringDatumRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EngineeringDatumType createEngineeringDatumType() {
        EngineeringDatumType result = EngineeringDatumType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EnvelopeDocument createEnvelopeDocument() {
        EnvelopeDocument result = EnvelopeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EnvelopeType createEnvelopeType() {
        EnvelopeType result = EnvelopeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EnvelopeWithTimePeriodDocument createEnvelopeWithTimePeriodDocument() {
        EnvelopeWithTimePeriodDocument result = EnvelopeWithTimePeriodDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EnvelopeWithTimePeriodType createEnvelopeWithTimePeriodType() {
        EnvelopeWithTimePeriodType result = EnvelopeWithTimePeriodType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ExtentOfDocument createExtentOfDocument() {
        ExtentOfDocument result = ExtentOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ExtentType createExtentType() {
        ExtentType result = ExtentType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ExteriorDocument createExteriorDocument() {
        ExteriorDocument result = ExteriorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FaceDocument createFaceDocument() {
        FaceDocument result = FaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FaceType createFaceType() {
        FaceType result = FaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureArrayPropertyType createFeatureArrayPropertyType() {
        FeatureArrayPropertyType result = FeatureArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureCollectionDocument createFeatureCollectionDocument() {
        FeatureCollectionDocument result = FeatureCollectionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureCollectionType createFeatureCollectionType() {
        FeatureCollectionType result = FeatureCollectionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureDocument createFeatureDocument() {
        FeatureDocument result = FeatureDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureMemberDocument createFeatureMemberDocument() {
        FeatureMemberDocument result = FeatureMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureMembersDocument createFeatureMembersDocument() {
        FeatureMembersDocument result = FeatureMembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeaturePropertyDocument createFeaturePropertyDocument() {
        FeaturePropertyDocument result = FeaturePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeaturePropertyType createFeaturePropertyType() {
        FeaturePropertyType result = FeaturePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureStyleDocument createFeatureStyleDocument() {
        FeatureStyleDocument result = FeatureStyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureStylePropertyType createFeatureStylePropertyType() {
        FeatureStylePropertyType result = FeatureStylePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FeatureStyleType createFeatureStyleType() {
        FeatureStyleType result = FeatureStyleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FileDocument createFileDocument() {
        FileDocument result = FileDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FileType createFileType() {
        FileType result = FileType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FileValueModelType createFileValueModelType() {
        FileValueModelType result = FileValueModelType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public FormulaType createFormulaType() {
        FormulaType result = FormulaType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralConversionDocument createGeneralConversionDocument() {
        GeneralConversionDocument result = GeneralConversionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralConversionRefDocument createGeneralConversionRefDocument() {
        GeneralConversionRefDocument result = GeneralConversionRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralConversionRefType createGeneralConversionRefType() {
        GeneralConversionRefType result = GeneralConversionRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralDerivedCRSDocument createGeneralDerivedCRSDocument() {
        GeneralDerivedCRSDocument result = GeneralDerivedCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralOperationParameterDocument createGeneralOperationParameterDocument() {
        GeneralOperationParameterDocument result = GeneralOperationParameterDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralParameterValueDocument createGeneralParameterValueDocument() {
        GeneralParameterValueDocument result = GeneralParameterValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralTransformationDocument createGeneralTransformationDocument() {
        GeneralTransformationDocument result = GeneralTransformationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralTransformationRefDocument createGeneralTransformationRefDocument() {
        GeneralTransformationRefDocument result = GeneralTransformationRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeneralTransformationRefType createGeneralTransformationRefType() {
        GeneralTransformationRefType result = GeneralTransformationRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GenericMetaDataDocument createGenericMetaDataDocument() {
        GenericMetaDataDocument result = GenericMetaDataDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GenericMetaDataType createGenericMetaDataType() {
        GenericMetaDataType result = GenericMetaDataType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeocentricCRSDocument createGeocentricCRSDocument() {
        GeocentricCRSDocument result = GeocentricCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeocentricCRSRefDocument createGeocentricCRSRefDocument() {
        GeocentricCRSRefDocument result = GeocentricCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeocentricCRSRefType createGeocentricCRSRefType() {
        GeocentricCRSRefType result = GeocentricCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeocentricCRSType createGeocentricCRSType() {
        GeocentricCRSType result = GeocentricCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodesicDocument createGeodesicDocument() {
        GeodesicDocument result = GeodesicDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodesicStringDocument createGeodesicStringDocument() {
        GeodesicStringDocument result = GeodesicStringDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodesicStringType createGeodesicStringType() {
        GeodesicStringType result = GeodesicStringType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodesicType createGeodesicType() {
        GeodesicType result = GeodesicType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodeticDatumDocument createGeodeticDatumDocument() {
        GeodeticDatumDocument result = GeodeticDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodeticDatumRefDocument createGeodeticDatumRefDocument() {
        GeodeticDatumRefDocument result = GeodeticDatumRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodeticDatumRefType createGeodeticDatumRefType() {
        GeodeticDatumRefType result = GeodeticDatumRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeodeticDatumType createGeodeticDatumType() {
        GeodeticDatumType result = GeodeticDatumType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeographicCRSDocument createGeographicCRSDocument() {
        GeographicCRSDocument result = GeographicCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeographicCRSRefDocument createGeographicCRSRefDocument() {
        GeographicCRSRefDocument result = GeographicCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeographicCRSRefType createGeographicCRSRefType() {
        GeographicCRSRefType result = GeographicCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeographicCRSType createGeographicCRSType() {
        GeographicCRSType result = GeographicCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometricAggregateDocument createGeometricAggregateDocument() {
        GeometricAggregateDocument result = GeometricAggregateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometricComplexDocument createGeometricComplexDocument() {
        GeometricComplexDocument result = GeometricComplexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometricComplexPropertyType createGeometricComplexPropertyType() {
        GeometricComplexPropertyType result = GeometricComplexPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometricComplexType createGeometricComplexType() {
        GeometricComplexType result = GeometricComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometricPrimitiveDocument createGeometricPrimitiveDocument() {
        GeometricPrimitiveDocument result = GeometricPrimitiveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometricPrimitivePropertyType createGeometricPrimitivePropertyType() {
        GeometricPrimitivePropertyType result = GeometricPrimitivePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryArrayPropertyType createGeometryArrayPropertyType() {
        GeometryArrayPropertyType result = GeometryArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryDocument createGeometryDocument() {
        GeometryDocument result = GeometryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryMemberDocument createGeometryMemberDocument() {
        GeometryMemberDocument result = GeometryMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryMembersDocument createGeometryMembersDocument() {
        GeometryMembersDocument result = GeometryMembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryPropertyType createGeometryPropertyType() {
        GeometryPropertyType result = GeometryPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryStyleDocument createGeometryStyleDocument() {
        GeometryStyleDocument result = GeometryStyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryStylePropertyType createGeometryStylePropertyType() {
        GeometryStylePropertyType result = GeometryStylePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GeometryStyleType createGeometryStyleType() {
        GeometryStyleType result = GeometryStyleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GMLDocument createGMLDocument() {
        GMLDocument result = GMLDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GraphStyleDocument createGraphStyleDocument() {
        GraphStyleDocument result = GraphStyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GraphStylePropertyType createGraphStylePropertyType() {
        GraphStylePropertyType result = GraphStylePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GraphStyleType createGraphStyleType() {
        GraphStyleType result = GraphStyleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GraphTypeType createGraphTypeType() {
        GraphTypeType result = GraphTypeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GreenwichLongitudeDocument createGreenwichLongitudeDocument() {
        GreenwichLongitudeDocument result = GreenwichLongitudeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridCoverageDocument createGridCoverageDocument() {
        GridCoverageDocument result = GridCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridCoverageType createGridCoverageType() {
        GridCoverageType result = GridCoverageType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GriddedSurfaceDocument createGriddedSurfaceDocument() {
        GriddedSurfaceDocument result = GriddedSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridDocument createGridDocument() {
        GridDocument result = GridDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridDomainDocument createGridDomainDocument() {
        GridDomainDocument result = GridDomainDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridDomainType createGridDomainType() {
        GridDomainType result = GridDomainType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridEnvelopeType createGridEnvelopeType() {
        GridEnvelopeType result = GridEnvelopeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridFunctionDocument createGridFunctionDocument() {
        GridFunctionDocument result = GridFunctionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridFunctionType createGridFunctionType() {
        GridFunctionType result = GridFunctionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridLengthType createGridLengthType() {
        GridLengthType result = GridLengthType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridLimitsType createGridLimitsType() {
        GridLimitsType result = GridLimitsType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GridType createGridType() {
        GridType result = GridType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GroupIDDocument createGroupIDDocument() {
        GroupIDDocument result = GroupIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public GroupNameDocument createGroupNameDocument() {
        GroupNameDocument result = GroupNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public HistoryDocument createHistoryDocument() {
        HistoryDocument result = HistoryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public HistoryPropertyType createHistoryPropertyType() {
        HistoryPropertyType result = HistoryPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IdAttribute createIdAttribute() {
        IdAttribute result = IdAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IdentifierType createIdentifierType() {
        IdentifierType result = IdentifierType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageCRSDocument createImageCRSDocument() {
        ImageCRSDocument result = ImageCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageCRSRefDocument createImageCRSRefDocument() {
        ImageCRSRefDocument result = ImageCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageCRSRefType createImageCRSRefType() {
        ImageCRSRefType result = ImageCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageCRSType createImageCRSType() {
        ImageCRSType result = ImageCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageDatumDocument createImageDatumDocument() {
        ImageDatumDocument result = ImageDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageDatumRefDocument createImageDatumRefDocument() {
        ImageDatumRefDocument result = ImageDatumRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageDatumRefType createImageDatumRefType() {
        ImageDatumRefType result = ImageDatumRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImageDatumType createImageDatumType() {
        ImageDatumType result = ImageDatumType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ImplicitGeometryDocument createImplicitGeometryDocument() {
        ImplicitGeometryDocument result = ImplicitGeometryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IncludesCRSDocument createIncludesCRSDocument() {
        IncludesCRSDocument result = IncludesCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IncludesElementDocument createIncludesElementDocument() {
        IncludesElementDocument result = IncludesElementDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IncludesParameterDocument createIncludesParameterDocument() {
        IncludesParameterDocument result = IncludesParameterDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IncludesValueDocument createIncludesValueDocument() {
        IncludesValueDocument result = IncludesValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IncrementOrder createIncrementOrder() {
        IncrementOrder result = IncrementOrder.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IndexMapDocument createIndexMapDocument() {
        IndexMapDocument result = IndexMapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IndexMapType createIndexMapType() {
        IndexMapType result = IndexMapType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IndirectEntryDocument createIndirectEntryDocument() {
        IndirectEntryDocument result = IndirectEntryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IndirectEntryType createIndirectEntryType() {
        IndirectEntryType result = IndirectEntryType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public InnerBoundaryIsDocument createInnerBoundaryIsDocument() {
        InnerBoundaryIsDocument result = InnerBoundaryIsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IntegerList createIntegerList() {
        IntegerList result = IntegerList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IntegerOrNull createIntegerOrNull() {
        IntegerOrNull result = IntegerOrNull.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IntegerOrNullList createIntegerOrNullList() {
        IntegerOrNullList result = IntegerOrNullList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IntegerValueDocument createIntegerValueDocument() {
        IntegerValueDocument result = IntegerValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IntegerValueListDocument createIntegerValueListDocument() {
        IntegerValueListDocument result = IntegerValueListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public InteriorDocument createInteriorDocument() {
        InteriorDocument result = InteriorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public InverseFlatteningDocument createInverseFlatteningDocument() {
        InverseFlatteningDocument result = InverseFlatteningDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IsolatedDocument createIsolatedDocument() {
        IsolatedDocument result = IsolatedDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IsolatedPropertyType createIsolatedPropertyType() {
        IsolatedPropertyType result = IsolatedPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public IsSphereDocument createIsSphereDocument() {
        IsSphereDocument result = IsSphereDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public KnotPropertyType createKnotPropertyType() {
        KnotPropertyType result = KnotPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public KnotType createKnotType() {
        KnotType result = KnotType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public KnotTypesType createKnotTypesType() {
        KnotTypesType result = KnotTypesType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LabelStyleDocument createLabelStyleDocument() {
        LabelStyleDocument result = LabelStyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LabelStylePropertyType createLabelStylePropertyType() {
        LabelStylePropertyType result = LabelStylePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LabelStyleType createLabelStyleType() {
        LabelStyleType result = LabelStyleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LengthType createLengthType() {
        LengthType result = LengthType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LinearCSDocument createLinearCSDocument() {
        LinearCSDocument result = LinearCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LinearCSRefDocument createLinearCSRefDocument() {
        LinearCSRefDocument result = LinearCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LinearCSRefType createLinearCSRefType() {
        LinearCSRefType result = LinearCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LinearCSType createLinearCSType() {
        LinearCSType result = LinearCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LinearRingDocument createLinearRingDocument() {
        LinearRingDocument result = LinearRingDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LinearRingPropertyType createLinearRingPropertyType() {
        LinearRingPropertyType result = LinearRingPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LinearRingType createLinearRingType() {
        LinearRingType result = LinearRingType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringDocument createLineStringDocument() {
        LineStringDocument result = LineStringDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringMemberDocument createLineStringMemberDocument() {
        LineStringMemberDocument result = LineStringMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringPropertyDocument createLineStringPropertyDocument() {
        LineStringPropertyDocument result = LineStringPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringPropertyType createLineStringPropertyType() {
        LineStringPropertyType result = LineStringPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringSegmentArrayPropertyType createLineStringSegmentArrayPropertyType() {
        LineStringSegmentArrayPropertyType result = LineStringSegmentArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringSegmentDocument createLineStringSegmentDocument() {
        LineStringSegmentDocument result = LineStringSegmentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringSegmentType createLineStringSegmentType() {
        LineStringSegmentType result = LineStringSegmentType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineStringType createLineStringType() {
        LineStringType result = LineStringType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LineTypeType createLineTypeType() {
        LineTypeType result = LineTypeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LocationDocument createLocationDocument() {
        LocationDocument result = LocationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LocationKeyWordDocument createLocationKeyWordDocument() {
        LocationKeyWordDocument result = LocationKeyWordDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LocationPropertyType createLocationPropertyType() {
        LocationPropertyType result = LocationPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LocationStringDocument createLocationStringDocument() {
        LocationStringDocument result = LocationStringDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MappingRuleDocument createMappingRuleDocument() {
        MappingRuleDocument result = MappingRuleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MaximalComplexDocument createMaximalComplexDocument() {
        MaximalComplexDocument result = MaximalComplexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MaximumOccursDocument createMaximumOccursDocument() {
        MaximumOccursDocument result = MaximumOccursDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeasureDescriptionDocument createMeasureDescriptionDocument() {
        MeasureDescriptionDocument result = MeasureDescriptionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeasureDocument createMeasureDocument() {
        MeasureDocument result = MeasureDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeasureListType createMeasureListType() {
        MeasureListType result = MeasureListType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeasureOrNullListType createMeasureOrNullListType() {
        MeasureOrNullListType result = MeasureOrNullListType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeasureType createMeasureType() {
        MeasureType result = MeasureType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MemberDocument createMemberDocument() {
        MemberDocument result = MemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MembersDocument createMembersDocument() {
        MembersDocument result = MembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeridianIDDocument createMeridianIDDocument() {
        MeridianIDDocument result = MeridianIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MeridianNameDocument createMeridianNameDocument() {
        MeridianNameDocument result = MeridianNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MetaDataDocument createMetaDataDocument() {
        MetaDataDocument result = MetaDataDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MetaDataPropertyDocument createMetaDataPropertyDocument() {
        MetaDataPropertyDocument result = MetaDataPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MetaDataPropertyType createMetaDataPropertyType() {
        MetaDataPropertyType result = MetaDataPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MethodFormulaDocument createMethodFormulaDocument() {
        MethodFormulaDocument result = MethodFormulaDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MethodIDDocument createMethodIDDocument() {
        MethodIDDocument result = MethodIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MethodNameDocument createMethodNameDocument() {
        MethodNameDocument result = MethodNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MinimumOccursDocument createMinimumOccursDocument() {
        MinimumOccursDocument result = MinimumOccursDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MinutesDocument createMinutesDocument() {
        MinutesDocument result = MinutesDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ModifiedCoordinateDocument createModifiedCoordinateDocument() {
        ModifiedCoordinateDocument result = ModifiedCoordinateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MovingObjectStatusDocument createMovingObjectStatusDocument() {
        MovingObjectStatusDocument result = MovingObjectStatusDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MovingObjectStatusType createMovingObjectStatusType() {
        MovingObjectStatusType result = MovingObjectStatusType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCenterLineOfDocument createMultiCenterLineOfDocument() {
        MultiCenterLineOfDocument result = MultiCenterLineOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCenterOfDocument createMultiCenterOfDocument() {
        MultiCenterOfDocument result = MultiCenterOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCoverageDocument createMultiCoverageDocument() {
        MultiCoverageDocument result = MultiCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurveCoverageDocument createMultiCurveCoverageDocument() {
        MultiCurveCoverageDocument result = MultiCurveCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurveCoverageType createMultiCurveCoverageType() {
        MultiCurveCoverageType result = MultiCurveCoverageType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurveDocument createMultiCurveDocument() {
        MultiCurveDocument result = MultiCurveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurveDomainDocument createMultiCurveDomainDocument() {
        MultiCurveDomainDocument result = MultiCurveDomainDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurveDomainType createMultiCurveDomainType() {
        MultiCurveDomainType result = MultiCurveDomainType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurvePropertyDocument createMultiCurvePropertyDocument() {
        MultiCurvePropertyDocument result = MultiCurvePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurvePropertyType createMultiCurvePropertyType() {
        MultiCurvePropertyType result = MultiCurvePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiCurveType createMultiCurveType() {
        MultiCurveType result = MultiCurveType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiEdgeOfDocument createMultiEdgeOfDocument() {
        MultiEdgeOfDocument result = MultiEdgeOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiExtentOfDocument createMultiExtentOfDocument() {
        MultiExtentOfDocument result = MultiExtentOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiGeometryDocument createMultiGeometryDocument() {
        MultiGeometryDocument result = MultiGeometryDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiGeometryPropertyDocument createMultiGeometryPropertyDocument() {
        MultiGeometryPropertyDocument result = MultiGeometryPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiGeometryPropertyType createMultiGeometryPropertyType() {
        MultiGeometryPropertyType result = MultiGeometryPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiGeometryType createMultiGeometryType() {
        MultiGeometryType result = MultiGeometryType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiLineStringDocument createMultiLineStringDocument() {
        MultiLineStringDocument result = MultiLineStringDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiLineStringPropertyType createMultiLineStringPropertyType() {
        MultiLineStringPropertyType result = MultiLineStringPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiLineStringType createMultiLineStringType() {
        MultiLineStringType result = MultiLineStringType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiLocationDocument createMultiLocationDocument() {
        MultiLocationDocument result = MultiLocationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointCoverageDocument createMultiPointCoverageDocument() {
        MultiPointCoverageDocument result = MultiPointCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointCoverageType createMultiPointCoverageType() {
        MultiPointCoverageType result = MultiPointCoverageType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointDocument createMultiPointDocument() {
        MultiPointDocument result = MultiPointDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointDomainDocument createMultiPointDomainDocument() {
        MultiPointDomainDocument result = MultiPointDomainDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointDomainType createMultiPointDomainType() {
        MultiPointDomainType result = MultiPointDomainType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointPropertyDocument createMultiPointPropertyDocument() {
        MultiPointPropertyDocument result = MultiPointPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointPropertyType createMultiPointPropertyType() {
        MultiPointPropertyType result = MultiPointPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPointType createMultiPointType() {
        MultiPointType result = MultiPointType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPolygonDocument createMultiPolygonDocument() {
        MultiPolygonDocument result = MultiPolygonDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPolygonPropertyType createMultiPolygonPropertyType() {
        MultiPolygonPropertyType result = MultiPolygonPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPolygonType createMultiPolygonType() {
        MultiPolygonType result = MultiPolygonType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiPositionDocument createMultiPositionDocument() {
        MultiPositionDocument result = MultiPositionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidCoverageDocument createMultiSolidCoverageDocument() {
        MultiSolidCoverageDocument result = MultiSolidCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidCoverageType createMultiSolidCoverageType() {
        MultiSolidCoverageType result = MultiSolidCoverageType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidDocument createMultiSolidDocument() {
        MultiSolidDocument result = MultiSolidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidDomainDocument createMultiSolidDomainDocument() {
        MultiSolidDomainDocument result = MultiSolidDomainDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidDomainType createMultiSolidDomainType() {
        MultiSolidDomainType result = MultiSolidDomainType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidPropertyDocument createMultiSolidPropertyDocument() {
        MultiSolidPropertyDocument result = MultiSolidPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidPropertyType createMultiSolidPropertyType() {
        MultiSolidPropertyType result = MultiSolidPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSolidType createMultiSolidType() {
        MultiSolidType result = MultiSolidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfaceCoverageDocument createMultiSurfaceCoverageDocument() {
        MultiSurfaceCoverageDocument result = MultiSurfaceCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfaceCoverageType createMultiSurfaceCoverageType() {
        MultiSurfaceCoverageType result = MultiSurfaceCoverageType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfaceDocument createMultiSurfaceDocument() {
        MultiSurfaceDocument result = MultiSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfaceDomainDocument createMultiSurfaceDomainDocument() {
        MultiSurfaceDomainDocument result = MultiSurfaceDomainDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfaceDomainType createMultiSurfaceDomainType() {
        MultiSurfaceDomainType result = MultiSurfaceDomainType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfacePropertyDocument createMultiSurfacePropertyDocument() {
        MultiSurfacePropertyDocument result = MultiSurfacePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfacePropertyType createMultiSurfacePropertyType() {
        MultiSurfacePropertyType result = MultiSurfacePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public MultiSurfaceType createMultiSurfaceType() {
        MultiSurfaceType result = MultiSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NameDocument createNameDocument() {
        NameDocument result = NameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NameList createNameList() {
        NameList result = NameList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NameOrNull createNameOrNull() {
        NameOrNull result = NameOrNull.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NameOrNullList createNameOrNullList() {
        NameOrNullList result = NameOrNullList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NCNameList createNCNameList() {
        NCNameList result = NCNameList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NodeDocument createNodeDocument() {
        NodeDocument result = NodeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NodeType createNodeType() {
        NodeType result = NodeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NullDocument createNullDocument() {
        NullDocument result = NullDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NullEnumeration createNullEnumeration() {
        NullEnumeration result = NullEnumeration.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public NullType createNullType() {
        NullType result = NullType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectDocument createObjectDocument() {
        ObjectDocument result = ObjectDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObliqueCartesianCSDocument createObliqueCartesianCSDocument() {
        ObliqueCartesianCSDocument result = ObliqueCartesianCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObliqueCartesianCSRefDocument createObliqueCartesianCSRefDocument() {
        ObliqueCartesianCSRefDocument result = ObliqueCartesianCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObliqueCartesianCSRefType createObliqueCartesianCSRefType() {
        ObliqueCartesianCSRefType result = ObliqueCartesianCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObliqueCartesianCSType createObliqueCartesianCSType() {
        ObliqueCartesianCSType result = ObliqueCartesianCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObservationDocument createObservationDocument() {
        ObservationDocument result = ObservationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObservationType createObservationType() {
        ObservationType result = ObservationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OffsetCurveDocument createOffsetCurveDocument() {
        OffsetCurveDocument result = OffsetCurveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OffsetCurveType createOffsetCurveType() {
        OffsetCurveType result = OffsetCurveType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationDocument createOperationDocument() {
        OperationDocument result = OperationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationMethodDocument createOperationMethodDocument() {
        OperationMethodDocument result = OperationMethodDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationMethodRefDocument createOperationMethodRefDocument() {
        OperationMethodRefDocument result = OperationMethodRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationMethodRefType createOperationMethodRefType() {
        OperationMethodRefType result = OperationMethodRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationMethodType createOperationMethodType() {
        OperationMethodType result = OperationMethodType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterDocument createOperationParameterDocument() {
        OperationParameterDocument result = OperationParameterDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterGroupDocument createOperationParameterGroupDocument() {
        OperationParameterGroupDocument result = OperationParameterGroupDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterGroupRefDocument createOperationParameterGroupRefDocument() {
        OperationParameterGroupRefDocument result = OperationParameterGroupRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterGroupRefType createOperationParameterGroupRefType() {
        OperationParameterGroupRefType result = OperationParameterGroupRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterGroupType createOperationParameterGroupType() {
        OperationParameterGroupType result = OperationParameterGroupType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterRefDocument createOperationParameterRefDocument() {
        OperationParameterRefDocument result = OperationParameterRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterRefType createOperationParameterRefType() {
        OperationParameterRefType result = OperationParameterRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationParameterType createOperationParameterType() {
        OperationParameterType result = OperationParameterType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationRefDocument createOperationRefDocument() {
        OperationRefDocument result = OperationRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationRefType createOperationRefType() {
        OperationRefType result = OperationRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OperationVersionDocument createOperationVersionDocument() {
        OperationVersionDocument result = OperationVersionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OrientableCurveDocument createOrientableCurveDocument() {
        OrientableCurveDocument result = OrientableCurveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OrientableCurveType createOrientableCurveType() {
        OrientableCurveType result = OrientableCurveType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OrientableSurfaceDocument createOrientableSurfaceDocument() {
        OrientableSurfaceDocument result = OrientableSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OrientableSurfaceType createOrientableSurfaceType() {
        OrientableSurfaceType result = OrientableSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OriginDocument createOriginDocument() {
        OriginDocument result = OriginDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public OuterBoundaryIsDocument createOuterBoundaryIsDocument() {
        OuterBoundaryIsDocument result = OuterBoundaryIsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ParameterIDDocument createParameterIDDocument() {
        ParameterIDDocument result = ParameterIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ParameterNameDocument createParameterNameDocument() {
        ParameterNameDocument result = ParameterNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ParameterValueDocument createParameterValueDocument() {
        ParameterValueDocument result = ParameterValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ParameterValueGroupDocument createParameterValueGroupDocument() {
        ParameterValueGroupDocument result = ParameterValueGroupDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ParameterValueGroupType createParameterValueGroupType() {
        ParameterValueGroupType result = ParameterValueGroupType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ParameterValueType createParameterValueType() {
        ParameterValueType result = ParameterValueType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ParametricCurveSurfaceDocument createParametricCurveSurfaceDocument() {
        ParametricCurveSurfaceDocument result = ParametricCurveSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PassThroughOperationDocument createPassThroughOperationDocument() {
        PassThroughOperationDocument result = PassThroughOperationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PassThroughOperationRefDocument createPassThroughOperationRefDocument() {
        PassThroughOperationRefDocument result = PassThroughOperationRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PassThroughOperationRefType createPassThroughOperationRefType() {
        PassThroughOperationRefType result = PassThroughOperationRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PassThroughOperationType createPassThroughOperationType() {
        PassThroughOperationType result = PassThroughOperationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PatchesDocument createPatchesDocument() {
        PatchesDocument result = PatchesDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PixelInCellDocument createPixelInCellDocument() {
        PixelInCellDocument result = PixelInCellDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PixelInCellType createPixelInCellType() {
        PixelInCellType result = PixelInCellType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointArrayPropertyDocument createPointArrayPropertyDocument() {
        PointArrayPropertyDocument result = PointArrayPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointArrayPropertyType createPointArrayPropertyType() {
        PointArrayPropertyType result = PointArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointDocument createPointDocument() {
        PointDocument result = PointDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointMemberDocument createPointMemberDocument() {
        PointMemberDocument result = PointMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointMembersDocument createPointMembersDocument() {
        PointMembersDocument result = PointMembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointPropertyDocument createPointPropertyDocument() {
        PointPropertyDocument result = PointPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointPropertyType createPointPropertyType() {
        PointPropertyType result = PointPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointRepDocument createPointRepDocument() {
        PointRepDocument result = PointRepDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PointType createPointType() {
        PointType result = PointType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolarCSDocument createPolarCSDocument() {
        PolarCSDocument result = PolarCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolarCSRefDocument createPolarCSRefDocument() {
        PolarCSRefDocument result = PolarCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolarCSRefType createPolarCSRefType() {
        PolarCSRefType result = PolarCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolarCSType createPolarCSType() {
        PolarCSType result = PolarCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonDocument createPolygonDocument() {
        PolygonDocument result = PolygonDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonMemberDocument createPolygonMemberDocument() {
        PolygonMemberDocument result = PolygonMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonPatchArrayPropertyType createPolygonPatchArrayPropertyType() {
        PolygonPatchArrayPropertyType result = PolygonPatchArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonPatchDocument createPolygonPatchDocument() {
        PolygonPatchDocument result = PolygonPatchDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonPatchesDocument createPolygonPatchesDocument() {
        PolygonPatchesDocument result = PolygonPatchesDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonPatchType createPolygonPatchType() {
        PolygonPatchType result = PolygonPatchType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonPropertyDocument createPolygonPropertyDocument() {
        PolygonPropertyDocument result = PolygonPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonPropertyType createPolygonPropertyType() {
        PolygonPropertyType result = PolygonPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolygonType createPolygonType() {
        PolygonType result = PolygonType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolyhedralSurfaceDocument createPolyhedralSurfaceDocument() {
        PolyhedralSurfaceDocument result = PolyhedralSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PolyhedralSurfaceType createPolyhedralSurfaceType() {
        PolyhedralSurfaceType result = PolyhedralSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PosDocument createPosDocument() {
        PosDocument result = PosDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PositionalAccuracyDocument createPositionalAccuracyDocument() {
        PositionalAccuracyDocument result = PositionalAccuracyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PositionDocument createPositionDocument() {
        PositionDocument result = PositionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PosListDocument createPosListDocument() {
        PosListDocument result = PosListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PrimeMeridianDocument createPrimeMeridianDocument() {
        PrimeMeridianDocument result = PrimeMeridianDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PrimeMeridianRefDocument createPrimeMeridianRefDocument() {
        PrimeMeridianRefDocument result = PrimeMeridianRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PrimeMeridianRefType createPrimeMeridianRefType() {
        PrimeMeridianRefType result = PrimeMeridianRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PrimeMeridianType createPrimeMeridianType() {
        PrimeMeridianType result = PrimeMeridianType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PriorityLocationDocument createPriorityLocationDocument() {
        PriorityLocationDocument result = PriorityLocationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public PriorityLocationPropertyType createPriorityLocationPropertyType() {
        PriorityLocationPropertyType result = PriorityLocationPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ProjectedCRSDocument createProjectedCRSDocument() {
        ProjectedCRSDocument result = ProjectedCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ProjectedCRSRefDocument createProjectedCRSRefDocument() {
        ProjectedCRSRefDocument result = ProjectedCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ProjectedCRSRefType createProjectedCRSRefType() {
        ProjectedCRSRefType result = ProjectedCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ProjectedCRSType createProjectedCRSType() {
        ProjectedCRSType result = ProjectedCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QNameList createQNameList() {
        QNameList result = QNameList.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QuantityDocument createQuantityDocument() {
        QuantityDocument result = QuantityDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QuantityExtentDocument createQuantityExtentDocument() {
        QuantityExtentDocument result = QuantityExtentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QuantityExtentType createQuantityExtentType() {
        QuantityExtentType result = QuantityExtentType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QuantityListDocument createQuantityListDocument() {
        QuantityListDocument result = QuantityListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QuantityPropertyType createQuantityPropertyType() {
        QuantityPropertyType result = QuantityPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QuantityTypeDocument createQuantityTypeDocument() {
        QuantityTypeDocument result = QuantityTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public QueryGrammarEnumeration createQueryGrammarEnumeration() {
        QueryGrammarEnumeration result = QueryGrammarEnumeration.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RangeParametersDocument createRangeParametersDocument() {
        RangeParametersDocument result = RangeParametersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RangeParametersType createRangeParametersType() {
        RangeParametersType result = RangeParametersType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RangeSetDocument createRangeSetDocument() {
        RangeSetDocument result = RangeSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RangeSetType createRangeSetType() {
        RangeSetType result = RangeSetType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RealizationEpochDocument createRealizationEpochDocument() {
        RealizationEpochDocument result = RealizationEpochDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectangleDocument createRectangleDocument() {
        RectangleDocument result = RectangleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectangleType createRectangleType() {
        RectangleType result = RectangleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectifiedGridCoverageDocument createRectifiedGridCoverageDocument() {
        RectifiedGridCoverageDocument result = RectifiedGridCoverageDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectifiedGridCoverageType createRectifiedGridCoverageType() {
        RectifiedGridCoverageType result = RectifiedGridCoverageType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectifiedGridDocument createRectifiedGridDocument() {
        RectifiedGridDocument result = RectifiedGridDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectifiedGridDomainDocument createRectifiedGridDomainDocument() {
        RectifiedGridDomainDocument result = RectifiedGridDomainDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectifiedGridDomainType createRectifiedGridDomainType() {
        RectifiedGridDomainType result = RectifiedGridDomainType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RectifiedGridType createRectifiedGridType() {
        RectifiedGridType result = RectifiedGridType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ReferenceDocument createReferenceDocument() {
        ReferenceDocument result = ReferenceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ReferenceSystemDocument createReferenceSystemDocument() {
        ReferenceSystemDocument result = ReferenceSystemDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ReferenceSystemRefDocument createReferenceSystemRefDocument() {
        ReferenceSystemRefDocument result = ReferenceSystemRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ReferenceSystemRefType createReferenceSystemRefType() {
        ReferenceSystemRefType result = ReferenceSystemRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ReferenceType createReferenceType() {
        ReferenceType result = ReferenceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelatedTimeType createRelatedTimeType() {
        RelatedTimeType result = RelatedTimeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelativeInternalPositionalAccuracyDocument createRelativeInternalPositionalAccuracyDocument() {
        RelativeInternalPositionalAccuracyDocument result =
                RelativeInternalPositionalAccuracyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelativeInternalPositionalAccuracyType createRelativeInternalPositionalAccuracyType() {
        RelativeInternalPositionalAccuracyType result =
                RelativeInternalPositionalAccuracyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RemarksDocument createRemarksDocument() {
        RemarksDocument result = RemarksDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RemoteSchemaAttribute createRemoteSchemaAttribute() {
        RemoteSchemaAttribute result = RemoteSchemaAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResultDocument createResultDocument() {
        ResultDocument result = ResultDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResultOfDocument createResultOfDocument() {
        ResultOfDocument result = ResultOfDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RingDocument createRingDocument() {
        RingDocument result = RingDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RingPropertyType createRingPropertyType() {
        RingPropertyType result = RingPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RingType createRingType() {
        RingType result = RingType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RoughConversionToPreferredUnitDocument createRoughConversionToPreferredUnitDocument() {
        RoughConversionToPreferredUnitDocument result = RoughConversionToPreferredUnitDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RowIndexDocument createRowIndexDocument() {
        RowIndexDocument result = RowIndexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ScalarValuePropertyType createScalarValuePropertyType() {
        ScalarValuePropertyType result = ScalarValuePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ScaleType createScaleType() {
        ScaleType result = ScaleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ScopeDocument createScopeDocument() {
        ScopeDocument result = ScopeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SecondDefiningParameterDocument createSecondDefiningParameterDocument() {
        SecondDefiningParameterDocument result = SecondDefiningParameterDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SecondDefiningParameterType createSecondDefiningParameterType() {
        SecondDefiningParameterType result = SecondDefiningParameterType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SecondsDocument createSecondsDocument() {
        SecondsDocument result = SecondsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SegmentsDocument createSegmentsDocument() {
        SegmentsDocument result = SegmentsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SemiMajorAxisDocument createSemiMajorAxisDocument() {
        SemiMajorAxisDocument result = SemiMajorAxisDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SemiMinorAxisDocument createSemiMinorAxisDocument() {
        SemiMinorAxisDocument result = SemiMinorAxisDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SequenceRuleNames createSequenceRuleNames() {
        SequenceRuleNames result = SequenceRuleNames.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SequenceRuleType createSequenceRuleType() {
        SequenceRuleType result = SequenceRuleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SignType createSignType() {
        SignType result = SignType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SingleOperationDocument createSingleOperationDocument() {
        SingleOperationDocument result = SingleOperationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SingleOperationRefDocument createSingleOperationRefDocument() {
        SingleOperationRefDocument result = SingleOperationRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SingleOperationRefType createSingleOperationRefType() {
        SingleOperationRefType result = SingleOperationRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidArrayPropertyDocument createSolidArrayPropertyDocument() {
        SolidArrayPropertyDocument result = SolidArrayPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidArrayPropertyType createSolidArrayPropertyType() {
        SolidArrayPropertyType result = SolidArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidDocument createSolidDocument() {
        SolidDocument result = SolidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidMemberDocument createSolidMemberDocument() {
        SolidMemberDocument result = SolidMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidMembersDocument createSolidMembersDocument() {
        SolidMembersDocument result = SolidMembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidPropertyDocument createSolidPropertyDocument() {
        SolidPropertyDocument result = SolidPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidPropertyType createSolidPropertyType() {
        SolidPropertyType result = SolidPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SolidType createSolidType() {
        SolidType result = SolidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SourceCRSDocument createSourceCRSDocument() {
        SourceCRSDocument result = SourceCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SourceDimensionsDocument createSourceDimensionsDocument() {
        SourceDimensionsDocument result = SourceDimensionsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SpeedType createSpeedType() {
        SpeedType result = SpeedType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SphereDocument createSphereDocument() {
        SphereDocument result = SphereDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SphereType createSphereType() {
        SphereType result = SphereType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SphericalCSDocument createSphericalCSDocument() {
        SphericalCSDocument result = SphericalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SphericalCSRefDocument createSphericalCSRefDocument() {
        SphericalCSRefDocument result = SphericalCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SphericalCSRefType createSphericalCSRefType() {
        SphericalCSRefType result = SphericalCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SphericalCSType createSphericalCSType() {
        SphericalCSType result = SphericalCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SrsIDDocument createSrsIDDocument() {
        SrsIDDocument result = SrsIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SrsNameDocument createSrsNameDocument() {
        SrsNameDocument result = SrsNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StatusDocument createStatusDocument() {
        StatusDocument result = StatusDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StrictAssociationDocument createStrictAssociationDocument() {
        StrictAssociationDocument result = StrictAssociationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StringOrNull createStringOrNull() {
        StringOrNull result = StringOrNull.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StringOrRefType createStringOrRefType() {
        StringOrRefType result = StringOrRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StringValueDocument createStringValueDocument() {
        StringValueDocument result = StringValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StyleDocument createStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StyleType createStyleType() {
        StyleType result = StyleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public StyleVariationType createStyleVariationType() {
        StyleVariationType result = StyleVariationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SubComplexDocument createSubComplexDocument() {
        SubComplexDocument result = SubComplexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SubjectDocument createSubjectDocument() {
        SubjectDocument result = SubjectDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SuccessionType createSuccessionType() {
        SuccessionType result = SuccessionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SuperComplexDocument createSuperComplexDocument() {
        SuperComplexDocument result = SuperComplexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfaceArrayPropertyDocument createSurfaceArrayPropertyDocument() {
        SurfaceArrayPropertyDocument result = SurfaceArrayPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfaceArrayPropertyType createSurfaceArrayPropertyType() {
        SurfaceArrayPropertyType result = SurfaceArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfaceDocument createSurfaceDocument() {
        SurfaceDocument result = SurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfaceInterpolationType createSurfaceInterpolationType() {
        SurfaceInterpolationType result = SurfaceInterpolationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfaceMemberDocument createSurfaceMemberDocument() {
        SurfaceMemberDocument result = SurfaceMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfaceMembersDocument createSurfaceMembersDocument() {
        SurfaceMembersDocument result = SurfaceMembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfacePatchArrayPropertyType createSurfacePatchArrayPropertyType() {
        SurfacePatchArrayPropertyType result = SurfacePatchArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfacePatchDocument createSurfacePatchDocument() {
        SurfacePatchDocument result = SurfacePatchDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfacePropertyDocument createSurfacePropertyDocument() {
        SurfacePropertyDocument result = SurfacePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfacePropertyType createSurfacePropertyType() {
        SurfacePropertyType result = SurfacePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SurfaceType createSurfaceType() {
        SurfaceType result = SurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SymbolDocument createSymbolDocument() {
        SymbolDocument result = SymbolDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SymbolType createSymbolType() {
        SymbolType result = SymbolType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SymbolTypeEnumeration createSymbolTypeEnumeration() {
        SymbolTypeEnumeration result = SymbolTypeEnumeration.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TargetCRSDocument createTargetCRSDocument() {
        TargetCRSDocument result = TargetCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TargetDimensionsDocument createTargetDimensionsDocument() {
        TargetDimensionsDocument result = TargetDimensionsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TargetDocument createTargetDocument() {
        TargetDocument result = TargetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TargetPropertyType createTargetPropertyType() {
        TargetPropertyType result = TargetPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCRSDocument createTemporalCRSDocument() {
        TemporalCRSDocument result = TemporalCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCRSRefDocument createTemporalCRSRefDocument() {
        TemporalCRSRefDocument result = TemporalCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCRSRefType createTemporalCRSRefType() {
        TemporalCRSRefType result = TemporalCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCRSType createTemporalCRSType() {
        TemporalCRSType result = TemporalCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCSDocument createTemporalCSDocument() {
        TemporalCSDocument result = TemporalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCSRefDocument createTemporalCSRefDocument() {
        TemporalCSRefDocument result = TemporalCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCSRefType createTemporalCSRefType() {
        TemporalCSRefType result = TemporalCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalCSType createTemporalCSType() {
        TemporalCSType result = TemporalCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalDatumDocument createTemporalDatumDocument() {
        TemporalDatumDocument result = TemporalDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalDatumRefDocument createTemporalDatumRefDocument() {
        TemporalDatumRefDocument result = TemporalDatumRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalDatumRefType createTemporalDatumRefType() {
        TemporalDatumRefType result = TemporalDatumRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalDatumType createTemporalDatumType() {
        TemporalDatumType result = TemporalDatumType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TemporalExtentDocument createTemporalExtentDocument() {
        TemporalExtentDocument result = TemporalExtentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCalendarDocument createTimeCalendarDocument() {
        TimeCalendarDocument result = TimeCalendarDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCalendarEraDocument createTimeCalendarEraDocument() {
        TimeCalendarEraDocument result = TimeCalendarEraDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCalendarEraPropertyType createTimeCalendarEraPropertyType() {
        TimeCalendarEraPropertyType result = TimeCalendarEraPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCalendarEraType createTimeCalendarEraType() {
        TimeCalendarEraType result = TimeCalendarEraType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCalendarPropertyType createTimeCalendarPropertyType() {
        TimeCalendarPropertyType result = TimeCalendarPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCalendarType createTimeCalendarType() {
        TimeCalendarType result = TimeCalendarType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeClockDocument createTimeClockDocument() {
        TimeClockDocument result = TimeClockDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeClockPropertyType createTimeClockPropertyType() {
        TimeClockPropertyType result = TimeClockPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeClockType createTimeClockType() {
        TimeClockType result = TimeClockType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeComplexDocument createTimeComplexDocument() {
        TimeComplexDocument result = TimeComplexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCoordinateSystemDocument createTimeCoordinateSystemDocument() {
        TimeCoordinateSystemDocument result = TimeCoordinateSystemDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeCoordinateSystemType createTimeCoordinateSystemType() {
        TimeCoordinateSystemType result = TimeCoordinateSystemType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeEdgeDocument createTimeEdgeDocument() {
        TimeEdgeDocument result = TimeEdgeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeEdgePropertyType createTimeEdgePropertyType() {
        TimeEdgePropertyType result = TimeEdgePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeEdgeType createTimeEdgeType() {
        TimeEdgeType result = TimeEdgeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeGeometricPrimitiveDocument createTimeGeometricPrimitiveDocument() {
        TimeGeometricPrimitiveDocument result = TimeGeometricPrimitiveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeGeometricPrimitivePropertyType createTimeGeometricPrimitivePropertyType() {
        TimeGeometricPrimitivePropertyType result = TimeGeometricPrimitivePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeIndeterminateValueType createTimeIndeterminateValueType() {
        TimeIndeterminateValueType result = TimeIndeterminateValueType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeInstantDocument createTimeInstantDocument() {
        TimeInstantDocument result = TimeInstantDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeInstantPropertyType createTimeInstantPropertyType() {
        TimeInstantPropertyType result = TimeInstantPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeInstantType createTimeInstantType() {
        TimeInstantType result = TimeInstantType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeIntervalDocument createTimeIntervalDocument() {
        TimeIntervalDocument result = TimeIntervalDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeIntervalLengthType createTimeIntervalLengthType() {
        TimeIntervalLengthType result = TimeIntervalLengthType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeNodeDocument createTimeNodeDocument() {
        TimeNodeDocument result = TimeNodeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeNodePropertyType createTimeNodePropertyType() {
        TimeNodePropertyType result = TimeNodePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeNodeType createTimeNodeType() {
        TimeNodeType result = TimeNodeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeObjectDocument createTimeObjectDocument() {
        TimeObjectDocument result = TimeObjectDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeOrdinalEraDocument createTimeOrdinalEraDocument() {
        TimeOrdinalEraDocument result = TimeOrdinalEraDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeOrdinalEraPropertyType createTimeOrdinalEraPropertyType() {
        TimeOrdinalEraPropertyType result = TimeOrdinalEraPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeOrdinalEraType createTimeOrdinalEraType() {
        TimeOrdinalEraType result = TimeOrdinalEraType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeOrdinalReferenceSystemDocument createTimeOrdinalReferenceSystemDocument() {
        TimeOrdinalReferenceSystemDocument result = TimeOrdinalReferenceSystemDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeOrdinalReferenceSystemType createTimeOrdinalReferenceSystemType() {
        TimeOrdinalReferenceSystemType result = TimeOrdinalReferenceSystemType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePeriodDocument createTimePeriodDocument() {
        TimePeriodDocument result = TimePeriodDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePeriodPropertyType createTimePeriodPropertyType() {
        TimePeriodPropertyType result = TimePeriodPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePeriodType createTimePeriodType() {
        TimePeriodType result = TimePeriodType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePositionDocument createTimePositionDocument() {
        TimePositionDocument result = TimePositionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePositionType createTimePositionType() {
        TimePositionType result = TimePositionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePositionUnion createTimePositionUnion() {
        TimePositionUnion result = TimePositionUnion.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePrimitiveDocument createTimePrimitiveDocument() {
        TimePrimitiveDocument result = TimePrimitiveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimePrimitivePropertyType createTimePrimitivePropertyType() {
        TimePrimitivePropertyType result = TimePrimitivePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeReferenceSystemDocument createTimeReferenceSystemDocument() {
        TimeReferenceSystemDocument result = TimeReferenceSystemDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeSliceDocument createTimeSliceDocument() {
        TimeSliceDocument result = TimeSliceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeTopologyComplexDocument createTimeTopologyComplexDocument() {
        TimeTopologyComplexDocument result = TimeTopologyComplexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeTopologyComplexPropertyType createTimeTopologyComplexPropertyType() {
        TimeTopologyComplexPropertyType result = TimeTopologyComplexPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeTopologyComplexType createTimeTopologyComplexType() {
        TimeTopologyComplexType result = TimeTopologyComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeTopologyPrimitiveDocument createTimeTopologyPrimitiveDocument() {
        TimeTopologyPrimitiveDocument result = TimeTopologyPrimitiveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeTopologyPrimitivePropertyType createTimeTopologyPrimitivePropertyType() {
        TimeTopologyPrimitivePropertyType result = TimeTopologyPrimitivePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeType createTimeType() {
        TimeType result = TimeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TimeUnitType createTimeUnitType() {
        TimeUnitType result = TimeUnitType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TinDocument createTinDocument() {
        TinDocument result = TinDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TinType createTinType() {
        TinType result = TinType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoComplexDocument createTopoComplexDocument() {
        TopoComplexDocument result = TopoComplexDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoComplexMemberType createTopoComplexMemberType() {
        TopoComplexMemberType result = TopoComplexMemberType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoComplexPropertyDocument createTopoComplexPropertyDocument() {
        TopoComplexPropertyDocument result = TopoComplexPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoComplexType createTopoComplexType() {
        TopoComplexType result = TopoComplexType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoCurveDocument createTopoCurveDocument() {
        TopoCurveDocument result = TopoCurveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoCurvePropertyDocument createTopoCurvePropertyDocument() {
        TopoCurvePropertyDocument result = TopoCurvePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoCurvePropertyType createTopoCurvePropertyType() {
        TopoCurvePropertyType result = TopoCurvePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoCurveType createTopoCurveType() {
        TopoCurveType result = TopoCurveType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopologyDocument createTopologyDocument() {
        TopologyDocument result = TopologyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopologyStyleDocument createTopologyStyleDocument() {
        TopologyStyleDocument result = TopologyStyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopologyStylePropertyType createTopologyStylePropertyType() {
        TopologyStylePropertyType result = TopologyStylePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopologyStyleType createTopologyStyleType() {
        TopologyStyleType result = TopologyStyleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPointDocument createTopoPointDocument() {
        TopoPointDocument result = TopoPointDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPointPropertyDocument createTopoPointPropertyDocument() {
        TopoPointPropertyDocument result = TopoPointPropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPointPropertyType createTopoPointPropertyType() {
        TopoPointPropertyType result = TopoPointPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPointType createTopoPointType() {
        TopoPointType result = TopoPointType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPrimitiveArrayAssociationType createTopoPrimitiveArrayAssociationType() {
        TopoPrimitiveArrayAssociationType result = TopoPrimitiveArrayAssociationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPrimitiveDocument createTopoPrimitiveDocument() {
        TopoPrimitiveDocument result = TopoPrimitiveDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPrimitiveMemberDocument createTopoPrimitiveMemberDocument() {
        TopoPrimitiveMemberDocument result = TopoPrimitiveMemberDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPrimitiveMembersDocument createTopoPrimitiveMembersDocument() {
        TopoPrimitiveMembersDocument result = TopoPrimitiveMembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoPrimitiveMemberType createTopoPrimitiveMemberType() {
        TopoPrimitiveMemberType result = TopoPrimitiveMemberType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoSolidDocument createTopoSolidDocument() {
        TopoSolidDocument result = TopoSolidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoSolidType createTopoSolidType() {
        TopoSolidType result = TopoSolidType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoSurfaceDocument createTopoSurfaceDocument() {
        TopoSurfaceDocument result = TopoSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoSurfacePropertyDocument createTopoSurfacePropertyDocument() {
        TopoSurfacePropertyDocument result = TopoSurfacePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoSurfacePropertyType createTopoSurfacePropertyType() {
        TopoSurfacePropertyType result = TopoSurfacePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoSurfaceType createTopoSurfaceType() {
        TopoSurfaceType result = TopoSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoVolumeDocument createTopoVolumeDocument() {
        TopoVolumeDocument result = TopoVolumeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoVolumePropertyDocument createTopoVolumePropertyDocument() {
        TopoVolumePropertyDocument result = TopoVolumePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoVolumePropertyType createTopoVolumePropertyType() {
        TopoVolumePropertyType result = TopoVolumePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TopoVolumeType createTopoVolumeType() {
        TopoVolumeType result = TopoVolumeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TrackDocument createTrackDocument() {
        TrackDocument result = TrackDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TrackType createTrackType() {
        TrackType result = TrackType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TransformationDocument createTransformationDocument() {
        TransformationDocument result = TransformationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TransformationRefDocument createTransformationRefDocument() {
        TransformationRefDocument result = TransformationRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TransformationRefType createTransformationRefType() {
        TransformationRefType result = TransformationRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TransformationType createTransformationType() {
        TransformationType result = TransformationType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TransformAttribute createTransformAttribute() {
        TransformAttribute result = TransformAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TriangleDocument createTriangleDocument() {
        TriangleDocument result = TriangleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TrianglePatchArrayPropertyType createTrianglePatchArrayPropertyType() {
        TrianglePatchArrayPropertyType result = TrianglePatchArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TrianglePatchesDocument createTrianglePatchesDocument() {
        TrianglePatchesDocument result = TrianglePatchesDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TriangleType createTriangleType() {
        TriangleType result = TriangleType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TriangulatedSurfaceDocument createTriangulatedSurfaceDocument() {
        TriangulatedSurfaceDocument result = TriangulatedSurfaceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TriangulatedSurfaceType createTriangulatedSurfaceType() {
        TriangulatedSurfaceType result = TriangulatedSurfaceType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TupleListDocument createTupleListDocument() {
        TupleListDocument result = TupleListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UnitDefinitionDocument createUnitDefinitionDocument() {
        UnitDefinitionDocument result = UnitDefinitionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UnitDefinitionType createUnitDefinitionType() {
        UnitDefinitionType result = UnitDefinitionType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UnitOfMeasureDocument createUnitOfMeasureDocument() {
        UnitOfMeasureDocument result = UnitOfMeasureDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UnitOfMeasureType createUnitOfMeasureType() {
        UnitOfMeasureType result = UnitOfMeasureType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UomAttribute createUomAttribute() {
        UomAttribute result = UomAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UserDefinedCSDocument createUserDefinedCSDocument() {
        UserDefinedCSDocument result = UserDefinedCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UserDefinedCSRefDocument createUserDefinedCSRefDocument() {
        UserDefinedCSRefDocument result = UserDefinedCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UserDefinedCSRefType createUserDefinedCSRefType() {
        UserDefinedCSRefType result = UserDefinedCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UserDefinedCSType createUserDefinedCSType() {
        UserDefinedCSType result = UserDefinedCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesAxisDocument createUsesAxisDocument() {
        UsesAxisDocument result = UsesAxisDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesCartesianCSDocument createUsesCartesianCSDocument() {
        UsesCartesianCSDocument result = UsesCartesianCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesCSDocument createUsesCSDocument() {
        UsesCSDocument result = UsesCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesEllipsoidalCSDocument createUsesEllipsoidalCSDocument() {
        UsesEllipsoidalCSDocument result = UsesEllipsoidalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesEllipsoidDocument createUsesEllipsoidDocument() {
        UsesEllipsoidDocument result = UsesEllipsoidDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesEngineeringDatumDocument createUsesEngineeringDatumDocument() {
        UsesEngineeringDatumDocument result = UsesEngineeringDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesGeodeticDatumDocument createUsesGeodeticDatumDocument() {
        UsesGeodeticDatumDocument result = UsesGeodeticDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesImageDatumDocument createUsesImageDatumDocument() {
        UsesImageDatumDocument result = UsesImageDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesMethodDocument createUsesMethodDocument() {
        UsesMethodDocument result = UsesMethodDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesObliqueCartesianCSDocument createUsesObliqueCartesianCSDocument() {
        UsesObliqueCartesianCSDocument result = UsesObliqueCartesianCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesOperationDocument createUsesOperationDocument() {
        UsesOperationDocument result = UsesOperationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesParameterDocument createUsesParameterDocument() {
        UsesParameterDocument result = UsesParameterDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesPrimeMeridianDocument createUsesPrimeMeridianDocument() {
        UsesPrimeMeridianDocument result = UsesPrimeMeridianDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesSingleOperationDocument createUsesSingleOperationDocument() {
        UsesSingleOperationDocument result = UsesSingleOperationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesSphericalCSDocument createUsesSphericalCSDocument() {
        UsesSphericalCSDocument result = UsesSphericalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesTemporalCSDocument createUsesTemporalCSDocument() {
        UsesTemporalCSDocument result = UsesTemporalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesTemporalDatumDocument createUsesTemporalDatumDocument() {
        UsesTemporalDatumDocument result = UsesTemporalDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesValueDocument createUsesValueDocument() {
        UsesValueDocument result = UsesValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesVerticalCSDocument createUsesVerticalCSDocument() {
        UsesVerticalCSDocument result = UsesVerticalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsesVerticalDatumDocument createUsesVerticalDatumDocument() {
        UsesVerticalDatumDocument result = UsesVerticalDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public UsingDocument createUsingDocument() {
        UsingDocument result = UsingDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValidAreaDocument createValidAreaDocument() {
        ValidAreaDocument result = ValidAreaDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValidTimeDocument createValidTimeDocument() {
        ValidTimeDocument result = ValidTimeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueArrayDocument createValueArrayDocument() {
        ValueArrayDocument result = ValueArrayDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueArrayPropertyType createValueArrayPropertyType() {
        ValueArrayPropertyType result = ValueArrayPropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueArrayType createValueArrayType() {
        ValueArrayType result = ValueArrayType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueComponentDocument createValueComponentDocument() {
        ValueComponentDocument result = ValueComponentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueComponentsDocument createValueComponentsDocument() {
        ValueComponentsDocument result = ValueComponentsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueDocument createValueDocument() {
        ValueDocument result = ValueDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueFileDocument createValueFileDocument() {
        ValueFileDocument result = ValueFileDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueListDocument createValueListDocument() {
        ValueListDocument result = ValueListDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValueOfParameterDocument createValueOfParameterDocument() {
        ValueOfParameterDocument result = ValueOfParameterDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValuePropertyDocument createValuePropertyDocument() {
        ValuePropertyDocument result = ValuePropertyDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValuePropertyType createValuePropertyType() {
        ValuePropertyType result = ValuePropertyType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ValuesOfGroupDocument createValuesOfGroupDocument() {
        ValuesOfGroupDocument result = ValuesOfGroupDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VectorDocument createVectorDocument() {
        VectorDocument result = VectorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VectorType createVectorType() {
        VectorType result = VectorType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VersionDocument createVersionDocument() {
        VersionDocument result = VersionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCRSDocument createVerticalCRSDocument() {
        VerticalCRSDocument result = VerticalCRSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCRSRefDocument createVerticalCRSRefDocument() {
        VerticalCRSRefDocument result = VerticalCRSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCRSRefType createVerticalCRSRefType() {
        VerticalCRSRefType result = VerticalCRSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCRSType createVerticalCRSType() {
        VerticalCRSType result = VerticalCRSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCSDocument createVerticalCSDocument() {
        VerticalCSDocument result = VerticalCSDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCSRefDocument createVerticalCSRefDocument() {
        VerticalCSRefDocument result = VerticalCSRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCSRefType createVerticalCSRefType() {
        VerticalCSRefType result = VerticalCSRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalCSType createVerticalCSType() {
        VerticalCSType result = VerticalCSType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalDatumDocument createVerticalDatumDocument() {
        VerticalDatumDocument result = VerticalDatumDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalDatumRefDocument createVerticalDatumRefDocument() {
        VerticalDatumRefDocument result = VerticalDatumRefDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalDatumRefType createVerticalDatumRefType() {
        VerticalDatumRefType result = VerticalDatumRefType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalDatumType createVerticalDatumType() {
        VerticalDatumType result = VerticalDatumType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalDatumTypeDocument createVerticalDatumTypeDocument() {
        VerticalDatumTypeDocument result = VerticalDatumTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalDatumTypeType createVerticalDatumTypeType() {
        VerticalDatumTypeType result = VerticalDatumTypeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VerticalExtentDocument createVerticalExtentDocument() {
        VerticalExtentDocument result = VerticalExtentDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public VolumeType createVolumeType() {
        VolumeType result = VolumeType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ClassificationWrapDocument.ClassificationWrap createClassificationWrap() {
        ClassificationWrapDocument.ClassificationWrap result = ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ClassificationWrapDocument.ClassificationWrap.Classification createClassification() {
        ClassificationWrapDocument.ClassificationWrap.Classification result = ClassificationWrapDocument.ClassificationWrap.Classification.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createDisplayStateEditionWrap() {
        DisplayStateEditionWrapDocument.DisplayStateEditionWrap result = DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EventWrapDocument.EventWrap createEventWrap() {
        EventWrapDocument.EventWrap result = EventWrapDocument.EventWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public EventWrapDocument.EventWrap.EventSet createEvent() {
        EventWrapDocument.EventWrap.EventSet result = EventWrapDocument.EventWrap.EventSet.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap createInscriptionsWrap() {
        InscriptionsWrapDocument.InscriptionsWrap result = InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap.Inscriptions createInscriptions() {
        InscriptionsWrapDocument.InscriptionsWrap.Inscriptions result =
                InscriptionsWrapDocument.InscriptionsWrap.Inscriptions.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LidoWrapDocument.LidoWrap createLidoWrap() {
        LidoWrapDocument.LidoWrap result = LidoWrapDocument.LidoWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public LidoWrapDocument.LidoWrap.Lido createLido() {
        LidoWrapDocument.LidoWrap.Lido result = LidoWrapDocument.LidoWrap.Lido.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectClassificationWrapDocument.ObjectClassificationWrap createObjectClassificationWrap() {
        ObjectClassificationWrapDocument.ObjectClassificationWrap result = ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectDescriptionWrapDocument.ObjectDescriptionWrap createObjectDescriptionWrap() {
        ObjectDescriptionWrapDocument.ObjectDescriptionWrap result = ObjectDescriptionWrapDocument.ObjectDescriptionWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectIdentificationWrapDocument.ObjectIdentificationWrap createObjectIdentificationWrap() {
        ObjectIdentificationWrapDocument.ObjectIdentificationWrap result =
                ObjectIdentificationWrapDocument.ObjectIdentificationWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap createObjectMeasurementsWrap() {
        ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap result = ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet createObjectMeasurements() {
        ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet result =
                ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectRelationWrapDocument.ObjectRelationWrap createObjectRelationWrap() {
        ObjectRelationWrapDocument.ObjectRelationWrap result =
                ObjectRelationWrapDocument.ObjectRelationWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createObjectWorkTypeWrap() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap result =
                ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType createObjectWorkType() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType result =
                ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RecordWrapDocument.RecordWrap createRecordWrap() {
        RecordWrapDocument.RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap createRelatedWorksWrap() {
        RelatedWorksWrapDocument.RelatedWorksWrap result =
                RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet createRelatedWorks() {
        RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet result =
                RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RepositoryWrapDocument.RepositoryWrap createRepositoryWrap() {
        RepositoryWrapDocument.RepositoryWrap result = RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResourceWrapDocument.ResourceWrap createResourceWrap() {
        ResourceWrapDocument.ResourceWrap result = ResourceWrapDocument.ResourceWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public ResourceWrapDocument.ResourceWrap.ResourceSet createResource() {
        ResourceWrapDocument.ResourceWrap.ResourceSet result = ResourceWrapDocument.ResourceWrap.ResourceSet.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RightsWorkWrapDocument.RightsWorkWrap createRightsWorkWrap() {
        RightsWorkWrapDocument.RightsWorkWrap result = RightsWorkWrapDocument.RightsWorkWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet createRightsWork() {
        RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet result = RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SubjectWrapDocument.SubjectWrap createSubjectWrap() {
        SubjectWrapDocument.SubjectWrap result = SubjectWrapDocument.SubjectWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public SubjectWrapDocument.SubjectWrap.SubjectSet createSubject() {
        SubjectWrapDocument.SubjectWrap.SubjectSet result = SubjectWrapDocument.SubjectWrap.SubjectSet.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TitleWrapDocument.TitleWrap createTitleWrap() {
        TitleWrapDocument.TitleWrap result = TitleWrapDocument.TitleWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public TitleWrapDocument.TitleWrap.TitleSet createTitle() {
        TitleWrapDocument.TitleWrap.TitleSet result = TitleWrapDocument.TitleWrap.TitleSet.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public CurveMembersDocument createCurveMembersDocument() {
        CurveMembersDocument result = CurveMembersDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateColorDocument createLanguageAnimateColorDocument() {
        org.w3.x2001.smil20.language.AnimateColorDocument result = org.w3.x2001.smil20.language.AnimateColorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateDocument createLanguageAnimateDocument() {
        org.w3.x2001.smil20.language.AnimateDocument result = org.w3.x2001.smil20.language.AnimateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateMotionDocument createLanguageAnimateMotionDocument() {
        org.w3.x2001.smil20.language.AnimateMotionDocument result = org.w3.x2001.smil20.language.AnimateMotionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.SetDocument createLanguageSetDocument() {
        org.w3.x2001.smil20.language.SetDocument result = org.w3.x2001.smil20.language.SetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x1999.xlink.ArcDocument createXLinkArcDocument() {
        org.w3.x1999.xlink.ArcDocument result = org.w3.x1999.xlink.ArcDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x1999.xlink.ArcType createXLinkArcType() {
        org.w3.x1999.xlink.ArcType result = org.w3.x1999.xlink.ArcType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x1999.xlink.LabelAttribute createXlinkLabelAttribute() {
        org.w3.x1999.xlink.LabelAttribute result = org.w3.x1999.xlink.LabelAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x1999.xlink.LabelType createXlinkLabelType() {
        org.w3.x1999.xlink.LabelType result = org.w3.x1999.xlink.LabelType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    @Override
    public org.w3.x1999.xlink.TypeAttribute createXlinkTypeAttribute() {
        org.w3.x1999.xlink.TypeAttribute result = org.w3.x1999.xlink.TypeAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }
}
