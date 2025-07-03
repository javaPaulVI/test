

public class CPU{

	public CPU(){

	}
	/** Calls step() for each tick and gives the program instructions as parameters
	 * @return 
	 */
	public Iterator<Result<?> run(){
		return iterator(y -> {
        	for (instruction : program.getInstructions()){
			Result<> result = step(instruction[0], instruction[1], instruction[2], instruction[3]);
			y.yield(result)
		}});

	}
	
	p Result<?> step(byte opCode, byte arg1, byte arg2, byte tick_or_address){
		// Check for callstack (implement)

		byte input1 = 0;
		byte input2 = 0;

		Bit[] opCodeArray = BitOperations.byteToBit(opCode)

		if (opCodeArray[7].get() == 1){
			input1 = arg1;
			opCodeArray[7] = new Bit(0)
		}  else {
			if({0,1,2,3,4,5}.contain((int)arg2)){
				input1 = registers[arg1].getValue();
			}
			switch((int) opCode){
				case 6:
					input1 = counter.getValue();
					break;
				case 7:
					input1 = in.next()
				case 8:
					ram.setIndex(registers[4].getValue());
					input1 = ram.load();
					break;
				case 9:
					input1=stack.pop()
			}
		}
		

		if (opCodeArray[6].get() == 1){
			input2 = arg2;
		
		} else {
			if({0,1,2,3,4,5}.contain((int)arg2)){
				input2 = registers[arg2].getValue();
			}
			switch((int) opCode){
				case 6:
					input2 = counter.getValue();
					break;
				case 7:
					input2 = in.next()
				case 8:
					ram.setIndex(registers[4].getValue());
					input2 = ram.load();
					break;
			}
		}

		if (opCodeArray[6].get() == 1){
			boolean comp = BitOperations.bytetobits(alu.compute(opcode))[1].get() == 1 ? true : false;
			if (comp){
				counter.setValue(tick_or_adress)
				return Ok<>(true)
			}
			return Ok<>(false)
		}
		
		
			
	}
}

