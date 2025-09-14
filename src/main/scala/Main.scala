object Main extends App:
  Console.out.println("Hello World")
  
  private val createNewAllocation = AllocationInstructionFactory.createNewAllocationInstruction
  Console.out.println(createNewAllocation)