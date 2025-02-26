package ir.instruction;

import ir.core.IRValue;
import ir.core.IRVisitor;

public class IRAddInstruction extends IRInstruction {

    // Add instructions has two operands and produces a value
    public IRAddInstruction(IRValue operand1, IRValue operand2) {
        super();
        this.addOperand(operand1);
        this.addOperand(operand2);
        this.addResult(this.getBinaryOpResultType(operand1.getType(), operand2.getType()));
    }

    @Override
    public Object accept(IRVisitor<?> v) {
        return v.visitAddInstruction(this);
    }

}
