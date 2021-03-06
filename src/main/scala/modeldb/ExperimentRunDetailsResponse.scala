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


object ExperimentRunDetailsResponse extends ValidatingThriftStructCodec3[ExperimentRunDetailsResponse] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("ExperimentRunDetailsResponse")
  val ProjectField: TField = new TField("project", TType.STRUCT, 1)
  val ProjectFieldManifest: Manifest[modeldb.Project] = implicitly[Manifest[modeldb.Project]]
  val ExperimentField: TField = new TField("experiment", TType.STRUCT, 2)
  val ExperimentFieldManifest: Manifest[modeldb.Experiment] = implicitly[Manifest[modeldb.Experiment]]
  val ExperimentRunField: TField = new TField("experimentRun", TType.STRUCT, 3)
  val ExperimentRunFieldManifest: Manifest[modeldb.ExperimentRun] = implicitly[Manifest[modeldb.ExperimentRun]]
  val ModelResponsesField: TField = new TField("modelResponses", TType.LIST, 4)
  val ModelResponsesFieldManifest: Manifest[Seq[modeldb.ModelResponse]] = implicitly[Manifest[Seq[modeldb.ModelResponse]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      ProjectField,
      false,
      false,
      ProjectFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ExperimentField,
      false,
      false,
      ExperimentFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ExperimentRunField,
      false,
      false,
      ExperimentRunFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ModelResponsesField,
      false,
      false,
      ModelResponsesFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[modeldb.ModelResponse]]),
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
  def validate(_item: ExperimentRunDetailsResponse): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: ExperimentRunDetailsResponse): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.project)
    buf ++= validateField(item.experiment)
    buf ++= validateField(item.experimentRun)
    buf ++= validateField(item.modelResponses)
    buf.toList
  }

  def withoutPassthroughFields(original: ExperimentRunDetailsResponse): ExperimentRunDetailsResponse =
    new Immutable(
      project =
        {
          val field = original.project
          modeldb.Project.withoutPassthroughFields(field)
        },
      experiment =
        {
          val field = original.experiment
          modeldb.Experiment.withoutPassthroughFields(field)
        },
      experimentRun =
        {
          val field = original.experimentRun
          modeldb.ExperimentRun.withoutPassthroughFields(field)
        },
      modelResponses =
        {
          val field = original.modelResponses
          field.map { field =>
            modeldb.ModelResponse.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: ExperimentRunDetailsResponse, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): ExperimentRunDetailsResponse = {

    var project: modeldb.Project = null
    var experiment: modeldb.Experiment = null
    var experimentRun: modeldb.ExperimentRun = null
    var modelResponses: Seq[modeldb.ModelResponse] = Seq[modeldb.ModelResponse]()

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
    
                project = readProjectValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'project' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                experiment = readExperimentValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'experiment' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                experimentRun = readExperimentRunValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'experimentRun' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.LIST =>
    
                modelResponses = readModelResponsesValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'modelResponses' (expected=%s, actual=%s).".format(
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
      project,
      experiment,
      experimentRun,
      modelResponses,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): ExperimentRunDetailsResponse =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): ExperimentRunDetailsResponse = {
    var project: modeldb.Project = null
    var experiment: modeldb.Experiment = null
    var experimentRun: modeldb.ExperimentRun = null
    var modelResponses: Seq[modeldb.ModelResponse] = Seq[modeldb.ModelResponse]()
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
                project = readProjectValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'project' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
                experiment = readExperimentValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'experiment' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRUCT =>
                experimentRun = readExperimentRunValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'experimentRun' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.LIST =>
                modelResponses = readModelResponsesValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'modelResponses' (expected=%s, actual=%s).".format(
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
      project,
      experiment,
      experimentRun,
      modelResponses,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    project: modeldb.Project,
    experiment: modeldb.Experiment,
    experimentRun: modeldb.ExperimentRun,
    modelResponses: Seq[modeldb.ModelResponse] = Seq[modeldb.ModelResponse]()
  ): ExperimentRunDetailsResponse =
    new Immutable(
      project,
      experiment,
      experimentRun,
      modelResponses
    )

  def unapply(_item: ExperimentRunDetailsResponse): _root_.scala.Option[_root_.scala.Tuple4[modeldb.Project, modeldb.Experiment, modeldb.ExperimentRun, Seq[modeldb.ModelResponse]]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readProjectValue(_iprot: TProtocol): modeldb.Project = {
    modeldb.Project.decode(_iprot)
  }

  @inline private def writeProjectField(project_item: modeldb.Project, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ProjectField)
    writeProjectValue(project_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeProjectValue(project_item: modeldb.Project, _oprot: TProtocol): Unit = {
    project_item.write(_oprot)
  }

  @inline private[modeldb] def readExperimentValue(_iprot: TProtocol): modeldb.Experiment = {
    modeldb.Experiment.decode(_iprot)
  }

  @inline private def writeExperimentField(experiment_item: modeldb.Experiment, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ExperimentField)
    writeExperimentValue(experiment_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExperimentValue(experiment_item: modeldb.Experiment, _oprot: TProtocol): Unit = {
    experiment_item.write(_oprot)
  }

  @inline private[modeldb] def readExperimentRunValue(_iprot: TProtocol): modeldb.ExperimentRun = {
    modeldb.ExperimentRun.decode(_iprot)
  }

  @inline private def writeExperimentRunField(experimentRun_item: modeldb.ExperimentRun, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ExperimentRunField)
    writeExperimentRunValue(experimentRun_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExperimentRunValue(experimentRun_item: modeldb.ExperimentRun, _oprot: TProtocol): Unit = {
    experimentRun_item.write(_oprot)
  }

  @inline private[modeldb] def readModelResponsesValue(_iprot: TProtocol): Seq[modeldb.ModelResponse] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[modeldb.ModelResponse](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          modeldb.ModelResponse.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeModelResponsesField(modelResponses_item: Seq[modeldb.ModelResponse], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ModelResponsesField)
    writeModelResponsesValue(modelResponses_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeModelResponsesValue(modelResponses_item: Seq[modeldb.ModelResponse], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, modelResponses_item.size))
    modelResponses_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = modelResponses_item.size
        while (_i < _size) {
          val modelResponses_item_element = modelResponses_item(_i)
          modelResponses_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        modelResponses_item.foreach { modelResponses_item_element =>
          modelResponses_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }


  object Immutable extends ThriftStructCodec3[ExperimentRunDetailsResponse] {
    override def encode(_item: ExperimentRunDetailsResponse, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): ExperimentRunDetailsResponse = ExperimentRunDetailsResponse.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[ExperimentRunDetailsResponse] = ExperimentRunDetailsResponse.metaData
  }

  /**
   * The default read-only implementation of ExperimentRunDetailsResponse.  You typically should not need to
   * directly reference this class; instead, use the ExperimentRunDetailsResponse.apply method to construct
   * new instances.
   */
  class Immutable(
      val project: modeldb.Project,
      val experiment: modeldb.Experiment,
      val experimentRun: modeldb.ExperimentRun,
      val modelResponses: Seq[modeldb.ModelResponse],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ExperimentRunDetailsResponse {
    def this(
      project: modeldb.Project,
      experiment: modeldb.Experiment,
      experimentRun: modeldb.ExperimentRun,
      modelResponses: Seq[modeldb.ModelResponse] = Seq[modeldb.ModelResponse]()
    ) = this(
      project,
      experiment,
      experimentRun,
      modelResponses,
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
      val project: modeldb.Project,
      val experiment: modeldb.Experiment,
      val experimentRun: modeldb.ExperimentRun,
      val modelResponses: Seq[modeldb.ModelResponse],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ExperimentRunDetailsResponse {

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
   * This Proxy trait allows you to extend the ExperimentRunDetailsResponse trait with additional state or
   * behavior and implement the read-only methods from ExperimentRunDetailsResponse using an underlying
   * instance.
   */
  trait Proxy extends ExperimentRunDetailsResponse {
    protected def _underlying_ExperimentRunDetailsResponse: ExperimentRunDetailsResponse
    override def project: modeldb.Project = _underlying_ExperimentRunDetailsResponse.project
    override def experiment: modeldb.Experiment = _underlying_ExperimentRunDetailsResponse.experiment
    override def experimentRun: modeldb.ExperimentRun = _underlying_ExperimentRunDetailsResponse.experimentRun
    override def modelResponses: Seq[modeldb.ModelResponse] = _underlying_ExperimentRunDetailsResponse.modelResponses
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_ExperimentRunDetailsResponse._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.ExperimentRunDetailsResponse.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait ExperimentRunDetailsResponse
  extends ThriftStruct
  with _root_.scala.Product4[modeldb.Project, modeldb.Experiment, modeldb.ExperimentRun, Seq[modeldb.ModelResponse]]
  with ValidatingThriftStruct[ExperimentRunDetailsResponse]
  with java.io.Serializable
{
  import ExperimentRunDetailsResponse._

  def project: modeldb.Project
  def experiment: modeldb.Experiment
  def experimentRun: modeldb.ExperimentRun
  def modelResponses: Seq[modeldb.ModelResponse]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: modeldb.Project = project
  def _2: modeldb.Experiment = experiment
  def _3: modeldb.ExperimentRun = experimentRun
  def _4: Seq[modeldb.ModelResponse] = modelResponses

  def toTuple: _root_.scala.Tuple4[modeldb.Project, modeldb.Experiment, modeldb.ExperimentRun, Seq[modeldb.ModelResponse]] = {
    (
      project,
      experiment,
      experimentRun,
      modelResponses
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
              if (project ne null) {
                writeProjectValue(project, _oprot)
                _root_.scala.Some(ExperimentRunDetailsResponse.ProjectField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (experiment ne null) {
                writeExperimentValue(experiment, _oprot)
                _root_.scala.Some(ExperimentRunDetailsResponse.ExperimentField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (experimentRun ne null) {
                writeExperimentRunValue(experimentRun, _oprot)
                _root_.scala.Some(ExperimentRunDetailsResponse.ExperimentRunField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (modelResponses ne null) {
                writeModelResponsesValue(modelResponses, _oprot)
                _root_.scala.Some(ExperimentRunDetailsResponse.ModelResponsesField)
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
  def setField(_blob: TFieldBlob): ExperimentRunDetailsResponse = {
    var project: modeldb.Project = this.project
    var experiment: modeldb.Experiment = this.experiment
    var experimentRun: modeldb.ExperimentRun = this.experimentRun
    var modelResponses: Seq[modeldb.ModelResponse] = this.modelResponses
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        project = readProjectValue(_blob.read)
      case 2 =>
        experiment = readExperimentValue(_blob.read)
      case 3 =>
        experimentRun = readExperimentRunValue(_blob.read)
      case 4 =>
        modelResponses = readModelResponsesValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      project,
      experiment,
      experimentRun,
      modelResponses,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): ExperimentRunDetailsResponse = {
    var project: modeldb.Project = this.project
    var experiment: modeldb.Experiment = this.experiment
    var experimentRun: modeldb.ExperimentRun = this.experimentRun
    var modelResponses: Seq[modeldb.ModelResponse] = this.modelResponses

    _fieldId match {
      case 1 =>
        project = null
      case 2 =>
        experiment = null
      case 3 =>
        experimentRun = null
      case 4 =>
        modelResponses = Seq[modeldb.ModelResponse]()
      case _ =>
    }
    new Immutable(
      project,
      experiment,
      experimentRun,
      modelResponses,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetProject: ExperimentRunDetailsResponse = unsetField(1)

  def unsetExperiment: ExperimentRunDetailsResponse = unsetField(2)

  def unsetExperimentRun: ExperimentRunDetailsResponse = unsetField(3)

  def unsetModelResponses: ExperimentRunDetailsResponse = unsetField(4)


  override def write(_oprot: TProtocol): Unit = {
    ExperimentRunDetailsResponse.validate(this)
    _oprot.writeStructBegin(Struct)
    if (project ne null) writeProjectField(project, _oprot)
    if (experiment ne null) writeExperimentField(experiment, _oprot)
    if (experimentRun ne null) writeExperimentRunField(experimentRun, _oprot)
    if (modelResponses ne null) writeModelResponsesField(modelResponses, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    project: modeldb.Project = this.project,
    experiment: modeldb.Experiment = this.experiment,
    experimentRun: modeldb.ExperimentRun = this.experimentRun,
    modelResponses: Seq[modeldb.ModelResponse] = this.modelResponses,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): ExperimentRunDetailsResponse =
    new Immutable(
      project,
      experiment,
      experimentRun,
      modelResponses,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ExperimentRunDetailsResponse]

  private def _equals(x: ExperimentRunDetailsResponse, y: ExperimentRunDetailsResponse): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[ExperimentRunDetailsResponse])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 4

  override def productElement(n: Int): Any = n match {
    case 0 => this.project
    case 1 => this.experiment
    case 2 => this.experimentRun
    case 3 => this.modelResponses
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "ExperimentRunDetailsResponse"

  def _codec: ValidatingThriftStructCodec3[ExperimentRunDetailsResponse] = ExperimentRunDetailsResponse
}

