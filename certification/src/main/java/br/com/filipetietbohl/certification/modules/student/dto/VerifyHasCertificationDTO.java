package br.com.filipetietbohl.certification.modules.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VerifyHasCertificationDTO {
  private String email;
  private String technology;

}
