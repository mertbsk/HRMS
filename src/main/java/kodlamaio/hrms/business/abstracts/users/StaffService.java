package kodlamaio.hrms.business.abstracts.users;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.users.Staff;

import java.util.List;

public interface StaffService {

    DataResult<List<Staff>> getAll();

    Result add(Staff staff);
}
