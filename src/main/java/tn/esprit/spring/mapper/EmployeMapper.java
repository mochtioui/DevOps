package tn.esprit.spring.mapper;


import tn.esprit.spring.dto.ContratDTO;
import tn.esprit.spring.dto.EmployeDTO;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;



public class EmployeMapper {

private EmployeMapper() {
		
	}
	
	public static Employe toEntity(EmployeDTO employeDto) {
		
		Contrat contrat = ContratMapper.toEntity(employeDto.getContrat());
		Employe employe = new Employe();
		
		employe.setEmail(employeDto.getEmail());
		employe.setPassword(employeDto.getPassword());
		employe.setPrenom(employeDto.getPrenom());
		employe.setActif(employeDto.isActif());
		employe.setContrat(contrat);
		employe.setEmail(employe.getEmail());
		employe.setNom(employe.getNom());
		employe.setId(employe.getId());
		employe.setRole(employe.getRole());
				return employe;
	
	}
	
	
	public static EmployeDTO toDto(Employe employe) {
		ContratDTO contrat = ContratMapper.toDto(employe.getContrat());
		return EmployeDTO.builder()
				.email(employe.getEmail())
				.password(employe.getPassword())
				.prenom(employe.getPrenom())
				.actif(employe.isActif())
				.contrat(contrat)
				.email(employe.getEmail())
				.nom(employe.getNom())
				.id(employe.getId())
				.role(employe.getRole())
				.build();
		
	
	}
	
	
	
	
	
	
}
