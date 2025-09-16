package allocation_model

trait Field
case class Quantity(value: Double) extends Field

trait FixMessage

case class AllocationInstructionModel(quantity: Quantity) extends FixMessage