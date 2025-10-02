import allocation_model.{AllocationInstructionModel, Buy, Quantity}

object Main extends App:
  Console.out.println("Hello World")

  private val allocationInstructionModel = AllocationInstructionModel(Quantity(10d), Buy)
  private val createNewAllocation = AllocationInstructionFactory.createNewAllocationInstruction(allocationInstructionModel)
  Console.out.println(createNewAllocation)