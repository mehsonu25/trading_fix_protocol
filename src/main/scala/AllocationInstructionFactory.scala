import allocation_model.AllocationInstructionModel
import quickfix.field.Quantity
import quickfix.fix44.AllocationInstruction

object AllocationInstructionFactory {
  
  def createNewAllocationInstruction(allocationInstruction: AllocationInstructionModel): AllocationInstruction =
    val ai = new AllocationInstruction()
    ai.set(new Quantity(allocationInstruction.quantity.value))
    ai

}
