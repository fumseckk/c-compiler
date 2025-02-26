package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVXORInstruction extends RISCVInstruction {
    public RISCVXORInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.XOR, List.of(rs1, rs2));
        addResult();
    }
}
