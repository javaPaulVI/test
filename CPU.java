

public class CPU{

	public Generator run(Generator generator){
		
		for (instruction : program.getInstructions()){
			generator.add(step())	
		}
	}
	
	private Result<?> step(byte opCode, byte arg1, byte arg2, byte tick_or_address){
		// Check for callstack

		byte input1 = 0;
		byte input2 = 0;

		Bit[] opCodeArray = BitOperations.byteToBit(opCode)

		if (opCodeArray[7].get() == 1){
			input1 = arg1;
		} else {
			if({0,1,2,3,4,5}.contain(arg1){
				input1 = registers[1].getValue();
			}

		}
		

		if (opCodeArray[6].get() == 1){
			input2 = arg2;
		
		} else {
			if({0,1,2,3,4,5}.contain(arg2){
				input2 = registers[1].getValue();
			}		
		}

		if (opCodeArray[6].get() == 1){
			boolean comp = BitOperations.bytetobits(alu.compute(opcode))[1].get() == 1 ? true : false;
			if (comp){
				counter.setValue(tick_or_adress)
				return Ok<>(true)
			}
		}
		
		
			
	}
}
