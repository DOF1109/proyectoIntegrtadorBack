package com.odontologia.ClinicaOdontologica.service;

import com.odontologia.ClinicaOdontologica.dao.OdontologoDAOH2;
import com.odontologia.ClinicaOdontologica.dao.iDao;
import com.odontologia.ClinicaOdontologica.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService {
    // Relacion de asociacion que hay entre el service y el DAO correspondiente
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao = new OdontologoDAOH2();
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }

    public Odontologo buscarOdontologo(Integer id){
        return odontologoiDao.buscar(id);
    }

    public List<Odontologo> listarOdontologos(){
        return odontologoiDao.buscarTodos();
    }

}
