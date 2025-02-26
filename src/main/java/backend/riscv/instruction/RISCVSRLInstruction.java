package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSRLInstruction extends RISCVInstruction {
    public RISCVSRLInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.SRL, List.of(rs1, rs2));
        addResult();
    }
}
