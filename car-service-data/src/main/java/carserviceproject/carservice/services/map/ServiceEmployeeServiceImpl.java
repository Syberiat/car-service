package carserviceproject.carservice.services.map;

import carserviceproject.carservice.models.ServiceEmployee;
import carserviceproject.carservice.services.ServiceEmployeeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ServiceEmployeeServiceImpl extends AbstractServiceMap<ServiceEmployee, Long> implements ServiceEmployeeService {


    @Override
    public ServiceEmployee findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<ServiceEmployee> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public ServiceEmployee save(ServiceEmployee object) {
        return super.save(object);
    }

    @Override
    public void delete(ServiceEmployee object) {
        super.delete(object);
    }
}
