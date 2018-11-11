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


object FeatureImportanceComparison extends ValidatingThriftStructCodec3[FeatureImportanceComparison] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("FeatureImportanceComparison")
  val FeatureNameField: TField = new TField("featureName", TType.STRING, 1)
  val FeatureNameFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val PercentileRankInModel1Field: TField = new TField("percentileRankInModel1", TType.DOUBLE, 2)
  val PercentileRankInModel1FieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val PercentileRankInModel2Field: TField = new TField("percentileRankInModel2", TType.DOUBLE, 3)
  val PercentileRankInModel2FieldManifest: Manifest[Double] = implicitly[Manifest[Double]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      FeatureNameField,
      false,
      false,
      FeatureNameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      PercentileRankInModel1Field,
      true,
      false,
      PercentileRankInModel1FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      PercentileRankInModel2Field,
      true,
      false,
      PercentileRankInModel2FieldManifest,
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
  def validate(_item: FeatureImportanceComparison): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: FeatureImportanceComparison): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.featureName)
    buf ++= validateField(item.percentileRankInModel1)
    buf ++= validateField(item.percentileRankInModel2)
    buf.toList
  }

  def withoutPassthroughFields(original: FeatureImportanceComparison): FeatureImportanceComparison =
    new Immutable(
      featureName =
        {
          val field = original.featureName
          field
        },
      percentileRankInModel1 =
        {
          val field = original.percentileRankInModel1
          field.map { field =>
            field
          }
        },
      percentileRankInModel2 =
        {
          val field = original.percentileRankInModel2
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: FeatureImportanceComparison, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): FeatureImportanceComparison = {

    var featureNameOffset: Int = -1
    var percentileRankInModel1Offset: Int = -1
    var percentileRankInModel2Offset: Int = -1

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
              case TType.STRING =>
                featureNameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'featureName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.DOUBLE =>
                percentileRankInModel1Offset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'percentileRankInModel1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.DOUBLE =>
                percentileRankInModel2Offset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'percentileRankInModel2' (expected=%s, actual=%s).".format(
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
      featureNameOffset,
      percentileRankInModel1Offset,
      percentileRankInModel2Offset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): FeatureImportanceComparison =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): FeatureImportanceComparison = {
    var featureName: String = null
    var percentileRankInModel1: _root_.scala.Option[Double] = _root_.scala.None
    var percentileRankInModel2: _root_.scala.Option[Double] = _root_.scala.None
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
              case TType.STRING =>
                featureName = readFeatureNameValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'featureName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.DOUBLE =>
                percentileRankInModel1 = _root_.scala.Some(readPercentileRankInModel1Value(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'percentileRankInModel1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.DOUBLE =>
                percentileRankInModel2 = _root_.scala.Some(readPercentileRankInModel2Value(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'percentileRankInModel2' (expected=%s, actual=%s).".format(
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
      featureName,
      percentileRankInModel1,
      percentileRankInModel2,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    featureName: String,
    percentileRankInModel1: _root_.scala.Option[Double] = _root_.scala.None,
    percentileRankInModel2: _root_.scala.Option[Double] = _root_.scala.None
  ): FeatureImportanceComparison =
    new Immutable(
      featureName,
      percentileRankInModel1,
      percentileRankInModel2
    )

  def unapply(_item: FeatureImportanceComparison): _root_.scala.Option[_root_.scala.Tuple3[String, Option[Double], Option[Double]]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readFeatureNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeFeatureNameField(featureName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(FeatureNameField)
    writeFeatureNameValue(featureName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeFeatureNameValue(featureName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(featureName_item)
  }

  @inline private[modeldb] def readPercentileRankInModel1Value(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writePercentileRankInModel1Field(percentileRankInModel1_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PercentileRankInModel1Field)
    writePercentileRankInModel1Value(percentileRankInModel1_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePercentileRankInModel1Value(percentileRankInModel1_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(percentileRankInModel1_item)
  }

  @inline private[modeldb] def readPercentileRankInModel2Value(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writePercentileRankInModel2Field(percentileRankInModel2_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PercentileRankInModel2Field)
    writePercentileRankInModel2Value(percentileRankInModel2_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePercentileRankInModel2Value(percentileRankInModel2_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(percentileRankInModel2_item)
  }


  object Immutable extends ThriftStructCodec3[FeatureImportanceComparison] {
    override def encode(_item: FeatureImportanceComparison, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): FeatureImportanceComparison = FeatureImportanceComparison.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[FeatureImportanceComparison] = FeatureImportanceComparison.metaData
  }

  /**
   * The default read-only implementation of FeatureImportanceComparison.  You typically should not need to
   * directly reference this class; instead, use the FeatureImportanceComparison.apply method to construct
   * new instances.
   */
  class Immutable(
      val featureName: String,
      val percentileRankInModel1: _root_.scala.Option[Double],
      val percentileRankInModel2: _root_.scala.Option[Double],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends FeatureImportanceComparison {
    def this(
      featureName: String,
      percentileRankInModel1: _root_.scala.Option[Double] = _root_.scala.None,
      percentileRankInModel2: _root_.scala.Option[Double] = _root_.scala.None
    ) = this(
      featureName,
      percentileRankInModel1,
      percentileRankInModel2,
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
      featureNameOffset: Int,
      percentileRankInModel1Offset: Int,
      percentileRankInModel2Offset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends FeatureImportanceComparison {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val featureName: String =
      if (featureNameOffset == -1)
        null
      else {
        _proto.decodeString(_buf, featureNameOffset)
      }
    lazy val percentileRankInModel1: _root_.scala.Option[Double] =
      if (percentileRankInModel1Offset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, percentileRankInModel1Offset))
      }
    lazy val percentileRankInModel2: _root_.scala.Option[Double] =
      if (percentileRankInModel2Offset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, percentileRankInModel2Offset))
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
   * This Proxy trait allows you to extend the FeatureImportanceComparison trait with additional state or
   * behavior and implement the read-only methods from FeatureImportanceComparison using an underlying
   * instance.
   */
  trait Proxy extends FeatureImportanceComparison {
    protected def _underlying_FeatureImportanceComparison: FeatureImportanceComparison
    override def featureName: String = _underlying_FeatureImportanceComparison.featureName
    override def percentileRankInModel1: _root_.scala.Option[Double] = _underlying_FeatureImportanceComparison.percentileRankInModel1
    override def percentileRankInModel2: _root_.scala.Option[Double] = _underlying_FeatureImportanceComparison.percentileRankInModel2
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_FeatureImportanceComparison._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.FeatureImportanceComparison.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait FeatureImportanceComparison
  extends ThriftStruct
  with _root_.scala.Product3[String, Option[Double], Option[Double]]
  with ValidatingThriftStruct[FeatureImportanceComparison]
  with java.io.Serializable
{
  import FeatureImportanceComparison._

  def featureName: String
  def percentileRankInModel1: _root_.scala.Option[Double]
  def percentileRankInModel2: _root_.scala.Option[Double]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: String = featureName
  def _2: _root_.scala.Option[Double] = percentileRankInModel1
  def _3: _root_.scala.Option[Double] = percentileRankInModel2

  def toTuple: _root_.scala.Tuple3[String, Option[Double], Option[Double]] = {
    (
      featureName,
      percentileRankInModel1,
      percentileRankInModel2
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
              if (featureName ne null) {
                writeFeatureNameValue(featureName, _oprot)
                _root_.scala.Some(FeatureImportanceComparison.FeatureNameField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (percentileRankInModel1.isDefined) {
                writePercentileRankInModel1Value(percentileRankInModel1.get, _oprot)
                _root_.scala.Some(FeatureImportanceComparison.PercentileRankInModel1Field)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (percentileRankInModel2.isDefined) {
                writePercentileRankInModel2Value(percentileRankInModel2.get, _oprot)
                _root_.scala.Some(FeatureImportanceComparison.PercentileRankInModel2Field)
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
  def setField(_blob: TFieldBlob): FeatureImportanceComparison = {
    var featureName: String = this.featureName
    var percentileRankInModel1: _root_.scala.Option[Double] = this.percentileRankInModel1
    var percentileRankInModel2: _root_.scala.Option[Double] = this.percentileRankInModel2
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        featureName = readFeatureNameValue(_blob.read)
      case 2 =>
        percentileRankInModel1 = _root_.scala.Some(readPercentileRankInModel1Value(_blob.read))
      case 3 =>
        percentileRankInModel2 = _root_.scala.Some(readPercentileRankInModel2Value(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      featureName,
      percentileRankInModel1,
      percentileRankInModel2,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): FeatureImportanceComparison = {
    var featureName: String = this.featureName
    var percentileRankInModel1: _root_.scala.Option[Double] = this.percentileRankInModel1
    var percentileRankInModel2: _root_.scala.Option[Double] = this.percentileRankInModel2

    _fieldId match {
      case 1 =>
        featureName = null
      case 2 =>
        percentileRankInModel1 = _root_.scala.None
      case 3 =>
        percentileRankInModel2 = _root_.scala.None
      case _ =>
    }
    new Immutable(
      featureName,
      percentileRankInModel1,
      percentileRankInModel2,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetFeatureName: FeatureImportanceComparison = unsetField(1)

  def unsetPercentileRankInModel1: FeatureImportanceComparison = unsetField(2)

  def unsetPercentileRankInModel2: FeatureImportanceComparison = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    FeatureImportanceComparison.validate(this)
    _oprot.writeStructBegin(Struct)
    if (featureName ne null) writeFeatureNameField(featureName, _oprot)
    if (percentileRankInModel1.isDefined) writePercentileRankInModel1Field(percentileRankInModel1.get, _oprot)
    if (percentileRankInModel2.isDefined) writePercentileRankInModel2Field(percentileRankInModel2.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    featureName: String = this.featureName,
    percentileRankInModel1: _root_.scala.Option[Double] = this.percentileRankInModel1,
    percentileRankInModel2: _root_.scala.Option[Double] = this.percentileRankInModel2,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): FeatureImportanceComparison =
    new Immutable(
      featureName,
      percentileRankInModel1,
      percentileRankInModel2,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[FeatureImportanceComparison]

  private def _equals(x: FeatureImportanceComparison, y: FeatureImportanceComparison): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[FeatureImportanceComparison])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.featureName
    case 1 => this.percentileRankInModel1
    case 2 => this.percentileRankInModel2
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "FeatureImportanceComparison"

  def _codec: ValidatingThriftStructCodec3[FeatureImportanceComparison] = FeatureImportanceComparison
}
