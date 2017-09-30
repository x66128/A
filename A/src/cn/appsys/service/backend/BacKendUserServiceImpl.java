package cn.appsys.service.backend;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.backenduser.BacKendUserMapper;
import cn.appsys.pojo.BackendUser;


@Service
public class BacKendUserServiceImpl implements BacKendUserService {
	@Resource
	private BacKendUserMapper mapper;

	@Override
	public BackendUser login(String userCode, String userPassword) {
		BackendUser user = null;
		user = mapper.getLoginUser(userCode);
		if (null != user) {
			if (!user.getUserPassword().equals(userPassword)) {
				user = null;
			}
		}
		return user;
	}

}
