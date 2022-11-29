package ch12.domain.userinfo.dao.oracle;

import ch12.domain.userinfo.UserInfo;
import ch12.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());

		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into Oracle DB userID = " + userInfo.getUserId());

		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from Oracle DB userID = " + userInfo.getUserId());

		
	}

}
