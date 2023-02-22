package functions.defined;

import datatypes.IntData;
import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;

@SuppressWarnings("serial")
public class PlusNine extends GPNode {
	
	public String toString() { return "plus9"; }

	public int expectedChildren() { return 9; }

	public void eval(final EvolutionState state,
                 final int thread,
                 final GPData input,
                 final ADFStack stack,
                 final GPIndividual individual,
                 final Problem problem) {
	    int result = 0;
	    IntData rd = ((IntData)(input));
	
	    for (int i = 0; i < children.length; i++) {
	    	children[i].eval(state,thread,input,stack,individual,problem);
	    	result += rd.x;
	    }
	    
	    rd.x = result;
	    
    }
}

