/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.prueba2.clinica.dao;

import com.lp2.prueba2.clinica.modelo.Receta;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcelo Esperguel
 */
public interface RecetaDAO extends CrudRepository<Receta, Integer> {
   
    public List<Receta> findByIdMedico(int id);

    public List<Receta> findByIdPaciente(int id);

    public List<Receta> findByIdMedicoAndIdPaciente(int idMedico,int idPaciente);
    
    public Receta findById(int id);
}
