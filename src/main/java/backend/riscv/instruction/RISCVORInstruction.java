package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVORInstruction extends RISCVInstruction {
    public RISCVORInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.OR, List.of(rs1, rs2));
        addResult();
    }
}
