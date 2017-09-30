package cn.appsys.service.backend;

import cn.appsys.pojo.BackendUser;

public interface BacKendUserService {
	/**
	 * 登录验证
	 * @param devCode
	 * @param password
	 * @return
	 */
	public BackendUser login(String userCode,String userPassword);
}
