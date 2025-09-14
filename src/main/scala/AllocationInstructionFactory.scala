import quickfix.field.Quantity
import quickfix.fix44.AllocationInstruction

object AllocationInstructionFactory {
  
  def createNewAllocationInstruction: AllocationInstruction = {
    val ai = new AllocationInstruction()
    ai.set(new Quantity(10d))
    ai
  }
}
