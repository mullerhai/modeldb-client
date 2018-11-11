/**
 * Generated by Scrooge
 *   version: 18.10.0
 *   rev: dda071e1412b53f4bfdebc19e474f584e475d475
 *   built at: 20181018-174244
 */
package modeldb

import com.twitter.io.Buf
import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob,
  ThriftException,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUtil,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport, TIOStreamTransport}
import java.io.ByteArrayInputStream
import java.nio.ByteBuffer
import java.util.Arrays
import java.util.concurrent.atomic.AtomicInteger
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object LinearModel extends ValidatingThriftStructCodec3[LinearModel] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("LinearModel")
  val InterceptTermField: TField = new TField("interceptTerm", TType.STRUCT, 1)
  val InterceptTermFieldManifest: Manifest[modeldb.LinearModelTerm] = implicitly[Manifest[modeldb.LinearModelTerm]]
  val FeatureTermsField: TField = new TField("featureTerms", TType.LIST, 2)
  val FeatureTermsFieldManifest: Manifest[Seq[modeldb.LinearModelTerm]] = implicitly[Manifest[Seq[modeldb.LinearModelTerm]]]
  val ObjectiveHistoryField: TField = new TField("objectiveHistory", TType.LIST, 3)
  val ObjectiveHistoryFieldManifest: Manifest[Seq[Double]] = implicitly[Manifest[Seq[Double]]]
  val RmseField: TField = new TField("rmse", TType.DOUBLE, 4)
  val RmseFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val ExplainedVarianceField: TField = new TField("explainedVariance", TType.DOUBLE, 5)
  val ExplainedVarianceFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val R2Field: TField = new TField("r2", TType.DOUBLE, 6)
  val R2FieldManifest: Manifest[Double] = implicitly[Manifest[Double]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      InterceptTermField,
      true,
      false,
      InterceptTermFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      FeatureTermsField,
      false,
      false,
      FeatureTermsFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[modeldb.LinearModelTerm]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ObjectiveHistoryField,
      true,
      false,
      ObjectiveHistoryFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[Double]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      RmseField,
      true,
      false,
      RmseFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ExplainedVarianceField,
      true,
      false,
      ExplainedVarianceFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      R2Field,
      true,
      false,
      R2FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: LinearModel): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: LinearModel): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.interceptTerm)
    buf ++= validateField(item.featureTerms)
    buf ++= validateField(item.objectiveHistory)
    buf ++= validateField(item.rmse)
    buf ++= validateField(item.explainedVariance)
    buf ++= validateField(item.r2)
    buf.toList
  }

  def withoutPassthroughFields(original: LinearModel): LinearModel =
    new Immutable(
      interceptTerm =
        {
          val field = original.interceptTerm
          field.map { field =>
            modeldb.LinearModelTerm.withoutPassthroughFields(field)
          }
        },
      featureTerms =
        {
          val field = original.featureTerms
          field.map { field =>
            modeldb.LinearModelTerm.withoutPassthroughFields(field)
          }
        },
      objectiveHistory =
        {
          val field = original.objectiveHistory
          field.map { field =>
            field.map { field =>
              field
            }
          }
        },
      rmse =
        {
          val field = original.rmse
          field.map { field =>
            field
          }
        },
      explainedVariance =
        {
          val field = original.explainedVariance
          field.map { field =>
            field
          }
        },
      r2 =
        {
          val field = original.r2
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: LinearModel, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): LinearModel = {

    var interceptTerm: Option[modeldb.LinearModelTerm] = None
    var featureTerms: Seq[modeldb.LinearModelTerm] = Seq[modeldb.LinearModelTerm]()
    var objectiveHistory: Option[Seq[Double]] = None
    var rmseOffset: Int = -1
    var explainedVarianceOffset: Int = -1
    var r2Offset: Int = -1

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                interceptTerm = Some(readInterceptTermValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'interceptTerm' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
    
                featureTerms = readFeatureTermsValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'featureTerms' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
    
                objectiveHistory = Some(readObjectiveHistoryValue(_iprot))
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'objectiveHistory' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
                rmseOffset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'rmse' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.DOUBLE =>
                explainedVarianceOffset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'explainedVariance' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.DOUBLE =>
                r2Offset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'r2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmseOffset,
      explainedVarianceOffset,
      r2Offset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): LinearModel =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): LinearModel = {
    var interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm] = _root_.scala.None
    var featureTerms: Seq[modeldb.LinearModelTerm] = Seq[modeldb.LinearModelTerm]()
    var objectiveHistory: _root_.scala.Option[Seq[Double]] = _root_.scala.None
    var rmse: _root_.scala.Option[Double] = _root_.scala.None
    var explainedVariance: _root_.scala.Option[Double] = _root_.scala.None
    var r2: _root_.scala.Option[Double] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
                interceptTerm = _root_.scala.Some(readInterceptTermValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'interceptTerm' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
                featureTerms = readFeatureTermsValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'featureTerms' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
                objectiveHistory = _root_.scala.Some(readObjectiveHistoryValue(_iprot))
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'objectiveHistory' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
                rmse = _root_.scala.Some(readRmseValue(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'rmse' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.DOUBLE =>
                explainedVariance = _root_.scala.Some(readExplainedVarianceValue(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'explainedVariance' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.DOUBLE =>
                r2 = _root_.scala.Some(readR2Value(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'r2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmse,
      explainedVariance,
      r2,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm] = _root_.scala.None,
    featureTerms: Seq[modeldb.LinearModelTerm] = Seq[modeldb.LinearModelTerm](),
    objectiveHistory: _root_.scala.Option[Seq[Double]] = _root_.scala.None,
    rmse: _root_.scala.Option[Double] = _root_.scala.None,
    explainedVariance: _root_.scala.Option[Double] = _root_.scala.None,
    r2: _root_.scala.Option[Double] = _root_.scala.None
  ): LinearModel =
    new Immutable(
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmse,
      explainedVariance,
      r2
    )

  def unapply(_item: LinearModel): _root_.scala.Option[_root_.scala.Tuple6[Option[modeldb.LinearModelTerm], Seq[modeldb.LinearModelTerm], Option[Seq[Double]], Option[Double], Option[Double], Option[Double]]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readInterceptTermValue(_iprot: TProtocol): modeldb.LinearModelTerm = {
    modeldb.LinearModelTerm.decode(_iprot)
  }

  @inline private def writeInterceptTermField(interceptTerm_item: modeldb.LinearModelTerm, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(InterceptTermField)
    writeInterceptTermValue(interceptTerm_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeInterceptTermValue(interceptTerm_item: modeldb.LinearModelTerm, _oprot: TProtocol): Unit = {
    interceptTerm_item.write(_oprot)
  }

  @inline private[modeldb] def readFeatureTermsValue(_iprot: TProtocol): Seq[modeldb.LinearModelTerm] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[modeldb.LinearModelTerm](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          modeldb.LinearModelTerm.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeFeatureTermsField(featureTerms_item: Seq[modeldb.LinearModelTerm], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(FeatureTermsField)
    writeFeatureTermsValue(featureTerms_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeFeatureTermsValue(featureTerms_item: Seq[modeldb.LinearModelTerm], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, featureTerms_item.size))
    featureTerms_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = featureTerms_item.size
        while (_i < _size) {
          val featureTerms_item_element = featureTerms_item(_i)
          featureTerms_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        featureTerms_item.foreach { featureTerms_item_element =>
          featureTerms_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[modeldb] def readObjectiveHistoryValue(_iprot: TProtocol): Seq[Double] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[Double](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          _iprot.readDouble()
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeObjectiveHistoryField(objectiveHistory_item: Seq[Double], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ObjectiveHistoryField)
    writeObjectiveHistoryValue(objectiveHistory_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeObjectiveHistoryValue(objectiveHistory_item: Seq[Double], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.DOUBLE, objectiveHistory_item.size))
    objectiveHistory_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = objectiveHistory_item.size
        while (_i < _size) {
          val objectiveHistory_item_element = objectiveHistory_item(_i)
          _oprot.writeDouble(objectiveHistory_item_element)
          _i += 1
        }
      case _ =>
        objectiveHistory_item.foreach { objectiveHistory_item_element =>
          _oprot.writeDouble(objectiveHistory_item_element)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[modeldb] def readRmseValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeRmseField(rmse_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(RmseField)
    writeRmseValue(rmse_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeRmseValue(rmse_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(rmse_item)
  }

  @inline private[modeldb] def readExplainedVarianceValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeExplainedVarianceField(explainedVariance_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ExplainedVarianceField)
    writeExplainedVarianceValue(explainedVariance_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExplainedVarianceValue(explainedVariance_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(explainedVariance_item)
  }

  @inline private[modeldb] def readR2Value(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeR2Field(r2_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(R2Field)
    writeR2Value(r2_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeR2Value(r2_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(r2_item)
  }


  object Immutable extends ThriftStructCodec3[LinearModel] {
    override def encode(_item: LinearModel, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): LinearModel = LinearModel.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[LinearModel] = LinearModel.metaData
  }

  /**
   * The default read-only implementation of LinearModel.  You typically should not need to
   * directly reference this class; instead, use the LinearModel.apply method to construct
   * new instances.
   */
  class Immutable(
      val interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm],
      val featureTerms: Seq[modeldb.LinearModelTerm],
      val objectiveHistory: _root_.scala.Option[Seq[Double]],
      val rmse: _root_.scala.Option[Double],
      val explainedVariance: _root_.scala.Option[Double],
      val r2: _root_.scala.Option[Double],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends LinearModel {
    def this(
      interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm] = _root_.scala.None,
      featureTerms: Seq[modeldb.LinearModelTerm] = Seq[modeldb.LinearModelTerm](),
      objectiveHistory: _root_.scala.Option[Seq[Double]] = _root_.scala.None,
      rmse: _root_.scala.Option[Double] = _root_.scala.None,
      explainedVariance: _root_.scala.Option[Double] = _root_.scala.None,
      r2: _root_.scala.Option[Double] = _root_.scala.None
    ) = this(
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmse,
      explainedVariance,
      r2,
      Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm],
      val featureTerms: Seq[modeldb.LinearModelTerm],
      val objectiveHistory: _root_.scala.Option[Seq[Double]],
      rmseOffset: Int,
      explainedVarianceOffset: Int,
      r2Offset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends LinearModel {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val rmse: _root_.scala.Option[Double] =
      if (rmseOffset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, rmseOffset))
      }
    lazy val explainedVariance: _root_.scala.Option[Double] =
      if (explainedVarianceOffset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, explainedVarianceOffset))
      }
    lazy val r2: _root_.scala.Option[Double] =
      if (r2Offset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, r2Offset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the LinearModel trait with additional state or
   * behavior and implement the read-only methods from LinearModel using an underlying
   * instance.
   */
  trait Proxy extends LinearModel {
    protected def _underlying_LinearModel: LinearModel
    override def interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm] = _underlying_LinearModel.interceptTerm
    override def featureTerms: Seq[modeldb.LinearModelTerm] = _underlying_LinearModel.featureTerms
    override def objectiveHistory: _root_.scala.Option[Seq[Double]] = _underlying_LinearModel.objectiveHistory
    override def rmse: _root_.scala.Option[Double] = _underlying_LinearModel.rmse
    override def explainedVariance: _root_.scala.Option[Double] = _underlying_LinearModel.explainedVariance
    override def r2: _root_.scala.Option[Double] = _underlying_LinearModel.r2
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_LinearModel._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.LinearModel.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait LinearModel
  extends ThriftStruct
  with _root_.scala.Product6[Option[modeldb.LinearModelTerm], Seq[modeldb.LinearModelTerm], Option[Seq[Double]], Option[Double], Option[Double], Option[Double]]
  with ValidatingThriftStruct[LinearModel]
  with java.io.Serializable
{
  import LinearModel._

  def interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm]
  def featureTerms: Seq[modeldb.LinearModelTerm]
  def objectiveHistory: _root_.scala.Option[Seq[Double]]
  def rmse: _root_.scala.Option[Double]
  def explainedVariance: _root_.scala.Option[Double]
  def r2: _root_.scala.Option[Double]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: _root_.scala.Option[modeldb.LinearModelTerm] = interceptTerm
  def _2: Seq[modeldb.LinearModelTerm] = featureTerms
  def _3: _root_.scala.Option[Seq[Double]] = objectiveHistory
  def _4: _root_.scala.Option[Double] = rmse
  def _5: _root_.scala.Option[Double] = explainedVariance
  def _6: _root_.scala.Option[Double] = r2

  def toTuple: _root_.scala.Tuple6[Option[modeldb.LinearModelTerm], Seq[modeldb.LinearModelTerm], Option[Seq[Double]], Option[Double], Option[Double], Option[Double]] = {
    (
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmse,
      explainedVariance,
      r2
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (interceptTerm.isDefined) {
                writeInterceptTermValue(interceptTerm.get, _oprot)
                _root_.scala.Some(LinearModel.InterceptTermField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (featureTerms ne null) {
                writeFeatureTermsValue(featureTerms, _oprot)
                _root_.scala.Some(LinearModel.FeatureTermsField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (objectiveHistory.isDefined) {
                writeObjectiveHistoryValue(objectiveHistory.get, _oprot)
                _root_.scala.Some(LinearModel.ObjectiveHistoryField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (rmse.isDefined) {
                writeRmseValue(rmse.get, _oprot)
                _root_.scala.Some(LinearModel.RmseField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (explainedVariance.isDefined) {
                writeExplainedVarianceValue(explainedVariance.get, _oprot)
                _root_.scala.Some(LinearModel.ExplainedVarianceField)
              } else {
                _root_.scala.None
              }
            case 6 =>
              if (r2.isDefined) {
                writeR2Value(r2.get, _oprot)
                _root_.scala.Some(LinearModel.R2Field)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): LinearModel = {
    var interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm] = this.interceptTerm
    var featureTerms: Seq[modeldb.LinearModelTerm] = this.featureTerms
    var objectiveHistory: _root_.scala.Option[Seq[Double]] = this.objectiveHistory
    var rmse: _root_.scala.Option[Double] = this.rmse
    var explainedVariance: _root_.scala.Option[Double] = this.explainedVariance
    var r2: _root_.scala.Option[Double] = this.r2
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        interceptTerm = _root_.scala.Some(readInterceptTermValue(_blob.read))
      case 2 =>
        featureTerms = readFeatureTermsValue(_blob.read)
      case 3 =>
        objectiveHistory = _root_.scala.Some(readObjectiveHistoryValue(_blob.read))
      case 4 =>
        rmse = _root_.scala.Some(readRmseValue(_blob.read))
      case 5 =>
        explainedVariance = _root_.scala.Some(readExplainedVarianceValue(_blob.read))
      case 6 =>
        r2 = _root_.scala.Some(readR2Value(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmse,
      explainedVariance,
      r2,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): LinearModel = {
    var interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm] = this.interceptTerm
    var featureTerms: Seq[modeldb.LinearModelTerm] = this.featureTerms
    var objectiveHistory: _root_.scala.Option[Seq[Double]] = this.objectiveHistory
    var rmse: _root_.scala.Option[Double] = this.rmse
    var explainedVariance: _root_.scala.Option[Double] = this.explainedVariance
    var r2: _root_.scala.Option[Double] = this.r2

    _fieldId match {
      case 1 =>
        interceptTerm = _root_.scala.None
      case 2 =>
        featureTerms = Seq[modeldb.LinearModelTerm]()
      case 3 =>
        objectiveHistory = _root_.scala.None
      case 4 =>
        rmse = _root_.scala.None
      case 5 =>
        explainedVariance = _root_.scala.None
      case 6 =>
        r2 = _root_.scala.None
      case _ =>
    }
    new Immutable(
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmse,
      explainedVariance,
      r2,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetInterceptTerm: LinearModel = unsetField(1)

  def unsetFeatureTerms: LinearModel = unsetField(2)

  def unsetObjectiveHistory: LinearModel = unsetField(3)

  def unsetRmse: LinearModel = unsetField(4)

  def unsetExplainedVariance: LinearModel = unsetField(5)

  def unsetR2: LinearModel = unsetField(6)


  override def write(_oprot: TProtocol): Unit = {
    LinearModel.validate(this)
    _oprot.writeStructBegin(Struct)
    if (interceptTerm.isDefined) writeInterceptTermField(interceptTerm.get, _oprot)
    if (featureTerms ne null) writeFeatureTermsField(featureTerms, _oprot)
    if (objectiveHistory.isDefined) writeObjectiveHistoryField(objectiveHistory.get, _oprot)
    if (rmse.isDefined) writeRmseField(rmse.get, _oprot)
    if (explainedVariance.isDefined) writeExplainedVarianceField(explainedVariance.get, _oprot)
    if (r2.isDefined) writeR2Field(r2.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    interceptTerm: _root_.scala.Option[modeldb.LinearModelTerm] = this.interceptTerm,
    featureTerms: Seq[modeldb.LinearModelTerm] = this.featureTerms,
    objectiveHistory: _root_.scala.Option[Seq[Double]] = this.objectiveHistory,
    rmse: _root_.scala.Option[Double] = this.rmse,
    explainedVariance: _root_.scala.Option[Double] = this.explainedVariance,
    r2: _root_.scala.Option[Double] = this.r2,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): LinearModel =
    new Immutable(
      interceptTerm,
      featureTerms,
      objectiveHistory,
      rmse,
      explainedVariance,
      r2,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[LinearModel]

  private def _equals(x: LinearModel, y: LinearModel): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[LinearModel])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 6

  override def productElement(n: Int): Any = n match {
    case 0 => this.interceptTerm
    case 1 => this.featureTerms
    case 2 => this.objectiveHistory
    case 3 => this.rmse
    case 4 => this.explainedVariance
    case 5 => this.r2
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "LinearModel"

  def _codec: ValidatingThriftStructCodec3[LinearModel] = LinearModel
}
