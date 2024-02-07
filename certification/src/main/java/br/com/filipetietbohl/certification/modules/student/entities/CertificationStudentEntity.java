package br.com.filipetietbohl.certification.modules.student.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
  
  private UUID Student_id;
  private UUID id;
  private String technology;
  private int grate;
  List<AnswersCertificationsEntity> AnswersCertificationsEntity;
}
