package br.com.filipetietbohl.certification.modules.student.useCases;

import org.springframework.stereotype.Service;

import br.com.filipetietbohl.certification.modules.student.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
  
  public boolean execute(VerifyHasCertificationDTO dto){
    if (dto.getEmail().equals("pedro@hotmail.com") && dto.getTechnology().equals("java")){
      return true;
    }
    return false;
  }
  
}
