package pe.edu.upc.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.spring.model.TrabajadorOficio;
import pe.edu.upc.spring.repository.ITrabajadorOficioRepository;
import pe.edu.upc.spring.service.ITrabajadorOficioService;

@Service
public class TrabajadorOficioServiceImpl implements ITrabajadorOficioService {
	
	@Autowired
	private ITrabajadorOficioRepository dTrabajadorOficio;

	@Override
	@Transactional
	public boolean insertar(TrabajadorOficio trabajadorOficio) {
		TrabajadorOficio objTrabajadorOficio = dTrabajadorOficio.save(trabajadorOficio);
		if (objTrabajadorOficio != null) return true;
		return false;
	}

	@Override
	@Transactional
	public boolean modificar(TrabajadorOficio trabajadorOficio) {
		boolean flag = false;
		try {
			dTrabajadorOficio.save(trabajadorOficio);
			flag = true;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return flag;
	}

	@Override
	@Transactional
	public void eliminar(int idTrabajadorOficio) {
		dTrabajadorOficio.deleteById(idTrabajadorOficio);		
	}

	@Override
	public Optional<TrabajadorOficio> buscarId(int idTrabajadorOficio) {
		return dTrabajadorOficio.findById(idTrabajadorOficio);
	}

	@Override
	public Optional<TrabajadorOficio> listarId(int idTrabajadorOficio) {
		return dTrabajadorOficio.findById(idTrabajadorOficio);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TrabajadorOficio> listar() {
		return dTrabajadorOficio.findAll();
	}

	@Override
	public List<TrabajadorOficio> buscarCuentaTrabajador(String cuentaUsuario) {
		return dTrabajadorOficio.buscarCuentaTrabajador(cuentaUsuario);
	}

	@Override
	public List<TrabajadorOficio> buscarOficio(String nombreOficio) {
		// TODO Auto-generated method stub
		return dTrabajadorOficio.buscarOficio(nombreOficio);
	}
	
}
