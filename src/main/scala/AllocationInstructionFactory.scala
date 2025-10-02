import allocation_model.AllocationInstructionModel
import quickfix.field.{Quantity, Side}
import quickfix.fix44.AllocationInstruction

object AllocationInstructionFactory {
  
  def createNewAllocationInstruction(allocationInstruction: AllocationInstructionModel): AllocationInstruction =
    val ai = new AllocationInstruction()
    ai.set(new Quantity(allocationInstruction.quantity.value))
    ai.set(mkSide(allocationInstruction.side))
    ai
    
  private def mkSide(side: allocation_model.Side): Side =
    side match {
      case allocation_model.Buy => new Side('1')
      case allocation_model.Sell => new Side('2')
    } 
}
