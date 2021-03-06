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


object Experiment extends ValidatingThriftStructCodec3[Experiment] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("Experiment")
  val IdField: TField = new TField("id", TType.I32, 1)
  val IdFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]
  val ProjectIdField: TField = new TField("projectId", TType.I32, 2)
  val ProjectIdFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]
  val NameField: TField = new TField("name", TType.STRING, 3)
  val NameFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val DescriptionField: TField = new TField("description", TType.STRING, 4)
  val DescriptionFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val IsDefaultField: TField = new TField("isDefault", TType.BOOL, 5)
  val IsDefaultFieldManifest: Manifest[Boolean] = implicitly[Manifest[Boolean]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      IdField,
      false,
      false,
      IdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      Some[Int](-1)
    ),
    new ThriftStructFieldInfo(
      ProjectIdField,
      false,
      false,
      ProjectIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
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
      DescriptionField,
      false,
      false,
      DescriptionFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      IsDefaultField,
      false,
      false,
      IsDefaultFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      Some[Boolean](false)
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: Experiment): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: Experiment): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.id)
    buf ++= validateField(item.projectId)
    buf ++= validateField(item.name)
    buf ++= validateField(item.description)
    buf ++= validateField(item.isDefault)
    buf.toList
  }

  def withoutPassthroughFields(original: Experiment): Experiment =
    new Immutable(
      id =
        {
          val field = original.id
          field
        },
      projectId =
        {
          val field = original.projectId
          field
        },
      name =
        {
          val field = original.name
          field
        },
      description =
        {
          val field = original.description
          field
        },
      isDefault =
        {
          val field = original.isDefault
          field
        }
    )

  override def encode(_item: Experiment, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): Experiment = {

    var id: Int = -1
    var projectId: Int = 0
    var nameOffset: Int = -1
    var descriptionOffset: Int = -1
    var isDefault: Boolean = false

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
              case TType.I32 =>
    
                id = readIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I32 =>
    
                projectId = readProjectIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'projectId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
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
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                descriptionOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'description' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.BOOL =>
    
                isDefault = readIsDefaultValue(_iprot)
              case _actualType =>
                val _expectedType = TType.BOOL
                throw new TProtocolException(
                  "Received wrong type for field 'isDefault' (expected=%s, actual=%s).".format(
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
      id,
      projectId,
      nameOffset,
      descriptionOffset,
      isDefault,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): Experiment =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): Experiment = {
    var id: Int = -1
    var projectId: Int = 0
    var name: String = null
    var description: String = null
    var isDefault: Boolean = false
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
              case TType.I32 =>
                id = readIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I32 =>
                projectId = readProjectIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'projectId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
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
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                description = readDescriptionValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'description' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.BOOL =>
                isDefault = readIsDefaultValue(_iprot)
              case _actualType =>
                val _expectedType = TType.BOOL
                throw new TProtocolException(
                  "Received wrong type for field 'isDefault' (expected=%s, actual=%s).".format(
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
      id,
      projectId,
      name,
      description,
      isDefault,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    id: Int = -1,
    projectId: Int,
    name: String,
    description: String,
    isDefault: Boolean = false
  ): Experiment =
    new Immutable(
      id,
      projectId,
      name,
      description,
      isDefault
    )

  def unapply(_item: Experiment): _root_.scala.Option[_root_.scala.Tuple5[Int, Int, String, String, Boolean]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readIdValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeIdField(id_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(IdField)
    writeIdValue(id_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeIdValue(id_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(id_item)
  }

  @inline private[modeldb] def readProjectIdValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeProjectIdField(projectId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ProjectIdField)
    writeProjectIdValue(projectId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeProjectIdValue(projectId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(projectId_item)
  }

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

  @inline private[modeldb] def readDescriptionValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeDescriptionField(description_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(DescriptionField)
    writeDescriptionValue(description_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeDescriptionValue(description_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(description_item)
  }

  @inline private[modeldb] def readIsDefaultValue(_iprot: TProtocol): Boolean = {
    _iprot.readBool()
  }

  @inline private def writeIsDefaultField(isDefault_item: Boolean, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(IsDefaultField)
    writeIsDefaultValue(isDefault_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeIsDefaultValue(isDefault_item: Boolean, _oprot: TProtocol): Unit = {
    _oprot.writeBool(isDefault_item)
  }


  object Immutable extends ThriftStructCodec3[Experiment] {
    override def encode(_item: Experiment, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): Experiment = Experiment.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[Experiment] = Experiment.metaData
  }

  /**
   * The default read-only implementation of Experiment.  You typically should not need to
   * directly reference this class; instead, use the Experiment.apply method to construct
   * new instances.
   */
  class Immutable(
      val id: Int,
      val projectId: Int,
      val name: String,
      val description: String,
      val isDefault: Boolean,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Experiment {
    def this(
      id: Int = -1,
      projectId: Int,
      name: String,
      description: String,
      isDefault: Boolean = false
    ) = this(
      id,
      projectId,
      name,
      description,
      isDefault,
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
      val id: Int,
      val projectId: Int,
      nameOffset: Int,
      descriptionOffset: Int,
      val isDefault: Boolean,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Experiment {

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
    lazy val description: String =
      if (descriptionOffset == -1)
        null
      else {
        _proto.decodeString(_buf, descriptionOffset)
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
   * This Proxy trait allows you to extend the Experiment trait with additional state or
   * behavior and implement the read-only methods from Experiment using an underlying
   * instance.
   */
  trait Proxy extends Experiment {
    protected def _underlying_Experiment: Experiment
    override def id: Int = _underlying_Experiment.id
    override def projectId: Int = _underlying_Experiment.projectId
    override def name: String = _underlying_Experiment.name
    override def description: String = _underlying_Experiment.description
    override def isDefault: Boolean = _underlying_Experiment.isDefault
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_Experiment._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.Experiment.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait Experiment
  extends ThriftStruct
  with _root_.scala.Product5[Int, Int, String, String, Boolean]
  with ValidatingThriftStruct[Experiment]
  with java.io.Serializable
{
  import Experiment._

  def id: Int
  def projectId: Int
  def name: String
  def description: String
  def isDefault: Boolean

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: Int = id
  def _2: Int = projectId
  def _3: String = name
  def _4: String = description
  def _5: Boolean = isDefault

  def toTuple: _root_.scala.Tuple5[Int, Int, String, String, Boolean] = {
    (
      id,
      projectId,
      name,
      description,
      isDefault
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
              if (true) {
                writeIdValue(id, _oprot)
                _root_.scala.Some(Experiment.IdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (true) {
                writeProjectIdValue(projectId, _oprot)
                _root_.scala.Some(Experiment.ProjectIdField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (name ne null) {
                writeNameValue(name, _oprot)
                _root_.scala.Some(Experiment.NameField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (description ne null) {
                writeDescriptionValue(description, _oprot)
                _root_.scala.Some(Experiment.DescriptionField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (true) {
                writeIsDefaultValue(isDefault, _oprot)
                _root_.scala.Some(Experiment.IsDefaultField)
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
  def setField(_blob: TFieldBlob): Experiment = {
    var id: Int = this.id
    var projectId: Int = this.projectId
    var name: String = this.name
    var description: String = this.description
    var isDefault: Boolean = this.isDefault
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        id = readIdValue(_blob.read)
      case 2 =>
        projectId = readProjectIdValue(_blob.read)
      case 3 =>
        name = readNameValue(_blob.read)
      case 4 =>
        description = readDescriptionValue(_blob.read)
      case 5 =>
        isDefault = readIsDefaultValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      id,
      projectId,
      name,
      description,
      isDefault,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): Experiment = {
    var id: Int = this.id
    var projectId: Int = this.projectId
    var name: String = this.name
    var description: String = this.description
    var isDefault: Boolean = this.isDefault

    _fieldId match {
      case 1 =>
        id = -1
      case 2 =>
        projectId = 0
      case 3 =>
        name = null
      case 4 =>
        description = null
      case 5 =>
        isDefault = false
      case _ =>
    }
    new Immutable(
      id,
      projectId,
      name,
      description,
      isDefault,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetId: Experiment = unsetField(1)

  def unsetProjectId: Experiment = unsetField(2)

  def unsetName: Experiment = unsetField(3)

  def unsetDescription: Experiment = unsetField(4)

  def unsetIsDefault: Experiment = unsetField(5)


  override def write(_oprot: TProtocol): Unit = {
    Experiment.validate(this)
    _oprot.writeStructBegin(Struct)
    writeIdField(id, _oprot)
    writeProjectIdField(projectId, _oprot)
    if (name ne null) writeNameField(name, _oprot)
    if (description ne null) writeDescriptionField(description, _oprot)
    writeIsDefaultField(isDefault, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    id: Int = this.id,
    projectId: Int = this.projectId,
    name: String = this.name,
    description: String = this.description,
    isDefault: Boolean = this.isDefault,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): Experiment =
    new Immutable(
      id,
      projectId,
      name,
      description,
      isDefault,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[Experiment]

  private def _equals(x: Experiment, y: Experiment): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[Experiment])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 5

  override def productElement(n: Int): Any = n match {
    case 0 => this.id
    case 1 => this.projectId
    case 2 => this.name
    case 3 => this.description
    case 4 => this.isDefault
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "Experiment"

  def _codec: ValidatingThriftStructCodec3[Experiment] = Experiment
}

