import allocation_model.{AllocationInstructionModel, Quantity}

object Main extends App:
  Console.out.println("Hello World")
  
  private val allocationInstructionModel = AllocationInstructionModel(Quantity(10d))
  private val createNewAllocation = AllocationInstructionFactory.createNewAllocationInstruction(allocationInstructionModel)
  Console.out.println(createNewAllocation)