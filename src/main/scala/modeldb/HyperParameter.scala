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


object HyperParameter extends ValidatingThriftStructCodec3[HyperParameter] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("HyperParameter")
  val NameField: TField = new TField("name", TType.STRING, 1)
  val NameFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val ValueField: TField = new TField("value", TType.STRING, 2)
  val ValueFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val TypeField: TField = new TField("type", TType.STRING, 3)
  val TypeFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val MinField: TField = new TField("min", TType.DOUBLE, 4)
  val MinFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val MaxField: TField = new TField("max", TType.DOUBLE, 5)
  val MaxFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      NameField,
      false,
      false,
      NameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ValueField,
      false,
      false,
      ValueFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      TypeField,
      false,
      false,
      TypeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      MinField,
      false,
      false,
      MinFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      MaxField,
      false,
      false,
      MaxFieldManifest,
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
  def validate(_item: HyperParameter): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: HyperParameter): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.name)
    buf ++= validateField(item.value)
    buf ++= validateField(item.`type`)
    buf ++= validateField(item.min)
    buf ++= validateField(item.max)
    buf.toList
  }

  def withoutPassthroughFields(original: HyperParameter): HyperParameter =
    new Immutable(
      name =
        {
          val field = original.name
          field
        },
      value =
        {
          val field = original.value
          field
        },
      `type` =
        {
          val field = original.`type`
          field
        },
      min =
        {
          val field = original.min
          field
        },
      max =
        {
          val field = original.max
          field
        }
    )

  override def encode(_item: HyperParameter, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): HyperParameter = {

    var nameOffset: Int = -1
    var valueOffset: Int = -1
    var typeOffset: Int = -1
    var min: Double = 0.0
    var max: Double = 0.0

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
                nameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                valueOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'value' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                typeOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field '`type`' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
    
                min = readMinValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'min' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.DOUBLE =>
    
                max = readMaxValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'max' (expected=%s, actual=%s).".format(
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
      nameOffset,
      valueOffset,
      typeOffset,
      min,
      max,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): HyperParameter =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): HyperParameter = {
    var name: String = null
    var value: String = null
    var `type`: String = null
    var min: Double = 0.0
    var max: Double = 0.0
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
                name = readNameValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                value = readValueValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'value' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                `type` = readTypeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field '`type`' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
                min = readMinValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'min' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.DOUBLE =>
                max = readMaxValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'max' (expected=%s, actual=%s).".format(
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
      name,
      value,
      `type`,
      min,
      max,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    name: String,
    value: String,
    `type`: String,
    min: Double,
    max: Double
  ): HyperParameter =
    new Immutable(
      name,
      value,
      `type`,
      min,
      max
    )

  def unapply(_item: HyperParameter): _root_.scala.Option[_root_.scala.Tuple5[String, String, String, Double, Double]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeNameField(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(NameField)
    writeNameValue(name_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeNameValue(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(name_item)
  }

  @inline private[modeldb] def readValueValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeValueField(value_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ValueField)
    writeValueValue(value_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeValueValue(value_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(value_item)
  }

  @inline private[modeldb] def readTypeValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeTypeField(type_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TypeField)
    writeTypeValue(type_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTypeValue(type_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(type_item)
  }

  @inline private[modeldb] def readMinValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeMinField(min_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MinField)
    writeMinValue(min_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMinValue(min_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(min_item)
  }

  @inline private[modeldb] def readMaxValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeMaxField(max_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MaxField)
    writeMaxValue(max_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMaxValue(max_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(max_item)
  }


  object Immutable extends ThriftStructCodec3[HyperParameter] {
    override def encode(_item: HyperParameter, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): HyperParameter = HyperParameter.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[HyperParameter] = HyperParameter.metaData
  }

  /**
   * The default read-only implementation of HyperParameter.  You typically should not need to
   * directly reference this class; instead, use the HyperParameter.apply method to construct
   * new instances.
   */
  class Immutable(
      val name: String,
      val value: String,
      val `type`: String,
      val min: Double,
      val max: Double,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends HyperParameter {
    def this(
      name: String,
      value: String,
      `type`: String,
      min: Double,
      max: Double
    ) = this(
      name,
      value,
      `type`,
      min,
      max,
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
      nameOffset: Int,
      valueOffset: Int,
      typeOffset: Int,
      val min: Double,
      val max: Double,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends HyperParameter {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val name: String =
      if (nameOffset == -1)
        null
      else {
        _proto.decodeString(_buf, nameOffset)
      }
    lazy val value: String =
      if (valueOffset == -1)
        null
      else {
        _proto.decodeString(_buf, valueOffset)
      }
    lazy val `type`: String =
      if (typeOffset == -1)
        null
      else {
        _proto.decodeString(_buf, typeOffset)
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
   * This Proxy trait allows you to extend the HyperParameter trait with additional state or
   * behavior and implement the read-only methods from HyperParameter using an underlying
   * instance.
   */
  trait Proxy extends HyperParameter {
    protected def _underlying_HyperParameter: HyperParameter
    override def name: String = _underlying_HyperParameter.name
    override def value: String = _underlying_HyperParameter.value
    override def `type`: String = _underlying_HyperParameter.`type`
    override def min: Double = _underlying_HyperParameter.min
    override def max: Double = _underlying_HyperParameter.max
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_HyperParameter._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.HyperParameter.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait HyperParameter
  extends ThriftStruct
  with _root_.scala.Product5[String, String, String, Double, Double]
  with ValidatingThriftStruct[HyperParameter]
  with java.io.Serializable
{
  import HyperParameter._

  def name: String
  def value: String
  def `type`: String
  def min: Double
  def max: Double

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: String = name
  def _2: String = value
  def _3: String = `type`
  def _4: Double = min
  def _5: Double = max

  def toTuple: _root_.scala.Tuple5[String, String, String, Double, Double] = {
    (
      name,
      value,
      `type`,
      min,
      max
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
              if (name ne null) {
                writeNameValue(name, _oprot)
                _root_.scala.Some(HyperParameter.NameField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (value ne null) {
                writeValueValue(value, _oprot)
                _root_.scala.Some(HyperParameter.ValueField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (`type` ne null) {
                writeTypeValue(`type`, _oprot)
                _root_.scala.Some(HyperParameter.TypeField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (true) {
                writeMinValue(min, _oprot)
                _root_.scala.Some(HyperParameter.MinField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (true) {
                writeMaxValue(max, _oprot)
                _root_.scala.Some(HyperParameter.MaxField)
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
  def setField(_blob: TFieldBlob): HyperParameter = {
    var name: String = this.name
    var value: String = this.value
    var `type`: String = this.`type`
    var min: Double = this.min
    var max: Double = this.max
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        name = readNameValue(_blob.read)
      case 2 =>
        value = readValueValue(_blob.read)
      case 3 =>
        `type` = readTypeValue(_blob.read)
      case 4 =>
        min = readMinValue(_blob.read)
      case 5 =>
        max = readMaxValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      name,
      value,
      `type`,
      min,
      max,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): HyperParameter = {
    var name: String = this.name
    var value: String = this.value
    var `type`: String = this.`type`
    var min: Double = this.min
    var max: Double = this.max

    _fieldId match {
      case 1 =>
        name = null
      case 2 =>
        value = null
      case 3 =>
        `type` = null
      case 4 =>
        min = 0.0
      case 5 =>
        max = 0.0
      case _ =>
    }
    new Immutable(
      name,
      value,
      `type`,
      min,
      max,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetName: HyperParameter = unsetField(1)

  def unsetValue: HyperParameter = unsetField(2)

  def unsetType: HyperParameter = unsetField(3)

  def unsetMin: HyperParameter = unsetField(4)

  def unsetMax: HyperParameter = unsetField(5)


  override def write(_oprot: TProtocol): Unit = {
    HyperParameter.validate(this)
    _oprot.writeStructBegin(Struct)
    if (name ne null) writeNameField(name, _oprot)
    if (value ne null) writeValueField(value, _oprot)
    if (`type` ne null) writeTypeField(`type`, _oprot)
    writeMinField(min, _oprot)
    writeMaxField(max, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    name: String = this.name,
    value: String = this.value,
    `type`: String = this.`type`,
    min: Double = this.min,
    max: Double = this.max,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): HyperParameter =
    new Immutable(
      name,
      value,
      `type`,
      min,
      max,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[HyperParameter]

  private def _equals(x: HyperParameter, y: HyperParameter): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[HyperParameter])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 5

  override def productElement(n: Int): Any = n match {
    case 0 => this.name
    case 1 => this.value
    case 2 => this.`type`
    case 3 => this.min
    case 4 => this.max
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "HyperParameter"

  def _codec: ValidatingThriftStructCodec3[HyperParameter] = HyperParameter
}

