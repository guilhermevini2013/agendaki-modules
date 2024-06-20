package com.agendaki.financially.api.dtos.bankSlip;

import java.util.Map;

public record BankSlipDTO(String due_date, Map<String, String> instruction_lines, HolderDTO holder) {
}
