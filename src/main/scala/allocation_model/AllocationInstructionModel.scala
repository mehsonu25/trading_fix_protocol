package allocation_model

trait Field
case class Quantity(value: Double) extends Field

trait Side extends Field
case object Buy extends Side
case object Sell extends Side

trait FixMessage

case class AllocationInstructionModel(quantity: Quantity, side: Side) extends FixMessage