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


object ResourceNotFoundException extends ValidatingThriftStructCodec3[ResourceNotFoundException] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("ResourceNotFoundException")
  val MessageField: TField = new TField("message", TType.STRING, 1)
  val MessageFieldManifest: Manifest[String] = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      MessageField,
      false,
      false,
      MessageFieldManifest,
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
  def validate(_item: ResourceNotFoundException): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: ResourceNotFoundException): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.message)
    buf.toList
  }

  def withoutPassthroughFields(original: ResourceNotFoundException): ResourceNotFoundException =
    new ResourceNotFoundException(
      message =
        {
          val field = original.message
          field
        }
    )

  override def encode(_item: ResourceNotFoundException, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  override def decode(_iprot: TProtocol): ResourceNotFoundException = {
    var message: String = null
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
                message = readMessageValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'message' (expected=%s, actual=%s).".format(
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

    new ResourceNotFoundException(
      message,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    message: String
  ): ResourceNotFoundException =
    new ResourceNotFoundException(
      message
    )

  def unapply(_item: ResourceNotFoundException): _root_.scala.Option[String] = _root_.scala.Some(_item.message)


  @inline private[modeldb] def readMessageValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeMessageField(message_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MessageField)
    writeMessageValue(message_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMessageValue(message_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(message_item)
  }


}

/**
 * Prefer the companion object's [[modeldb.ResourceNotFoundException.apply]]
 * for construction if you don't need to specify passthrough or
 * flags.
 */
class ResourceNotFoundException(
    val message: String,
    val _passthroughFields: immutable$Map[Short, TFieldBlob])
  extends ThriftException with ThriftStruct
  with _root_.scala.Product1[String]
  with ValidatingThriftStruct[ResourceNotFoundException]
  with java.io.Serializable
{
  import ResourceNotFoundException._

  def this(
    message: String
  ) = this(
    message,
    Map.empty
  )

  def _1: String = message


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
              if (message ne null) {
                writeMessageValue(message, _oprot)
                _root_.scala.Some(ResourceNotFoundException.MessageField)
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
  def setField(_blob: TFieldBlob): ResourceNotFoundException = {
    var message: String = this.message
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        message = readMessageValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new ResourceNotFoundException(
      message,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): ResourceNotFoundException = {
    var message: String = this.message

    _fieldId match {
      case 1 =>
        message = null
      case _ =>
    }
    new ResourceNotFoundException(
      message,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetMessage: ResourceNotFoundException = unsetField(1)


  override def write(_oprot: TProtocol): Unit = {
    ResourceNotFoundException.validate(this)
    _oprot.writeStructBegin(Struct)
    if (message ne null) writeMessageField(message, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    message: String = this.message,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): ResourceNotFoundException =
    new ResourceNotFoundException(
      message,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ResourceNotFoundException]

  private def _equals(x: ResourceNotFoundException, y: ResourceNotFoundException): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[ResourceNotFoundException])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)

  override def getMessage: String = String.valueOf(message)

  override def productArity: Int = 1

  override def productElement(n: Int): Any = n match {
    case 0 => this.message
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "ResourceNotFoundException"

  def _codec: ValidatingThriftStructCodec3[ResourceNotFoundException] = ResourceNotFoundException
}

