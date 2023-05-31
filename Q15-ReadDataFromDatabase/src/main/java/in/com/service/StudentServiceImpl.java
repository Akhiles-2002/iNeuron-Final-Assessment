package in.com.service;

import in.com.dao.IStudentDao;
import in.com.daofactory.StudentDaoFactory;
import in.com.dto.Student;

public class StudentServiceImpl implements IStudentService {

	@Override
	public Student readData(Integer sid) {

		IStudentDao studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.readData(sid);
	}

}
