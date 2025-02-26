package ir.core;

import ir.instruction.IRAddInstruction;
import ir.instruction.IRAllocaInstruction;
import ir.instruction.IRCompareGtInstruction;
import ir.instruction.IRCompareLtInstruction;
import ir.instruction.IRConstantInstruction;
import ir.instruction.IRDivInstruction;
import ir.instruction.IRFunctionCallInstruction;
import ir.instruction.IRGetElementPtrInstruction;
import ir.instruction.IRLoadInstruction;
import ir.instruction.IRMulInstruction;
import ir.instruction.IRStoreInstruction;
import ir.instruction.IRSubInstruction;
import ir.terminator.IRCondBr;
import ir.terminator.IRGoto;
import ir.terminator.IRReturn;

public abstract class IRVisitor<T> {

    public abstract T visitTopLevel(IRTopLevel t);

    public abstract T visitFunction(IRFunction f);

    public abstract T visitBlock(IRBlock b);

    public abstract T visitPhiOperation(IRPhiOperation p);

    public abstract T visitAddInstruction(IRAddInstruction i);

    public abstract T visitSubInstruction(IRSubInstruction i);
    
    public abstract T visitMulInstruction(IRMulInstruction i);

    public abstract T visitDivInstruction(IRDivInstruction i);

    public abstract T visitAllocaInstruction(IRAllocaInstruction i);

    public abstract T visitGetElementPtrInstruction(IRGetElementPtrInstruction i);

    public abstract T visitLoadInstruction(IRLoadInstruction i);

    public abstract T visitStoreInstruction(IRStoreInstruction i);

    public abstract T visitFunctionCall(IRFunctionCallInstruction i);

    public abstract T visitConstantInstruction(IRConstantInstruction<?> i);

    public abstract T visitGotoTerminator(IRGoto g);

    public abstract T visitCondBr(IRCondBr b);

    public abstract T visitReturnTerminator(IRReturn r);
    
    public abstract T visitCompareLtInstruction(IRCompareLtInstruction c);

    public abstract T visitCompareGtInstruction(IRCompareGtInstruction c);

}
