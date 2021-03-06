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


object ModelAncestryResponse extends ValidatingThriftStructCodec3[ModelAncestryResponse] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("ModelAncestryResponse")
  val ModelIdField: TField = new TField("modelId", TType.I32, 1)
  val ModelIdFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]
  val FitEventField: TField = new TField("fitEvent", TType.STRUCT, 2)
  val FitEventFieldManifest: Manifest[modeldb.FitEvent] = implicitly[Manifest[modeldb.FitEvent]]
  val TransformEventsField: TField = new TField("transformEvents", TType.LIST, 3)
  val TransformEventsFieldManifest: Manifest[Seq[modeldb.TransformEvent]] = implicitly[Manifest[Seq[modeldb.TransformEvent]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      ModelIdField,
      false,
      false,
      ModelIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      FitEventField,
      false,
      false,
      FitEventFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      TransformEventsField,
      false,
      false,
      TransformEventsFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[modeldb.TransformEvent]]),
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
  def validate(_item: ModelAncestryResponse): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: ModelAncestryResponse): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.modelId)
    buf ++= validateField(item.fitEvent)
    buf ++= validateField(item.transformEvents)
    buf.toList
  }

  def withoutPassthroughFields(original: ModelAncestryResponse): ModelAncestryResponse =
    new Immutable(
      modelId =
        {
          val field = original.modelId
          field
        },
      fitEvent =
        {
          val field = original.fitEvent
          modeldb.FitEvent.withoutPassthroughFields(field)
        },
      transformEvents =
        {
          val field = original.transformEvents
          field.map { field =>
            modeldb.TransformEvent.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: ModelAncestryResponse, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): ModelAncestryResponse = {

    var modelId: Int = 0
    var fitEvent: modeldb.FitEvent = null
    var transformEvents: Seq[modeldb.TransformEvent] = Seq[modeldb.TransformEvent]()

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
    
                modelId = readModelIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'modelId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                fitEvent = readFitEventValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'fitEvent' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
    
                transformEvents = readTransformEventsValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'transformEvents' (expected=%s, actual=%s).".format(
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
      modelId,
      fitEvent,
      transformEvents,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): ModelAncestryResponse =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): ModelAncestryResponse = {
    var modelId: Int = 0
    var fitEvent: modeldb.FitEvent = null
    var transformEvents: Seq[modeldb.TransformEvent] = Seq[modeldb.TransformEvent]()
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
                modelId = readModelIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'modelId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
                fitEvent = readFitEventValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'fitEvent' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
                transformEvents = readTransformEventsValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'transformEvents' (expected=%s, actual=%s).".format(
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
      modelId,
      fitEvent,
      transformEvents,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    modelId: Int,
    fitEvent: modeldb.FitEvent,
    transformEvents: Seq[modeldb.TransformEvent] = Seq[modeldb.TransformEvent]()
  ): ModelAncestryResponse =
    new Immutable(
      modelId,
      fitEvent,
      transformEvents
    )

  def unapply(_item: ModelAncestryResponse): _root_.scala.Option[_root_.scala.Tuple3[Int, modeldb.FitEvent, Seq[modeldb.TransformEvent]]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readModelIdValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeModelIdField(modelId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ModelIdField)
    writeModelIdValue(modelId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeModelIdValue(modelId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(modelId_item)
  }

  @inline private[modeldb] def readFitEventValue(_iprot: TProtocol): modeldb.FitEvent = {
    modeldb.FitEvent.decode(_iprot)
  }

  @inline private def writeFitEventField(fitEvent_item: modeldb.FitEvent, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(FitEventField)
    writeFitEventValue(fitEvent_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeFitEventValue(fitEvent_item: modeldb.FitEvent, _oprot: TProtocol): Unit = {
    fitEvent_item.write(_oprot)
  }

  @inline private[modeldb] def readTransformEventsValue(_iprot: TProtocol): Seq[modeldb.TransformEvent] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[modeldb.TransformEvent](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          modeldb.TransformEvent.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeTransformEventsField(transformEvents_item: Seq[modeldb.TransformEvent], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TransformEventsField)
    writeTransformEventsValue(transformEvents_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTransformEventsValue(transformEvents_item: Seq[modeldb.TransformEvent], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, transformEvents_item.size))
    transformEvents_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = transformEvents_item.size
        while (_i < _size) {
          val transformEvents_item_element = transformEvents_item(_i)
          transformEvents_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        transformEvents_item.foreach { transformEvents_item_element =>
          transformEvents_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }


  object Immutable extends ThriftStructCodec3[ModelAncestryResponse] {
    override def encode(_item: ModelAncestryResponse, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): ModelAncestryResponse = ModelAncestryResponse.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[ModelAncestryResponse] = ModelAncestryResponse.metaData
  }

  /**
   * The default read-only implementation of ModelAncestryResponse.  You typically should not need to
   * directly reference this class; instead, use the ModelAncestryResponse.apply method to construct
   * new instances.
   */
  class Immutable(
      val modelId: Int,
      val fitEvent: modeldb.FitEvent,
      val transformEvents: Seq[modeldb.TransformEvent],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ModelAncestryResponse {
    def this(
      modelId: Int,
      fitEvent: modeldb.FitEvent,
      transformEvents: Seq[modeldb.TransformEvent] = Seq[modeldb.TransformEvent]()
    ) = this(
      modelId,
      fitEvent,
      transformEvents,
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
      val modelId: Int,
      val fitEvent: modeldb.FitEvent,
      val transformEvents: Seq[modeldb.TransformEvent],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ModelAncestryResponse {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
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
   * This Proxy trait allows you to extend the ModelAncestryResponse trait with additional state or
   * behavior and implement the read-only methods from ModelAncestryResponse using an underlying
   * instance.
   */
  trait Proxy extends ModelAncestryResponse {
    protected def _underlying_ModelAncestryResponse: ModelAncestryResponse
    override def modelId: Int = _underlying_ModelAncestryResponse.modelId
    override def fitEvent: modeldb.FitEvent = _underlying_ModelAncestryResponse.fitEvent
    override def transformEvents: Seq[modeldb.TransformEvent] = _underlying_ModelAncestryResponse.transformEvents
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_ModelAncestryResponse._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.ModelAncestryResponse.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait ModelAncestryResponse
  extends ThriftStruct
  with _root_.scala.Product3[Int, modeldb.FitEvent, Seq[modeldb.TransformEvent]]
  with ValidatingThriftStruct[ModelAncestryResponse]
  with java.io.Serializable
{
  import ModelAncestryResponse._

  def modelId: Int
  def fitEvent: modeldb.FitEvent
  def transformEvents: Seq[modeldb.TransformEvent]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: Int = modelId
  def _2: modeldb.FitEvent = fitEvent
  def _3: Seq[modeldb.TransformEvent] = transformEvents

  def toTuple: _root_.scala.Tuple3[Int, modeldb.FitEvent, Seq[modeldb.TransformEvent]] = {
    (
      modelId,
      fitEvent,
      transformEvents
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
                writeModelIdValue(modelId, _oprot)
                _root_.scala.Some(ModelAncestryResponse.ModelIdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (fitEvent ne null) {
                writeFitEventValue(fitEvent, _oprot)
                _root_.scala.Some(ModelAncestryResponse.FitEventField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (transformEvents ne null) {
                writeTransformEventsValue(transformEvents, _oprot)
                _root_.scala.Some(ModelAncestryResponse.TransformEventsField)
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
  def setField(_blob: TFieldBlob): ModelAncestryResponse = {
    var modelId: Int = this.modelId
    var fitEvent: modeldb.FitEvent = this.fitEvent
    var transformEvents: Seq[modeldb.TransformEvent] = this.transformEvents
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        modelId = readModelIdValue(_blob.read)
      case 2 =>
        fitEvent = readFitEventValue(_blob.read)
      case 3 =>
        transformEvents = readTransformEventsValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      modelId,
      fitEvent,
      transformEvents,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): ModelAncestryResponse = {
    var modelId: Int = this.modelId
    var fitEvent: modeldb.FitEvent = this.fitEvent
    var transformEvents: Seq[modeldb.TransformEvent] = this.transformEvents

    _fieldId match {
      case 1 =>
        modelId = 0
      case 2 =>
        fitEvent = null
      case 3 =>
        transformEvents = Seq[modeldb.TransformEvent]()
      case _ =>
    }
    new Immutable(
      modelId,
      fitEvent,
      transformEvents,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetModelId: ModelAncestryResponse = unsetField(1)

  def unsetFitEvent: ModelAncestryResponse = unsetField(2)

  def unsetTransformEvents: ModelAncestryResponse = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    ModelAncestryResponse.validate(this)
    _oprot.writeStructBegin(Struct)
    writeModelIdField(modelId, _oprot)
    if (fitEvent ne null) writeFitEventField(fitEvent, _oprot)
    if (transformEvents ne null) writeTransformEventsField(transformEvents, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    modelId: Int = this.modelId,
    fitEvent: modeldb.FitEvent = this.fitEvent,
    transformEvents: Seq[modeldb.TransformEvent] = this.transformEvents,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): ModelAncestryResponse =
    new Immutable(
      modelId,
      fitEvent,
      transformEvents,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ModelAncestryResponse]

  private def _equals(x: ModelAncestryResponse, y: ModelAncestryResponse): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[ModelAncestryResponse])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.modelId
    case 1 => this.fitEvent
    case 2 => this.transformEvents
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "ModelAncestryResponse"

  def _codec: ValidatingThriftStructCodec3[ModelAncestryResponse] = ModelAncestryResponse
}

